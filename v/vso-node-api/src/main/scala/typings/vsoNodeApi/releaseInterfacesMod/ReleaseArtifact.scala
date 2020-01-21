package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], definitionData = definitionData.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseArtifact]
  }
}

