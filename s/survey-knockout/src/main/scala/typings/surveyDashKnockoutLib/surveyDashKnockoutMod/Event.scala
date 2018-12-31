package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Event")
@js.native
class Event[T /* <: js.Function */, Options] () extends js.Object {
  val isEmpty: scala.Boolean = js.native
  def add(func: T): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def fire(sender: js.Any, options: Options): scala.Unit = js.native
  def hasFunc(func: T): scala.Boolean = js.native
  def remove(func: T): scala.Unit = js.native
}

