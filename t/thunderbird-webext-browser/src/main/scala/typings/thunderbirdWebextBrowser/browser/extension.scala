package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `extension` {
  
  trait GetViewsFetchProperties extends StObject {
    
    /**
      * Find a view according to a tab id. If this field is omitted, returns
      * all views.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of view to get. If omitted, returns all views (including
      * background pages and tabs). Valid values: 'tab', 'popup', 'sidebar'.
      */
    var `type`: js.UndefOr[ViewType] = js.undefined
    
    /** The window to restrict the search to. If omitted, returns all views. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object GetViewsFetchProperties {
    
    inline def apply(): GetViewsFetchProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetViewsFetchProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetViewsFetchProperties] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait LastError extends StObject {
    
    /** Description of the error that has taken place. */
    var message: String
  }
  object LastError {
    
    inline def apply(message: String): LastError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LastError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sidebar
  */
  trait ViewType extends StObject
  object ViewType {
    
    inline def popup: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup = "popup".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.popup]
    
    inline def sidebar: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.sidebar]
    
    inline def tab: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab = "tab".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab]
  }
}
