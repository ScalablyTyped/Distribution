package typings.tinycolor2.tinycolor2Mod.ColorFormatsNs

import typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSV extends _ColorInputWithoutInstance {
  var h: Double
  var s: Double
  var v: Double
}

object HSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): HSV = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
  
    __obj.asInstanceOf[HSV]
  }
}

