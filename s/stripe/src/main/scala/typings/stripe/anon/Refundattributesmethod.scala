package typings.stripe.anon

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Refundattributesmethod extends StObject {
  
  var refund_attributes_method: js.UndefOr[email | manual] = js.native
}
object Refundattributesmethod {
  
  @scala.inline
  def apply(): Refundattributesmethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refundattributesmethod]
  }
  
  @scala.inline
  implicit class RefundattributesmethodMutableBuilder[Self <: Refundattributesmethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefund_attributes_method(value: email | manual): Self = StObject.set(x, "refund_attributes_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_attributes_methodUndefined: Self = StObject.set(x, "refund_attributes_method", js.undefined)
  }
}
