package typings.three.anon

import typings.three.srcConstantsMod.MOUSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LEFT_ extends StObject {
  
  var LEFT: MOUSE
  
  var MIDDLE: MOUSE
  
  var RIGHT: MOUSE
}
object LEFT_ {
  
  inline def apply(LEFT: MOUSE, MIDDLE: MOUSE, RIGHT: MOUSE): LEFT_ = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEFT_]
  }
  
  extension [Self <: LEFT_](x: Self) {
    
    inline def setLEFT(value: MOUSE): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setMIDDLE(value: MOUSE): Self = StObject.set(x, "MIDDLE", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: MOUSE): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
  }
}
