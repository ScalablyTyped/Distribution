package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.anon.ValueAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointWorkItemProperty extends js.Object {
  var workItem: ValueAny
}

object PointWorkItemProperty {
  @scala.inline
  def apply(workItem: ValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWorkItemProperty]
  }
}

