package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var address: java.lang.String = js.native
  var privateKey: java.lang.String = js.native
  def encrypt(password: java.lang.String): PrivateKey = js.native
  def encrypt(password: java.lang.String, options: js.Any): PrivateKey = js.native
  def sign(data: java.lang.String): MessageSignature = js.native
  def signTransaction(tx: web3Lib.ethTypesMod.Tx): js.Promise[TxSignature] = js.native
  def signTransaction(
    tx: web3Lib.ethTypesMod.Tx,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ TxSignature, scala.Unit]
  ): js.Promise[TxSignature] = js.native
}

