package typings.thunderbirdWebextBrowser.browser.runtime

import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSender extends StObject {
  
  /**
    * The frame that opened the connection. 0 for top-level frames, positive
    * for child frames. This will only be set when `tab` is set.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the extension or app that opened the connection, if any. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The `tabs.Tab` which opened the connection, if any. This property will
    * **only** be present when the connection was opened from a tab
    * (including content scripts), and **only** if the receiver is an
    * extension, not an app.
    */
  var tab: js.UndefOr[Tab] = js.undefined
  
  /**
    * The TLS channel ID of the page or frame that opened the connection, if
    * requested by the extension or app, and if available.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var tlsChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the page or frame that opened the connection. If the sender
    * is in an iframe, it will be iframe's URL not the URL of the page which
    * hosts it.
    */
  var url: js.UndefOr[String] = js.undefined
}
object MessageSender {
  
  inline def apply(): MessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSender] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    inline def setTlsChannelId(value: String): Self = StObject.set(x, "tlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setTlsChannelIdUndefined: Self = StObject.set(x, "tlsChannelId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
