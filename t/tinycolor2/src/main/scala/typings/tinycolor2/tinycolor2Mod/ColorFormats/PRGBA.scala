package typings.tinycolor2.tinycolor2Mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.tinycolor2Mod._ColorInput because Already inherited
- typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait PRGBA
  extends PRGB
     with Alpha

object PRGBA {
  @scala.inline
  def apply(a: Double, b: String, g: String, r: String): PRGBA = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[PRGBA]
  }
}

