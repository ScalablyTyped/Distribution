package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDisplay {
  
  trait OpenOpenProperties extends StObject {
    
    /**
      * Whether the new tab should become the active tab in the window. Only
      * applicable to messages opened in tabs.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The headerMessageId of a message to be opened. Will throw an
      * _ExtensionError_, if the provided `headerMessageId` is unknown or
      * invalid. Not supported for external messages.
      */
    var headerMessageId: js.UndefOr[String] = js.undefined
    
    /**
      * Where to open the message. If not specified, the users preference is
      * honoured. Ignored for external messages, which are always opened in a
      * new window.
      */
    var location: js.UndefOr[OpenOpenPropertiesLocation] = js.undefined
    
    /**
      * The id of a message to be opened. Will throw an _ExtensionError_, if
      * the provided `messageId` is unknown or invalid.
      */
    var messageId: js.UndefOr[Double] = js.undefined
    
    /**
      * The id of the window, where the new tab should be created. Defaults to
      * the current window. Only applicable to messages opened in tabs.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object OpenOpenProperties {
    
    inline def apply(): OpenOpenProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOpenProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenOpenProperties] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setHeaderMessageId(value: String): Self = StObject.set(x, "headerMessageId", value.asInstanceOf[js.Any])
      
      inline def setHeaderMessageIdUndefined: Self = StObject.set(x, "headerMessageId", js.undefined)
      
      inline def setLocation(value: OpenOpenPropertiesLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.window
  */
  trait OpenOpenPropertiesLocation extends StObject
  object OpenOpenPropertiesLocation {
    
    inline def tab: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab = "tab".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.tab]
    
    inline def window: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.window = "window".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.window]
  }
}
