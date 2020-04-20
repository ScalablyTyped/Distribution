package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConditionRunner extends js.Object {
  def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any
}

object IConditionRunner {
  @scala.inline
  def apply(runCondition: (HashTable[_], HashTable[_]) => js.Any): IConditionRunner = {
    val __obj = js.Dynamic.literal(runCondition = js.Any.fromFunction2(runCondition))
    __obj.asInstanceOf[IConditionRunner]
  }
}

