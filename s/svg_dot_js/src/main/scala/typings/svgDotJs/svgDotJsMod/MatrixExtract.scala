package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// matrix.js
trait MatrixExtract extends js.Object {
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var f: Double
  var matrix: Matrix
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var transformedX: Double
  var transformedY: Double
  var x: Double
  var y: Double
}

object MatrixExtract {
  @scala.inline
  def apply(
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    matrix: Matrix,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    transformedX: Double,
    transformedY: Double,
    x: Double,
    y: Double
  ): MatrixExtract = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f, matrix = matrix, rotation = rotation, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, transformedX = transformedX, transformedY = transformedY, x = x, y = y)
  
    __obj.asInstanceOf[MatrixExtract]
  }
}

