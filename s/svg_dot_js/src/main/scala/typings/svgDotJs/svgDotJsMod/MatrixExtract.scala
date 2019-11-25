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
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], transformedX = transformedX.asInstanceOf[js.Any], transformedY = transformedY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatrixExtract]
  }
}

