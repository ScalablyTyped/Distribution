package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color
  extends vegaDashTypingsLib.typesSpecEncodeMod._ColorValueRef {
  var color: vegaDashTypingsLib.typesSpecEncodeMod.ColorRGB | vegaDashTypingsLib.typesSpecEncodeMod.ColorHSL | vegaDashTypingsLib.typesSpecEncodeMod.ColorLAB | vegaDashTypingsLib.typesSpecEncodeMod.ColorHCL
}

object Anon_Color {
  @scala.inline
  def apply(
    color: vegaDashTypingsLib.typesSpecEncodeMod.ColorRGB | vegaDashTypingsLib.typesSpecEncodeMod.ColorHSL | vegaDashTypingsLib.typesSpecEncodeMod.ColorLAB | vegaDashTypingsLib.typesSpecEncodeMod.ColorHCL
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

