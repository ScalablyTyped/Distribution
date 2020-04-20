package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
}

