package typings.tinycolor2.tinycolor2Mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.tinycolor2Mod._ColorInput because Already inherited
- typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait RGBA
  extends RGB
     with Alpha

object RGBA {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RGBA]
  }
}

