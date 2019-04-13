package typings
package tinycolor2Lib.tinycolor2Mod.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tinycolor2Lib.tinycolor2Mod._ColorInputWithoutInstance because Already inherited */ trait PRGBA
  extends PRGB
     with Alpha

object PRGBA {
  @scala.inline
  def apply(a: scala.Double, b: java.lang.String, g: java.lang.String, r: java.lang.String): PRGBA = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[PRGBA]
  }
}

