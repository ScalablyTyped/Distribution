package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskBuilder extends js.Object {
  var name: String = js.native
  var taskEntryPoint: String = js.native
  def addCondition(condition: IBackgroundCondition): Unit = js.native
  def register(): BackgroundTaskRegistration = js.native
  def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
}

object IBackgroundTaskBuilder {
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => Unit,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
  @scala.inline
  implicit class IBackgroundTaskBuilderOps[Self <: IBackgroundTaskBuilder] (val x: Self) extends AnyVal {
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
    def setAddCondition(value: IBackgroundCondition => Unit): Self = this.set("addCondition", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegister(value: () => BackgroundTaskRegistration): Self = this.set("register", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTrigger(value: IBackgroundTrigger => Unit): Self = this.set("setTrigger", js.Any.fromFunction1(value))
    @scala.inline
    def setTaskEntryPoint(value: String): Self = this.set("taskEntryPoint", value.asInstanceOf[js.Any])
  }
  
}

