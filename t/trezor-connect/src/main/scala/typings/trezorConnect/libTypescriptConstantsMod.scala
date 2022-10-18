package typings.trezorConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptConstantsMod {
  
  object BLOCKCHAIN {
    
    @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN.BLOCK")
    @js.native
    val BLOCK: /* "blockchain-block" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN.CONNECT")
    @js.native
    val CONNECT: /* "blockchain-connect" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN.ERROR")
    @js.native
    val ERROR: /* "blockchain-error" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN.FIAT_RATES_UPDATE")
    @js.native
    val FIAT_RATES_UPDATE: /* "fiat-rates-update" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN.NOTIFICATION")
    @js.native
    val NOTIFICATION: /* "blockchain-notification" */ String = js.native
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "BLOCKCHAIN_EVENT")
  @js.native
  val BLOCKCHAIN_EVENT: /* "BLOCKCHAIN_EVENT" */ String = js.native
  
  object CARDANO {
    
    @js.native
    sealed trait ADDRESS_TYPE extends StObject
    @JSImport("trezor-connect/lib/typescript/constants", "CARDANO.ADDRESS_TYPE")
    @js.native
    object ADDRESS_TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[ADDRESS_TYPE & Double] = js.native
      
      @js.native
      sealed trait Base
        extends StObject
           with ADDRESS_TYPE
      /* 0 */ val Base: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.ADDRESS_TYPE.Base & Double = js.native
      
      @js.native
      sealed trait Byron
        extends StObject
           with ADDRESS_TYPE
      /* 8 */ val Byron: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.ADDRESS_TYPE.Byron & Double = js.native
      
      @js.native
      sealed trait Enterprise
        extends StObject
           with ADDRESS_TYPE
      /* 6 */ val Enterprise: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.ADDRESS_TYPE.Enterprise & Double = js.native
      
      @js.native
      sealed trait Pointer
        extends StObject
           with ADDRESS_TYPE
      /* 4 */ val Pointer: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.ADDRESS_TYPE.Pointer & Double = js.native
      
      @js.native
      sealed trait Reward
        extends StObject
           with ADDRESS_TYPE
      /* 14 */ val Reward: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.ADDRESS_TYPE.Reward & Double = js.native
    }
    
    @js.native
    sealed trait CERTIFICATE_TYPE extends StObject
    @JSImport("trezor-connect/lib/typescript/constants", "CARDANO.CERTIFICATE_TYPE")
    @js.native
    object CERTIFICATE_TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[CERTIFICATE_TYPE & Double] = js.native
      
      @js.native
      sealed trait StakeDelegation
        extends StObject
           with CERTIFICATE_TYPE
      /* 2 */ val StakeDelegation: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.CERTIFICATE_TYPE.StakeDelegation & Double = js.native
      
      @js.native
      sealed trait StakeDeregistration
        extends StObject
           with CERTIFICATE_TYPE
      /* 1 */ val StakeDeregistration: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.CERTIFICATE_TYPE.StakeDeregistration & Double = js.native
      
      @js.native
      sealed trait StakePoolRegistration
        extends StObject
           with CERTIFICATE_TYPE
      /* 3 */ val StakePoolRegistration: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.CERTIFICATE_TYPE.StakePoolRegistration & Double = js.native
      
      @js.native
      sealed trait StakeRegistration
        extends StObject
           with CERTIFICATE_TYPE
      /* 0 */ val StakeRegistration: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.CERTIFICATE_TYPE.StakeRegistration & Double = js.native
    }
    
    @js.native
    sealed trait NETWORK_IDS extends StObject
    @JSImport("trezor-connect/lib/typescript/constants", "CARDANO.NETWORK_IDS")
    @js.native
    object NETWORK_IDS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[NETWORK_IDS & Double] = js.native
      
      @js.native
      sealed trait mainnet
        extends StObject
           with NETWORK_IDS
      /* 1 */ val mainnet: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.NETWORK_IDS.mainnet & Double = js.native
      
      @js.native
      sealed trait testnet
        extends StObject
           with NETWORK_IDS
      /* 0 */ val testnet: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.NETWORK_IDS.testnet & Double = js.native
    }
    
    @js.native
    sealed trait PROTOCOL_MAGICS extends StObject
    @JSImport("trezor-connect/lib/typescript/constants", "CARDANO.PROTOCOL_MAGICS")
    @js.native
    object PROTOCOL_MAGICS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[PROTOCOL_MAGICS & Double] = js.native
      
      @js.native
      sealed trait mainnet
        extends StObject
           with PROTOCOL_MAGICS
      /* 764824073 */ val mainnet: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.PROTOCOL_MAGICS.mainnet & Double = js.native
      
      @js.native
      sealed trait testnet
        extends StObject
           with PROTOCOL_MAGICS
      /* 1097911063 */ val testnet: typings.trezorConnect.libTypescriptConstantsMod.CARDANO.PROTOCOL_MAGICS.testnet & Double = js.native
    }
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "CORE_EVENT")
  @js.native
  val CORE_EVENT: /* "CORE_EVENT" */ String = js.native
  
  object DEVICE {
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.ACQUIRE")
    @js.native
    val ACQUIRE: /* "device-acquire" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.ACQUIRED")
    @js.native
    val ACQUIRED: /* "device-acquired" */ String = js.native
    
    // trezor-link events in protobuf format
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.BUTTON")
    @js.native
    val BUTTON: /* "button" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.CHANGED")
    @js.native
    val CHANGED: /* "device-changed" */ String = js.native
    
    // device list events
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.CONNECT")
    @js.native
    val CONNECT: /* "device-connect" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.CONNECT_UNACQUIRED")
    @js.native
    val CONNECT_UNACQUIRED: /* "device-connect_unacquired" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.DISCONNECT")
    @js.native
    val DISCONNECT: /* "device-disconnect" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.LOADING")
    @js.native
    val LOADING: /* "device-loading" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.PASSPHRASE")
    @js.native
    val PASSPHRASE: /* "passphrase" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.PASSPHRASE_ON_DEVICE")
    @js.native
    val PASSPHRASE_ON_DEVICE: /* "passphrase_on_device" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.PIN")
    @js.native
    val PIN: /* "pin" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.RELEASE")
    @js.native
    val RELEASE: /* "device-release" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.RELEASED")
    @js.native
    val RELEASED: /* "device-released" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.USED_ELSEWHERE")
    @js.native
    val USED_ELSEWHERE: /* "device-used_elsewhere" */ String = js.native
    
    // custom
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.WAIT_FOR_SELECTION")
    @js.native
    val WAIT_FOR_SELECTION: /* "device-wait_for_selection" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "DEVICE.WORD")
    @js.native
    val WORD: /* "word" */ String = js.native
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "DEVICE_EVENT")
  @js.native
  val DEVICE_EVENT: /* "DEVICE_EVENT" */ String = js.native
  
  object IFRAME {
    
    @JSImport("trezor-connect/lib/typescript/constants", "IFRAME.BOOTSTRAP")
    @js.native
    val BOOTSTRAP: /* "iframe-bootstrap" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "IFRAME.CALL")
    @js.native
    val CALL: /* "iframe-call" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "IFRAME.ERROR")
    @js.native
    val ERROR: /* "iframe-error" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "IFRAME.INIT")
    @js.native
    val INIT: /* "iframe-init" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "IFRAME.LOADED")
    @js.native
    val LOADED: /* "iframe-loaded" */ String = js.native
  }
  
  object POPUP {
    
    // Message called from popup.html inline script before "window.onload" event. This is first message from popup to window.opener.
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.BOOTSTRAP")
    @js.native
    val BOOTSTRAP: /* "popup-bootstrap" */ String = js.native
    
    // Message called from iframe to popup, it means that popup will not be needed (example: Blockchain methods are not using popup at all)
    // This will close active popup window and/or clear opening process in PopupManager (maybe popup wasn't opened yet)
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.CANCEL_POPUP_REQUEST")
    @js.native
    val CANCEL_POPUP_REQUEST: /* "ui-cancel-popup-request" */ String = js.native
    
    // Event emitted from PopupManager at the end of popup closing process.
    // Sent from popup thru window.opener to an iframe because message channel between popup and iframe is no longer available
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.CLOSED")
    @js.native
    val CLOSED: /* "popup-closed" */ String = js.native
    
    // Message called from inline element in popup.html (window.closeWindow), this is used only with webextensions to properly handle popup close event
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.CLOSE_WINDOW")
    @js.native
    val CLOSE_WINDOW: /* "window.close" */ String = js.native
    
    // Error message from popup to window.opener. Could be thrown during popup initialization process (POPUP.INIT)
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.ERROR")
    @js.native
    val ERROR: /* "popup-error" */ String = js.native
    
    // Message to webextensions, opens "trezor-usb-permission.html" within webextension
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.EXTENSION_USB_PERMISSIONS")
    @js.native
    val EXTENSION_USB_PERMISSIONS: /* "open-usb-permissions" */ String = js.native
    
    // Message called from both [popup > iframe] then [iframe > popup] in this exact order.
    // Firstly popup call iframe to resolve popup promise in Core
    // Then iframe reacts to POPUP.HANDSHAKE message and sends ConnectSettings, transport information and requested method details back to popup
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.HANDSHAKE")
    @js.native
    val HANDSHAKE: /* "popup-handshake" */ String = js.native
    
    // Message from window.opener to popup.js. Send settings to popup. This is first message from window.opener to popup.
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.INIT")
    @js.native
    val INIT: /* "popup-init" */ String = js.native
    
    // Message from popup.js to window.opener, called after "window.onload" event. This is second message from popup to window.opener.
    @JSImport("trezor-connect/lib/typescript/constants", "POPUP.LOADED")
    @js.native
    val LOADED: /* "popup-loaded" */ String = js.native
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "RESPONSE_EVENT")
  @js.native
  val RESPONSE_EVENT: /* "RESPONSE_EVENT" */ String = js.native
  
  object TRANSPORT {
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.DISABLE_WEBUSB")
    @js.native
    val DISABLE_WEBUSB: /* "transport-disable_webusb" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.ERROR")
    @js.native
    val ERROR: /* "transport-error" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.RECONNECT")
    @js.native
    val RECONNECT: /* "transport-reconnect" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.REQUEST")
    @js.native
    val REQUEST: /* "transport-request_device" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.START")
    @js.native
    val START: /* "transport-start" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.START_PENDING")
    @js.native
    val START_PENDING: /* "transport-start_pending" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.STREAM")
    @js.native
    val STREAM: /* "transport-stream" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT.UPDATE")
    @js.native
    val UPDATE: /* "transport-update" */ String = js.native
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "TRANSPORT_EVENT")
  @js.native
  val TRANSPORT_EVENT: /* "TRANSPORT_EVENT" */ String = js.native
  
  object UI {
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.ADDRESS_VALIDATION")
    @js.native
    val ADDRESS_VALIDATION: /* "ui-address_validation" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.BOOTLOADER")
    @js.native
    val BOOTLOADER: /* "ui-device_bootloader_mode" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.BUNDLE_PROGRESS")
    @js.native
    val BUNDLE_PROGRESS: /* "ui-bundle_progress" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CHANGE_ACCOUNT")
    @js.native
    val CHANGE_ACCOUNT: /* "ui-change_account" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CHANGE_SETTINGS")
    @js.native
    val CHANGE_SETTINGS: /* "ui-change_settings" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CLOSE_UI_WINDOW")
    @js.native
    val CLOSE_UI_WINDOW: /* "ui-close_window" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CONNECT")
    @js.native
    val CONNECT: /* "ui-connect" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CUSTOM_MESSAGE_REQUEST")
    @js.native
    val CUSTOM_MESSAGE_REQUEST: /* "ui-custom_request" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.CUSTOM_MESSAGE_RESPONSE")
    @js.native
    val CUSTOM_MESSAGE_RESPONSE: /* "ui-custom_response" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.DEVICE_NEEDS_BACKUP")
    @js.native
    val DEVICE_NEEDS_BACKUP: /* "ui-device_needs_backup" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_NOT_COMPATIBLE")
    @js.native
    val FIRMWARE_NOT_COMPATIBLE: /* "ui-device_firmware_not_compatible" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_NOT_INSTALLED")
    @js.native
    val FIRMWARE_NOT_INSTALLED: /* "ui-device_firmware_not_installed" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_NOT_SUPPORTED")
    @js.native
    val FIRMWARE_NOT_SUPPORTED: /* "ui-device_firmware_unsupported" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_OLD")
    @js.native
    val FIRMWARE_OLD: /* "ui-device_firmware_old" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_OUTDATED")
    @js.native
    val FIRMWARE_OUTDATED: /* "ui-device_firmware_outdated" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.FIRMWARE_PROGRESS")
    @js.native
    val FIRMWARE_PROGRESS: /* "ui-firmware-progress" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.INITIALIZE")
    @js.native
    val INITIALIZE: /* "ui-device_not_initialized" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.INSUFFICIENT_FUNDS")
    @js.native
    val INSUFFICIENT_FUNDS: /* "ui-insufficient_funds" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.INVALID_PASSPHRASE")
    @js.native
    val INVALID_PASSPHRASE: /* "ui-invalid_passphrase" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.INVALID_PASSPHRASE_ACTION")
    @js.native
    val INVALID_PASSPHRASE_ACTION: /* "ui-invalid_passphrase_action" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.INVALID_PIN")
    @js.native
    val INVALID_PIN: /* "ui-invalid_pin" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.LOADING")
    @js.native
    val LOADING: /* "ui-loading" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.LOGIN_CHALLENGE_REQUEST")
    @js.native
    val LOGIN_CHALLENGE_REQUEST: /* "ui-login_challenge_request" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.LOGIN_CHALLENGE_RESPONSE")
    @js.native
    val LOGIN_CHALLENGE_RESPONSE: /* "ui-login_challenge_response" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.NOT_IN_BOOTLOADER")
    @js.native
    val NOT_IN_BOOTLOADER: /* "ui-device_not_in_bootloader_mode" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_ACCOUNT")
    @js.native
    val RECEIVE_ACCOUNT: /* "ui-receive_account" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_CONFIRMATION")
    @js.native
    val RECEIVE_CONFIRMATION: /* "ui-receive_confirmation" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_DEVICE")
    @js.native
    val RECEIVE_DEVICE: /* "ui-receive_device" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_FEE")
    @js.native
    val RECEIVE_FEE: /* "ui-receive_fee" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_PASSPHRASE")
    @js.native
    val RECEIVE_PASSPHRASE: /* "ui-receive_passphrase" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_PERMISSION")
    @js.native
    val RECEIVE_PERMISSION: /* "ui-receive_permission" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_PIN")
    @js.native
    val RECEIVE_PIN: /* "ui-receive_pin" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.RECEIVE_WORD")
    @js.native
    val RECEIVE_WORD: /* "ui-receive_word" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_BUTTON")
    @js.native
    val REQUEST_BUTTON: /* "ui-button" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_CONFIRMATION")
    @js.native
    val REQUEST_CONFIRMATION: /* "ui-request_confirmation" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_PASSPHRASE")
    @js.native
    val REQUEST_PASSPHRASE: /* "ui-request_passphrase" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_PASSPHRASE_ON_DEVICE")
    @js.native
    val REQUEST_PASSPHRASE_ON_DEVICE: /* "ui-request_passphrase_on_device" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_PERMISSION")
    @js.native
    val REQUEST_PERMISSION: /* "ui-request_permission" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_PIN")
    @js.native
    val REQUEST_PIN: /* "ui-request_pin" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_UI_WINDOW")
    @js.native
    val REQUEST_UI_WINDOW: /* "ui-request_window" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUEST_WORD")
    @js.native
    val REQUEST_WORD: /* "ui-request_word" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.REQUIRE_MODE")
    @js.native
    val REQUIRE_MODE: /* "ui-device_require_mode" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.SEEDLESS")
    @js.native
    val SEEDLESS: /* "ui-device_seedless" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.SELECT_ACCOUNT")
    @js.native
    val SELECT_ACCOUNT: /* "ui-select_account" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.SELECT_DEVICE")
    @js.native
    val SELECT_DEVICE: /* "ui-select_device" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.SELECT_FEE")
    @js.native
    val SELECT_FEE: /* "ui-select_fee" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.SET_OPERATION")
    @js.native
    val SET_OPERATION: /* "ui-set_operation" */ String = js.native
    
    // TRANSPORT is also defined as standalone namespace. plugin bug or invalid syntax?
    // eslint-disable-next-line @typescript-eslint/no-shadow
    @JSImport("trezor-connect/lib/typescript/constants", "UI.TRANSPORT")
    @js.native
    val TRANSPORT: /* "ui-no_transport" */ String = js.native
    
    @JSImport("trezor-connect/lib/typescript/constants", "UI.UPDATE_CUSTOM_FEE")
    @js.native
    val UPDATE_CUSTOM_FEE: /* "ui-update_custom_fee" */ String = js.native
  }
  
  @JSImport("trezor-connect/lib/typescript/constants", "UI_EVENT")
  @js.native
  val UI_EVENT: /* "UI_EVENT" */ String = js.native
}
