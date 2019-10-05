package typings.tinycolor2.tinycolor2Mod.ColorFormats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tinycolor2.tinycolor2Mod._ColorInput because Already inherited
- typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait HSVA extends HSV {
  var a: Double
}

object HSVA {
  @scala.inline
  def apply(a: Double, h: Double, s: Double, v: Double): HSVA = {
    val __obj = js.Dynamic.literal(a = a, h = h, s = s, v = v)
  
    __obj.asInstanceOf[HSVA]
  }
}

