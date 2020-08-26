package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryConfiguration extends js.Object {
  /**
    * Name
    */
  var name: String = js.native
  /**
    * Category Reference Name
    */
  var referenceName: String = js.native
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}

object CategoryConfiguration {
  @scala.inline
  def apply(name: String, referenceName: String, workItemTypes: js.Array[WorkItemTypeReference]): CategoryConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryConfiguration]
  }
  @scala.inline
  implicit class CategoryConfigurationOps[Self <: CategoryConfiguration] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemTypesVarargs(value: WorkItemTypeReference*): Self = this.set("workItemTypes", js.Array(value :_*))
    @scala.inline
    def setWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = this.set("workItemTypes", value.asInstanceOf[js.Any])
  }
  
}

