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

