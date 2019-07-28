package typings.atTensorflowTfjsDashCore.distIoHttpMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.POST
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.SaveResult
import typings.std.RegExp
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
@js.native
class HTTPRequest protected () extends IOHandler {
  def this(path: String) = this()
  def this(path: String, loadOptions: LoadOptions) = this()
  val DEFAULT_METHOD: POST = js.native
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

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
@js.native
object HTTPRequest extends js.Object {
  val URL_SCHEME_REGEX: RegExp = js.native
}

