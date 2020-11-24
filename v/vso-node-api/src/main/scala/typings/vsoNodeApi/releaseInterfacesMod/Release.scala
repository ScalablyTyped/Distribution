package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Release extends js.Object {
  
  /**
    * Gets links to access the release.
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
    * Gets revision number of definition snapshot.
    */
  var definitionSnapshotRevision: Double = js.native
  
  /**
    * Gets or sets description of release.
    */
  var description: String = js.native
  
  /**
    * Gets list of environments.
    */
  var environments: js.Array[ReleaseEnvironment] = js.native
  
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  
  /**
    * Whether to exclude the release from retention policies.
    */
  var keepForever: Boolean = js.native
  
  /**
    * Gets logs container url.
    */
  var logsContainerUrl: String = js.native
  
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef = js.native
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  
  /**
    * Gets name.
    */
  var name: String = js.native
  
  /**
    * Gets pool name.
    */
  var poolName: String = js.native
  
  /**
    * Gets or sets project reference.
    */
  var projectReference: ProjectReference = js.native
  
  var properties: js.Any = js.native
  
  /**
    * Gets reason of release.
    */
  var reason: ReleaseReason = js.native
  
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  
  /**
    * Gets release name format.
    */
  var releaseNameFormat: String = js.native
  
  /**
    * Gets status.
    */
  var status: ReleaseStatus = js.native
  
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[String] = js.native
  
  var triggeringArtifactAlias: String = js.native
  
  var url: String = js.native
  
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup] = js.native
  
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
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
  
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
    
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
    def setDefinitionSnapshotRevision(value: Double): Self = this.set("definitionSnapshotRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: ReleaseEnvironment*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[ReleaseEnvironment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = this.set("keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsContainerUrl(value: String): Self = this.set("logsContainerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolName(value: String): Self = this.set("poolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReference(value: ProjectReference): Self = this.set("projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: ReleaseReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNameFormat(value: String): Self = this.set("releaseNameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ReleaseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggeringArtifactAlias(value: String): Self = this.set("triggeringArtifactAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableGroupsVarargs(value: VariableGroup*): Self = this.set("variableGroups", js.Array(value :_*))
    
    @scala.inline
    def setVariableGroups(value: js.Array[VariableGroup]): Self = this.set("variableGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
