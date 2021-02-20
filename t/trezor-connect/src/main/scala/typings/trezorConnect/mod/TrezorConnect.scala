package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TrezorConnect {
  
  @JSImport("trezor-connect", "TrezorConnect.cancel")
  @js.native
  def cancel(): Unit = js.native
  
  @JSImport("trezor-connect", "TrezorConnect.cipherKeyValue")
  @js.native
  def cipherKeyValue(params: Bundle[CipherKeyValueParams]): js.Promise[ResponseMessage[js.Array[CipherKeyValue]]] = js.native
  /**
    * Asks device to encrypt value using the private key derived by given BIP32
    * path and the given key. IV is always computed automatically.
    */
  @JSImport("trezor-connect", "TrezorConnect.cipherKeyValue")
  @js.native
  def cipherKeyValue(params: CipherKeyValueParams): js.Promise[ResponseMessage[CipherKeyValue]] = js.native
  
  /**
    * Requests a payment from the users wallet to a set of given outputs.
    * Internally a BIP-0044 account discovery is performed and user is presented
    * with a list of accounts. After account selection user is presented with
    * list of fee selection. After selecting a fee transaction is signed and
    * returned in hexadecimal format. Change output is added automatically, if
    * needed.
    */
  @JSImport("trezor-connect", "TrezorConnect.composeTransaction")
  @js.native
  def composeTransaction(params: ComposeTransactionParams): js.Promise[ResponseMessage[Transaction]] = js.native
  
  @JSImport("trezor-connect", "TrezorConnect.dispose")
  @js.native
  def dispose(): Unit = js.native
  
  /**
    * Gets an info of specified account.
    */
  @JSImport("trezor-connect", "TrezorConnect.getAccountInfo")
  @js.native
  def getAccountInfo(params: GetAccountInfoParams): js.Promise[ResponseMessage[AccountInfo]] = js.native
  
  @JSImport("trezor-connect", "TrezorConnect.getAddress")
  @js.native
  def getAddress(params: Bundle[GetAddressParams]): js.Promise[ResponseMessage[js.Array[Address]]] = js.native
  /**
    * Display requested address derived by given BIP32 path on device and
    * returns it to caller. User is asked to confirm the export on Trezor.
    */
  @JSImport("trezor-connect", "TrezorConnect.getAddress")
  @js.native
  def getAddress(params: GetAddressParams): js.Promise[ResponseMessage[Address]] = js.native
  
  /**
    * Retrieves the set of features associated with the device.
    */
  @JSImport("trezor-connect", "TrezorConnect.getFeatures")
  @js.native
  def getFeatures(): js.Promise[ResponseMessage[Features]] = js.native
  @JSImport("trezor-connect", "TrezorConnect.getFeatures")
  @js.native
  def getFeatures(params: CommonParams): js.Promise[ResponseMessage[Features]] = js.native
  
  @JSImport("trezor-connect", "TrezorConnect.getPublicKey")
  @js.native
  def getPublicKey(params: Bundle[GetPublicKeyParams]): js.Promise[ResponseMessage[js.Array[PublicKey]]] = js.native
  /**
    * Retrieves BIP32 extended public derived by given BIP32 path.
    * User is presented with a description of the requested key and asked to
    * confirm the export.
    */
  @JSImport("trezor-connect", "TrezorConnect.getPublicKey")
  @js.native
  def getPublicKey(params: GetPublicKeyParams): js.Promise[ResponseMessage[PublicKey]] = js.native
  
  /**
    * Retrieves the settings that TrezorConnect was initialized with.
    */
  @JSImport("trezor-connect", "TrezorConnect.getSettings")
  @js.native
  def getSettings(): js.Promise[ResponseMessage[Settings]] = js.native
  
  /**
    * Initializes TrezorConnect.
    */
  @JSImport("trezor-connect", "TrezorConnect.init")
  @js.native
  def init(settings: Settings): Unit = js.native
  
  @JSImport("trezor-connect", "TrezorConnect.manifest")
  @js.native
  def manifest(params: ManifestParams): Unit = js.native
  
  /**
    * Broadcasts the transaction to the selected network.
    */
  @JSImport("trezor-connect", "TrezorConnect.pushTransaction")
  @js.native
  def pushTransaction(params: PushTransactionParams): js.Promise[ResponseMessage[TransactionID]] = js.native
  
  /**
    * Challenge-response authentication via Trezor.
    * To protect against replay attacks you should use a server-side generated
    * and randomized challengeHidden for every attempt. You can also provide a
    * visual challenge that will be shown on the device.
    */
  @JSImport("trezor-connect", "TrezorConnect.requestLogin")
  @js.native
  def requestLogin(params: RequestLoginParams): js.Promise[LoginDetails] = js.native
  
  /**
    * Performs device setup and generates a new seed.
    */
  @JSImport("trezor-connect", "TrezorConnect.resetDevice")
  @js.native
  def resetDevice(params: ResetDeviceParams): js.Promise[ResponseMessage[Message]] = js.native
  
  /**
    * Asks device to sign a message using the private key derived by given BIP32
    * path.
    */
  @JSImport("trezor-connect", "TrezorConnect.signMessage")
  @js.native
  def signMessage(params: SignMessageParams): js.Promise[ResponseMessage[SignedMessage]] = js.native
  
  /**
    * Asks device to sign given inputs and outputs of pre-composed transaction.
    * User is asked to confirm all transaction details on Trezor.
    */
  @JSImport("trezor-connect", "TrezorConnect.signTransaction")
  @js.native
  def signTransaction(params: SignTransactionParams): js.Promise[ResponseMessage[SignedTransaction]] = js.native
  
  /**
    * Asks device to verify a message using the signer address and signature.
    */
  @JSImport("trezor-connect", "TrezorConnect.verifyMessage")
  @js.native
  def verifyMessage(params: VerifyMessageParams): js.Promise[ResponseMessage[Message]] = js.native
  
  /**
    * Resets device to factory defaults and removes all private data.
    */
  @JSImport("trezor-connect", "TrezorConnect.wipeDevice")
  @js.native
  def wipeDevice(): js.Promise[ResponseMessage[Message]] = js.native
  @JSImport("trezor-connect", "TrezorConnect.wipeDevice")
  @js.native
  def wipeDevice(params: CommonParams): js.Promise[ResponseMessage[Message]] = js.native
}
