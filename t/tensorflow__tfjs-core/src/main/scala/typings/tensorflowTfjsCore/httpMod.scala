package typings.tensorflowTfjsCore

import typings.std.RegExp
import typings.std.RequestInit
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
  @js.native
  class HTTPRequest protected () extends IOHandler {
    def this(path: String) = this()
    def this(path: String, loadOptions: LoadOptions) = this()
    
    val DEFAULT_METHOD: /* "POST" */ String = js.native
    
    val fetch: js.Any = js.native
    
    var loadWeights: js.Any = js.native
    
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
    
    val onProgress: js.Any = js.native
    
    val path: String = js.native
    
    val requestInit: RequestInit = js.native
    
    @JSName("save")
    def save_MHTTPRequest(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
    
    val weightPathPrefix: js.Any = js.native
    
    val weightUrlConverter: js.Any = js.native
  }
  /* static members */
  object HTTPRequest {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest.URL_SCHEME_REGEX")
    @js.native
    val URL_SCHEME_REGEX: RegExp = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "browserHTTPRequest")
  @js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "browserHTTPRequest")
  @js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "http")
  @js.native
  def http(path: String): IOHandler = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "http")
  @js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "httpRouter")
  @js.native
  val httpRouter: IORouter = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "isHTTPScheme")
  @js.native
  def isHTTPScheme(url: String): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "parseUrl")
  @js.native
  def parseUrl(url: String): js.Tuple2[String, String] = js.native
}
