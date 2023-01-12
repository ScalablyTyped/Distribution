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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDeliveryTimelineView] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: DeliveryTimelineView): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
