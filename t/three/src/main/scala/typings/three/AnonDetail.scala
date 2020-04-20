package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetail extends js.Object {
  var detail: Double
  var radius: Double
}

object AnonDetail {
  @scala.inline
  def apply(detail: Double, radius: Double): AnonDetail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetail]
  }
}

