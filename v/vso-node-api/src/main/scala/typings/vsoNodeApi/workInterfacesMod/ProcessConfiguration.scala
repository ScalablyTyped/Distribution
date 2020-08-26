package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessConfiguration extends js.Object {
  /**
    * Details about bug work items
    */
  var bugWorkItems: CategoryConfiguration = js.native
  /**
    * Details about portfolio backlogs
    */
  var portfolioBacklogs: js.Array[CategoryConfiguration] = js.native
  /**
    * Details of requirement backlog
    */
  var requirementBacklog: CategoryConfiguration = js.native
  /**
    * Details of task backlog
    */
  var taskBacklog: CategoryConfiguration = js.native
  /**
    * Type fields for the process configuration
    */
  var typeFields: StringDictionary[WorkItemFieldReference] = js.native
  var url: String = js.native
}

object ProcessConfiguration {
  @scala.inline
  def apply(
    bugWorkItems: CategoryConfiguration,
    portfolioBacklogs: js.Array[CategoryConfiguration],
    requirementBacklog: CategoryConfiguration,
    taskBacklog: CategoryConfiguration,
    typeFields: StringDictionary[WorkItemFieldReference],
    url: String
  ): ProcessConfiguration = {
    val __obj = js.Dynamic.literal(bugWorkItems = bugWorkItems.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], typeFields = typeFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessConfiguration]
  }
  @scala.inline
  implicit class ProcessConfigurationOps[Self <: ProcessConfiguration] (val x: Self) extends AnyVal {
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
    def setBugWorkItems(value: CategoryConfiguration): Self = this.set("bugWorkItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortfolioBacklogsVarargs(value: CategoryConfiguration*): Self = this.set("portfolioBacklogs", js.Array(value :_*))
    @scala.inline
    def setPortfolioBacklogs(value: js.Array[CategoryConfiguration]): Self = this.set("portfolioBacklogs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequirementBacklog(value: CategoryConfiguration): Self = this.set("requirementBacklog", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskBacklog(value: CategoryConfiguration): Self = this.set("taskBacklog", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeFields(value: StringDictionary[WorkItemFieldReference]): Self = this.set("typeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

