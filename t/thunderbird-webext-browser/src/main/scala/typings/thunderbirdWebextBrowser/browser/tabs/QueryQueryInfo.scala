package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQueryInfo extends StObject {
  
  /** Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tabs are in the current window. */
  var currentWindow: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tabs are highlighted. Works as an alias of active. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  /** The position of the tabs within their windows. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Whether the tabs are in the last focused window. */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tab is a Thunderbird 3-pane tab. */
  var mailTab: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tabs have completed loading. */
  var status: js.UndefOr[TabStatus] = js.undefined
  
  /** Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Match tabs against the given Tab.type (see {@link tabs.Tab}). Ignored
    * if `queryInfo.mailTab` is specified.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Match tabs against one or more URL Patterns . Note that fragment
    * identifiers are not matched.
    */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The ID of the parent window, or {@link windows.WINDOW_ID_CURRENT} for
    * the current window.
    */
  var windowId: js.UndefOr[Double] = js.undefined
  
  /** The type of window the tabs are in. */
  var windowType: js.UndefOr[WindowType] = js.undefined
}
object QueryQueryInfo {
  
  inline def apply(): QueryQueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryQueryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryQueryInfo] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
    
    inline def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
    
    inline def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
    
    inline def setMailTab(value: Boolean): Self = StObject.set(x, "mailTab", value.asInstanceOf[js.Any])
    
    inline def setMailTabUndefined: Self = StObject.set(x, "mailTab", js.undefined)
    
    inline def setStatus(value: TabStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    
    inline def setWindowType(value: WindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
    
    inline def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
  }
}
