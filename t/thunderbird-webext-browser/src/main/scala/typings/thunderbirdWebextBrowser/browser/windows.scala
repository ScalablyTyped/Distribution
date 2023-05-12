package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windows {
  
  trait CreateCreateData extends StObject {
    
    /**
      * Allow scripts running inside the window to close the window by calling
      * `window.close()`.
      */
    var allowScriptsToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, opens an active window. If false, opens an inactive window.
      *
      * @deprecated Unsupported on Firefox at this time.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height in pixels of the new window, including the frame. If not
      * specified defaults to a natural height.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** @deprecated Unsupported on Firefox at this time. */
    var incognito: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of pixels to position the new window from the left edge of
      * the screen. If not specified, the new window is offset naturally from
      * the last focused window.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * The initial state of the window. The `minimized`, `maximized` and
      * `fullscreen` states cannot be combined with `left`, `top`, `width` or
      * `height`.
      */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /** The id of the tab for which you want to adopt to the new window. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.undefined
    
    /**
      * The number of pixels to position the new window from the top edge of
      * the screen. If not specified, the new window is offset naturally from
      * the last focused window.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies what type of window to create. Thunderbird does not support
      * `panel` and `detached_panel`, they are interpreted as `popup`.
      */
    var `type`: js.UndefOr[CreateType] = js.undefined
    
    /**
      * A URL or array of URLs to open as tabs in the window. Fully-qualified
      * URLs must include a scheme (i.e. `http://www.google.com`, not
      * `www.google.com`). Relative URLs will be relative to the current page
      * within the extension. Defaults to the New Tab Page.
      */
    var url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The width in pixels of the new window, including the frame. If not
      * specified defaults to a natural width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CreateCreateData {
    
    inline def apply(): CreateCreateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCreateData] (val x: Self) extends AnyVal {
      
      inline def setAllowScriptsToClose(value: Boolean): Self = StObject.set(x, "allowScriptsToClose", value.asInstanceOf[js.Any])
      
      inline def setAllowScriptsToCloseUndefined: Self = StObject.set(x, "allowScriptsToClose", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: CreateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.detached_panel
  */
  trait CreateType extends StObject
  object CreateType {
    
    inline def detached_panel: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.detached_panel = "detached_panel".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.detached_panel]
    
    inline def normal: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal = "normal".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal]
    
    inline def panel: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel = "panel".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel]
    
    inline def popup: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup = "popup".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup]
  }
  
  trait GetInfo extends StObject {
    
    /**
      * If true, the {@link windows.Window} returned will have a `tabs`
      * property that contains an array of {@link tabs.Tab} objects
      * representing the tabs inside the window. The {@link tabs.Tab} objects
      * only contain the `url`, `title` and `favIconUrl` properties if the
      * extension's manifest file includes the <permission>tabs</permission>
      * permission.
      */
    var populate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the {@link windows.Window} returned will be filtered based on
      * its type. Supported by {@link windows.getAll} only, ignored in all
      * other functions.
      */
    var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
  }
  object GetInfo {
    
    inline def apply(): GetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetInfo] (val x: Self) extends AnyVal {
      
      inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      inline def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value*))
    }
  }
  
  trait UpdateUpdateInfo extends StObject {
    
    /**
      * Setting this to `true` will cause the window to be displayed in a
      * manner that draws the user's attention to the window, without changing
      * the focused window. The effect lasts until the user changes focus to
      * the window. This option has no effect if the window already has focus.
      */
    var drawAttention: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, brings the window to the front. If false, brings the next
      * window in the z-order to the front.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** The height to resize the window to in pixels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The offset from the left edge of the screen to move the window to in
      * pixels. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * The new state of the window. The `minimized`, `maximized` and
      * `fullscreen` states cannot be combined with `left`, `top`, `width` or
      * `height`.
      */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.undefined
    
    /**
      * The offset from the top edge of the screen to move the window to in
      * pixels. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /** The width to resize the window to in pixels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object UpdateUpdateInfo {
    
    inline def apply(): UpdateUpdateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateUpdateInfo] (val x: Self) extends AnyVal {
      
      inline def setDrawAttention(value: Boolean): Self = StObject.set(x, "drawAttention", value.asInstanceOf[js.Any])
      
      inline def setDrawAttentionUndefined: Self = StObject.set(x, "drawAttention", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Window extends StObject {
    
    /** Whether the window is set to be always on top. */
    var alwaysOnTop: Boolean
    
    /** Whether the window is currently the focused window. */
    var focused: Boolean
    
    /** The height of the window, including the frame, in pixels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** The ID of the window. Window IDs are unique within a session. */
    var id: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the window is incognito. Since Thunderbird does not support
      * the incognito mode, this is always `false`.
      */
    var incognito: Boolean
    
    /** The offset of the window from the left edge of the screen in pixels. */
    var left: js.UndefOr[Double] = js.undefined
    
    /** The state of this window. */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /**
      * Array of {@link tabs.Tab} objects representing the current tabs in the
      * window. Only included if requested by {@link windows.get}, {@link windows.getCurrent},
      *  {@link windows.getAll} or {@link windows.getLastFocused},
      *  and the optional {@link windows.GetInfo}
      * parameter has its `populate` member set to `true`.
      */
    var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
    
    /** The title of the window. Read-only. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The offset of the window from the top edge of the screen in pixels. */
    var top: js.UndefOr[Double] = js.undefined
    
    /** The type of window this is. */
    var `type`: js.UndefOr[WindowType] = js.undefined
    
    /** The width of the window, including the frame, in pixels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Window {
    
    inline def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
      val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: WindowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.minimized
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.maximized
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.fullscreen
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.docked
  */
  trait WindowState extends StObject
  object WindowState {
    
    inline def docked: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.docked = "docked".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.docked]
    
    inline def fullscreen: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.fullscreen = "fullscreen".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.fullscreen]
    
    inline def maximized: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.maximized = "maximized".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.maximized]
    
    inline def minimized: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.minimized = "minimized".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.minimized]
    
    inline def normal: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal = "normal".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.app
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageCompose
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageDisplay
  */
  trait WindowType extends StObject
  object WindowType {
    
    inline def app: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.app = "app".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.app]
    
    inline def devtools: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools = "devtools".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools]
    
    inline def messageCompose: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageCompose = "messageCompose".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageCompose]
    
    inline def messageDisplay: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageDisplay = "messageDisplay".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.messageDisplay]
    
    inline def normal: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal = "normal".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.normal]
    
    inline def panel: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel = "panel".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.panel]
    
    inline def popup: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup = "popup".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup]
  }
}
