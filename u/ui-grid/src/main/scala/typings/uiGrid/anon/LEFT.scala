package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LEFT extends StObject {
  
  var DOWN: Double = js.native
  
  var LEFT: Double = js.native
  
  var PG_DOWN: Double = js.native
  
  var PG_UP: Double = js.native
  
  var RIGHT: Double = js.native
  
  var UP: Double = js.native
}
object LEFT {
  
  @scala.inline
  def apply(DOWN: Double, LEFT: Double, PG_DOWN: Double, PG_UP: Double, RIGHT: Double, UP: Double): LEFT = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], PG_DOWN = PG_DOWN.asInstanceOf[js.Any], PG_UP = PG_UP.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEFT]
  }
  
  @scala.inline
  implicit class LEFTMutableBuilder[Self <: LEFT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOWN(value: Double): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: Double): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPG_DOWN(value: Double): Self = StObject.set(x, "PG_DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPG_UP(value: Double): Self = StObject.set(x, "PG_UP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: Double): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUP(value: Double): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
  }
}
