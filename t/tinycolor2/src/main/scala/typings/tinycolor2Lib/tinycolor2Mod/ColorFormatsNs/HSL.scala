package typings
package tinycolor2Lib.tinycolor2Mod.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSL
  extends tinycolor2Lib.tinycolor2Mod._ColorInputWithoutInstance {
  var h: scala.Double
  var l: scala.Double
  var s: scala.Double
}

object HSL {
  @scala.inline
  def apply(h: scala.Double, l: scala.Double, s: scala.Double): HSL = {
    val __obj = js.Dynamic.literal(h = h, l = l, s = s)
  
    __obj.asInstanceOf[HSL]
  }
}

