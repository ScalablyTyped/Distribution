package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.AnonKeyValueAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointWorkItemProperty extends js.Object {
  var workItem: AnonKeyValueAny
}

object PointWorkItemProperty {
  @scala.inline
  def apply(workItem: AnonKeyValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointWorkItemProperty]
  }
}

