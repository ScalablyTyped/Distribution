package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentUpdate extends js.Object {
  /**
    * The current state of this agent update
    */
  var currentState: java.lang.String
  /**
    * Gets the date on which this agent update was requested.
    */
  var requestTime: stdLib.Date
  /**
    * The identity that request the agent update
    */
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets the source agent version of the agent update
    */
  var sourceVersion: PackageVersion
  /**
    * Gets or sets the target agent version of the agent update
    */
  var targetVersion: PackageVersion
}

object TaskAgentUpdate {
  @scala.inline
  def apply(
    currentState: java.lang.String,
    requestTime: stdLib.Date,
    requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    sourceVersion: PackageVersion,
    targetVersion: PackageVersion
  ): TaskAgentUpdate = {
    val __obj = js.Dynamic.literal(currentState = currentState, requestTime = requestTime, requestedBy = requestedBy, sourceVersion = sourceVersion, targetVersion = targetVersion)
  
    __obj.asInstanceOf[TaskAgentUpdate]
  }
}

