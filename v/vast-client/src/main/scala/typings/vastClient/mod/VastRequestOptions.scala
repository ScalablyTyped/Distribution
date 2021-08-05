package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastRequestOptions extends StObject {
  
  /**
    * Allows you to parse all the ads contained in the VAST or to parse them ad by ad or adPod by adPod (default true)
    */
  var resolveAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom timeout for the requests (default 0)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Custom urlhandler to be used instead of the default ones urlhandlers
    */
  var urlHandler: js.UndefOr[VASTClientUrlHandler] = js.undefined
  
  /**
    * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers (default false)
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A number of Wrapper responses that can be received with no InLine response (default 0)
    */
  var wrapperLimit: js.UndefOr[Double] = js.undefined
}
object VastRequestOptions {
  
  inline def apply(): VastRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VastRequestOptions]
  }
  
  extension [Self <: VastRequestOptions](x: Self) {
    
    inline def setResolveAll(value: Boolean): Self = StObject.set(x, "resolveAll", value.asInstanceOf[js.Any])
    
    inline def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrlHandler(value: VASTClientUrlHandler): Self = StObject.set(x, "urlHandler", value.asInstanceOf[js.Any])
    
    inline def setUrlHandlerUndefined: Self = StObject.set(x, "urlHandler", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    inline def setWrapperLimit(value: Double): Self = StObject.set(x, "wrapperLimit", value.asInstanceOf[js.Any])
    
    inline def setWrapperLimitUndefined: Self = StObject.set(x, "wrapperLimit", js.undefined)
  }
}
