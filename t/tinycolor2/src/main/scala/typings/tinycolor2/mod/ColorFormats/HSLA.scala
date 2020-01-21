package typings.tinycolor2.mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.mod._ColorInput because Already inherited
- typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait HSLA
  extends HSL
     with Alpha

object HSLA {
  @scala.inline
  def apply(a: Double, h: Double, l: Double, s: Double): HSLA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HSLA]
  }
}

