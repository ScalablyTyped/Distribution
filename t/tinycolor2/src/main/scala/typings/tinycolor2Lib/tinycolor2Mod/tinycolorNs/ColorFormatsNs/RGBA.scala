package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tinycolor2Lib.tinycolor2Mod.tinycolorNs._ColorInputWithoutInstance because Already inherited */ trait RGBA
  extends RGB
     with Alpha

object RGBA {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): RGBA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[RGBA]
  }
}

