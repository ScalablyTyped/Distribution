package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object describing filters to apply to tabs.onUpdated events.
  */
trait UpdateFilter extends StObject {
  
  /**
    * A list of property names. Events that do not match any of the names will be filtered out.
    * Optional.
    */
  var properties: js.UndefOr[js.Array[UpdatePropertyName]] = js.undefined
  
  /**
    * Optional.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of URLs or URL patterns. Events that cannot match any of the URLs will be filtered out.
    * Filtering with urls requires the <code>"tabs"</code> or  <code>"activeTab"</code> permission.
    * Optional.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object UpdateFilter {
  
  inline def apply(): UpdateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFilter] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[UpdatePropertyName]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: UpdatePropertyName*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
