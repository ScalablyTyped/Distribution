package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
  var address: String = js.native
  
  def encrypt(password: String): EncryptedKeystoreV3Json = js.native
  
  var privateKey: String = js.native
  
  def sign(data: String): Sign = js.native
  
  def signTransaction(transactionConfig: TransactionConfig): js.Promise[SignedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function1[/* signTransaction */ SignedTransaction, Unit]
  ): js.Promise[SignedTransaction] = js.native
}
