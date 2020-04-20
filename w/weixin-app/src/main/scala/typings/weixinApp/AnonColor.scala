package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: Double | String
  var text: String
}

object AnonColor {
  @scala.inline
  def apply(color: Double | String, text: String): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

