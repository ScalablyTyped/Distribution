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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactType")(artifactType)
    __obj.updateDynamic("artifactTypeStreamMapping")(artifactTypeStreamMapping)
    __obj.updateDynamic("browsableArtifactTypeMapping")(browsableArtifactTypeMapping)
    __obj.updateDynamic("dataSourceBindings")(dataSourceBindings)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("downloadTaskId")(downloadTaskId)
    __obj.updateDynamic("endpointTypeId")(endpointTypeId)
    __obj.updateDynamic("inputDescriptors")(inputDescriptors)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uniqueSourceIdentifier")(uniqueSourceIdentifier)
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
}

