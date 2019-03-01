package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDependentRule extends WorkItemTrackingResource {
  /**
    * The dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference]
}

object FieldDependentRule {
  @scala.inline
  def apply(_links: js.Any, dependentFields: js.Array[WorkItemFieldReference], url: java.lang.String): FieldDependentRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("dependentFields")(dependentFields)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FieldDependentRule]
  }
}

