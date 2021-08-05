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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest")
  @js.native
  class HTTPRequest protected ()
    extends StObject
       with IOHandler {
    def this(path: String) = this()
    def this(path: String, loadOptions: LoadOptions) = this()
    
    val DEFAULT_METHOD: /* "POST" */ String = js.native
    
    /* private */ val fetch: js.Any = js.native
    
    /* private */ var loadWeights: js.Any = js.native
    
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
    
    /* private */ val onProgress: js.Any = js.native
    
    /* protected */ val path: String = js.native
    
    /* protected */ val requestInit: RequestInit = js.native
    
    @JSName("save")
    def save_MHTTPRequest(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
    
    /* private */ val weightPathPrefix: js.Any = js.native
    
    /* private */ val weightUrlConverter: js.Any = js.native
  }
  /* static members */
  object HTTPRequest {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/http", "HTTPRequest.URL_SCHEME_REGEX")
    @js.native
    val URL_SCHEME_REGEX: RegExp = js.native
  }
  
  inline def browserHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  inline def http(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def http(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-core/dist/io/http", "httpRouter")
  @js.native
  val httpRouter: IORouter = js.native
  
  inline def isHTTPScheme(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTTPScheme")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseUrl(url: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
}
