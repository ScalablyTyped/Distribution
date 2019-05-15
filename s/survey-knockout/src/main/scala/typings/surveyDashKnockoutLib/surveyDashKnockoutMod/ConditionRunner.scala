package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ConditionRunner")
@js.native
class ConditionRunner protected () extends js.Object {
  def this(expression: java.lang.String) = this()
  var expression: java.lang.String = js.native
  def getVariables(): js.Array[java.lang.String] = js.native
  def hasFunction(): scala.Boolean = js.native
  def run(values: HashTable[_]): scala.Boolean = js.native
  def run(values: HashTable[_], properties: HashTable[_]): scala.Boolean = js.native
}

