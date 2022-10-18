package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesTabsMod.Tabs.Tab
import typings.webextensionPolyfill.namespacesWindowsMod.Windows.Window
import typings.webextensionPolyfill.webextensionPolyfillInts.`25`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesSessionsMod {
  
  object Sessions {
    
    trait Device extends StObject {
      
      /**
        * The name of the foreign device.
        */
      var deviceName: String
      
      var info: String
      
      /**
        * A list of open window sessions for the foreign device, sorted from most recently to least recently modified session.
        */
      var sessions: js.Array[Session]
    }
    object Device {
      
      inline def apply(deviceName: String, info: String, sessions: js.Array[Session]): Device = {
        val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Device]
      }
      
      extension [Self <: Device](x: Self) {
        
        inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setSessions(value: js.Array[Session]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value*))
      }
    }
    
    trait Filter extends StObject {
      
      /**
        * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch the maximum number of
        * entries ($(ref:sessions.MAX_SESSION_RESULTS)).
        * Optional.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
    }
    object Filter {
      
      inline def apply(): Filter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Filter]
      }
      
      extension [Self <: Filter](x: Self) {
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      }
    }
    
    trait Session extends StObject {
      
      /**
        * The time when the window or tab was closed or modified, represented in milliseconds since the epoch.
        */
      var lastModified: Double
      
      /**
        * The $(ref:tabs.Tab), if this entry describes a tab. Either this or $(ref:sessions.Session.window) will be set.
        * Optional.
        */
      var tab: js.UndefOr[Tab] = js.undefined
      
      /**
        * The $(ref:windows.Window), if this entry describes a window. Either this or $(ref:sessions.Session.tab) will be set.
        * Optional.
        */
      var window: js.UndefOr[Window] = js.undefined
    }
    object Session {
      
      inline def apply(lastModified: Double): Session = {
        val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
        __obj.asInstanceOf[Session]
      }
      
      extension [Self <: Session](x: Self) {
        
        inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
        
        inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
        
        inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
        
        inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        
        inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * The maximum number of $(ref:sessions.Session) that will be included in a requested list.
        */
      var MAX_SESSION_RESULTS: `25` = js.native
      
      /**
        * Forget a recently closed tab.
        *
        * @param windowId The windowId of the window to which the recently closed tab to be forgotten belongs.
        * @param sessionId The sessionId (closedId) of the recently closed tab to be forgotten.
        */
      def forgetClosedTab(windowId: Double, sessionId: String): js.Promise[Unit] = js.native
      
      /**
        * Forget a recently closed window.
        *
        * @param sessionId The sessionId (closedId) of the recently closed window to be forgotten.
        */
      def forgetClosedWindow(sessionId: String): js.Promise[Unit] = js.native
      
      /**
        * Gets the list of recently closed tabs and/or windows.
        *
        * @param filter Optional.
        */
      def getRecentlyClosed(): js.Promise[js.Array[Session]] = js.native
      def getRecentlyClosed(filter: Filter): js.Promise[js.Array[Session]] = js.native
      
      /**
        * Retrieve a value that was set for a given key on a given tab.
        *
        * @param tabId The id of the tab whose value is being retrieved from.
        * @param key The key which corresponds to the value.
        */
      def getTabValue(tabId: Double, key: String): js.Promise[Any] = js.native
      
      /**
        * Retrieve a value that was set for a given key on a given window.
        *
        * @param windowId The id of the window whose value is being retrieved from.
        * @param key The key which corresponds to the value.
        */
      def getWindowValue(windowId: Double, key: String): js.Promise[Any] = js.native
      
      /**
        * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced sessions changes.
        */
      var onChanged: Event[js.Function0[Unit]] = js.native
      
      /**
        * Remove a key/value pair that was set on a given tab.
        *
        * @param tabId The id of the tab whose key/value pair is being removed.
        * @param key The key which corresponds to the value.
        */
      def removeTabValue(tabId: Double, key: String): js.Promise[Unit] = js.native
      
      /**
        * Remove a key/value pair that was set on a given window.
        *
        * @param windowId The id of the window whose key/value pair is being removed.
        * @param key The key which corresponds to the value.
        */
      def removeWindowValue(windowId: Double, key: String): js.Promise[Unit] = js.native
      
      /**
        * Reopens a $(ref:windows.Window) or $(ref:tabs.Tab), with an optional callback to run when the entry has been restored.
        *
        * @param sessionId Optional. The $(ref:windows.Window.sessionId), or $(ref:tabs.Tab.sessionId) to restore.
        * If this parameter is not specified, the most recently closed session is restored.
        */
      def restore(): js.Promise[Session] = js.native
      def restore(sessionId: String): js.Promise[Session] = js.native
      
      /**
        * Set a key/value pair on a given tab.
        *
        * @param tabId The id of the tab that the key/value pair is being set on.
        * @param key The key which corresponds to the value being set.
        * @param value The value being set.
        */
      def setTabValue(tabId: Double, key: String, value: Any): js.Promise[Unit] = js.native
      
      /**
        * Set a key/value pair on a given window.
        *
        * @param windowId The id of the window that the key/value pair is being set on.
        * @param key The key which corresponds to the value being set.
        * @param value The value being set.
        */
      def setWindowValue(windowId: Double, key: String, value: Any): js.Promise[Unit] = js.native
    }
  }
}
