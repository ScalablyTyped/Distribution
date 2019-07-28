package typings.web3.ethTypesMod

import typings.web3.typesMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Personal")
@js.native
class Personal () extends js.Object {
  def ecRecover(message: String, sig: String): Unit = js.native
  def importRawKey(): js.Promise[String] = js.native
  def lockAccount(): js.Promise[Boolean] = js.native
  def newAccount(password: String): js.Promise[String] = js.native
  def newAccount(password: String, cb: Callback[Boolean]): js.Promise[String] = js.native
  def sendTransaction(tx: Tx, passphrase: String): js.Promise[String] = js.native
  def sign(): js.Promise[String] = js.native
  def unlockAccount(address: String, password: String, unlockDuration: Double): Unit = js.native
}

