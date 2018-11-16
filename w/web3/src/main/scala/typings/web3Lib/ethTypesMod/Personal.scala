package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Personal")
@js.native
class Personal () extends js.Object {
  def ecRecover(message: java.lang.String, sig: java.lang.String): scala.Unit = js.native
  def importRawKey(): stdLib.Promise[java.lang.String] = js.native
  def lockAccount(): stdLib.Promise[scala.Boolean] = js.native
  def newAccount(password: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def newAccount(password: java.lang.String, cb: web3Lib.typesMod.Callback[scala.Boolean]): stdLib.Promise[java.lang.String] = js.native
  def sendTransaction(tx: Tx, passphrase: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def sign(): stdLib.Promise[java.lang.String] = js.native
  def unlockAccount(address: java.lang.String, password: java.lang.String, unlockDuration: scala.Double): scala.Unit = js.native
}

