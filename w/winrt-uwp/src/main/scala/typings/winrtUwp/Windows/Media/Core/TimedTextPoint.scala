package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents 2D coordinate that is used to convey the values of timed text style properties. */
trait TimedTextPoint extends StObject {
  
  /** The units of the coordinates, either pixels or percentage. */
  var unit: TimedTextUnit
  
  /** The X coordinate of the point. */
  var x: Double
  
  /** The Y coordinate of the point. */
  var y: Double
}
object TimedTextPoint {
  
  @scala.inline
  def apply(unit: TimedTextUnit, x: Double, y: Double): TimedTextPoint = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextPoint]
  }
  
  @scala.inline
  implicit class TimedTextPointMutableBuilder[Self <: TimedTextPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: TimedTextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
