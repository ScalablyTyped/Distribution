package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeTemplate extends js.Object {
  /**
    * XML template in string format.
    */
  var template: java.lang.String
}

object WorkItemTypeTemplate {
  @scala.inline
  def apply(template: java.lang.String): WorkItemTypeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[WorkItemTypeTemplate]
  }
}

