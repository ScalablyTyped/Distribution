package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Device
import typings.trezorConnect.anon.DeviceType
import typings.trezorConnect.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.PayloadDevice
  - typings.trezorConnect.anon.TypeString
  - typings.trezorConnect.anon.PayloadDeviceType
*/
trait DeviceMessage
  extends StObject
     with _UiEvent
object DeviceMessage {
  
  inline def PayloadDevice(payload: Device, `type`: /* "ui-request_pin" */ String): typings.trezorConnect.anon.PayloadDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadDevice]
  }
  
  inline def PayloadDeviceType(payload: DeviceType, `type`: /* "ui-invalid_pin" */ String): typings.trezorConnect.anon.PayloadDeviceType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.PayloadDeviceType]
  }
  
  inline def TypeString(payload: Type, `type`: /* "ui-request_word" */ String): typings.trezorConnect.anon.TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.TypeString]
  }
}
