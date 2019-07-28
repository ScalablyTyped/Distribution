package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanReference extends js.Object {
  var artifactLocation: String
  var artifactUri: String
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planId: String
  var planType: String
  var scopeIdentifier: String
  var version: Double
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planId: String,
    planType: String,
    scopeIdentifier: String,
    version: Double
  ): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation, artifactUri = artifactUri, definition = definition, owner = owner, planId = planId, planType = planType, scopeIdentifier = scopeIdentifier, version = version)
  
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
}

