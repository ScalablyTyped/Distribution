package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Personal")
@js.native
class Personal () extends js.Object {
  def ecRecover(message: java.lang.String, sig: java.lang.String): scala.Unit = js.native
  def importRawKey(): js.Promise[java.lang.String] = js.native
  def lockAccount(): js.Promise[scala.Boolean] = js.native
  def newAccount(password: java.lang.String): js.Promise[java.lang.String] = js.native
  def newAccount(password: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Boolean]): js.Promise[java.lang.String] = js.native
  def sendTransaction(tx: Tx, passphrase: java.lang.String): js.Promise[java.lang.String] = js.native
  def sign(): js.Promise[java.lang.String] = js.native
  def unlockAccount(address: java.lang.String, password: java.lang.String, unlockDuration: scala.Double): scala.Unit = js.native
}

