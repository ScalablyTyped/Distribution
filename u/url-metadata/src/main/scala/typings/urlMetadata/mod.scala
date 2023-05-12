package typings.urlMetadata

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(url: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("url-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[String] = js.undefined
    
    var descriptionLength: js.UndefOr[Double] = js.undefined
    
    var ensureSecureImageRequest: js.UndefOr[Boolean] = js.undefined
    
    var includeResponseBody: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var requestHeaders: js.UndefOr[Record[String, String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDescriptionLength(value: Double): Self = StObject.set(x, "descriptionLength", value.asInstanceOf[js.Any])
      
      inline def setDescriptionLengthUndefined: Self = StObject.set(x, "descriptionLength", js.undefined)
      
      inline def setEnsureSecureImageRequest(value: Boolean): Self = StObject.set(x, "ensureSecureImageRequest", value.asInstanceOf[js.Any])
      
      inline def setEnsureSecureImageRequestUndefined: Self = StObject.set(x, "ensureSecureImageRequest", js.undefined)
      
      inline def setIncludeResponseBody(value: Boolean): Self = StObject.set(x, "includeResponseBody", value.asInstanceOf[js.Any])
      
      inline def setIncludeResponseBodyUndefined: Self = StObject.set(x, "includeResponseBody", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRequestHeaders(value: Record[String, String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type Result = Record[String, String | Boolean | (Record[String, String])]
}
