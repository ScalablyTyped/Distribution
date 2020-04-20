package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTemplate extends WorkItemTemplateReference {
  /**
    * Mapping of field and its templated value.
    */
  var fields: StringDictionary[String]
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
}

