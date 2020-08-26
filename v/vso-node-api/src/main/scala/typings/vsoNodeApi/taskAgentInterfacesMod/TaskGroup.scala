package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskGroup extends TaskDefinition {
  var comment: String = js.native
  var createdBy: IdentityRef = js.native
  var createdOn: Date = js.native
  var modifiedBy: IdentityRef = js.native
  var modifiedOn: Date = js.native
  var owner: String = js.native
  var revision: Double = js.native
  var tasks: js.Array[TaskGroupStep] = js.native
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
    val __obj = js.Dynamic.literal(agentExecution = agentExecution.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], contentsUploaded = contentsUploaded.asInstanceOf[js.Any], contributionIdentifier = contributionIdentifier.asInstanceOf[js.Any], contributionVersion = contributionVersion.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], instanceNameFormat = instanceNameFormat.asInstanceOf[js.Any], minimumAgentVersion = minimumAgentVersion.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any], packageType = packageType.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], releaseNotes = releaseNotes.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runsOn = runsOn.asInstanceOf[js.Any], serverOwned = serverOwned.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroup]
  }
  @scala.inline
  implicit class TaskGroupOps[Self <: TaskGroup] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasksVarargs(value: TaskGroupStep*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[TaskGroupStep]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
  
}

