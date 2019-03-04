package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroup extends TaskDefinition {
  var comment: java.lang.String
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var createdOn: stdLib.Date
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var modifiedOn: stdLib.Date
  var owner: java.lang.String
  var revision: scala.Double
  var tasks: js.Array[TaskGroupStep]
}

object TaskGroup {
  @scala.inline
  def apply(
    agentExecution: TaskExecution,
    author: java.lang.String,
    category: java.lang.String,
    comment: java.lang.String,
    contentsUploaded: scala.Boolean,
    contributionIdentifier: java.lang.String,
    contributionVersion: java.lang.String,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
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
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    owner: java.lang.String,
    packageLocation: java.lang.String,
    packageType: java.lang.String,
    preview: scala.Boolean,
    releaseNotes: java.lang.String,
    revision: scala.Double,
    runsOn: js.Array[java.lang.String],
    serverOwned: scala.Boolean,
    sourceDefinitions: js.Array[TaskSourceDefinition],
    sourceLocation: java.lang.String,
    tasks: js.Array[TaskGroupStep],
    version: TaskVersion,
    visibility: js.Array[java.lang.String]
  ): TaskGroup = {
    val __obj = js.Dynamic.literal(agentExecution = agentExecution, author = author, category = category, comment = comment, contentsUploaded = contentsUploaded, contributionIdentifier = contributionIdentifier, contributionVersion = contributionVersion, createdBy = createdBy, createdOn = createdOn, dataSourceBindings = dataSourceBindings, definitionType = definitionType, demands = demands, description = description, disabled = disabled, execution = execution, friendlyName = friendlyName, groups = groups, helpMarkDown = helpMarkDown, hostType = hostType, iconUrl = iconUrl, id = id, inputs = inputs, instanceNameFormat = instanceNameFormat, minimumAgentVersion = minimumAgentVersion, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, owner = owner, packageLocation = packageLocation, packageType = packageType, preview = preview, releaseNotes = releaseNotes, revision = revision, runsOn = runsOn, serverOwned = serverOwned, sourceDefinitions = sourceDefinitions, sourceLocation = sourceLocation, tasks = tasks, version = version, visibility = visibility)
  
    __obj.asInstanceOf[TaskGroup]
  }
}

