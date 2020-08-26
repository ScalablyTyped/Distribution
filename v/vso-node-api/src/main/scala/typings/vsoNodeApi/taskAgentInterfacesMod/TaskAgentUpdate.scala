package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentUpdate extends js.Object {
  /**
    * The current state of this agent update
    */
  var currentState: String = js.native
  /**
    * Gets the date on which this agent update was requested.
    */
  var requestTime: Date = js.native
  /**
    * The identity that request the agent update
    */
  var requestedBy: IdentityRef = js.native
  /**
    * Gets or sets the source agent version of the agent update
    */
  var sourceVersion: PackageVersion = js.native
  /**
    * Gets or sets the target agent version of the agent update
    */
  var targetVersion: PackageVersion = js.native
}

object TaskAgentUpdate {
  @scala.inline
  def apply(
    currentState: String,
    requestTime: Date,
    requestedBy: IdentityRef,
    sourceVersion: PackageVersion,
    targetVersion: PackageVersion
  ): TaskAgentUpdate = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentUpdate]
  }
  @scala.inline
  implicit class TaskAgentUpdateOps[Self <: TaskAgentUpdate] (val x: Self) extends AnyVal {
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
    def setCurrentState(value: String): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestTime(value: Date): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVersion(value: PackageVersion): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVersion(value: PackageVersion): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
  }
  
}

