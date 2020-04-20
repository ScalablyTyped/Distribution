package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinition extends js.Object {
  var agentExecution: TaskExecution
  var author: String
  var category: String
  var contentsUploaded: Boolean
  var contributionIdentifier: String
  var contributionVersion: String
  var dataSourceBindings: js.Array[DataSourceBinding]
  var definitionType: String
  var demands: js.Array[_]
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
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: String,
    category: String,
    contentsUploaded: Boolean,
    contributionIdentifier: String,
    contributionVersion: String,
    dataSourceBindings: js.Array[DataSourceBinding],
    definitionType: String,
    demands: js.Array[_],
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
}

