package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTransaction extends StObject {
  
  val PurchaseDetails: TypeofPurchaseDetails
}
object TypeofTransaction {
  
  inline def apply(PurchaseDetails: TypeofPurchaseDetails): TypeofTransaction = {
    val __obj = js.Dynamic.literal(PurchaseDetails = PurchaseDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTransaction]
  }
  
  extension [Self <: TypeofTransaction](x: Self) {
    
    inline def setPurchaseDetails(value: TypeofPurchaseDetails): Self = StObject.set(x, "PurchaseDetails", value.asInstanceOf[js.Any])
  }
}
