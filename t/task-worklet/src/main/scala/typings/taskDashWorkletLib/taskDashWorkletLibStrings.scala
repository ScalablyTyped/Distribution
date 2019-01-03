package typings
package taskDashWorkletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object taskDashWorkletLibStrings {
  @js.native
  sealed trait cancelled extends js.Object
  
  @js.native
  sealed trait completed extends js.Object
  
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait scheduled extends js.Object
  
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  def completed: completed = "completed".asInstanceOf[completed]
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  def pending: pending = "pending".asInstanceOf[pending]
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
}

