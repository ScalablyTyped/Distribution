package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  /**
    * Whether the tab is active in its window. (Does not necessarily mean
    * the window is focused.)
    */
  var active: Boolean
  
  /**
    * The URL of the tab's favicon. This property is only present if the
    * extension's manifest includes the <permission>tabs</permission>
    * permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  
  /** The height of the tab in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: Boolean
  
  /**
    * The ID of the tab. Tab IDs are unique within a session. Under some
    * circumstances a Tab may not be assigned an ID. Tab ID can also be set
    * to {@link tabs.TAB_ID_NONE} for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /** The zero-based index of the tab within its window. */
  var index: Double
  
  /** Whether the tab is a 3-pane tab. */
  var mailTab: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tab is selected.
    *
    * @deprecated Please use {@link tabs.Tab.highlighted}.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** Either `loading` or `complete`. */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the tab. This property is only present if the extension's
    * manifest includes the <permission>tabs</permission> permission.
    */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[TabType] = js.undefined
  
  /**
    * The URL the tab is displaying. This property is only present if the
    * extension's manifest includes the <permission>tabs</permission>
    * permission.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /** The width of the tab in pixels. */
  var width: js.UndefOr[Double] = js.undefined
  
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object Tab {
  
  inline def apply(active: Boolean, highlighted: Boolean, index: Double): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
    
    inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMailTab(value: Boolean): Self = StObject.set(x, "mailTab", value.asInstanceOf[js.Any])
    
    inline def setMailTabUndefined: Self = StObject.set(x, "mailTab", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: TabType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
