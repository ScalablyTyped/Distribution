package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentArtifactDefinition extends js.Object {
  var alias: String
  var artifactType: AgentArtifactType
  var details: String
  var name: String
  var version: String
}

object AgentArtifactDefinition {
  @scala.inline
  def apply(alias: String, artifactType: AgentArtifactType, details: String, name: String, version: String): AgentArtifactDefinition = {
    val __obj = js.Dynamic.literal(alias = alias, artifactType = artifactType, details = details, name = name, version = version)
  
    __obj.asInstanceOf[AgentArtifactDefinition]
  }
}

