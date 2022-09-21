package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadReloadPropertiesType extends StObject {
  
  /**
    * Whether using any local cache. Default is false.
    * Optional.
    */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}
object ReloadReloadPropertiesType {
  
  inline def apply(): ReloadReloadPropertiesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadReloadPropertiesType]
  }
  
  extension [Self <: ReloadReloadPropertiesType](x: Self) {
    
    inline def setBypassCache(value: Boolean): Self = StObject.set(x, "bypassCache", value.asInstanceOf[js.Any])
    
    inline def setBypassCacheUndefined: Self = StObject.set(x, "bypassCache", js.undefined)
  }
}
