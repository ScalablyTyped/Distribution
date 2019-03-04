package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseArtifact extends js.Object {
  var artifactProvider: ArtifactProvider
  var artifactType: java.lang.String
  var definitionData: java.lang.String
  var definitionId: scala.Double
  var description: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var releaseId: scala.Double
}

object ReleaseArtifact {
  @scala.inline
  def apply(
    artifactProvider: ArtifactProvider,
    artifactType: java.lang.String,
    definitionData: java.lang.String,
    definitionId: scala.Double,
    description: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    releaseId: scala.Double
  ): ReleaseArtifact = {
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider, artifactType = artifactType, definitionData = definitionData, definitionId = definitionId, description = description, id = id, name = name, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseArtifact]
  }
}

