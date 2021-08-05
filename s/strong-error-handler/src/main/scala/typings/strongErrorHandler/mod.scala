package typings.strongErrorHandler

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.strongErrorHandler.mod.StrongErrorHandler.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /***
    * Create a new strong error middleware funciton using the given options.
    * @param options
    */
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("strong-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object StrongErrorHandler {
    
    trait options extends StObject {
      
      /***
        * HTTP responses include all error properties, including sensitive data such as file paths,
        * URLs and stack traces, defaults to false.
        */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /***
        * Specify the default response content type to use when the client does not provide any Accepts header.
        * Defaults to 'json'.
        */
      var defaultType: js.UndefOr[String] = js.undefined
      
      /***
        *If true, all errors are printed via console.error, including an array of fields (custom error properties)
        *that are safe to include in response messages (both 4xx and 5xx).
        *If false, sends only the error back in the response.
        * Defaults to true
        */
      var log: js.UndefOr[Boolean] = js.undefined
      
      /***
        * Negotiate the response content type via Accepts request header.
        * When disabled, strong-error-handler will always use the default content type when producing responses.
        * Disabling content type negotiation is useful if you want to see JSON-formatted
        * error responses in browsers, because browsers usually prefer HTML and XML over other content types.
        */
      var negotiateContentType: js.UndefOr[Boolean] = js.undefined
      
      /***
        * Specifies property names on errors that are allowed to be passed through in 4xx and 5xx responses.
        */
      var safeFields: js.UndefOr[js.Array[String]] = js.undefined
    }
    object options {
      
      inline def apply(): options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[options]
      }
      
      extension [Self <: options](x: Self) {
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setDefaultType(value: String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
        
        inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
        
        inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
        
        inline def setNegotiateContentType(value: Boolean): Self = StObject.set(x, "negotiateContentType", value.asInstanceOf[js.Any])
        
        inline def setNegotiateContentTypeUndefined: Self = StObject.set(x, "negotiateContentType", js.undefined)
        
        inline def setSafeFields(value: js.Array[String]): Self = StObject.set(x, "safeFields", value.asInstanceOf[js.Any])
        
        inline def setSafeFieldsUndefined: Self = StObject.set(x, "safeFields", js.undefined)
        
        inline def setSafeFieldsVarargs(value: String*): Self = StObject.set(x, "safeFields", js.Array(value :_*))
      }
    }
  }
}
