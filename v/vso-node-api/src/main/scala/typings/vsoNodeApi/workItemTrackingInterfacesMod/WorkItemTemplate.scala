package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTemplate extends WorkItemTemplateReference {
  /**
    * Mapping of field and its templated value.
    */
  var fields: StringDictionary[String] = js.native
}

object WorkItemTemplate {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    fields: StringDictionary[String],
    id: String,
    name: String,
    url: String,
    workItemTypeName: String
  ): WorkItemTemplate = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTemplate]
  }
  @scala.inline
  implicit class WorkItemTemplateOps[Self <: WorkItemTemplate] (val x: Self) extends AnyVal {
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
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

