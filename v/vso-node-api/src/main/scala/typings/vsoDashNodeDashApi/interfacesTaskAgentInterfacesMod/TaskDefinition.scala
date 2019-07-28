package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(agentExecution = agentExecution, author = author, category = category, contentsUploaded = contentsUploaded, contributionIdentifier = contributionIdentifier, contributionVersion = contributionVersion, dataSourceBindings = dataSourceBindings, definitionType = definitionType, demands = demands, description = description, disabled = disabled, execution = execution, friendlyName = friendlyName, groups = groups, helpMarkDown = helpMarkDown, hostType = hostType, iconUrl = iconUrl, id = id, inputs = inputs, instanceNameFormat = instanceNameFormat, minimumAgentVersion = minimumAgentVersion, name = name, packageLocation = packageLocation, packageType = packageType, preview = preview, releaseNotes = releaseNotes, runsOn = runsOn, serverOwned = serverOwned, sourceDefinitions = sourceDefinitions, sourceLocation = sourceLocation, version = version, visibility = visibility)
  
    __obj.asInstanceOf[TaskDefinition]
  }
}

