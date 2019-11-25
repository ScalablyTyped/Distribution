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
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentArtifactDefinition]
  }
}

