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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], definitionSnapshotRevision = definitionSnapshotRevision.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], logsContainerUrl = logsContainerUrl.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolName = poolName.asInstanceOf[js.Any], projectReference = projectReference.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseNameFormat = releaseNameFormat.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggeringArtifactAlias = triggeringArtifactAlias.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Release]
  }
}

