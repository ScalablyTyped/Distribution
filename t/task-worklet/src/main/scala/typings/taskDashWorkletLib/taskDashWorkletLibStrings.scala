package typings
package taskDashWorkletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object taskDashWorkletLibStrings {
  @js.native
  sealed trait cancelled
    extends taskDashWorkletLib.taskDashWorkletMod.State
  
  @js.native
  sealed trait completed
    extends taskDashWorkletLib.taskDashWorkletMod.State
  
  @js.native
  sealed trait fulfilled
    extends taskDashWorkletLib.taskDashWorkletMod.State
  
  @js.native
  sealed trait pending
    extends taskDashWorkletLib.taskDashWorkletMod.State
  
  @js.native
  sealed trait scheduled
    extends taskDashWorkletLib.taskDashWorkletMod.State
  
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
}

