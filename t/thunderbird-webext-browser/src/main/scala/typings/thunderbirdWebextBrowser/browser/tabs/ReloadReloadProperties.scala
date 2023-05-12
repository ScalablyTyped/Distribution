package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadReloadProperties extends StObject {
  
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}
object ReloadReloadProperties {
  
  inline def apply(): ReloadReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadReloadProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReloadReloadProperties] (val x: Self) extends AnyVal {
    
    inline def setBypassCache(value: Boolean): Self = StObject.set(x, "bypassCache", value.asInstanceOf[js.Any])
    
    inline def setBypassCacheUndefined: Self = StObject.set(x, "bypassCache", js.undefined)
  }
}
