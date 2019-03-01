package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanReference extends js.Object {
  var artifactLocation: java.lang.String
  var artifactUri: java.lang.String
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planId: java.lang.String
  var planType: java.lang.String
  var scopeIdentifier: java.lang.String
  var version: scala.Double
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(
    artifactLocation: java.lang.String,
    artifactUri: java.lang.String,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planId: java.lang.String,
    planType: java.lang.String,
    scopeIdentifier: java.lang.String,
    version: scala.Double
  ): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactLocation")(artifactLocation)
    __obj.updateDynamic("artifactUri")(artifactUri)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("planType")(planType)
    __obj.updateDynamic("scopeIdentifier")(scopeIdentifier)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
}

