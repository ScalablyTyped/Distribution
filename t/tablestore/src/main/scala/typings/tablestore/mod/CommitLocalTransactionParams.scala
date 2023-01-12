package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitLocalTransactionParams extends StObject {
  
  var transactionId: String
}
object CommitLocalTransactionParams {
  
  inline def apply(transactionId: String): CommitLocalTransactionParams = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitLocalTransactionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitLocalTransactionParams] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
