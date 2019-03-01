package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGFilterPrimitiveStandardAttributes extends js.Object {
  val height: SVGAnimatedLength
  val result: SVGAnimatedString
  val width: SVGAnimatedLength
  val x: SVGAnimatedLength
  val y: SVGAnimatedLength
}

object SVGFilterPrimitiveStandardAttributes {
  @scala.inline
  def apply(
    height: SVGAnimatedLength,
    result: SVGAnimatedString,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
}

