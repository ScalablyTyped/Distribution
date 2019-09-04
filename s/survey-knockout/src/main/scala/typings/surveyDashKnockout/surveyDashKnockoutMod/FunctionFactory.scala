package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "FunctionFactory")
@js.native
class FunctionFactory () extends js.Object {
  def clear(): Unit = js.native
  def getAll(): js.Array[String] = js.native
  def hasFunction(name: String): Boolean = js.native
  def isAsyncFunction(name: String): Boolean = js.native
  def register(name: String, func: js.Function1[/* params */ js.Array[_], _]): Unit = js.native
  def register(name: String, func: js.Function1[/* params */ js.Array[_], _], isAsync: Boolean): Unit = js.native
  def run(name: String, params: js.Array[_]): js.Any = js.native
  def run(name: String, params: js.Array[_], properties: HashTable[_]): js.Any = js.native
  def unregister(name: String): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "FunctionFactory")
@js.native
object FunctionFactory extends js.Object {
  var Instance: FunctionFactory = js.native
}

