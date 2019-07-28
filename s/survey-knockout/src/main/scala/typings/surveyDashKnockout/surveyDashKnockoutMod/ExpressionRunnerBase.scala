package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ExpressionRunnerBase")
@js.native
class ExpressionRunnerBase protected () extends js.Object {
  def this(expression: String) = this()
  var expression: String = js.native
  def canRun(): Boolean = js.native
  def getVariables(): js.Array[String] = js.native
  def hasFunction(): Boolean = js.native
  /* protected */ def runCore(values: HashTable[_]): js.Any = js.native
  /* protected */ def runCore(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
}

