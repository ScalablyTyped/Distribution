package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import typings.webextensionPolyfill.namespacesTabsMod.Tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the script context that sent a message or request.
  */
trait MessageSender extends StObject {
  
  /**
    * The $(topic:frame_ids)[frame] that opened the connection. 0 for top-level frames, positive for child frames.
    * This will only be set when <code>tab</code> is set.
    * Optional.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the extension or app that opened the connection, if any.
    * Optional.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The $(ref:tabs.Tab) which opened the connection, if any. This property will <strong>only</strong>
    * be present when the connection was opened from a tab (including content scripts), and <strong>only</strong>
    * if the receiver is an extension, not an app.
    * Optional.
    */
  var tab: js.UndefOr[Tab] = js.undefined
  
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe,
    * it will be iframe's URL not the URL of the page which hosts it.
    * Optional.
    */
  var url: js.UndefOr[String] = js.undefined
}
object MessageSender {
  
  inline def apply(): MessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSender]
  }
  
  extension [Self <: MessageSender](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
