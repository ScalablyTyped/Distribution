package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Release extends StObject {
  
  /**
    * Gets links to access the release.
    */
  var _links: Any
  
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
  var createdOn: js.Date
  
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
  var modifiedOn: js.Date
  
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
  
  var properties: Any
  
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
  
  inline def apply(
    _links: Any,
    artifacts: js.Array[Artifact],
    comment: String,
    createdBy: IdentityRef,
    createdOn: js.Date,
    definitionSnapshotRevision: Double,
    description: String,
    environments: js.Array[ReleaseEnvironment],
    id: Double,
    keepForever: Boolean,
    logsContainerUrl: String,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    poolName: String,
    projectReference: ProjectReference,
    properties: Any,
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
  
  extension [Self <: Release](x: Self) {
    
    inline def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDefinitionSnapshotRevision(value: Double): Self = StObject.set(x, "definitionSnapshotRevision", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: js.Array[ReleaseEnvironment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: ReleaseEnvironment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    inline def setLogsContainerUrl(value: String): Self = StObject.set(x, "logsContainerUrl", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    inline def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setReason(value: ReleaseReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    inline def setReleaseNameFormat(value: String): Self = StObject.set(x, "releaseNameFormat", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReleaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTriggeringArtifactAlias(value: String): Self = StObject.set(x, "triggeringArtifactAlias", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVariableGroups(value: js.Array[VariableGroup]): Self = StObject.set(x, "variableGroups", value.asInstanceOf[js.Any])
    
    inline def setVariableGroupsVarargs(value: VariableGroup*): Self = StObject.set(x, "variableGroups", js.Array(value*))
    
    inline def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
