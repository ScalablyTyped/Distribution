package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  var capacityPerDay: Double
  
  var name: String
}
object Activity {
  
  inline def apply(capacityPerDay: Double, name: String): Activity = {
    val __obj = js.Dynamic.literal(capacityPerDay = capacityPerDay.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    inline def setCapacityPerDay(value: Double): Self = StObject.set(x, "capacityPerDay", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
