package typings.thunderbirdWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptions extends StObject {
  
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for
    * processes that are listening for the connection event.
    *
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}
object SendMessageOptions {
  
  inline def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
  }
}
