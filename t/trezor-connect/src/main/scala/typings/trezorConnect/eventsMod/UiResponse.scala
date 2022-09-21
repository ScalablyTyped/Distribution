package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Granted
import typings.trezorConnect.anon.Message
import typings.trezorConnect.anon.PassphraseOnDevice
import typings.trezorConnect.anon.Remember
import typings.trezorConnect.anon.TypeValue
import typings.trezorConnect.anon.Value
import typings.trezorConnect.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.eventsMod.ReceivePermission
  - typings.trezorConnect.eventsMod.ReceiveConfirmation
  - typings.trezorConnect.eventsMod.ReceiveDevice
  - typings.trezorConnect.eventsMod.ReceivePin
  - typings.trezorConnect.eventsMod.ReceiveWord
  - typings.trezorConnect.eventsMod.ReceivePassphrase
  - typings.trezorConnect.eventsMod.ReceivePassphraseAction
  - typings.trezorConnect.eventsMod.ReceiveAccount
  - typings.trezorConnect.eventsMod.ReceiveFee
  - typings.trezorConnect.eventsMod.CustomMessageRequest
*/
trait UiResponse extends StObject
object UiResponse {
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typings.trezorConnect.eventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.CustomMessageRequest]
  }
  
  inline def ReceiveAccount(`type`: /* "ui-receive_account" */ String): typings.trezorConnect.eventsMod.ReceiveAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceiveAccount]
  }
  
  inline def ReceiveConfirmation(payload: Boolean, `type`: /* "ui-receive_confirmation" */ String): typings.trezorConnect.eventsMod.ReceiveConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceiveConfirmation]
  }
  
  inline def ReceiveDevice(payload: Remember, `type`: /* "ui-receive_device" */ String): typings.trezorConnect.eventsMod.ReceiveDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceiveDevice]
  }
  
  inline def ReceiveFee(payload: Value | `0` | TypeValue, `type`: /* "ui-receive_fee" */ String): typings.trezorConnect.eventsMod.ReceiveFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceiveFee]
  }
  
  inline def ReceivePassphrase(payload: PassphraseOnDevice, `type`: /* "ui-receive_passphrase" */ String): typings.trezorConnect.eventsMod.ReceivePassphrase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceivePassphrase]
  }
  
  inline def ReceivePassphraseAction(payload: Boolean, `type`: /* "ui-invalid_passphrase_action" */ String): typings.trezorConnect.eventsMod.ReceivePassphraseAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceivePassphraseAction]
  }
  
  inline def ReceivePermission(payload: Granted, `type`: /* "ui-receive_permission" */ String): typings.trezorConnect.eventsMod.ReceivePermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceivePermission]
  }
  
  inline def ReceivePin(payload: String, `type`: /* "ui-receive_pin" */ String): typings.trezorConnect.eventsMod.ReceivePin = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceivePin]
  }
  
  inline def ReceiveWord(payload: String, `type`: /* "ui-receive_word" */ String): typings.trezorConnect.eventsMod.ReceiveWord = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.eventsMod.ReceiveWord]
  }
}
