package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hex extends js.Object {
  var hex: String
  var hsl: String
  var hsv: String
  var rgb: String
}

object Hex {
  @scala.inline
  def apply(hex: String, hsl: String, hsv: String, rgb: String): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
}

