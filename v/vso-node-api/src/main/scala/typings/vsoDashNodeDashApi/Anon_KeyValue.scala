package typings.vsoDashNodeDashApi

import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: String
  var value: js.Array[WorkItemTypeColorAndIcon]
}

object Anon_KeyValue {
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColorAndIcon]): Anon_KeyValue = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

