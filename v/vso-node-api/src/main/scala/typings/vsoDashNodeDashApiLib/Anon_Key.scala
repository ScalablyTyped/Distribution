package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var value: js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColor]
}

object Anon_Key {
  @scala.inline
  def apply(
    key: java.lang.String,
    value: js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColor]
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Key]
  }
}

