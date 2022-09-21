package typings.webextensionPolyfill.tabsMod.Tabs

import typings.webextensionPolyfill.webextensionPolyfillStrings.Application
import typings.webextensionPolyfill.webextensionPolyfillStrings.Screen
import typings.webextensionPolyfill.webextensionPolyfillStrings.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQueryInfoType extends StObject {
  
  /**
    * Whether the tabs are active in their windows.
    * Optional.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tabs are drawing attention.
    * Optional.
    */
  var attention: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tabs are audible.
    * Optional.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * Optional.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the tab is using the camera.
    * Optional.
    */
  var camera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The CookieStoreId used for the tab.
    * Optional.
    */
  var cookieStoreId: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /**
    * Whether the tabs are in the $(topic:current-window)[current window].
    * Optional.
    */
  var currentWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True while the tabs are not loaded with content.
    * Optional.
    */
  var discarded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True while the tabs are hidden.
    * Optional.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tabs are highlighted.  Works as an alias of active.
    * Optional.
    */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position of the tabs within their windows.
    * Optional.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the tabs are in the last focused window.
    * Optional.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the tab is using the microphone.
    * Optional.
    */
  var microphone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tabs are muted.
    * Optional.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * Optional.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the tabs are pinned.
    * Optional.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True for any screen sharing, or a string to specify type of screen sharing.
    * Optional.
    */
  var screen: js.UndefOr[Screen | Window | Application | Boolean] = js.undefined
  
  /**
    * Whether the tabs have completed loading.
    * Optional.
    */
  var status: js.UndefOr[TabStatus] = js.undefined
  
  /**
    * Match page titles against a pattern.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Match tabs against one or more $(topic:match_patterns)[URL patterns]. Note that fragment identifiers are not matched.
    * Optional.
    */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The ID of the parent window, or $(ref:windows.WINDOW_ID_CURRENT) for the $(topic:current-window)[current window].
    * Optional.
    */
  var windowId: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of window the tabs are in.
    * Optional.
    */
  var windowType: js.UndefOr[WindowType] = js.undefined
}
object QueryQueryInfoType {
  
  inline def apply(): QueryQueryInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryQueryInfoType]
  }
  
  extension [Self <: QueryQueryInfoType](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
    
    inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    inline def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    inline def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    inline def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCookieStoreId(value: js.Array[String] | String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    inline def setCookieStoreIdVarargs(value: String*): Self = StObject.set(x, "cookieStoreId", js.Array(value*))
    
    inline def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
    
    inline def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
    
    inline def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    inline def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
    
    inline def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
    
    inline def setMicrophone(value: Boolean): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneUndefined: Self = StObject.set(x, "microphone", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    inline def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setScreen(value: Screen | Window | Application | Boolean): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setStatus(value: TabStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    
    inline def setWindowType(value: WindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
    
    inline def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
  }
}
