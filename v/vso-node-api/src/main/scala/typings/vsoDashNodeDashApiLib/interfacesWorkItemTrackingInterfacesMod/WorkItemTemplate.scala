package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTemplate extends WorkItemTemplateReference {
  /**
    * Mapping of field and its templated value.
    */
  var fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object WorkItemTemplate {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    fields: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    workItemTypeName: java.lang.String
  ): WorkItemTemplate = {
    val __obj = js.Dynamic.literal(_links = _links, description = description, fields = fields, id = id, name = name, url = url, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemTemplate]
  }
}

