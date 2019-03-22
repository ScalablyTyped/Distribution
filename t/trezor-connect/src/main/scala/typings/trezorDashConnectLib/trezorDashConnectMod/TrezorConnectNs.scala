package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trezor-connect", "TrezorConnect")
@js.native
object TrezorConnectNs extends js.Object {
  def cancel(): scala.Unit = js.native
  def cipherKeyValue(
    params: trezorDashConnectLib.trezorDashConnectMod.Bundle[trezorDashConnectLib.trezorDashConnectMod.CipherKeyValueParams]
  ): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[js.Array[trezorDashConnectLib.trezorDashConnectMod.CipherKeyValue]]
  ] = js.native
  /**
    * Asks device to encrypt value using the private key derived by given BIP32
    * path and the given key. IV is always computed automatically.
    */
  def cipherKeyValue(params: trezorDashConnectLib.trezorDashConnectMod.CipherKeyValueParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.CipherKeyValue]
  ] = js.native
  /**
    * Requests a payment from the users wallet to a set of given outputs.
    * Internally a BIP-0044 account discovery is performed and user is presented
    * with a list of accounts. After account selection user is presented with
    * list of fee selection. After selecting a fee transaction is signed and
    * returned in hexadecimal format. Change output is added automatically, if
    * needed.
    */
  def composeTransaction(params: trezorDashConnectLib.trezorDashConnectMod.ComposeTransactionParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Transaction]
  ] = js.native
  def dispose(): scala.Unit = js.native
  /**
    * Gets an info of specified account.
    */
  def getAccountInfo(params: trezorDashConnectLib.trezorDashConnectMod.GetAccountInfoParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.AccountInfo]
  ] = js.native
  def getAddress(
    params: trezorDashConnectLib.trezorDashConnectMod.Bundle[trezorDashConnectLib.trezorDashConnectMod.GetAddressParams]
  ): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[js.Array[trezorDashConnectLib.trezorDashConnectMod.Address]]
  ] = js.native
  /**
    * Display requested address derived by given BIP32 path on device and
    * returns it to caller. User is asked to confirm the export on Trezor.
    */
  def getAddress(params: trezorDashConnectLib.trezorDashConnectMod.GetAddressParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Address]
  ] = js.native
  /**
    * Retrieves the set of features associated with the device.
    */
  def getFeatures(): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Features]
  ] = js.native
  def getFeatures(params: trezorDashConnectLib.trezorDashConnectMod.CommonParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Features]
  ] = js.native
  def getPublicKey(
    params: trezorDashConnectLib.trezorDashConnectMod.Bundle[trezorDashConnectLib.trezorDashConnectMod.GetPublicKeyParams]
  ): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[js.Array[trezorDashConnectLib.trezorDashConnectMod.PublicKey]]
  ] = js.native
  /**
    * Retrieves BIP32 extended public derived by given BIP32 path.
    * User is presented with a description of the requested key and asked to
    * confirm the export.
    */
  def getPublicKey(params: trezorDashConnectLib.trezorDashConnectMod.GetPublicKeyParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.PublicKey]
  ] = js.native
  /**
    * Retrieves the settings that TrezorConnect was initialized with.
    */
  def getSettings(): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Settings]
  ] = js.native
  /**
    * Initializes TrezorConnect.
    */
  def init(settings: trezorDashConnectLib.trezorDashConnectMod.Settings): scala.Unit = js.native
  /**
    * Broadcasts the transaction to the selected network.
    */
  def pushTransaction(params: trezorDashConnectLib.trezorDashConnectMod.PushTransactionParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.TransactionID]
  ] = js.native
  /**
    * Challenge-response authentication via Trezor.
    * To protect against replay attacks you should use a server-side generated
    * and randomized challengeHidden for every attempt. You can also provide a
    * visual challenge that will be shown on the device.
    */
  def requestLogin(params: trezorDashConnectLib.trezorDashConnectMod.RequestLoginParams): js.Promise[trezorDashConnectLib.trezorDashConnectMod.LoginDetails] = js.native
  /**
    * Performs device setup and generates a new seed.
    */
  def resetDevice(params: trezorDashConnectLib.trezorDashConnectMod.ResetDeviceParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Message]
  ] = js.native
  /**
    * Asks device to sign a message using the private key derived by given BIP32
    * path.
    */
  def signMessage(params: trezorDashConnectLib.trezorDashConnectMod.SignMessageParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.SignedMessage]
  ] = js.native
  /**
    * Asks device to sign given inputs and outputs of pre-composed transaction.
    * User is asked to confirm all transaction details on Trezor.
    */
  def signTransaction(params: trezorDashConnectLib.trezorDashConnectMod.SignTransactionParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.SignedTransaction]
  ] = js.native
  /**
    * Asks device to verify a message using the signer address and signature.
    */
  def verifyMessage(params: trezorDashConnectLib.trezorDashConnectMod.VerifyMessageParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Message]
  ] = js.native
  /**
    * Resets device to factory defaults and removes all private data.
    */
  def wipeDevice(): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Message]
  ] = js.native
  def wipeDevice(params: trezorDashConnectLib.trezorDashConnectMod.CommonParams): js.Promise[
    trezorDashConnectLib.trezorDashConnectMod.ResponseMessage[trezorDashConnectLib.trezorDashConnectMod.Message]
  ] = js.native
}

