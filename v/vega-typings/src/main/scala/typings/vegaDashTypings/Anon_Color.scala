package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.ColorHCL
import typings.vegaDashTypings.typesSpecEncodeMod.ColorHSL
import typings.vegaDashTypings.typesSpecEncodeMod.ColorLAB
import typings.vegaDashTypings.typesSpecEncodeMod.ColorRGB
import typings.vegaDashTypings.typesSpecEncodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object Anon_Color {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

