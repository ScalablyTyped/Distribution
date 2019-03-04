package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// boxes.js
trait Box extends js.Object {
  var cx: scala.Double
  var cy: scala.Double
  var h: scala.Double
  var height: scala.Double
  var w: scala.Double
  var width: scala.Double
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
  def merge(box: Box): Box
  def transform(m: Matrix): Box
}

object Box {
  @scala.inline
  def apply(
    cx: scala.Double,
    cy: scala.Double,
    h: scala.Double,
    height: scala.Double,
    merge: js.Function1[Box, Box],
    transform: js.Function1[Matrix, Box],
    w: scala.Double,
    width: scala.Double,
    x: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y2: scala.Double
  ): Box = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, h = h, height = height, merge = merge, transform = transform, w = w, width = width, x = x, x2 = x2, y = y, y2 = y2)
  
    __obj.asInstanceOf[Box]
  }
}

