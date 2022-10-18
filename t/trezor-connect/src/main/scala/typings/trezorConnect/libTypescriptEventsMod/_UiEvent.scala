package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.AccountTypes
import typings.trezorConnect.anon.CoinInfo
import typings.trezorConnect.anon.CustomCancelButton
import typings.trezorConnect.anon.Device
import typings.trezorConnect.anon.DeviceProgress
import typings.trezorConnect.anon.DeviceType
import typings.trezorConnect.anon.Devices
import typings.trezorConnect.anon.Message
import typings.trezorConnect.anon.OmitButtonRequestcodecodeCode
import typings.trezorConnect.anon.Permissions
import typings.trezorConnect.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UiEvent extends StObject
object _UiEvent {
  
  inline def ButtonRequestMessage(payload: OmitButtonRequestcodecodeCode, `type`: /* "ui-button" */ String): typings.trezorConnect.libTypescriptEventsMod.ButtonRequestMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ButtonRequestMessage]
  }
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typings.trezorConnect.libTypescriptEventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.CustomMessageRequest]
  }
  
  inline def FirmwareProgress(payload: DeviceProgress, `type`: /* "ui-firmware-progress" */ String): typings.trezorConnect.libTypescriptEventsMod.FirmwareProgress = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.FirmwareProgress]
  }
  
  inline def MessageWithoutPayload(payload: scala.Unit, `type`: /* "ui-request_window" */ String): typings.trezorConnect.libTypescriptEventsMod.MessageWithoutPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.MessageWithoutPayload]
  }
  
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
  
  inline def PopupHandshake(`type`: /* "popup-handshake" */ String): typings.trezorConnect.libTypescriptEventsMod.PopupHandshake = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.PopupHandshake]
  }
  
  inline def RequestConfirmation(payload: CustomCancelButton, `type`: /* "ui-request_confirmation" */ String): typings.trezorConnect.libTypescriptEventsMod.RequestConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.RequestConfirmation]
  }
  
  inline def RequestPermission(payload: Permissions, `type`: /* "ui-request_permission" */ String): typings.trezorConnect.libTypescriptEventsMod.RequestPermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.RequestPermission]
  }
  
  inline def SelectAccount(payload: AccountTypes, `type`: /* "ui-select_account" */ String): typings.trezorConnect.libTypescriptEventsMod.SelectAccount = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.SelectAccount]
  }
  
  inline def SelectDevice(payload: Devices, `type`: /* "ui-select_device" */ String): typings.trezorConnect.libTypescriptEventsMod.SelectDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.SelectDevice]
  }
  
  inline def SelectFee(payload: CoinInfo, `type`: /* "ui-select_fee" */ String): typings.trezorConnect.libTypescriptEventsMod.SelectFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.SelectFee]
  }
  
  inline def TypeString(payload: Type, `type`: /* "ui-request_word" */ String): typings.trezorConnect.anon.TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.TypeString]
  }
  
  inline def UnexpectedDeviceMode(
    payload: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device,
    `type`: /* "ui-device_bootloader_mode" */ String
  ): typings.trezorConnect.libTypescriptEventsMod.UnexpectedDeviceMode = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.UnexpectedDeviceMode]
  }
  
  inline def UpdateCustomFee(payload: CoinInfo, `type`: /* "ui-update_custom_fee" */ String): typings.trezorConnect.libTypescriptEventsMod.UpdateCustomFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.UpdateCustomFee]
  }
}
