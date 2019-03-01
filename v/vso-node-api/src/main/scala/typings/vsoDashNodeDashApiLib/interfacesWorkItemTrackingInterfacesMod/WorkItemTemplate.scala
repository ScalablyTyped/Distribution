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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItemTypeName")(workItemTypeName)
    __obj.asInstanceOf[WorkItemTemplate]
  }
}

