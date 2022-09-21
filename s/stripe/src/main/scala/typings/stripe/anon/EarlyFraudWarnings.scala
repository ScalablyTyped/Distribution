package typings.stripe.anon

import typings.stripe.mod.Stripe.Radar.EarlyFraudWarningsResource
import typings.stripe.mod.Stripe.Radar.ValueListItemsResource
import typings.stripe.mod.Stripe.Radar.ValueListsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EarlyFraudWarnings extends StObject {
  
  var earlyFraudWarnings: EarlyFraudWarningsResource
  
  var valueListItems: ValueListItemsResource
  
  var valueLists: ValueListsResource
}
object EarlyFraudWarnings {
  
  inline def apply(
    earlyFraudWarnings: EarlyFraudWarningsResource,
    valueListItems: ValueListItemsResource,
    valueLists: ValueListsResource
  ): EarlyFraudWarnings = {
    val __obj = js.Dynamic.literal(earlyFraudWarnings = earlyFraudWarnings.asInstanceOf[js.Any], valueListItems = valueListItems.asInstanceOf[js.Any], valueLists = valueLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarlyFraudWarnings]
  }
  
  extension [Self <: EarlyFraudWarnings](x: Self) {
    
    inline def setEarlyFraudWarnings(value: EarlyFraudWarningsResource): Self = StObject.set(x, "earlyFraudWarnings", value.asInstanceOf[js.Any])
    
    inline def setValueListItems(value: ValueListItemsResource): Self = StObject.set(x, "valueListItems", value.asInstanceOf[js.Any])
    
    inline def setValueLists(value: ValueListsResource): Self = StObject.set(x, "valueLists", value.asInstanceOf[js.Any])
  }
}
