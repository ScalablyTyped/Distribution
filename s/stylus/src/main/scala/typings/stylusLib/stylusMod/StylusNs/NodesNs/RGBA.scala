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
    add: (scala.Double, scala.Double, scala.Double, scala.Double) => RGBA,
    b: scala.Double,
    clone: () => Node,
    coerce: Node => Node,
    column: scala.Double,
    divide: scala.Double => RGBA,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    g: scala.Double,
    hash: java.lang.String,
    hsla: HSLA,
    lineno: scala.Double,
    multiply: scala.Double => RGBA,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    r: scala.Double,
    rgba: RGBA,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (scala.Double, scala.Double, scala.Double, scala.Double) => RGBA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => stylusLib.Anon_ABColumn
  ): RGBA = {
    val __obj = js.Dynamic.literal(a = a, add = js.Any.fromFunction4(add), b = b, clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, divide = js.Any.fromFunction1(divide), eval = js.Any.fromFunction0(eval), filename = filename, first = first, g = g, hash = hash, hsla = hsla, lineno = lineno, multiply = js.Any.fromFunction1(multiply), nodeName = nodeName, operate = js.Any.fromFunction2(operate), r = r, rgba = rgba, shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction4(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RGBA]
  }
}

