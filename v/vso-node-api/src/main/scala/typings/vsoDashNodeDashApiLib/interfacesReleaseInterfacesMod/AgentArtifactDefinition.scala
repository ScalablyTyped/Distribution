package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentArtifactDefinition extends js.Object {
  var alias: java.lang.String
  var artifactType: AgentArtifactType
  var details: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
}

object AgentArtifactDefinition {
  @scala.inline
  def apply(
    alias: java.lang.String,
    artifactType: AgentArtifactType,
    details: java.lang.String,
    name: java.lang.String,
    version: java.lang.String
  ): AgentArtifactDefinition = {
    val __obj = js.Dynamic.literal(alias = alias, artifactType = artifactType, details = details, name = name, version = version)
  
    __obj.asInstanceOf[AgentArtifactDefinition]
  }
}

