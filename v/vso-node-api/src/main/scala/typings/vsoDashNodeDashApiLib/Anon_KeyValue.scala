package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: java.lang.String
  var value: js.Array[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
  ]
}

object Anon_KeyValue {
  @scala.inline
  def apply(
    key: java.lang.String,
    value: js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
    ]
  ): Anon_KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

