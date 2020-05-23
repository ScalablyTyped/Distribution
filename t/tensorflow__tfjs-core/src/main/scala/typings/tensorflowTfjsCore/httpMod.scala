package typings.tensorflowTfjsCore

import typings.std.RegExp
import typings.std.RequestInit
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  @js.native
  class HTTPRequest protected () extends IOHandler {
    def this(path: String) = this()
    def this(path: String, loadOptions: LoadOptions) = this()
    val DEFAULT_METHOD: /* "POST" */ String = js.native
    val fetch: js.Any = js.native
    var loadWeights: js.Any = js.native
    val onProgress: js.Any = js.native
    val path: String = js.native
    val requestInit: RequestInit = js.native
    val weightPathPrefix: js.Any = js.native
    /**
      * Load model artifacts via HTTP request(s).
      *
      * See the documentation to `tf.io.http` for details on the saved
      * artifacts.
      *
      * @returns The loaded model artifacts (if loading succeeds).
      */
    @JSName("load")
    def load_MHTTPRequest(): js.Promise[ModelArtifacts] = js.native
    @JSName("save")
    def save_MHTTPRequest(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  
  val httpRouter: IORouter = js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def http(path: String): IOHandler = js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def isHTTPScheme(url: String): Boolean = js.native
  def parseUrl(url: String): js.Tuple2[String, String] = js.native
  /* static members */
  @js.native
  object HTTPRequest extends js.Object {
    val URL_SCHEME_REGEX: RegExp = js.native
  }
  
}

