package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.TestHelpers.Issuing.CardsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIssuingCardsResource extends StObject {
  
  var CardsResource: Instantiable0[typings.stripe.mod.Stripe.TestHelpers.Issuing.CardsResource]
}
object TypeofIssuingCardsResource {
  
  inline def apply(CardsResource: Instantiable0[CardsResource]): TypeofIssuingCardsResource = {
    val __obj = js.Dynamic.literal(CardsResource = CardsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIssuingCardsResource]
  }
  
  extension [Self <: TypeofIssuingCardsResource](x: Self) {
    
    inline def setCardsResource(value: Instantiable0[CardsResource]): Self = StObject.set(x, "CardsResource", value.asInstanceOf[js.Any])
  }
}
