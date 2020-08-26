package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualIntervention extends js.Object {
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef = js.native
  /**
    * Gets or sets comments for approval.
    */
  var comments: String = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: Double = js.native
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: String = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  /**
    * Gets or sets the name.
    */
  var name: String = js.native
  /**
    * Gets releaseReference for manual intervention.
    */
  var release: ReleaseShallowReference = js.native
  /**
    * Gets releaseDefinitionReference for manual intervention.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets releaseEnvironmentReference for manual intervention.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  /**
    * Gets or sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus = js.native
  /**
    * Get task instance identifier.
    */
  var taskInstanceId: String = js.native
  /**
    * Gets url to access the manual intervention.
    */
  var url: String = js.native
}

object ManualIntervention {
  @scala.inline
  def apply(
    approver: IdentityRef,
    comments: String,
    createdOn: Date,
    id: Double,
    instructions: String,
    modifiedOn: Date,
    name: String,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    status: ManualInterventionStatus,
    taskInstanceId: String,
    url: String
  ): ManualIntervention = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskInstanceId = taskInstanceId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualIntervention]
  }
  @scala.inline
  implicit class ManualInterventionOps[Self <: ManualIntervention] (val x: Self) extends AnyVal {
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
    def setApprover(value: IdentityRef): Self = this.set("approver", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: ReleaseShallowReference): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = this.set("releaseEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ManualInterventionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskInstanceId(value: String): Self = this.set("taskInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

