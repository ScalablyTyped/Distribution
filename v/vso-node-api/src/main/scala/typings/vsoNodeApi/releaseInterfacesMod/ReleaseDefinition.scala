package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinition extends js.Object {
  /**
    * Gets links to access the release definition.
    */
  var _links: js.Any = js.native
  /**
    * Gets or sets the list of artifacts.
    */
  var artifacts: js.Array[Artifact] = js.native
  /**
    * Gets or sets comment.
    */
  var comment: String = js.native
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  /**
    * Gets or sets the description.
    */
  var description: String = js.native
  /**
    * Gets or sets the list of environments.
    */
  var environments: js.Array[ReleaseDefinitionEnvironment] = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Whether release definition is deleted.
    */
  var isDeleted: Boolean = js.native
  /**
    * Gets the reference of last release.
    */
  var lastRelease: ReleaseReference = js.native
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  /**
    * Gets or sets the name.
    */
  var name: String = js.native
  /**
    * Gets or sets the path.
    */
  var path: String = js.native
  /**
    * Gets or sets pipeline process.
    */
  var pipelineProcess: PipelineProcess = js.native
  /**
    * Gets or sets properties.
    */
  var properties: js.Any = js.native
  /**
    * Gets or sets the release name format.
    */
  var releaseNameFormat: String = js.native
  var retentionPolicy: RetentionPolicy = js.native
  /**
    * Gets the revision number.
    */
  var revision: Double = js.native
  /**
    * Gets or sets source of release definition.
    */
  var source: ReleaseDefinitionSource = js.native
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String] = js.native
  /**
    * Gets or sets the list of triggers.
    */
  var triggers: js.Array[ReleaseTriggerBase] = js.native
  /**
    * Gets url to access the release definition.
    */
  var url: String = js.native
  /**
    * Gets or sets the list of variable groups.
    */
  var variableGroups: js.Array[Double] = js.native
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
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
  @scala.inline
  implicit class ReleaseDefinitionOps[Self <: ReleaseDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentsVarargs(value: ReleaseDefinitionEnvironment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[ReleaseDefinitionEnvironment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastRelease(value: ReleaseReference): Self = this.set("lastRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelineProcess(value: PipelineProcess): Self = this.set("pipelineProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseNameFormat(value: String): Self = this.set("releaseNameFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPolicy(value: RetentionPolicy): Self = this.set("retentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: ReleaseDefinitionSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggersVarargs(value: ReleaseTriggerBase*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[ReleaseTriggerBase]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableGroupsVarargs(value: Double*): Self = this.set("variableGroups", js.Array(value :_*))
    @scala.inline
    def setVariableGroups(value: js.Array[Double]): Self = this.set("variableGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

