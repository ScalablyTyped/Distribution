package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixLike extends _MatrixAlias {
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var f: Double
}

object MatrixLike {
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): MatrixLike = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f)
  
    __obj.asInstanceOf[MatrixLike]
  }
}

