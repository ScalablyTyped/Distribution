package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "FunctionFactory")
@js.native
class FunctionFactory () extends js.Object {
  def clear(): scala.Unit = js.native
  def getAll(): js.Array[java.lang.String] = js.native
  def hasFunction(name: java.lang.String): scala.Boolean = js.native
  def register(name: java.lang.String, func: js.Function1[/* params */ js.Array[_], _]): scala.Unit = js.native
  def run(name: java.lang.String, params: js.Array[_]): js.Any = js.native
  def run(name: java.lang.String, params: js.Array[_], properties: HashTable[_]): js.Any = js.native
  def unregister(name: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "FunctionFactory")
@js.native
object FunctionFactory extends js.Object {
  var Instance: surveyDashKnockoutLib.surveyDashKnockoutMod.FunctionFactory = js.native
}

