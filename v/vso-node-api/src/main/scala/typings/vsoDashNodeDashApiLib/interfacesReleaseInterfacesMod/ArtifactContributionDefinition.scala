package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactContributionDefinition extends js.Object {
  var artifactType: java.lang.String
  var artifactTypeStreamMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var browsableArtifactTypeMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var dataSourceBindings: js.Array[DataSourceBinding]
  var displayName: java.lang.String
  var downloadTaskId: java.lang.String
  var endpointTypeId: java.lang.String
  var inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor]
  var name: java.lang.String
  var uniqueSourceIdentifier: java.lang.String
}

object ArtifactContributionDefinition {
  @scala.inline
  def apply(
    artifactType: java.lang.String,
    artifactTypeStreamMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    browsableArtifactTypeMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    dataSourceBindings: js.Array[DataSourceBinding],
    displayName: java.lang.String,
    downloadTaskId: java.lang.String,
    endpointTypeId: java.lang.String,
    inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor],
    name: java.lang.String,
    uniqueSourceIdentifier: java.lang.String
  ): ArtifactContributionDefinition = {
    val __obj = js.Dynamic.literal(artifactType = artifactType, artifactTypeStreamMapping = artifactTypeStreamMapping, browsableArtifactTypeMapping = browsableArtifactTypeMapping, dataSourceBindings = dataSourceBindings, displayName = displayName, downloadTaskId = downloadTaskId, endpointTypeId = endpointTypeId, inputDescriptors = inputDescriptors, name = name, uniqueSourceIdentifier = uniqueSourceIdentifier)
  
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
}

