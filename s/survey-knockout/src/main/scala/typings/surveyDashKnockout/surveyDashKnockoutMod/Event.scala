package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Event")
@js.native
class Event[T /* <: js.Function */, Options] () extends js.Object {
  val isEmpty: Boolean = js.native
  def add(func: T): Unit = js.native
  def clear(): Unit = js.native
  def fire(sender: js.Any, options: Options): Unit = js.native
  def hasFunc(func: T): Boolean = js.native
  def remove(func: T): Unit = js.native
}

