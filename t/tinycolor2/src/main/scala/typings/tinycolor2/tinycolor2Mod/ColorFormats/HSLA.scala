package typings.tinycolor2.tinycolor2Mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.tinycolor2Mod._ColorInput because Already inherited
- typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait HSLA
  extends HSL
     with Alpha

object HSLA {
  @scala.inline
  def apply(a: Double, h: Double, l: Double, s: Double): HSLA = {
    val __obj = js.Dynamic.literal(a = a, h = h, l = l, s = s)
  
    __obj.asInstanceOf[HSLA]
  }
}

