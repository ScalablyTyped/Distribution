package typings.svgDotJs.svgDotJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import typings.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix
  extends Instantiable0[Matrix]
     with Instantiable1[/* source */ MatrixAlias, Matrix]
     with Instantiable6[
      /* a */ Double, 
      /* b */ Double, 
      /* c */ Double, 
      /* d */ Double, 
      /* e */ Double, 
      /* f */ Double, 
      Matrix
    ] {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  def around(cx: Double, cy: Double, matrix: Matrix): Matrix = js.native
  def at(pos: Double): Matrix = js.native
  def extract(): MatrixExtract = js.native
  def flip(): Matrix = js.native
  def flip(a: String): Matrix = js.native
  def flip(a: String, offset: Double): Matrix = js.native
  def flip(offset: Double): Matrix = js.native
  def inverse(): Matrix = js.native
  def morph(matrix: Matrix): this.type = js.native
  def multiply(matrix: Matrix): Matrix = js.native
  def native(): SVGMatrix = js.native
  def rotate(r: Double): Matrix = js.native
  def rotate(r: Double, cx: Double): Matrix = js.native
  def rotate(r: Double, cx: Double, cy: Double): Matrix = js.native
  def scale(x: Double): Matrix = js.native
  def scale(x: Double, y: Double): Matrix = js.native
  def scale(x: Double, y: Double, cx: Double): Matrix = js.native
  def scale(x: Double, y: Double, cx: Double, cy: Double): Matrix = js.native
  def skew(x: Double): Matrix = js.native
  def skew(x: Double, y: Double): Matrix = js.native
  def skew(x: Double, y: Double, cx: Double): Matrix = js.native
  def skew(x: Double, y: Double, cx: Double, cy: Double): Matrix = js.native
  def skewX(x: Double): Matrix = js.native
  def skewX(x: Double, cx: Double): Matrix = js.native
  def skewX(x: Double, cx: Double, cy: Double): Matrix = js.native
  def skewY(y: Double): Matrix = js.native
  def skewY(y: Double, cx: Double): Matrix = js.native
  def skewY(y: Double, cx: Double, cy: Double): Matrix = js.native
  def translate(x: Double, y: Double): Matrix = js.native
}

