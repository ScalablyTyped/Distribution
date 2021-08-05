package typings.wixUiCore.srcComponentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISDKConfig extends StObject {
  
  var isLoaded: js.UndefOr[js.Function1[/* sdk */ js.Any, Boolean]] = js.undefined
  
  var isRequireAllow: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var onReady: js.UndefOr[String] = js.undefined
  
  var resolveRequire: js.UndefOr[js.Function1[/* sdk */ js.Any, js.Any]] = js.undefined
  
  var url: String
}
object ISDKConfig {
  
  inline def apply(name: String, url: String): ISDKConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISDKConfig]
  }
  
  extension [Self <: ISDKConfig](x: Self) {
    
    inline def setIsLoaded(value: /* sdk */ js.Any => Boolean): Self = StObject.set(x, "isLoaded", js.Any.fromFunction1(value))
    
    inline def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
    
    inline def setIsRequireAllow(value: Boolean): Self = StObject.set(x, "isRequireAllow", value.asInstanceOf[js.Any])
    
    inline def setIsRequireAllowUndefined: Self = StObject.set(x, "isRequireAllow", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnReady(value: String): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setResolveRequire(value: /* sdk */ js.Any => js.Any): Self = StObject.set(x, "resolveRequire", js.Any.fromFunction1(value))
    
    inline def setResolveRequireUndefined: Self = StObject.set(x, "resolveRequire", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
