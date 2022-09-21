package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPayouts extends StObject {
  
  val Schedule: Any
}
object TypeofPayouts {
  
  inline def apply(Schedule: Any): TypeofPayouts = {
    val __obj = js.Dynamic.literal(Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPayouts]
  }
  
  extension [Self <: TypeofPayouts](x: Self) {
    
    inline def setSchedule(value: Any): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
  }
}
