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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("divide")(divide)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("hsla")(hsla)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("multiply")(multiply)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("rgba")(rgba)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("substract")(substract)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[RGBA]
  }
}

