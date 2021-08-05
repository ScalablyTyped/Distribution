package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOWN extends StObject {
  
  var DOWN: String
  
  var LEFT: String
  
  var NONE: String
  
  var RIGHT: String
  
  var UP: String
}
object DOWN {
  
  inline def apply(DOWN: String, LEFT: String, NONE: String, RIGHT: String, UP: String): DOWN = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOWN]
  }
  
  extension [Self <: DOWN](x: Self) {
    
    inline def setDOWN(value: String): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: String): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: String): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setUP(value: String): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
  }
}
