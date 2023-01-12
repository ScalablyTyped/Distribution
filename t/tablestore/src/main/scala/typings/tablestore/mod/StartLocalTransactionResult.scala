package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLocalTransactionResult extends StObject {
  
  var transactionId: String
}
object StartLocalTransactionResult {
  
  inline def apply(transactionId: String): StartLocalTransactionResult = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalTransactionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartLocalTransactionResult] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
