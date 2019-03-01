package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskRegistration extends js.Object {
  var name: java.lang.String
  var oncompleted: js.Any
  var onprogress: js.Any
  var taskId: java.lang.String
  def unregister(cancelTask: scala.Boolean): scala.Unit
}

object IBackgroundTaskRegistration {
  @scala.inline
  def apply(
    name: java.lang.String,
    oncompleted: js.Any,
    onprogress: js.Any,
    taskId: java.lang.String,
    unregister: js.Function1[scala.Boolean, scala.Unit]
  ): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("oncompleted")(oncompleted)
    __obj.updateDynamic("onprogress")(onprogress)
    __obj.updateDynamic("taskId")(taskId)
    __obj.updateDynamic("unregister")(unregister)
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
}

