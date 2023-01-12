package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM extends StObject {
  
  var BOTTOM: String
  
  var LEFT: String
  
  var RIGHT: String
  
  var UP: String
}
object BOTTOM {
  
  inline def apply(BOTTOM: String, LEFT: String, RIGHT: String, UP: String): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOTTOM] (val x: Self) extends AnyVal {
    
    inline def setBOTTOM(value: String): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: String): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: String): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setUP(value: String): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
  }
}
