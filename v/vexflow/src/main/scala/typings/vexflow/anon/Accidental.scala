package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accidental extends StObject {
  
  var accidental: String = js.native
  
  var code: Double = js.native
  
  var displaced: Boolean = js.native
  
  var int_value: Double = js.native
  
  var key: String = js.native
  
  var line: Double = js.native
  
  var octave: Double = js.native
  
  var shift_right: Double = js.native
  
  var stroke: Double = js.native
}
object Accidental {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AccidentalMutableBuilder[Self <: Accidental] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaced(value: Boolean): Self = StObject.set(x, "displaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt_value(value: Double): Self = StObject.set(x, "int_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOctave(value: Double): Self = StObject.set(x, "octave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
