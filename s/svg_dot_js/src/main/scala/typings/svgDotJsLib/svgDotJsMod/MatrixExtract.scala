package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// matrix.js
trait MatrixExtract extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var c: scala.Double
  var d: scala.Double
  var e: scala.Double
  var f: scala.Double
  var matrix: Matrix
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var skewX: scala.Double
  var skewY: scala.Double
  var transformedX: scala.Double
  var transformedY: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object MatrixExtract {
  @scala.inline
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double,
    matrix: Matrix,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    transformedX: scala.Double,
    transformedY: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): MatrixExtract = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f, matrix = matrix, rotation = rotation, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, transformedX = transformedX, transformedY = transformedY, x = x, y = y)
  
    __obj.asInstanceOf[MatrixExtract]
  }
}

