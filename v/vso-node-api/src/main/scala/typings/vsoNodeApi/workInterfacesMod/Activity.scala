package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  var capacityPerDay: Double
  
  var name: String
}
object Activity {
  
  @scala.inline
  def apply(capacityPerDay: Double, name: String): Activity = {
    val __obj = js.Dynamic.literal(capacityPerDay = capacityPerDay.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityPerDay(value: Double): Self = StObject.set(x, "capacityPerDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
