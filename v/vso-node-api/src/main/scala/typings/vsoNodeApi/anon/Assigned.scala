package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assigned extends StObject {
  
  var active: scala.Double
  
  var assigned: scala.Double
  
  var moving: scala.Double
}
object Assigned {
  
  inline def apply(active: scala.Double, assigned: scala.Double, moving: scala.Double): Assigned = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assigned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assigned] (val x: Self) extends AnyVal {
    
    inline def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAssigned(value: scala.Double): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
    
    inline def setMoving(value: scala.Double): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
  }
}
