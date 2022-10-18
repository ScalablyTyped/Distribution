package typings.trezorConnect.libTypescriptEventsMod

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
  - typings.trezorConnect.libTypescriptEventsMod.ReceivePermission
  - typings.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation
  - typings.trezorConnect.libTypescriptEventsMod.ReceiveDevice
  - typings.trezorConnect.libTypescriptEventsMod.ReceivePin
  - typings.trezorConnect.libTypescriptEventsMod.ReceiveWord
  - typings.trezorConnect.libTypescriptEventsMod.ReceivePassphrase
  - typings.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction
  - typings.trezorConnect.libTypescriptEventsMod.ReceiveAccount
  - typings.trezorConnect.libTypescriptEventsMod.ReceiveFee
  - typings.trezorConnect.libTypescriptEventsMod.CustomMessageRequest
*/
trait UiResponse extends StObject
object UiResponse {
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typings.trezorConnect.libTypescriptEventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.CustomMessageRequest]
  }
  
  inline def ReceiveAccount(`type`: /* "ui-receive_account" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceiveAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceiveAccount]
  }
  
  inline def ReceiveConfirmation(payload: Boolean, `type`: /* "ui-receive_confirmation" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceiveConfirmation]
  }
  
  inline def ReceiveDevice(payload: Remember, `type`: /* "ui-receive_device" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceiveDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceiveDevice]
  }
  
  inline def ReceiveFee(payload: Value | `0` | TypeValue, `type`: /* "ui-receive_fee" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceiveFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceiveFee]
  }
  
  inline def ReceivePassphrase(payload: PassphraseOnDevice, `type`: /* "ui-receive_passphrase" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceivePassphrase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceivePassphrase]
  }
  
  inline def ReceivePassphraseAction(payload: Boolean, `type`: /* "ui-invalid_passphrase_action" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceivePassphraseAction]
  }
  
  inline def ReceivePermission(payload: Granted, `type`: /* "ui-receive_permission" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceivePermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceivePermission]
  }
  
  inline def ReceivePin(payload: String, `type`: /* "ui-receive_pin" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceivePin = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceivePin]
  }
  
  inline def ReceiveWord(payload: String, `type`: /* "ui-receive_word" */ String): typings.trezorConnect.libTypescriptEventsMod.ReceiveWord = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.libTypescriptEventsMod.ReceiveWord]
  }
}
