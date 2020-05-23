package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: Double | String
  var text: String
}

object Color {
  @scala.inline
  def apply(color: Double | String, text: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

