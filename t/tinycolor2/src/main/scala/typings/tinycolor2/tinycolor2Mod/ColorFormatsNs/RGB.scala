package typings.tinycolor2.tinycolor2Mod.ColorFormatsNs

import typings.tinycolor2.tinycolor2Mod._ColorInputWithoutInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends _ColorInputWithoutInstance {
  var b: Double
  var g: Double
  var r: Double
}

object RGB {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): RGB = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
  
    __obj.asInstanceOf[RGB]
  }
}

