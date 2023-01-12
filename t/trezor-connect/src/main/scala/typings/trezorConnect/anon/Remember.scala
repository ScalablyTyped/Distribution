package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remember extends StObject {
  
  var device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var remember: Boolean
}
object Remember {
  
  inline def apply(device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device, remember: Boolean): Remember = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], remember = remember.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Remember] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setRemember(value: Boolean): Self = StObject.set(x, "remember", value.asInstanceOf[js.Any])
  }
}
