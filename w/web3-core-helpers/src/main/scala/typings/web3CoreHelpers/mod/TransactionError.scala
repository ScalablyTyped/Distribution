package typings.web3CoreHelpers.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionError
  extends StObject
     with Error {
  
  var receipt: js.Object
}
object TransactionError {
  
  @scala.inline
  def apply(message: String, name: String, receipt: js.Object): TransactionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionError]
  }
  
  @scala.inline
  implicit class TransactionErrorMutableBuilder[Self <: TransactionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceipt(value: js.Object): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
  }
}
