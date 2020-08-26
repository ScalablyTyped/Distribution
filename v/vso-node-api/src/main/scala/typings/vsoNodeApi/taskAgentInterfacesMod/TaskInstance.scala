package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskInstance extends TaskReference {
  var alwaysRun: Boolean = js.native
  var condition: String = js.native
  var continueOnError: Boolean = js.native
  var displayName: String = js.native
  var enabled: Boolean = js.native
  var instanceId: String = js.native
  var timeoutInMinutes: Double = js.native
}

object TaskInstance {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    id: String,
    inputs: StringDictionary[String],
    instanceId: String,
    name: String,
    timeoutInMinutes: Double,
    version: String
  ): TaskInstance = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInstance]
  }
  @scala.inline
  implicit class TaskInstanceOps[Self <: TaskInstance] (val x: Self) extends AnyVal {
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
    def setAlwaysRun(value: Boolean): Self = this.set("alwaysRun", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
  
}

