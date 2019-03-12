package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskBuilder extends js.Object {
  var name: java.lang.String
  var taskEntryPoint: java.lang.String
  def addCondition(condition: IBackgroundCondition): scala.Unit
  def register(): BackgroundTaskRegistration
  def setTrigger(trigger: IBackgroundTrigger): scala.Unit
}

object IBackgroundTaskBuilder {
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => scala.Unit,
    name: java.lang.String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => scala.Unit,
    taskEntryPoint: java.lang.String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), name = name, register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint)
  
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
}

