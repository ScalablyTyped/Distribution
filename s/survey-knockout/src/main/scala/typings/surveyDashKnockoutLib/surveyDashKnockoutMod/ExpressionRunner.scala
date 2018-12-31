package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ExpressionRunner")
@js.native
class ExpressionRunner protected () extends js.Object {
  def this(expression: java.lang.String) = this()
  var expression: java.lang.String = js.native
  def canRun(): scala.Boolean = js.native
  def run(values: HashTable[_]): js.Any = js.native
  def run(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
}

