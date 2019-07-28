package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseArtifact extends js.Object {
  var artifactProvider: ArtifactProvider
  var artifactType: String
  var definitionData: String
  var definitionId: Double
  var description: String
  var id: Double
  var name: String
  var releaseId: Double
}

object ReleaseArtifact {
  @scala.inline
  def apply(
    artifactProvider: ArtifactProvider,
    artifactType: String,
    definitionData: String,
    definitionId: Double,
    description: String,
    id: Double,
    name: String,
    releaseId: Double
  ): ReleaseArtifact = {
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider, artifactType = artifactType, definitionData = definitionData, definitionId = definitionId, description = description, id = id, name = name, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseArtifact]
  }
}

