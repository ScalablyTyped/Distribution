package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains ranges of time for various reasons.
  * @see https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges
  */
@js.native
trait TimeRange extends StObject {
  
  /**
    * Returns the time offset at which a specified time range ends.
    *
    * @param [index=0]
    *        The range number to return the time for.
    *
    * @return The time that offset at the specified index.
    */
  def end(index: Double): Double = js.native
  
  /**
    *           The number of time ranges represented by this Object
    */
  val length: Double = js.native
  
  /**
    * Returns the time offset at which a specified time range begins.
    *
    * @param [index=0]
    *        The range number to return the time for.
    *
    * @return The time that offset at the specified index.
    */
  def start(index: Double): Double = js.native
}
object TimeRange {
  
  @scala.inline
  def apply(end: Double => Double, length: Double, start: Double => Double): TimeRange = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[TimeRange]
  }
  
  @scala.inline
  implicit class TimeRangeMutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
