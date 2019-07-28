package typings.tinycolor2.tinycolor2Mod.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait RGBA
  extends RGB
     with Alpha

object RGBA {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[RGBA]
  }
}

