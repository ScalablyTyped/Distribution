package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the size of padding around a timed text region. */
trait TimedTextPadding extends StObject {
  
  /** The padding after the timed text region. */
  var after: Double
  
  /** The padding before the timed text region. */
  var before: Double
  
  /** The padding towards the end of the timed text. */
  var end: Double
  
  /** The padding towards the start of the timed text. */
  var start: Double
  
  /** The units in which the other members of the structure are expressed. */
  var unit: TimedTextUnit
}
object TimedTextPadding {
  
  @scala.inline
  def apply(after: Double, before: Double, end: Double, start: Double, unit: TimedTextUnit): TimedTextPadding = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextPadding]
  }
  
  @scala.inline
  implicit class TimedTextPaddingMutableBuilder[Self <: TimedTextPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: TimedTextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
