package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Trigger")
@js.native
class Trigger () extends Base {
  var expression: java.lang.String = js.native
  var name: java.lang.String = js.native
  var operator: java.lang.String = js.native
  var value: js.Any = js.native
  def buildExpression(): java.lang.String = js.native
  def check(value: js.Any): scala.Unit = js.native
  def checkExpression(keys: js.Any, values: HashTable[_]): scala.Unit = js.native
  def checkExpression(keys: js.Any, values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
  /* protected */ def onFailure(): scala.Unit = js.native
  /* protected */ def onSuccess(values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
}

@JSImport("survey-knockout", "Trigger")
@js.native
object Trigger extends js.Object {
  val operators: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
  var operatorsValue: surveyDashKnockoutLib.surveyDashKnockoutMod.HashTable[js.Function] = js.native
}

