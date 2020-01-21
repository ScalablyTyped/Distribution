package typings.stylus.mod.Stylus.Nodes

import typings.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLA extends Node {
  var a: Double
  var h: Double
  var hsla: HSLA
  var l: Double
  var rgba: RGBA
  var s: Double
  /**
    * Add h,s,l to the current component values
    */
  def add(h: Double, s: Double, l: Double): HSLA
  /**
    * djust hue by `deg`.
    */
  def adjustHue(deg: Double): HSLA
  /**
    * Adjust lightness by `percent`.
    */
  def adjustLightness(percent: Double): HSLA
  /**
    * Subtract h,s,l from the current component values
    */
  def substract(h: Double, s: Double, l: Double): HSLA
}

object HSLA {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double) => HSLA,
    adjustHue: Double => HSLA,
    adjustLightness: Double => HSLA,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    h: Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    rgba: RGBA,
    s: Double,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (Double, Double, Double) => HSLA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => AnonColumn
  ): HSLA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction3(add), adjustHue = js.Any.fromFunction1(adjustHue), adjustLightness = js.Any.fromFunction1(adjustLightness), coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), rgba = rgba.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction3(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[HSLA]
  }
}

