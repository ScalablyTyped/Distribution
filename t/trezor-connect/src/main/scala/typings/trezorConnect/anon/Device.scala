package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.PinMatrixRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var `type`: PinMatrixRequestType
}
object Device {
  
  inline def apply(device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device, `type`: PinMatrixRequestType): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: PinMatrixRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
