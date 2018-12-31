package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Helpers")
@js.native
class Helpers () extends js.Object

@JSImport("survey-knockout", "Helpers")
@js.native
object Helpers extends js.Object {
  def getMaxLength(maxLength: scala.Double, surveyLength: scala.Double): js.Any = js.native
  def getUnbindValue(value: js.Any): js.Any = js.native
  def isArrayContainsEqual(x: js.Any, y: js.Any): scala.Boolean = js.native
  def isArraysEqual(x: js.Any, y: js.Any): scala.Boolean = js.native
  def isArraysEqual(x: js.Any, y: js.Any, ignoreOrder: scala.Boolean): scala.Boolean = js.native
  def isTwoValueEquals(x: js.Any, y: js.Any): scala.Boolean = js.native
  def isTwoValueEquals(x: js.Any, y: js.Any, ignoreOrder: scala.Boolean): scala.Boolean = js.native
  /**
    * A static methods that returns true if a value underfined, null, empty string or empty array.
    * @param value
    */
  def isValueEmpty(value: js.Any): scala.Boolean = js.native
  def randomizeArray[T](array: js.Array[T]): js.Array[T] = js.native
}

