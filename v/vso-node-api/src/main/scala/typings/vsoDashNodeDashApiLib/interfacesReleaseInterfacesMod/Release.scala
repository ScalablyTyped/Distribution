package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Release extends js.Object {
  /**
    * Gets links to access the release.
    */
  var _links: js.Any
  /**
    * Gets or sets the list of artifacts.
    */
  var artifacts: js.Array[Artifact]
  /**
    * Gets or sets comment.
    */
  var comment: java.lang.String
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets revision number of definition snapshot.
    */
  var definitionSnapshotRevision: scala.Double
  /**
    * Gets or sets description of release.
    */
  var description: java.lang.String
  /**
    * Gets list of environments.
    */
  var environments: js.Array[ReleaseEnvironment]
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Whether to exclude the release from retention policies.
    */
  var keepForever: scala.Boolean
  /**
    * Gets logs container url.
    */
  var logsContainerUrl: java.lang.String
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets name.
    */
  var name: java.lang.String
  /**
    * Gets pool name.
    */
  var poolName: java.lang.String
  /**
    * Gets or sets project reference.
    */
  var projectReference: ProjectReference
  var properties: js.Any
  /**
    * Gets reason of release.
    */
  var reason: ReleaseReason
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
    * Gets release name format.
    */
  var releaseNameFormat: java.lang.String
  /**
    * Gets status.
    */
  var status: ReleaseStatus
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[java.lang.String]
  var triggeringArtifactAlias: java.lang.String
  var url: java.lang.String
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup]
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
}

object Release {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: java.lang.String,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    definitionSnapshotRevision: scala.Double,
    description: java.lang.String,
    environments: js.Array[ReleaseEnvironment],
    id: scala.Double,
    keepForever: scala.Boolean,
    logsContainerUrl: java.lang.String,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    poolName: java.lang.String,
    projectReference: ProjectReference,
    properties: js.Any,
    reason: ReleaseReason,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseNameFormat: java.lang.String,
    status: ReleaseStatus,
    tags: js.Array[java.lang.String],
    triggeringArtifactAlias: java.lang.String,
    url: java.lang.String,
    variableGroups: js.Array[VariableGroup],
    variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
  ): Release = {
    val __obj = js.Dynamic.literal(_links = _links, artifacts = artifacts, comment = comment, createdBy = createdBy, createdOn = createdOn, definitionSnapshotRevision = definitionSnapshotRevision, description = description, environments = environments, id = id, keepForever = keepForever, logsContainerUrl = logsContainerUrl, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, poolName = poolName, projectReference = projectReference, properties = properties, reason = reason, releaseDefinition = releaseDefinition, releaseNameFormat = releaseNameFormat, status = status, tags = tags, triggeringArtifactAlias = triggeringArtifactAlias, url = url, variableGroups = variableGroups, variables = variables)
  
    __obj.asInstanceOf[Release]
  }
}

