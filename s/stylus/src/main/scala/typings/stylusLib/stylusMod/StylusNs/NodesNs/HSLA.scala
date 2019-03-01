package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLA extends Node {
  var a: scala.Double
  var h: scala.Double
  var hsla: HSLA
  var l: scala.Double
  var rgba: RGBA
  var s: scala.Double
  /**
    * Add h,s,l to the current component values
    */
  def add(h: scala.Double, s: scala.Double, l: scala.Double): HSLA
  /**
    * djust hue by `deg`.
    */
  def adjustHue(deg: scala.Double): HSLA
  /**
    * Adjust lightness by `percent`.
    */
  def adjustLightness(percent: scala.Double): HSLA
  /**
    * Subtract h,s,l from the current component values
    */
  def substract(h: scala.Double, s: scala.Double, l: scala.Double): HSLA
}

object HSLA {
  @scala.inline
  def apply(
    a: scala.Double,
    add: js.Function3[scala.Double, scala.Double, scala.Double, HSLA],
    adjustHue: js.Function1[scala.Double, HSLA],
    adjustLightness: js.Function1[scala.Double, HSLA],
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    h: scala.Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: scala.Double,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    rgba: RGBA,
    s: scala.Double,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    substract: js.Function3[scala.Double, scala.Double, scala.Double, HSLA],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_AColumn]
  ): HSLA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("adjustHue")(adjustHue)
    __obj.updateDynamic("adjustLightness")(adjustLightness)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("hsla")(hsla)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("rgba")(rgba)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("substract")(substract)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[HSLA]
  }
}

