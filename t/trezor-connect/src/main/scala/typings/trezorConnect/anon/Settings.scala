package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptParamsMod.ConnectSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var settings: ConnectSettings
  
  // those are settings from window.opener
  var useBroadcastChannel: Boolean
}
object Settings {
  
  inline def apply(settings: ConnectSettings, useBroadcastChannel: Boolean): Settings = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], useBroadcastChannel = useBroadcastChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setSettings(value: ConnectSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setUseBroadcastChannel(value: Boolean): Self = StObject.set(x, "useBroadcastChannel", value.asInstanceOf[js.Any])
  }
}
