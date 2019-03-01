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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agentExecution")(agentExecution)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("contentsUploaded")(contentsUploaded)
    __obj.updateDynamic("contributionIdentifier")(contributionIdentifier)
    __obj.updateDynamic("contributionVersion")(contributionVersion)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("dataSourceBindings")(dataSourceBindings)
    __obj.updateDynamic("definitionType")(definitionType)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("execution")(execution)
    __obj.updateDynamic("friendlyName")(friendlyName)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("helpMarkDown")(helpMarkDown)
    __obj.updateDynamic("hostType")(hostType)
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("instanceNameFormat")(instanceNameFormat)
    __obj.updateDynamic("minimumAgentVersion")(minimumAgentVersion)
    __obj.updateDynamic("modifiedBy")(modifiedBy)
    __obj.updateDynamic("modifiedOn")(modifiedOn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("packageLocation")(packageLocation)
    __obj.updateDynamic("packageType")(packageType)
    __obj.updateDynamic("preview")(preview)
    __obj.updateDynamic("releaseNotes")(releaseNotes)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("runsOn")(runsOn)
    __obj.updateDynamic("serverOwned")(serverOwned)
    __obj.updateDynamic("sourceDefinitions")(sourceDefinitions)
    __obj.updateDynamic("sourceLocation")(sourceLocation)
    __obj.updateDynamic("tasks")(tasks)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[TaskGroup]
  }
}

