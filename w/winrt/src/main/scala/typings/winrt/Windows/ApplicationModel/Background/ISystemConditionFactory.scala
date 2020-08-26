package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISystemConditionFactory extends js.Object {
  def create(conditionType: SystemConditionType): SystemCondition = js.native
}

object ISystemConditionFactory {
  @scala.inline
  def apply(create: SystemConditionType => SystemCondition): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ISystemConditionFactory]
  }
  @scala.inline
  implicit class ISystemConditionFactoryOps[Self <: ISystemConditionFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: SystemConditionType => SystemCondition): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

