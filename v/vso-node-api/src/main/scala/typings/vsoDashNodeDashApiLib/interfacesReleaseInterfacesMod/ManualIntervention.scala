package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualIntervention extends js.Object {
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets comments for approval.
    */
  var comments: java.lang.String
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: scala.Double
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: java.lang.String
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets or sets the name.
    */
  var name: java.lang.String
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
  var taskInstanceId: java.lang.String
  /**
    * Gets url to access the manual intervention.
    */
  var url: java.lang.String
}

object ManualIntervention {
  @scala.inline
  def apply(
    approver: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    comments: java.lang.String,
    createdOn: stdLib.Date,
    id: scala.Double,
    instructions: java.lang.String,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    status: ManualInterventionStatus,
    taskInstanceId: java.lang.String,
    url: java.lang.String
  ): ManualIntervention = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approver")(approver)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("instructions")(instructions)
    __obj.updateDynamic("modifiedOn")(modifiedOn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseDefinition")(releaseDefinition)
    __obj.updateDynamic("releaseEnvironment")(releaseEnvironment)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("taskInstanceId")(taskInstanceId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ManualIntervention]
  }
}

