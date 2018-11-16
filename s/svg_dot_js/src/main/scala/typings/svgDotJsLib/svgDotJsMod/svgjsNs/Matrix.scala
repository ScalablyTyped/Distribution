package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix
  extends ScalablyTyped.runtime.Instantiable0[Matrix]
     with ScalablyTyped.runtime.Instantiable1[/* source */ MatrixAlias, Matrix]
     with ScalablyTyped.runtime.Instantiable6[
      /* a */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      /* e */ scala.Double, 
      /* f */ scala.Double, 
      Matrix
    ] {
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var e: scala.Double = js.native
  var f: scala.Double = js.native
  def around(cx: scala.Double, cy: scala.Double, matrix: Matrix): Matrix = js.native
  def at(pos: scala.Double): Matrix = js.native
  def extract(): MatrixExtract = js.native
  def flip(): Matrix = js.native
  def flip(a: java.lang.String): Matrix = js.native
  def flip(a: java.lang.String, offset: scala.Double): Matrix = js.native
  def flip(offset: scala.Double): Matrix = js.native
  def inverse(): Matrix = js.native
  def morph(matrix: Matrix): this.type = js.native
  def multiply(matrix: Matrix): Matrix = js.native
  def native(): stdLib.SVGMatrix = js.native
  def rotate(r: scala.Double): Matrix = js.native
  def rotate(r: scala.Double, cx: scala.Double): Matrix = js.native
  def rotate(r: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def scale(x: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def skew(x: scala.Double): Matrix = js.native
  def skew(x: scala.Double, y: scala.Double): Matrix = js.native
  def skew(x: scala.Double, y: scala.Double, cx: scala.Double): Matrix = js.native
  def skew(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def skewX(x: scala.Double): Matrix = js.native
  def skewX(x: scala.Double, cx: scala.Double): Matrix = js.native
  def skewX(x: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def skewY(y: scala.Double): Matrix = js.native
  def skewY(y: scala.Double, cx: scala.Double): Matrix = js.native
  def skewY(y: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def translate(x: scala.Double, y: scala.Double): Matrix = js.native
}

