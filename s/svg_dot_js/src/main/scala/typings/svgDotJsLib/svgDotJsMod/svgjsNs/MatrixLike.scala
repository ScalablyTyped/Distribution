package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixLike extends _MatrixAlias {
  var a: scala.Double
  var b: scala.Double
  var c: scala.Double
  var d: scala.Double
  var e: scala.Double
  var f: scala.Double
}

object MatrixLike {
  @scala.inline
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): MatrixLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("d")(d)
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("f")(f)
    __obj.asInstanceOf[MatrixLike]
  }
}

