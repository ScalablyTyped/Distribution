package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterGatesAlways extends js.Object {
  var afterGatesAlways: Double
  var afterSuccessfulGates: Double
  var beforeGates: Double
}

object AnonAfterGatesAlways {
  @scala.inline
  def apply(afterGatesAlways: Double, afterSuccessfulGates: Double, beforeGates: Double): AnonAfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAfterGatesAlways]
  }
}

