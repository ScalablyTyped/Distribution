package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("trezor-connect", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
  
  @scala.inline
  def cipherKeyValue(params: Bundle[CipherKeyValueParams]): js.Promise[ResponseMessage[js.Array[CipherKeyValue]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[js.Array[CipherKeyValue]]]]
  /**
    * Asks device to encrypt value using the private key derived by given BIP32
    * path and the given key. IV is always computed automatically.
    */
  @scala.inline
  def cipherKeyValue(params: CipherKeyValueParams): js.Promise[ResponseMessage[CipherKeyValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[CipherKeyValue]]]
  
  /**
    * Requests a payment from the users wallet to a set of given outputs.
    * Internally a BIP-0044 account discovery is performed and user is presented
    * with a list of accounts. After account selection user is presented with
    * list of fee selection. After selecting a fee transaction is signed and
    * returned in hexadecimal format. Change output is added automatically, if
    * needed.
    */
  @scala.inline
  def composeTransaction(params: ComposeTransactionParams): js.Promise[ResponseMessage[Transaction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Transaction]]]
  
  @scala.inline
  def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
  
  /**
    * Gets an info of specified account.
    */
  @scala.inline
  def getAccountInfo(params: GetAccountInfoParams): js.Promise[ResponseMessage[AccountInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[AccountInfo]]]
  
  @scala.inline
  def getAddress(params: Bundle[GetAddressParams]): js.Promise[ResponseMessage[js.Array[Address]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[js.Array[Address]]]]
  /**
    * Display requested address derived by given BIP32 path on device and
    * returns it to caller. User is asked to confirm the export on Trezor.
    */
  @scala.inline
  def getAddress(params: GetAddressParams): js.Promise[ResponseMessage[Address]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Address]]]
  
  /**
    * Retrieves the set of features associated with the device.
    */
  @scala.inline
  def getFeatures(): js.Promise[ResponseMessage[Features]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")().asInstanceOf[js.Promise[ResponseMessage[Features]]]
  @scala.inline
  def getFeatures(params: CommonParams): js.Promise[ResponseMessage[Features]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Features]]]
  
  @scala.inline
  def getPublicKey(params: Bundle[GetPublicKeyParams]): js.Promise[ResponseMessage[js.Array[PublicKey]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[js.Array[PublicKey]]]]
  /**
    * Retrieves BIP32 extended public derived by given BIP32 path.
    * User is presented with a description of the requested key and asked to
    * confirm the export.
    */
  @scala.inline
  def getPublicKey(params: GetPublicKeyParams): js.Promise[ResponseMessage[PublicKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[PublicKey]]]
  
  /**
    * Retrieves the settings that TrezorConnect was initialized with.
    */
  @scala.inline
  def getSettings(): js.Promise[ResponseMessage[Settings]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[js.Promise[ResponseMessage[Settings]]]
  
  /**
    * Initializes TrezorConnect.
    */
  @scala.inline
  def init(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def manifest(params: ManifestParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Broadcasts the transaction to the selected network.
    */
  @scala.inline
  def pushTransaction(params: PushTransactionParams): js.Promise[ResponseMessage[TransactionID]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[TransactionID]]]
  
  /**
    * Challenge-response authentication via Trezor.
    * To protect against replay attacks you should use a server-side generated
    * and randomized challengeHidden for every attempt. You can also provide a
    * visual challenge that will be shown on the device.
    */
  @scala.inline
  def requestLogin(params: RequestLoginParams): js.Promise[LoginDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoginDetails]]
  
  /**
    * Performs device setup and generates a new seed.
    */
  @scala.inline
  def resetDevice(params: ResetDeviceParams): js.Promise[ResponseMessage[Message]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Message]]]
  
  /**
    * Asks device to sign a message using the private key derived by given BIP32
    * path.
    */
  @scala.inline
  def signMessage(params: SignMessageParams): js.Promise[ResponseMessage[SignedMessage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[SignedMessage]]]
  
  /**
    * Asks device to sign given inputs and outputs of pre-composed transaction.
    * User is asked to confirm all transaction details on Trezor.
    */
  @scala.inline
  def signTransaction(params: SignTransactionParams): js.Promise[ResponseMessage[SignedTransaction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("signTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[SignedTransaction]]]
  
  /**
    * Asks device to verify a message using the signer address and signature.
    */
  @scala.inline
  def verifyMessage(params: VerifyMessageParams): js.Promise[ResponseMessage[Message]] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Message]]]
  
  /**
    * Resets device to factory defaults and removes all private data.
    */
  @scala.inline
  def wipeDevice(): js.Promise[ResponseMessage[Message]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")().asInstanceOf[js.Promise[ResponseMessage[Message]]]
  @scala.inline
  def wipeDevice(params: CommonParams): js.Promise[ResponseMessage[Message]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseMessage[Message]]]
}
