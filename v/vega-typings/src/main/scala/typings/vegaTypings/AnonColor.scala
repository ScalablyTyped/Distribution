package typings.vegaTypings

import typings.vegaTypings.encodeMod.ColorHCL
import typings.vegaTypings.encodeMod.ColorHSL
import typings.vegaTypings.encodeMod.ColorLAB
import typings.vegaTypings.encodeMod.ColorRGB
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object AnonColor {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

