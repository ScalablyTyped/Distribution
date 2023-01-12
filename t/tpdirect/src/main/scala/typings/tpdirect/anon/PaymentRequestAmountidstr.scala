package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tpdirect.PaymentRequestAmount & {  id :string,   detail :string} */
trait PaymentRequestAmountidstr extends StObject {
  
  var amount: Currency
  
  var detail: String
  
  var id: String
  
  var label: String
}
object PaymentRequestAmountidstr {
  
  inline def apply(amount: Currency, detail: String, id: String, label: String): PaymentRequestAmountidstr = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestAmountidstr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentRequestAmountidstr] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
