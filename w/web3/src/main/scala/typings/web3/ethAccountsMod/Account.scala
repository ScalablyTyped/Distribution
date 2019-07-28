package typings.web3.ethAccountsMod

import typings.std.Error
import typings.web3.ethTypesMod.Tx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var address: String = js.native
  var privateKey: String = js.native
  def encrypt(password: String): PrivateKey = js.native
  def encrypt(password: String, options: js.Any): PrivateKey = js.native
  def sign(data: String): MessageSignature = js.native
  def signTransaction(tx: Tx): js.Promise[TxSignature] = js.native
  def signTransaction(tx: Tx, cb: js.Function2[/* err */ Error, /* result */ TxSignature, Unit]): js.Promise[TxSignature] = js.native
}

