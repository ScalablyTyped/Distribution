package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinition extends js.Object {
  var agentExecution: TaskExecution
  var author: java.lang.String
  var category: java.lang.String
  var contentsUploaded: scala.Boolean
  var contributionIdentifier: java.lang.String
  var contributionVersion: java.lang.String
  var dataSourceBindings: js.Array[DataSourceBinding]
  var definitionType: java.lang.String
  var demands: js.Array[_]
  var description: java.lang.String
  var disabled: scala.Boolean
  var execution: org.scalablytyped.runtime.StringDictionary[js.Any]
  var friendlyName: java.lang.String
  var groups: js.Array[TaskGroupDefinition]
  var helpMarkDown: java.lang.String
  var hostType: java.lang.String
  var iconUrl: java.lang.String
  var id: java.lang.String
  var inputs: js.Array[TaskInputDefinition]
  var instanceNameFormat: java.lang.String
  var minimumAgentVersion: java.lang.String
  var name: java.lang.String
  var packageLocation: java.lang.String
  var packageType: java.lang.String
  var preview: scala.Boolean
  var releaseNotes: java.lang.String
  var runsOn: js.Array[java.lang.String]
  var serverOwned: scala.Boolean
  var sourceDefinitions: js.Array[TaskSourceDefinition]
  var sourceLocation: java.lang.String
  var version: TaskVersion
  var visibility: js.Array[java.lang.String]
}

object TaskDefinition {
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: java.lang.String,
    category: java.lang.String,
    contentsUploaded: scala.Boolean,
    contributionIdentifier: java.lang.String,
    contributionVersion: java.lang.String,
    dataSourceBindings: js.Array[DataSourceBinding],
    definitionType: java.lang.String,
    demands: js.Array[_],
    description: java.lang.String,
    disabled: scala.Boolean,
    execution: org.scalablytyped.runtime.StringDictionary[js.Any],
    friendlyName: java.lang.String,
    groups: js.Array[TaskGroupDefinition],
    helpMarkDown: java.lang.String,
    hostType: java.lang.String,
    iconUrl: java.lang.String,
    id: java.lang.String,
    inputs: js.Array[TaskInputDefinition],
    instanceNameFormat: java.lang.String,
    minimumAgentVersion: java.lang.String,
    name: java.lang.String,
    packageLocation: java.lang.String,
    packageType: java.lang.String,
    preview: scala.Boolean,
    releaseNotes: java.lang.String,
    runsOn: js.Array[java.lang.String],
    serverOwned: scala.Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: java.lang.String,
    version: TaskVersion,
    visibility: js.Array[java.lang.String]
  ): TaskDefinition = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution, author = author, category = category, contentsUploaded = contentsUploaded, contributionIdentifier = contributionIdentifier, contributionVersion = contributionVersion, dataSourceBindings = dataSourceBindings, definitionType = definitionType, demands = demands, description = description, disabled = disabled, execution = execution, friendlyName = friendlyName, groups = groups, helpMarkDown = helpMarkDown, hostType = hostType, iconUrl = iconUrl, id = id, inputs = inputs, instanceNameFormat = instanceNameFormat, minimumAgentVersion = minimumAgentVersion, name = name, packageLocation = packageLocation, packageType = packageType, preview = preview, releaseNotes = releaseNotes, runsOn = runsOn, serverOwned = serverOwned, sourceDefinitions = sourceDefinitions, sourceLocation = sourceLocation, version = version, visibility = visibility)
  
    __obj.asInstanceOf[TaskDefinition]
  }
}

