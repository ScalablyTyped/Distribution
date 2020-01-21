package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinition extends js.Object {
  /**
    * Gets links to access the release definition.
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
    * Gets or sets the description.
    */
  var description: String
  /**
    * Gets or sets the list of environments.
    */
  var environments: js.Array[ReleaseDefinitionEnvironment]
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  /**
    * Whether release definition is deleted.
    */
  var isDeleted: Boolean
  /**
    * Gets the reference of last release.
    */
  var lastRelease: ReleaseReference
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date
  /**
    * Gets or sets the name.
    */
  var name: String
  /**
    * Gets or sets the path.
    */
  var path: String
  /**
    * Gets or sets pipeline process.
    */
  var pipelineProcess: PipelineProcess
  /**
    * Gets or sets properties.
    */
  var properties: js.Any
  /**
    * Gets or sets the release name format.
    */
  var releaseNameFormat: String
  var retentionPolicy: RetentionPolicy
  /**
    * Gets the revision number.
    */
  var revision: Double
  /**
    * Gets or sets source of release definition.
    */
  var source: ReleaseDefinitionSource
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String]
  /**
    * Gets or sets the list of triggers.
    */
  var triggers: js.Array[ReleaseTriggerBase]
  /**
    * Gets url to access the release definition.
    */
  var url: String
  /**
    * Gets or sets the list of variable groups.
    */
  var variableGroups: js.Array[Double]
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue]
}

object ReleaseDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: String,
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    environments: js.Array[ReleaseDefinitionEnvironment],
    id: Double,
    isDeleted: Boolean,
    lastRelease: ReleaseReference,
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    path: String,
    pipelineProcess: PipelineProcess,
    properties: js.Any,
    releaseNameFormat: String,
    retentionPolicy: RetentionPolicy,
    revision: Double,
    source: ReleaseDefinitionSource,
    tags: js.Array[String],
    triggers: js.Array[ReleaseTriggerBase],
    url: String,
    variableGroups: js.Array[Double],
    variables: StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinition = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipelineProcess = pipelineProcess.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], releaseNameFormat = releaseNameFormat.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseDefinition]
  }
}

