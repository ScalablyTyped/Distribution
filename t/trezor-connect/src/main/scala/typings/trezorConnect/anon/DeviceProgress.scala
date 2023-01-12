package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceProgress extends StObject {
  
  var device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var progress: Double
}
object DeviceProgress {
  
  inline def apply(device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device, progress: Double): DeviceProgress = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceProgress] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
