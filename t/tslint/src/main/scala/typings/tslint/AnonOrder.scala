package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var order: String
}

object AnonOrder {
  @scala.inline
  def apply(order: String): AnonOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrder]
  }
}

