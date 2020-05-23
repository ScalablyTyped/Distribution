package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ColorHCL
import typings.vegaTypings.encodeMod.ColorHSL
import typings.vegaTypings.encodeMod.ColorLAB
import typings.vegaTypings.encodeMod.ColorRGB
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object Color {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

