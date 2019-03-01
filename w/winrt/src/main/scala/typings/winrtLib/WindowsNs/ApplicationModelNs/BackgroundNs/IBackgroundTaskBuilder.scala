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
    addCondition: js.Function1[IBackgroundCondition, scala.Unit],
    name: java.lang.String,
    register: js.Function0[BackgroundTaskRegistration],
    setTrigger: js.Function1[IBackgroundTrigger, scala.Unit],
    taskEntryPoint: java.lang.String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCondition")(addCondition)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("setTrigger")(setTrigger)
    __obj.updateDynamic("taskEntryPoint")(taskEntryPoint)
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
}

