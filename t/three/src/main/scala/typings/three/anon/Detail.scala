package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detail extends js.Object {
  var detail: Double
  var radius: Double
}

object Detail {
  @scala.inline
  def apply(detail: Double, radius: Double): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
}

