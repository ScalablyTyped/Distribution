package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accidental extends StObject {
  
  var accidental: String
  
  var code: Double
  
  var displaced: Boolean
  
  var int_value: Double
  
  var key: String
  
  var line: Double
  
  var octave: Double
  
  var shift_right: Double
  
  var stroke: Double
}
object Accidental {
  
  inline def apply(
    accidental: String,
    code: Double,
    displaced: Boolean,
    int_value: Double,
    key: String,
    line: Double,
    octave: Double,
    shift_right: Double,
    stroke: Double
  ): Accidental = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], displaced = displaced.asInstanceOf[js.Any], int_value = int_value.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], octave = octave.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accidental]
  }
  
  extension [Self <: Accidental](x: Self) {
    
    inline def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDisplaced(value: Boolean): Self = StObject.set(x, "displaced", value.asInstanceOf[js.Any])
    
    inline def setInt_value(value: Double): Self = StObject.set(x, "int_value", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOctave(value: Double): Self = StObject.set(x, "octave", value.asInstanceOf[js.Any])
    
    inline def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
