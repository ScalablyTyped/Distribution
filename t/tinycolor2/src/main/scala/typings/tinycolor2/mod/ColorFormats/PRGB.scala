package typings.tinycolor2.mod.ColorFormats

import typings.tinycolor2.mod._ColorInputWithoutInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PRGB extends _ColorInputWithoutInstance {
  var b: String
  var g: String
  var r: String
}

object PRGB {
  @scala.inline
  def apply(b: String, g: String, r: String): PRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PRGB]
  }
}

