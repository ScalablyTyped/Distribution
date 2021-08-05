package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDeliveryTimelineView extends StObject {
  
  var enumValues: DeliveryTimelineView
}
object EnumValuesDeliveryTimelineView {
  
  inline def apply(enumValues: DeliveryTimelineView): EnumValuesDeliveryTimelineView = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeliveryTimelineView]
  }
  
  extension [Self <: EnumValuesDeliveryTimelineView](x: Self) {
    
    inline def setEnumValues(value: DeliveryTimelineView): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
