package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualIntervention extends js.Object {
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef
  /**
    * Gets or sets comments for approval.
    */
  var comments: String
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: Double
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: String
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date
  /**
    * Gets or sets the name.
    */
  var name: String
  /**
    * Gets releaseReference for manual intervention.
    */
  var release: ReleaseShallowReference
  /**
    * Gets releaseDefinitionReference for manual intervention.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
    * Gets releaseEnvironmentReference for manual intervention.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference
  /**
    * Gets or sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus
  /**
    * Get task instance identifier.
    */
  var taskInstanceId: String
  /**
    * Gets url to access the manual intervention.
    */
  var url: String
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
    val __obj = js.Dynamic.literal(approver = approver, comments = comments, createdOn = createdOn, id = id, instructions = instructions, modifiedOn = modifiedOn, name = name, release = release, releaseDefinition = releaseDefinition, releaseEnvironment = releaseEnvironment, status = status, taskInstanceId = taskInstanceId, url = url)
  
    __obj.asInstanceOf[ManualIntervention]
  }
}

