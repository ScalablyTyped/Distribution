package typings.trezorConnect.anon

import typings.trezorConnect.eventsMod.ButtonRequestData
import typings.trezorConnect.trezorConnectStrings.ButtonRequest_FirmwareUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.ButtonRequest, 'code'> & {  code :trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.ButtonRequest['code'] | 'ButtonRequest_FirmwareUpdate' | undefined,   device :trezor-connect.trezor-connect/lib/typescript/trezor/device.Device,   data :trezor-connect.trezor-connect/lib/typescript/events.ButtonRequestData | undefined} */
trait OmitButtonRequestcodecode extends StObject {
  
  var code: js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.ButtonRequest['code'] */ js.Any) | ButtonRequest_FirmwareUpdate
  ] = js.undefined
  
  var data: js.UndefOr[ButtonRequestData] = js.undefined
  
  var device: typings.trezorConnect.deviceMod.Device
  
  var pages: js.UndefOr[Double] = js.undefined
}
object OmitButtonRequestcodecode {
  
  inline def apply(device: typings.trezorConnect.deviceMod.Device): OmitButtonRequestcodecode = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitButtonRequestcodecode]
  }
  
  extension [Self <: OmitButtonRequestcodecode](x: Self) {
    
    inline def setCode(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.ButtonRequest['code'] */ js.Any) | ButtonRequest_FirmwareUpdate
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: ButtonRequestData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDevice(value: typings.trezorConnect.deviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
  }
}
