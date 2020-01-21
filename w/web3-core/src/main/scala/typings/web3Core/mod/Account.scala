package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var address: String = js.native
  var privateKey: String = js.native
  def encrypt(password: String): EncryptedKeystoreV3Json = js.native
  def sign(data: String): Sign = js.native
  def signTransaction(transactionConfig: TransactionConfig): js.Promise[SignedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function1[/* signTransaction */ SignedTransaction, Unit]
  ): js.Promise[SignedTransaction] = js.native
}

