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
    val __obj = js.Dynamic.literal(a = a, add = add, adjustHue = adjustHue, adjustLightness = adjustLightness, clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, h = h, hash = hash, hsla = hsla, l = l, lineno = lineno, nodeName = nodeName, operate = operate, rgba = rgba, s = s, shouldCoerce = shouldCoerce, substract = substract, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[HSLA]
  }
}

