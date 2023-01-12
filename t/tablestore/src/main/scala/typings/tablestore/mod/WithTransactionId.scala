package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  transactionId :string}> */
trait WithTransactionId extends StObject {
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object WithTransactionId {
  
  inline def apply(): WithTransactionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithTransactionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithTransactionId] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
