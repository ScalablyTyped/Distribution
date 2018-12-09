package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accounts extends js.Object {
  var wallet: web3Lib.Anon_Clear = js.native
  def create(): Account = js.native
  def create(entropy: java.lang.String): Account = js.native
  def decrypt(privateKey: PrivateKey, password: java.lang.String): Account = js.native
  def encrypt(privateKey: java.lang.String, password: java.lang.String): PrivateKey = js.native
  def privateKeyToAccount(privKey: java.lang.String): Account = js.native
  def publicToAddress(key: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: java.lang.String, sigOrV: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: java.lang.String, sigOrV: java.lang.String, r: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: java.lang.String, sigOrV: java.lang.String, r: java.lang.String, s: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: Signature): java.lang.String = js.native
  def recover(sigOrHash: Signature, sigOrV: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: Signature, sigOrV: java.lang.String, r: java.lang.String): java.lang.String = js.native
  def recover(sigOrHash: Signature, sigOrV: java.lang.String, r: java.lang.String, s: java.lang.String): java.lang.String = js.native
  def recoverTransaction(signature: java.lang.String): java.lang.String = js.native
  def sign(data: java.lang.String, privateKey: java.lang.String): MessageSignature = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx, privateKey: java.lang.String): js.Promise[TxSignature] = js.native
  def signTransaction(
    tx: web3Lib.ethTypesMod.Tx,
    privateKey: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ TxSignature, scala.Unit]
  ): js.Promise[TxSignature] = js.native
}

