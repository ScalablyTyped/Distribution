package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISystemTriggerFactory extends js.Object {
  def create(triggerType: SystemTriggerType, oneShot: Boolean): SystemTrigger = js.native
}

object ISystemTriggerFactory {
  @scala.inline
  def apply(create: (SystemTriggerType, Boolean) => SystemTrigger): ISystemTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ISystemTriggerFactory]
  }
  @scala.inline
  implicit class ISystemTriggerFactoryOps[Self <: ISystemTriggerFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: (SystemTriggerType, Boolean) => SystemTrigger): Self = this.set("create", js.Any.fromFunction2(value))
  }
  
}

