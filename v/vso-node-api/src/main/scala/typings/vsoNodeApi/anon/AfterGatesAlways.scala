package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterGatesAlways extends js.Object {
  var afterGatesAlways: scala.Double
  var afterSuccessfulGates: scala.Double
  var beforeGates: scala.Double
}

object AfterGatesAlways {
  @scala.inline
  def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): AfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGatesAlways]
  }
}

