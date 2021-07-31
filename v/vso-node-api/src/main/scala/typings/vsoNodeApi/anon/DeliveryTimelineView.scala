package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryTimelineView extends StObject {
  
  var deliveryTimelineView: scala.Double
}
object DeliveryTimelineView {
  
  @scala.inline
  def apply(deliveryTimelineView: scala.Double): DeliveryTimelineView = {
    val __obj = js.Dynamic.literal(deliveryTimelineView = deliveryTimelineView.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryTimelineView]
  }
  
  @scala.inline
  implicit class DeliveryTimelineViewMutableBuilder[Self <: DeliveryTimelineView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryTimelineView(value: scala.Double): Self = StObject.set(x, "deliveryTimelineView", value.asInstanceOf[js.Any])
  }
}
