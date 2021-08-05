package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinition extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ReleaseDefinition](x: Self) {
    
    inline def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: js.Array[ReleaseDefinitionEnvironment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: ReleaseDefinitionEnvironment*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setLastRelease(value: ReleaseReference): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPipelineProcess(value: PipelineProcess): Self = StObject.set(x, "pipelineProcess", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setReleaseNameFormat(value: String): Self = StObject.set(x, "releaseNameFormat", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ReleaseDefinitionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTriggers(value: js.Array[ReleaseTriggerBase]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersVarargs(value: ReleaseTriggerBase*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVariableGroups(value: js.Array[Double]): Self = StObject.set(x, "variableGroups", value.asInstanceOf[js.Any])
    
    inline def setVariableGroupsVarargs(value: Double*): Self = StObject.set(x, "variableGroups", js.Array(value :_*))
    
    inline def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
