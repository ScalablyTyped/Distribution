package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "AlarmRelative")
@js.native
open class AlarmRelative protected () extends Alarm_ {
  def this(delay: Double) = this()
  def this(delay: Double, period: Double) = this()
  
  /**
    * An attribute to store the difference in time (in seconds) between when an alarm is added and when it is triggered.
    *
    * @remark Since Tizen 2.4 the operating system adjusts this value to decrease the power consumption.
    */
  val delay: Double = js.native
  
  /**
    * Returns the duration in seconds before the next alarm is triggered.
    *
    * If the alarm has expired, this method returns null.
    *
    * @returns The duration before the next alarm is triggered.
    *
    * @throw WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def getRemainingSeconds(): Double | Null = js.native
  
  /**
    * An attribute to store the duration in seconds between each trigger of an alarm.
    * By default, this attribute is set to null, indicating that this alarm does not repeat.
    *
    * @remark Since Tizen 2.4 the operating system adjusts this value to decrease the power consumption.
    */
  val period: Double | Null = js.native
}
