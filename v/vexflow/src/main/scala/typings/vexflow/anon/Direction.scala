package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: Double = js.native
  
  var first_x: Double = js.native
  
  var first_y: Double = js.native
  
  var last_x: Double = js.native
  
  var last_y: Double = js.native
}
object Direction {
  
  @scala.inline
  def apply(direction: Double, first_x: Double, first_y: Double, last_x: Double, last_y: Double): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_x(value: Double): Self = StObject.set(x, "first_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_y(value: Double): Self = StObject.set(x, "first_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_x(value: Double): Self = StObject.set(x, "last_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_y(value: Double): Self = StObject.set(x, "last_y", value.asInstanceOf[js.Any])
  }
}
