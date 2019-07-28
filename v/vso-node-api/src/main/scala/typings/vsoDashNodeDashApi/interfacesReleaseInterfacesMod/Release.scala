package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
  var comment: String
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets revision number of definition snapshot.
    */
  var definitionSnapshotRevision: Double
  /**
    * Gets or sets description of release.
    */
  var description: String
  /**
    * Gets list of environments.
    */
  var environments: js.Array[ReleaseEnvironment]
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  /**
    * Whether to exclude the release from retention policies.
    */
  var keepForever: Boolean
  /**
    * Gets logs container url.
    */
  var logsContainerUrl: String
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date
  /**
    * Gets name.
    */
  var name: String
  /**
    * Gets pool name.
    */
  var poolName: String
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
  var releaseNameFormat: String
  /**
    * Gets status.
    */
  var status: ReleaseStatus
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String]
  var triggeringArtifactAlias: String
  var url: String
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup]
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue]
}

object Release {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: String,
    createdBy: IdentityRef,
    createdOn: Date,
    definitionSnapshotRevision: Double,
    description: String,
    environments: js.Array[ReleaseEnvironment],
    id: Double,
    keepForever: Boolean,
    logsContainerUrl: String,
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    poolName: String,
    projectReference: ProjectReference,
    properties: js.Any,
    reason: ReleaseReason,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseNameFormat: String,
    status: ReleaseStatus,
    tags: js.Array[String],
    triggeringArtifactAlias: String,
    url: String,
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[ConfigurationVariableValue]
  ): Release = {
    val __obj = js.Dynamic.literal(_links = _links, artifacts = artifacts, comment = comment, createdBy = createdBy, createdOn = createdOn, definitionSnapshotRevision = definitionSnapshotRevision, description = description, environments = environments, id = id, keepForever = keepForever, logsContainerUrl = logsContainerUrl, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, poolName = poolName, projectReference = projectReference, properties = properties, reason = reason, releaseDefinition = releaseDefinition, releaseNameFormat = releaseNameFormat, status = status, tags = tags, triggeringArtifactAlias = triggeringArtifactAlias, url = url, variableGroups = variableGroups, variables = variables)
  
    __obj.asInstanceOf[Release]
  }
}

