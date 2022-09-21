package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "TimeDuration")
@js.native
open class TimeDuration protected () extends StObject {
  def this(length: Double) = this()
  def this(length: Double, unit: TimeDurationUnit) = this()
  
  /**
    * Calculates the difference between two TimeDuration objects.
    *
    * Calculates the difference in time between _this_ and _other_.
    * The TimeDuration that is returned is effectively _first_ - _other_ (that is: positive if the first parameter is larger).
    *
    * The returned TimeDuration is the biggest possible unit without losing the precision.
    *
    * @param other Other TimeDuration object to compare to.
    *
    * @returns New TimeDuration object corresponding to the result of _this_ - _other_.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def difference(other: TimeDuration): TimeDuration = js.native
  
  /**
    * Checks whether the TimeDuration is equal to another.
    *
    * This method takes the units into consideration and will return true
    * if the two TimeDuration objects represent the same duration in different units.
    *
    * @param other Other TimeDuration object to compare to.
    *
    * @returns true if the two TimeDuration object represent the same duration.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def equalsTo(other: TimeDuration): Boolean = js.native
  
  /**
    * Checks whether the TimeDuration is greater than another.
    *
    * This method takes the units into consideration when doing the comparison.
    *
    * @param other Other TimeDuration object to compare to.
    *
    * @returns true if the TimeDuration is greater than _other_.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def greaterThan(other: TimeDuration): Boolean = js.native
  
  /**
    * The duration length.
    *
    * The unit of the duration length (milliseconds, seconds, minutes, hours, or days)
    * is determined by the duration unit attribute.
    */
  var length: Double = js.native
  
  /**
    * Checks whether the TimeDuration is lower than another.
    *
    * This method takes the units into consideration when doing the comparison.
    *
    * @param other Other TimeDuration object to compare to.
    *
    * @returns true if the TimeDuration is less than _other_.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def lessThan(other: TimeDuration): Boolean = js.native
  
  /**
    * The duration unit (milliseconds, seconds, minutes, hours, or days).
    *
    * The default value is "MSECS" (milliseconds unit).
    */
  var unit: TimeDurationUnit = js.native
}
