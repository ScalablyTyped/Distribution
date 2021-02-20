package typings.taskWorklet

import typings.taskWorklet.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskWorkletStrings {
  
  @js.native
  sealed trait cancelled extends State
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait completed extends State
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait fulfilled extends State
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait pending extends State
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait scheduled extends State
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
}
