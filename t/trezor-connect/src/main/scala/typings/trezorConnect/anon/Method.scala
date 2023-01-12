package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptEventsMod.TransportInfo
import typings.trezorConnect.libTypescriptParamsMod.ConnectSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  // those are settings from the iframe, they could be different from window.opener settings
  var method: js.UndefOr[String] = js.undefined
  
  var settings: ConnectSettings
  
  var transport: js.UndefOr[TransportInfo] = js.undefined
}
object Method {
  
  inline def apply(settings: ConnectSettings): Method = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSettings(value: ConnectSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: TransportInfo): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
