package typings.webextensionPolyfill

import typings.webextensionPolyfill.eventsMod.Events.Event
import typings.webextensionPolyfill.tabsMod.Tabs.Tab
import typings.webextensionPolyfill.webextensionPolyfillNumbers.`-1`
import typings.webextensionPolyfill.webextensionPolyfillNumbers.`-2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowsMod {
  
  object Windows {
    
    trait CreateCreateDataType extends StObject {
      
      /**
        * Allow scripts to close the window.
        * Optional.
        */
      var allowScriptsToClose: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The CookieStoreId to use for all tabs that were created when the window is opened.
        * Optional.
        */
      var cookieStoreId: js.UndefOr[String] = js.undefined
      
      /**
        * If true, the new window will be focused. If false, the new window will be opened in the background and the currently
        * focused window will stay focused. Defaults to true.
        * Optional.
        */
      var focused: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
        * Optional.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * Whether the new window should be an incognito window.
        * Optional.
        */
      var incognito: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The number of pixels to position the new window from the left edge of the screen. If not specified,
        * the new window is offset naturally from the last focused window. This value is ignored for panels.
        * Optional.
        */
      var left: js.UndefOr[Double] = js.undefined
      
      /**
        * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left',
        * 'top', 'width' or 'height'.
        * Optional.
        */
      var state: js.UndefOr[WindowState] = js.undefined
      
      /**
        * The id of the tab for which you want to adopt to the new window.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * A string to add to the beginning of the window title.
        * Optional.
        */
      var titlePreface: js.UndefOr[String] = js.undefined
      
      /**
        * The number of pixels to position the new window from the top edge of the screen. If not specified,
        * the new window is offset naturally from the last focused window. This value is ignored for panels.
        * Optional.
        */
      var top: js.UndefOr[Double] = js.undefined
      
      /**
        * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the
        * '--enable-panels' flag is set.
        * Optional.
        */
      var `type`: js.UndefOr[CreateType] = js.undefined
      
      /**
        * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.
        * google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension.
        * Defaults to the New Tab Page.
        * Optional.
        */
      var url: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
        * Optional.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object CreateCreateDataType {
      
      inline def apply(): CreateCreateDataType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateCreateDataType]
      }
      
      extension [Self <: CreateCreateDataType](x: Self) {
        
        inline def setAllowScriptsToClose(value: Boolean): Self = StObject.set(x, "allowScriptsToClose", value.asInstanceOf[js.Any])
        
        inline def setAllowScriptsToCloseUndefined: Self = StObject.set(x, "allowScriptsToClose", js.undefined)
        
        inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
        
        inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
        
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
    
    /**
      * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the
      * '--enable-panels' flag is set.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.popup
      - typings.webextensionPolyfill.webextensionPolyfillStrings.panel
      - typings.webextensionPolyfill.webextensionPolyfillStrings.detached_panel
    */
    trait CreateType extends StObject
    object CreateType {
      
      inline def detached_panel: typings.webextensionPolyfill.webextensionPolyfillStrings.detached_panel = "detached_panel".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.detached_panel]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
      
      inline def panel: typings.webextensionPolyfill.webextensionPolyfillStrings.panel = "panel".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.panel]
      
      inline def popup: typings.webextensionPolyfill.webextensionPolyfillStrings.popup = "popup".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.popup]
    }
    
    /**
      * Specifies properties used to filter the $(ref:windows.Window) returned and to determine whether they should contain a
      * list of the $(ref:tabs.Tab) objects.
      */
    trait GetAllGetInfoType
      extends StObject
         with GetInfo {
      
      /**
        * If set, the $(ref:windows.Window) returned will be filtered based on its type. If unset the default filter is set to
        * <code>['app', 'normal', 'panel', 'popup']</code>, with <code>'app'</code> and <code>'panel'</code>
        * window types limited to the extension's own windows.
        * Optional.
        */
      var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
    }
    object GetAllGetInfoType {
      
      inline def apply(): GetAllGetInfoType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetAllGetInfoType]
      }
      
      extension [Self <: GetAllGetInfoType](x: Self) {
        
        inline def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
        
        inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
        
        inline def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value*))
      }
    }
    
    /**
      * Specifies whether the $(ref:windows.Window) returned should contain a list of the $(ref:tabs.Tab) objects.
      */
    trait GetInfo extends StObject {
      
      /**
        * If true, the $(ref:windows.Window) returned will have a <var>tabs</var> property that contains a list of the $(ref:tabs.
        * Tab) objects. The <code>Tab</code> objects only contain the <code>url</code>, <code>title</code> and <code>
        * favIconUrl</code> properties if the extension's manifest file includes the <code>"tabs"</code> permission.
        * Optional.
        */
      var populate: js.UndefOr[Boolean] = js.undefined
    }
    object GetInfo {
      
      inline def apply(): GetInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetInfo]
      }
      
      extension [Self <: GetInfo](x: Self) {
        
        inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
        
        inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * The windowId value that represents the $(topic:current-window)[current window].
        */
      var WINDOW_ID_CURRENT: `-2` = js.native
      
      /**
        * The windowId value that represents the absence of a browser window.
        */
      var WINDOW_ID_NONE: `-1` = js.native
      
      /**
        * Creates (opens) a new browser with any optional sizing, position or default URL provided.
        *
        * @param createData Optional.
        */
      def create(): js.Promise[Window] = js.native
      def create(createData: CreateCreateDataType): js.Promise[Window] = js.native
      
      /**
        * Gets details about a window.
        *
        * @param windowId
        * @param getInfo Optional.
        */
      def get(windowId: Double): js.Promise[Window] = js.native
      def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = js.native
      
      /**
        * Gets all windows.
        *
        * @param getInfo Optional. Specifies properties used to filter the $(ref:windows.Window)
        * returned and to determine whether they should contain a list of the $(ref:tabs.Tab) objects.
        */
      def getAll(): js.Promise[js.Array[Window]] = js.native
      def getAll(getInfo: GetAllGetInfoType): js.Promise[js.Array[Window]] = js.native
      
      /**
        * Gets the $(topic:current-window)[current window].
        *
        * @param getInfo Optional.
        */
      def getCurrent(): js.Promise[Window] = js.native
      def getCurrent(getInfo: GetInfo): js.Promise[Window] = js.native
      
      /**
        * Gets the window that was most recently focused &mdash; typically the window 'on top'.
        *
        * @param getInfo Optional.
        */
      def getLastFocused(): js.Promise[Window] = js.native
      def getLastFocused(getInfo: GetInfo): js.Promise[Window] = js.native
      
      /**
        * Fired when a window is created.
        *
        * @param window Details of the window that was created.
        */
      var onCreated: Event[js.Function1[/* window */ Window, Unit]] = js.native
      
      /**
        * Fired when the currently focused window changes. Will be $(ref:windows.WINDOW_ID_NONE)
        * if all browser windows have lost focus. Note: On some Linux window managers, WINDOW_ID_NONE will always be sent
        * immediately preceding a switch from one browser window to another.
        *
        * @param windowId ID of the newly focused window.
        */
      var onFocusChanged: Event[js.Function1[/* windowId */ Double, Unit]] = js.native
      
      /**
        * Fired when a window is removed (closed).
        *
        * @param windowId ID of the removed window.
        */
      var onRemoved: Event[js.Function1[/* windowId */ Double, Unit]] = js.native
      
      /**
        * Removes (closes) a window, and all the tabs inside it.
        *
        * @param windowId
        */
      def remove(windowId: Double): js.Promise[Unit] = js.native
      
      /**
        * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties will be
        * left unchanged.
        *
        * @param windowId
        * @param updateInfo
        */
      def update(windowId: Double, updateInfo: UpdateUpdateInfoType): js.Promise[Window] = js.native
    }
    
    trait UpdateUpdateInfoType extends StObject {
      
      /**
        * If true, causes the window to be displayed in a manner that draws the user's attention to the window,
        * without changing the focused window. The effect lasts until the user changes focus to the window.
        * This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
        * Optional.
        */
      var drawAttention: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
        * Optional.
        */
      var focused: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The height to resize the window to in pixels. This value is ignored for panels.
        * Optional.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels.
        * Optional.
        */
      var left: js.UndefOr[Double] = js.undefined
      
      /**
        * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top',
        * 'width' or 'height'.
        * Optional.
        */
      var state: js.UndefOr[WindowState] = js.undefined
      
      /**
        * A string to add to the beginning of the window title.
        * Optional.
        */
      var titlePreface: js.UndefOr[String] = js.undefined
      
      /**
        * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
        * Optional.
        */
      var top: js.UndefOr[Double] = js.undefined
      
      /**
        * The width to resize the window to in pixels. This value is ignored for panels.
        * Optional.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object UpdateUpdateInfoType {
      
      inline def apply(): UpdateUpdateInfoType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateUpdateInfoType]
      }
      
      extension [Self <: UpdateUpdateInfoType](x: Self) {
        
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
      
      /**
        * Whether the window is set to be always on top.
        */
      var alwaysOnTop: Boolean
      
      /**
        * Whether the window is currently the focused window.
        */
      var focused: Boolean
      
      /**
        * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height
        * property, for example when querying closed windows from the $(ref:sessions) API.
        * Optional.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be
        * assigned an ID, for example when querying windows using the $(ref:sessions) API, in which case a session ID may be
        * present.
        * Optional.
        */
      var id: js.UndefOr[Double] = js.undefined
      
      /**
        * Whether the window is incognito.
        */
      var incognito: Boolean
      
      /**
        * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be
        * assigned left property, for example when querying closed windows from the $(ref:sessions) API.
        * Optional.
        */
      var left: js.UndefOr[Double] = js.undefined
      
      /**
        * The session ID used to uniquely identify a Window obtained from the $(ref:sessions) API.
        * Optional.
        */
      var sessionId: js.UndefOr[String] = js.undefined
      
      /**
        * The state of this browser window.
        * Optional.
        */
      var state: js.UndefOr[WindowState] = js.undefined
      
      /**
        * Array of $(ref:tabs.Tab) objects representing the current tabs in the window.
        * Optional.
        */
      var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
      
      /**
        * The title of the window. Read-only.
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be
        * assigned top property, for example when querying closed windows from the $(ref:sessions) API.
        * Optional.
        */
      var top: js.UndefOr[Double] = js.undefined
      
      /**
        * The type of browser window this is.
        * Optional.
        */
      var `type`: js.UndefOr[WindowType] = js.undefined
      
      /**
        * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width
        * property, for example when querying closed windows from the $(ref:sessions) API.
        * Optional.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object Window {
      
      inline def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
        val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
        
        inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
        
        inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
        
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
    
    /**
      * The state of this browser window. Under some circumstances a Window may not be assigned state property,
      * for example when querying closed windows from the $(ref:sessions) API.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.minimized
      - typings.webextensionPolyfill.webextensionPolyfillStrings.maximized
      - typings.webextensionPolyfill.webextensionPolyfillStrings.fullscreen
      - typings.webextensionPolyfill.webextensionPolyfillStrings.docked
    */
    trait WindowState extends StObject
    object WindowState {
      
      inline def docked: typings.webextensionPolyfill.webextensionPolyfillStrings.docked = "docked".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.docked]
      
      inline def fullscreen: typings.webextensionPolyfill.webextensionPolyfillStrings.fullscreen = "fullscreen".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.fullscreen]
      
      inline def maximized: typings.webextensionPolyfill.webextensionPolyfillStrings.maximized = "maximized".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.maximized]
      
      inline def minimized: typings.webextensionPolyfill.webextensionPolyfillStrings.minimized = "minimized".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.minimized]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
    }
    
    /**
      * The type of browser window this is. Under some circumstances a Window may not be assigned type property,
      * for example when querying closed windows from the $(ref:sessions) API.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.popup
      - typings.webextensionPolyfill.webextensionPolyfillStrings.panel
      - typings.webextensionPolyfill.webextensionPolyfillStrings.app
      - typings.webextensionPolyfill.webextensionPolyfillStrings.devtools
    */
    trait WindowType extends StObject
    object WindowType {
      
      inline def app: typings.webextensionPolyfill.webextensionPolyfillStrings.app = "app".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.app]
      
      inline def devtools: typings.webextensionPolyfill.webextensionPolyfillStrings.devtools = "devtools".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.devtools]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
      
      inline def panel: typings.webextensionPolyfill.webextensionPolyfillStrings.panel = "panel".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.panel]
      
      inline def popup: typings.webextensionPolyfill.webextensionPolyfillStrings.popup = "popup".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.popup]
    }
  }
}
