package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISystemCondition extends IBackgroundCondition {
  var conditionType: SystemConditionType = js.native
}

object ISystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): ISystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISystemCondition]
  }
  @scala.inline
  implicit class ISystemConditionOps[Self <: ISystemCondition] (val x: Self) extends AnyVal {
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
    def setConditionType(value: SystemConditionType): Self = this.set("conditionType", value.asInstanceOf[js.Any])
  }
  
}

