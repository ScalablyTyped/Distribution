package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a floating point value that is used to convey the values of timed text style properties. */
trait TimedTextDouble extends StObject {
  
  /** The units of the value, either pixels or percentage. */
  var unit: TimedTextUnit
  
  /** The value. */
  var value: Double
}
object TimedTextDouble {
  
  inline def apply(unit: TimedTextUnit, value: Double): TimedTextDouble = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextDouble]
  }
  
  extension [Self <: TimedTextDouble](x: Self) {
    
    inline def setUnit(value: TimedTextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
