package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Operand")
@js.native
abstract class Operand () extends js.Object {
  def evaluate(): js.Any = js.native
  def evaluate(processValue: ProcessValue): js.Any = js.native
  def hasFunction(): scala.Boolean = js.native
  def setVariables(variables: js.Array[java.lang.String]): js.Any = js.native
}

