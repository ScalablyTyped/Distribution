package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tinycolor2Lib.tinycolor2Mod.tinycolorNs._ColorInputWithoutInstance because Already inherited */ trait HSVA extends HSV {
  var a: scala.Double
}

object HSVA {
  @scala.inline
  def apply(a: scala.Double, h: scala.Double, s: scala.Double, v: scala.Double): HSVA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[HSVA]
  }
}

