package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ExpressionRunnerBase")
@js.native
class ExpressionRunnerBase protected () extends js.Object {
  def this(expression: java.lang.String) = this()
  var expression: java.lang.String = js.native
  def canRun(): scala.Boolean = js.native
  def getVariables(): js.Array[java.lang.String] = js.native
  def hasFunction(): scala.Boolean = js.native
  /* protected */ def runCore(values: HashTable[_]): js.Any = js.native
  /* protected */ def runCore(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
}

