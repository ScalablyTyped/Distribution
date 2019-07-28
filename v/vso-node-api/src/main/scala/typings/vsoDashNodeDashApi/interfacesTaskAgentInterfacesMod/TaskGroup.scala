package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroup extends TaskDefinition {
  var comment: String
  var createdBy: IdentityRef
  var createdOn: Date
  var modifiedBy: IdentityRef
  var modifiedOn: Date
  var owner: String
  var revision: Double
  var tasks: js.Array[TaskGroupStep]
}

object TaskGroup {
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: String,
    category: String,
    comment: String,
    contentsUploaded: Boolean,
    contributionIdentifier: String,
    contributionVersion: String,
    createdBy: IdentityRef,
    createdOn: Date,
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
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    owner: String,
    packageLocation: String,
    packageType: String,
    preview: Boolean,
    releaseNotes: String,
    revision: Double,
    runsOn: js.Array[String],
    serverOwned: Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: String,
    tasks: js.Array[TaskGroupStep],
    version: TaskVersion,
    visibility: js.Array[String]
  ): TaskGroup = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution, author = author, category = category, comment = comment, contentsUploaded = contentsUploaded, contributionIdentifier = contributionIdentifier, contributionVersion = contributionVersion, createdBy = createdBy, createdOn = createdOn, dataSourceBindings = dataSourceBindings, definitionType = definitionType, demands = demands, description = description, disabled = disabled, execution = execution, friendlyName = friendlyName, groups = groups, helpMarkDown = helpMarkDown, hostType = hostType, iconUrl = iconUrl, id = id, inputs = inputs, instanceNameFormat = instanceNameFormat, minimumAgentVersion = minimumAgentVersion, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, owner = owner, packageLocation = packageLocation, packageType = packageType, preview = preview, releaseNotes = releaseNotes, revision = revision, runsOn = runsOn, serverOwned = serverOwned, sourceDefinitions = sourceDefinitions, sourceLocation = sourceLocation, tasks = tasks, version = version, visibility = visibility)
  
    __obj.asInstanceOf[TaskGroup]
  }
}

