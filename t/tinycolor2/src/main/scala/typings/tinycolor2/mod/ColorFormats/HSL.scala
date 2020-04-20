package typings.tinycolor2.mod.ColorFormats

import typings.tinycolor2.mod._ColorInputWithoutInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSL extends _ColorInputWithoutInstance {
  var h: Double
  var l: Double
  var s: Double
}

object HSL {
  @scala.inline
  def apply(h: Double, l: Double, s: Double): HSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSL]
  }
}

