package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactContributionDefinition extends js.Object {
  var artifactType: String
  var artifactTypeStreamMapping: StringDictionary[String]
  var browsableArtifactTypeMapping: StringDictionary[String]
  var dataSourceBindings: js.Array[DataSourceBinding]
  var displayName: String
  var downloadTaskId: String
  var endpointTypeId: String
  var inputDescriptors: js.Array[InputDescriptor]
  var name: String
  var uniqueSourceIdentifier: String
}

object ArtifactContributionDefinition {
  @scala.inline
  def apply(
    artifactType: String,
    artifactTypeStreamMapping: StringDictionary[String],
    browsableArtifactTypeMapping: StringDictionary[String],
    dataSourceBindings: js.Array[DataSourceBinding],
    displayName: String,
    downloadTaskId: String,
    endpointTypeId: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactContributionDefinition = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], artifactTypeStreamMapping = artifactTypeStreamMapping.asInstanceOf[js.Any], browsableArtifactTypeMapping = browsableArtifactTypeMapping.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], downloadTaskId = downloadTaskId.asInstanceOf[js.Any], endpointTypeId = endpointTypeId.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
}

