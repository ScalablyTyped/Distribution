package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDescriptor
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
    val __obj = js.Dynamic.literal(artifactType = artifactType, artifactTypeStreamMapping = artifactTypeStreamMapping, browsableArtifactTypeMapping = browsableArtifactTypeMapping, dataSourceBindings = dataSourceBindings, displayName = displayName, downloadTaskId = downloadTaskId, endpointTypeId = endpointTypeId, inputDescriptors = inputDescriptors, name = name, uniqueSourceIdentifier = uniqueSourceIdentifier)
  
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
}

