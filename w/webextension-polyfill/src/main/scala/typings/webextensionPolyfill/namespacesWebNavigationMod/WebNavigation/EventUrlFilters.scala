package typings.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import typings.webextensionPolyfill.namespacesEventsMod.Events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventUrlFilters extends StObject {
  
  var url: js.Array[UrlFilter]
}
object EventUrlFilters {
  
  inline def apply(url: js.Array[UrlFilter]): EventUrlFilters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUrlFilters]
  }
  
  extension [Self <: EventUrlFilters](x: Self) {
    
    inline def setUrl(value: js.Array[UrlFilter]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlVarargs(value: UrlFilter*): Self = StObject.set(x, "url", js.Array(value*))
  }
}
