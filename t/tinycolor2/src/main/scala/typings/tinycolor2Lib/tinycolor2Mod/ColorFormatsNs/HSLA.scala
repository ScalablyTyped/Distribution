package typings
package tinycolor2Lib.tinycolor2Mod.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tinycolor2Lib.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait HSLA
  extends HSL
     with Alpha

object HSLA {
  @scala.inline
  def apply(a: scala.Double, h: scala.Double, l: scala.Double, s: scala.Double): HSLA = {
    val __obj = js.Dynamic.literal(a = a, h = h, l = l, s = s)
  
    __obj.asInstanceOf[HSLA]
  }
}

