package typings.taskWorklet

import typings.taskWorklet.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object taskWorkletStrings {
  @js.native
  sealed trait cancelled extends State
  
  @js.native
  sealed trait completed extends State
  
  @js.native
  sealed trait fulfilled extends State
  
  @js.native
  sealed trait pending extends State
  
  @js.native
  sealed trait scheduled extends State
  
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

