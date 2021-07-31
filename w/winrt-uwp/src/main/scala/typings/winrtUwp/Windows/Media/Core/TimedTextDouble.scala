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
  
  @scala.inline
  def apply(unit: TimedTextUnit, value: Double): TimedTextDouble = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextDouble]
  }
  
  @scala.inline
  implicit class TimedTextDoubleMutableBuilder[Self <: TimedTextDouble] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: TimedTextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
