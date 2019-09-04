package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Operand")
@js.native
abstract class Operand () extends js.Object {
  def addToAsyncList(list: js.Array[FunctionOperand]): Unit = js.native
  def evaluate(): js.Any = js.native
  def evaluate(processValue: ProcessValue): js.Any = js.native
  def hasAsyncFunction(): Boolean = js.native
  def hasFunction(): Boolean = js.native
  def setVariables(variables: js.Array[String]): js.Any = js.native
}

