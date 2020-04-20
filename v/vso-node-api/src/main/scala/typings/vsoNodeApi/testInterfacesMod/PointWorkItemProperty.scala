package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.AnonValueAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointWorkItemProperty extends js.Object {
  var workItem: AnonValueAny
}

object PointWorkItemProperty {
  @scala.inline
  def apply(workItem: AnonValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWorkItemProperty]
  }
}

