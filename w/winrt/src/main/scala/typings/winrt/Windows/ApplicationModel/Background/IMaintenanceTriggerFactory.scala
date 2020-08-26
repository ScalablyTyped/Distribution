package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaintenanceTriggerFactory extends js.Object {
  def create(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger = js.native
}

object IMaintenanceTriggerFactory {
  @scala.inline
  def apply(create: (Double, Boolean) => MaintenanceTrigger): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
  @scala.inline
  implicit class IMaintenanceTriggerFactoryOps[Self <: IMaintenanceTriggerFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: (Double, Boolean) => MaintenanceTrigger): Self = this.set("create", js.Any.fromFunction2(value))
  }
  
}

