package typings.web3CoreHelpers.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionRevertInstructionError
  extends StObject
     with Error {
  
  var reason: String
  
  var signature: String
}
object TransactionRevertInstructionError {
  
  inline def apply(message: String, name: String, reason: String, signature: String): TransactionRevertInstructionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRevertInstructionError]
  }
  
  extension [Self <: TransactionRevertInstructionError](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
