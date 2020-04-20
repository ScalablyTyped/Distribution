package typings.tinycolor2.mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.mod._ColorInput because Already inherited
- typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait PRGBA
  extends PRGB
     with Alpha

object PRGBA {
  @scala.inline
  def apply(a: Double, b: String, g: String, r: String): PRGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[PRGBA]
  }
}

