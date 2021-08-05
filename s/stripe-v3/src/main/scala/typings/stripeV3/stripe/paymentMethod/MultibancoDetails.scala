package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultibancoDetails extends StObject {
  
  var entity: String
  
  var reference: String
}
object MultibancoDetails {
  
  inline def apply(entity: String, reference: String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultibancoDetails]
  }
  
  extension [Self <: MultibancoDetails](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
