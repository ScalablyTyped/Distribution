package typings.webextensionPolyfill

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesExtensionMod {
  
  object Extension {
    
    trait GetViewsFetchPropertiesType extends StObject {
      
      /**
        * Find a view according to a tab id. If this field is omitted, returns all views.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab',
        * 'popup', 'sidebar'.
        * Optional.
        */
      var `type`: js.UndefOr[ViewType] = js.undefined
      
      /**
        * The window to restrict the search to. If omitted, returns all views.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object GetViewsFetchPropertiesType {
      
      inline def apply(): GetViewsFetchPropertiesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetViewsFetchPropertiesType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetViewsFetchPropertiesType] (val x: Self) extends AnyVal {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Returns the JavaScript 'window' object for the background page running inside the current extension.
        * Returns null if the extension has no background page.
        */
      def getBackgroundPage(): Window = js.native
      
      /**
        * Returns an array of the JavaScript 'window' objects for each of the pages running inside the current extension.
        *
        * @param fetchProperties Optional.
        * @returns Array of global objects
        */
      def getViews(): js.Array[Window] = js.native
      def getViews(fetchProperties: GetViewsFetchPropertiesType): js.Array[Window] = js.native
      
      /**
        * True for content scripts running inside incognito tabs, and for extension pages running inside an incognito process.
        * The latter only applies to extensions with 'split' incognito_behavior.
        * Optional.
        */
      var inIncognitoContext: js.UndefOr[Boolean] = js.native
      
      /**
        * Retrieves the state of the extension's access to the 'file://' scheme (as determined by the user-controlled 'Allow
        * access to File URLs' checkbox.
        */
      def isAllowedFileSchemeAccess(): js.Promise[Boolean] = js.native
      
      /**
        * Retrieves the state of the extension's access to Incognito-mode (as determined by the user-controlled 'Allowed in
        * Incognito' checkbox.
        */
      def isAllowedIncognitoAccess(): js.Promise[Boolean] = js.native
    }
    
    /**
      * The type of extension view.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.tab
      - typings.webextensionPolyfill.webextensionPolyfillStrings.popup
      - typings.webextensionPolyfill.webextensionPolyfillStrings.sidebar
    */
    trait ViewType extends StObject
    object ViewType {
      
      inline def popup: typings.webextensionPolyfill.webextensionPolyfillStrings.popup = "popup".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.popup]
      
      inline def sidebar: typings.webextensionPolyfill.webextensionPolyfillStrings.sidebar = "sidebar".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.sidebar]
      
      inline def tab: typings.webextensionPolyfill.webextensionPolyfillStrings.tab = "tab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.tab]
    }
  }
}
