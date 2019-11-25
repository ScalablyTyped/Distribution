package typings.vegaDashTypings.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColorValueRef extends js.Object

object _ColorValueRef {
  @scala.inline
  def Anon_ValueLinearGradient(value: LinearGradient | RadialGradient): _ColorValueRef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def Anon_Count(
    gradient: Field,
    count: Int | Double = null,
    start: js.Array[Double] = null,
    stop: js.Array[Double] = null
  ): _ColorValueRef = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def Anon_Color(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): _ColorValueRef = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ColorValueRef]
  }
}

