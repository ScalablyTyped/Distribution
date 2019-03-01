package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs.ColorFormatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSV
  extends tinycolor2Lib.tinycolor2Mod.tinycolorNs._ColorInputWithoutInstance {
  var h: scala.Double
  var s: scala.Double
  var v: scala.Double
}

object HSV {
  @scala.inline
  def apply(h: scala.Double, s: scala.Double, v: scala.Double): HSV = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[HSV]
  }
}

