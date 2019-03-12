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
    add: (scala.Double, scala.Double, scala.Double) => HSLA,
    adjustHue: scala.Double => HSLA,
    adjustLightness: scala.Double => HSLA,
    clone: () => Node,
    coerce: Node => Node,
    column: scala.Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    h: scala.Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: scala.Double,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    rgba: RGBA,
    s: scala.Double,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (scala.Double, scala.Double, scala.Double) => HSLA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => stylusLib.Anon_AColumn
  ): HSLA = {
    val __obj = js.Dynamic.literal(a = a, add = js.Any.fromFunction3(add), adjustHue = js.Any.fromFunction1(adjustHue), adjustLightness = js.Any.fromFunction1(adjustLightness), clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, h = h, hash = hash, hsla = hsla, l = l, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), rgba = rgba, s = s, shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction3(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[HSLA]
  }
}

