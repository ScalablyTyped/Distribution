package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PRGB
  extends tinycolor2Lib.tinycolor2Mod.tinycolorNs._ColorInputWithoutInstance {
  var b: java.lang.String
  var g: java.lang.String
  var r: java.lang.String
}

object PRGB {
  @scala.inline
  def apply(b: java.lang.String, g: java.lang.String, r: java.lang.String): PRGB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[PRGB]
  }
}

