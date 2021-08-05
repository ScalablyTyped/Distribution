package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinition extends StObject {
  
  var agentExecution: TaskExecution
  
  var author: String
  
  var category: String
  
  var contentsUploaded: Boolean
  
  var contributionIdentifier: String
  
  var contributionVersion: String
  
  var dataSourceBindings: js.Array[DataSourceBinding]
  
  var definitionType: String
  
  var demands: js.Array[js.Any]
  
  var description: String
  
  var disabled: Boolean
  
  var execution: StringDictionary[js.Any]
  
  var friendlyName: String
  
  var groups: js.Array[TaskGroupDefinition]
  
  var helpMarkDown: String
  
  var hostType: String
  
  var iconUrl: String
  
  var id: String
  
  var inputs: js.Array[TaskInputDefinition]
  
  var instanceNameFormat: String
  
  var minimumAgentVersion: String
  
  var name: String
  
  var packageLocation: String
  
  var packageType: String
  
  var preview: Boolean
  
  var releaseNotes: String
  
  var runsOn: js.Array[String]
  
  var serverOwned: Boolean
  
  var sourceDefinitions: js.Array[TaskSourceDefinition]
  
  var sourceLocation: String
  
  var version: TaskVersion
  
  var visibility: js.Array[String]
}
object TaskDefinition {
  
  inline def apply(
    agentExecution: TaskExecution,
    author: String,
    category: String,
    contentsUploaded: Boolean,
    contributionIdentifier: String,
    contributionVersion: String,
    dataSourceBindings: js.Array[DataSourceBinding],
    definitionType: String,
    demands: js.Array[js.Any],
    description: String,
    disabled: Boolean,
    execution: StringDictionary[js.Any],
    friendlyName: String,
    groups: js.Array[TaskGroupDefinition],
    helpMarkDown: String,
    hostType: String,
    iconUrl: String,
    id: String,
    inputs: js.Array[TaskInputDefinition],
    instanceNameFormat: String,
    minimumAgentVersion: String,
    name: String,
    packageLocation: String,
    packageType: String,
    preview: Boolean,
    releaseNotes: String,
    runsOn: js.Array[String],
    serverOwned: Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: String,
    version: TaskVersion,
    visibility: js.Array[String]
  ): TaskDefinition = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], contentsUploaded = contentsUploaded.asInstanceOf[js.Any], contributionIdentifier = contributionIdentifier.asInstanceOf[js.Any], contributionVersion = contributionVersion.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceNameFormat = instanceNameFormat.asInstanceOf[js.Any], minimumAgentVersion = minimumAgentVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any], packageType = packageType.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], releaseNotes = releaseNotes.asInstanceOf[js.Any], runsOn = runsOn.asInstanceOf[js.Any], serverOwned = serverOwned.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinition]
  }
  
  extension [Self <: TaskDefinition](x: Self) {
    
    inline def setAgentExecution(value: TaskExecution): Self = StObject.set(x, "agentExecution", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setContentsUploaded(value: Boolean): Self = StObject.set(x, "contentsUploaded", value.asInstanceOf[js.Any])
    
    inline def setContributionIdentifier(value: String): Self = StObject.set(x, "contributionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setContributionVersion(value: String): Self = StObject.set(x, "contributionVersion", value.asInstanceOf[js.Any])
    
    inline def setDataSourceBindings(value: js.Array[DataSourceBinding]): Self = StObject.set(x, "dataSourceBindings", value.asInstanceOf[js.Any])
    
    inline def setDataSourceBindingsVarargs(value: DataSourceBinding*): Self = StObject.set(x, "dataSourceBindings", js.Array(value :_*))
    
    inline def setDefinitionType(value: String): Self = StObject.set(x, "definitionType", value.asInstanceOf[js.Any])
    
    inline def setDemands(value: js.Array[js.Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setExecution(value: StringDictionary[js.Any]): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: js.Array[TaskGroupDefinition]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: TaskGroupDefinition*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setHelpMarkDown(value: String): Self = StObject.set(x, "helpMarkDown", value.asInstanceOf[js.Any])
    
    inline def setHostType(value: String): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[TaskInputDefinition]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TaskInputDefinition*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setInstanceNameFormat(value: String): Self = StObject.set(x, "instanceNameFormat", value.asInstanceOf[js.Any])
    
    inline def setMinimumAgentVersion(value: String): Self = StObject.set(x, "minimumAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackageLocation(value: String): Self = StObject.set(x, "packageLocation", value.asInstanceOf[js.Any])
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotes(value: String): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setRunsOn(value: js.Array[String]): Self = StObject.set(x, "runsOn", value.asInstanceOf[js.Any])
    
    inline def setRunsOnVarargs(value: String*): Self = StObject.set(x, "runsOn", js.Array(value :_*))
    
    inline def setServerOwned(value: Boolean): Self = StObject.set(x, "serverOwned", value.asInstanceOf[js.Any])
    
    inline def setSourceDefinitions(value: js.Array[TaskSourceDefinition]): Self = StObject.set(x, "sourceDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSourceDefinitionsVarargs(value: TaskSourceDefinition*): Self = StObject.set(x, "sourceDefinitions", js.Array(value :_*))
    
    inline def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: TaskVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: js.Array[String]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityVarargs(value: String*): Self = StObject.set(x, "visibility", js.Array(value :_*))
  }
}
