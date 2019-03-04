package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Node {
  var a: scala.Double
  var b: scala.Double
  var g: scala.Double
  var hsla: HSLA
  var r: scala.Double
  var rgba: RGBA
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): RGBA
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: scala.Double): RGBA
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: scala.Double): RGBA
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): RGBA
}

object RGBA {
  @scala.inline
  def apply(
    a: scala.Double,
    add: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, RGBA],
    b: scala.Double,
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    divide: js.Function1[scala.Double, RGBA],
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    g: scala.Double,
    hash: java.lang.String,
    hsla: HSLA,
    lineno: scala.Double,
    multiply: js.Function1[scala.Double, RGBA],
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    r: scala.Double,
    rgba: RGBA,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    substract: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, RGBA],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ABColumn]
  ): RGBA = {
    val __obj = js.Dynamic.literal(a = a, add = add, b = b, clone = clone, coerce = coerce, column = column, divide = divide, eval = eval, filename = filename, first = first, g = g, hash = hash, hsla = hsla, lineno = lineno, multiply = multiply, nodeName = nodeName, operate = operate, r = r, rgba = rgba, shouldCoerce = shouldCoerce, substract = substract, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[RGBA]
  }
}

