package typings.stylus.mod.Stylus.Nodes

import typings.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Node {
  var a: Double
  var b: Double
  var g: Double
  var hsla: HSLA
  var r: Double
  var rgba: RGBA
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: Double, g: Double, b: Double, a: Double): RGBA
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: Double): RGBA
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: Double): RGBA
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: Double, g: Double, b: Double, a: Double): RGBA
}

object RGBA {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double, Double) => RGBA,
    b: Double,
    coerce: Node => Node,
    column: Double,
    divide: Double => RGBA,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    g: Double,
    hash: java.lang.String,
    hsla: HSLA,
    lineno: Double,
    multiply: Double => RGBA,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    r: Double,
    rgba: RGBA,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (Double, Double, Double, Double) => RGBA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => AnonColumn
  ): RGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction4(add), b = b.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], divide = js.Any.fromFunction1(divide), eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], multiply = js.Any.fromFunction1(multiply), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), r = r.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction4(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RGBA]
  }
}

