package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferredPaymentRequest extends StObject {
  
  /**
    * default is false
    */
  var isAmountPending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * default is true
    */
  var isShowTotalAmount: js.UndefOr[Boolean] = js.undefined
}
object DeferredPaymentRequest {
  
  inline def apply(): DeferredPaymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeferredPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setIsAmountPending(value: Boolean): Self = StObject.set(x, "isAmountPending", value.asInstanceOf[js.Any])
    
    inline def setIsAmountPendingUndefined: Self = StObject.set(x, "isAmountPending", js.undefined)
    
    inline def setIsShowTotalAmount(value: Boolean): Self = StObject.set(x, "isShowTotalAmount", value.asInstanceOf[js.Any])
    
    inline def setIsShowTotalAmountUndefined: Self = StObject.set(x, "isShowTotalAmount", js.undefined)
  }
}
