package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Radar.EarlyFraudWarningsResource
import typings.stripe.mod.Stripe.Radar.ValueListItemsResource
import typings.stripe.mod.Stripe.Radar.ValueListsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadar extends StObject {
  
  var EarlyFraudWarningsResource: Instantiable0[typings.stripe.mod.Stripe.Radar.EarlyFraudWarningsResource]
  
  val ValueList: Any
  
  val ValueListCreateParams: Any
  
  var ValueListItemsResource: Instantiable0[typings.stripe.mod.Stripe.Radar.ValueListItemsResource]
  
  var ValueListsResource: Instantiable0[typings.stripe.mod.Stripe.Radar.ValueListsResource]
}
object TypeofRadar {
  
  inline def apply(
    EarlyFraudWarningsResource: Instantiable0[EarlyFraudWarningsResource],
    ValueList: Any,
    ValueListCreateParams: Any,
    ValueListItemsResource: Instantiable0[ValueListItemsResource],
    ValueListsResource: Instantiable0[ValueListsResource]
  ): TypeofRadar = {
    val __obj = js.Dynamic.literal(EarlyFraudWarningsResource = EarlyFraudWarningsResource.asInstanceOf[js.Any], ValueList = ValueList.asInstanceOf[js.Any], ValueListCreateParams = ValueListCreateParams.asInstanceOf[js.Any], ValueListItemsResource = ValueListItemsResource.asInstanceOf[js.Any], ValueListsResource = ValueListsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRadar] (val x: Self) extends AnyVal {
    
    inline def setEarlyFraudWarningsResource(value: Instantiable0[EarlyFraudWarningsResource]): Self = StObject.set(x, "EarlyFraudWarningsResource", value.asInstanceOf[js.Any])
    
    inline def setValueList(value: Any): Self = StObject.set(x, "ValueList", value.asInstanceOf[js.Any])
    
    inline def setValueListCreateParams(value: Any): Self = StObject.set(x, "ValueListCreateParams", value.asInstanceOf[js.Any])
    
    inline def setValueListItemsResource(value: Instantiable0[ValueListItemsResource]): Self = StObject.set(x, "ValueListItemsResource", value.asInstanceOf[js.Any])
    
    inline def setValueListsResource(value: Instantiable0[ValueListsResource]): Self = StObject.set(x, "ValueListsResource", value.asInstanceOf[js.Any])
  }
}
