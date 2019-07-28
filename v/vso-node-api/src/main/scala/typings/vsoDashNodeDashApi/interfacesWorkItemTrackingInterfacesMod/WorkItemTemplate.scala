package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links, description = description, fields = fields, id = id, name = name, url = url, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemTemplate]
  }
}

