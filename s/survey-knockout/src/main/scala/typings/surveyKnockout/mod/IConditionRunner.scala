package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConditionRunner extends js.Object {
  def runCondition(values: HashTable[_], properties: HashTable[_]): js.Any = js.native
}

object IConditionRunner {
  @scala.inline
  def apply(runCondition: (HashTable[_], HashTable[_]) => js.Any): IConditionRunner = {
    val __obj = js.Dynamic.literal(runCondition = js.Any.fromFunction2(runCondition))
    __obj.asInstanceOf[IConditionRunner]
  }
  @scala.inline
  implicit class IConditionRunnerOps[Self <: IConditionRunner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRunCondition(value: (HashTable[_], HashTable[_]) => js.Any): Self = this.set("runCondition", js.Any.fromFunction2(value))
  }
  
}

