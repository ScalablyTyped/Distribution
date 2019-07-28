package typings.tinycolor2.tinycolor2Mod.ColorFormatsNs

import typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance
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
    val __obj = js.Dynamic.literal(h = h, l = l, s = s)
  
    __obj.asInstanceOf[HSL]
  }
}

