package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColorValueRef extends js.Object

object _ColorValueRef {
  @scala.inline
  def `0`(value: LinearGradient | RadialGradient): _ColorValueRef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def Count(gradient: Field): _ColorValueRef = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def Color(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): _ColorValueRef = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValueRef]
  }
}

