package typings.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultibancoDetails extends StObject {
  
  var entity: String = js.native
  
  var reference: String = js.native
}
object MultibancoDetails {
  
  @scala.inline
  def apply(entity: String, reference: String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultibancoDetails]
  }
  
  @scala.inline
  implicit class MultibancoDetailsMutableBuilder[Self <: MultibancoDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
