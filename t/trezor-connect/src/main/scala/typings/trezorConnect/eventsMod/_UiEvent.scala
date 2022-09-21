package typings.trezorConnect.eventsMod

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
  
  inline def ButtonRequestMessage(payload: OmitButtonRequestcodecodeCode, `type`: /* "ui-button" */ String): typings.trezorConnect.eventsMod.ButtonRequestMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ButtonRequestMessage]
  }
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typings.trezorConnect.eventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.CustomMessageRequest]
  }
  
  inline def FirmwareProgress(payload: DeviceProgress, `type`: /* "ui-firmware-progress" */ String): typings.trezorConnect.eventsMod.FirmwareProgress = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.FirmwareProgress]
  }
  
  inline def MessageWithoutPayload(payload: scala.Unit, `type`: /* "ui-request_window" */ String): typings.trezorConnect.eventsMod.MessageWithoutPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.MessageWithoutPayload]
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
  
  inline def PopupHandshake(`type`: /* "popup-handshake" */ String): typings.trezorConnect.eventsMod.PopupHandshake = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.PopupHandshake]
  }
  
  inline def RequestConfirmation(payload: CustomCancelButton, `type`: /* "ui-request_confirmation" */ String): typings.trezorConnect.eventsMod.RequestConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.RequestConfirmation]
  }
  
  inline def RequestPermission(payload: Permissions, `type`: /* "ui-request_permission" */ String): typings.trezorConnect.eventsMod.RequestPermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.RequestPermission]
  }
  
  inline def SelectAccount(payload: AccountTypes, `type`: /* "ui-select_account" */ String): typings.trezorConnect.eventsMod.SelectAccount = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.SelectAccount]
  }
  
  inline def SelectDevice(payload: Devices, `type`: /* "ui-select_device" */ String): typings.trezorConnect.eventsMod.SelectDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.SelectDevice]
  }
  
  inline def SelectFee(payload: CoinInfo, `type`: /* "ui-select_fee" */ String): typings.trezorConnect.eventsMod.SelectFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.SelectFee]
  }
  
  inline def TypeString(payload: Type, `type`: /* "ui-request_word" */ String): typings.trezorConnect.anon.TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.TypeString]
  }
  
  inline def UnexpectedDeviceMode(payload: typings.trezorConnect.deviceMod.Device, `type`: /* "ui-device_bootloader_mode" */ String): typings.trezorConnect.eventsMod.UnexpectedDeviceMode = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.UnexpectedDeviceMode]
  }
  
  inline def UpdateCustomFee(payload: CoinInfo, `type`: /* "ui-update_custom_fee" */ String): typings.trezorConnect.eventsMod.UpdateCustomFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.UpdateCustomFee]
  }
}
