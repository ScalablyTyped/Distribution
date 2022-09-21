package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightHighlightInfoType extends StObject {
  
  /**
    * If true, the $(ref:windows.Window) returned will have a <var>tabs</var> property that contains a list of the $(ref:tabs.
    * Tab) objects. The <code>Tab</code> objects only contain the <code>url</code>, <code>title</code> and <code>
    * favIconUrl</code> properties if the extension's manifest file includes the <code>"tabs"</code> permission. If false,
    * the $(ref:windows.Window) won't have the <var>tabs</var> property.
    * Optional.
    */
  var populate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more tab indices to highlight.
    */
  var tabs: js.Array[Double] | Double
  
  /**
    * The window that contains the tabs.
    * Optional.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}
object HighlightHighlightInfoType {
  
  inline def apply(tabs: js.Array[Double] | Double): HighlightHighlightInfoType = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightHighlightInfoType]
  }
  
  extension [Self <: HighlightHighlightInfoType](x: Self) {
    
    inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
    
    inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
    
    inline def setTabs(value: js.Array[Double] | Double): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Double*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
