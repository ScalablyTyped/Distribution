package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingBuyData extends StObject {
  
  /**
    * Payment information. It is same with paymentDetails param of buyItem.
    *
    * @since 2.4
    */
  var payDetail: String
  
  /**
    * Payment result
    *
    * @since 2.4
    */
  var payResult: String
}
object BillingBuyData {
  
  inline def apply(payDetail: String, payResult: String): BillingBuyData = {
    val __obj = js.Dynamic.literal(payDetail = payDetail.asInstanceOf[js.Any], payResult = payResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingBuyData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingBuyData] (val x: Self) extends AnyVal {
    
    inline def setPayDetail(value: String): Self = StObject.set(x, "payDetail", value.asInstanceOf[js.Any])
    
    inline def setPayResult(value: String): Self = StObject.set(x, "payResult", value.asInstanceOf[js.Any])
  }
}
