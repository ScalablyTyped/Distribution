package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Trigger")
@js.native
class Trigger () extends Base {
  var expression: String = js.native
  var name: String = js.native
  var operator: String = js.native
  var value: js.Any = js.native
  def buildExpression(): String = js.native
  def check(value: js.Any): Unit = js.native
  def checkExpression(keys: js.Any, values: HashTable[_]): Unit = js.native
  def checkExpression(keys: js.Any, values: HashTable[_], properties: HashTable[_]): Unit = js.native
  /* protected */ def onFailure(): Unit = js.native
  /* protected */ def onSuccess(values: HashTable[_], properties: HashTable[_]): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "Trigger")
@js.native
object Trigger extends js.Object {
  val operators: HashTable[js.Function] = js.native
  var operatorsValue: HashTable[js.Function] = js.native
}

