package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskBuilder extends js.Object {
  var name: String
  var taskEntryPoint: String
  def addCondition(condition: IBackgroundCondition): Unit
  def register(): BackgroundTaskRegistration
  def setTrigger(trigger: IBackgroundTrigger): Unit
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
}

