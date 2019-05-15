package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ConditionNode")
@js.native
class ConditionNode () extends js.Object {
  var children: js.Array[_] = js.native
  var connective: java.lang.String = js.native
  val isEmpty: scala.Boolean = js.native
  var isNot: scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def fillVariables(vars: js.Array[java.lang.String]): scala.Unit = js.native
  def getVariables(): js.Array[java.lang.String] = js.native
  def hasFunction(): scala.Boolean = js.native
}

