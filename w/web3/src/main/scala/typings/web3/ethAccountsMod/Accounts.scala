package typings.web3.ethAccountsMod

import typings.std.Error
import typings.web3.Anon_Account
import typings.web3.ethTypesMod.Tx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accounts extends js.Object {
  var wallet: Anon_Account = js.native
  def create(): Account = js.native
  def create(entropy: String): Account = js.native
  def decrypt(privateKey: PrivateKey, password: String): Account = js.native
  def encrypt(privateKey: String, password: String): PrivateKey = js.native
  def privateKeyToAccount(privKey: String): Account = js.native
  def publicToAddress(key: String): String = js.native
  def recover(sigOrHash: String): String = js.native
  def recover(sigOrHash: String, sigOrV: String): String = js.native
  def recover(sigOrHash: String, sigOrV: String, r: String): String = js.native
  def recover(sigOrHash: String, sigOrV: String, r: String, s: String): String = js.native
  def recover(sigOrHash: Signature): String = js.native
  def recover(sigOrHash: Signature, sigOrV: String): String = js.native
  def recover(sigOrHash: Signature, sigOrV: String, r: String): String = js.native
  def recover(sigOrHash: Signature, sigOrV: String, r: String, s: String): String = js.native
  def recoverTransaction(signature: String): String = js.native
  def sign(data: String, privateKey: String): MessageSignature = js.native
  def signTransaction(tx: Tx, privateKey: String): js.Promise[TxSignature] = js.native
  def signTransaction(tx: Tx, privateKey: String, cb: js.Function2[/* err */ Error, /* result */ TxSignature, Unit]): js.Promise[TxSignature] = js.native
}

