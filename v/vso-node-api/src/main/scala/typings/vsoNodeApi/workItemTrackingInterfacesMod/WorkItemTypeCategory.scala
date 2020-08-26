package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeCategory extends WorkItemTrackingResource {
  /**
    * Gets or sets the default type of the work item.
    */
  var defaultWorkItemType: WorkItemTypeReference = js.native
  /**
    * The name of the category.
    */
  var name: String = js.native
  /**
    * The reference name of the category.
    */
  var referenceName: String = js.native
  /**
    * The work item types that belond to the category.
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}

object WorkItemTypeCategory {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultWorkItemType: WorkItemTypeReference,
    name: String,
    referenceName: String,
    url: String,
    workItemTypes: js.Array[WorkItemTypeReference]
  ): WorkItemTypeCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultWorkItemType = defaultWorkItemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeCategory]
  }
  @scala.inline
  implicit class WorkItemTypeCategoryOps[Self <: WorkItemTypeCategory] (val x: Self) extends AnyVal {
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
    def setDefaultWorkItemType(value: WorkItemTypeReference): Self = this.set("defaultWorkItemType", value.asInstanceOf[js.Any])
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

