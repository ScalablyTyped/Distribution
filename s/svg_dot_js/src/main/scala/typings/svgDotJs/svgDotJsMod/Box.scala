package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// boxes.js
trait Box extends js.Object {
  var cx: Double
  var cy: Double
  var h: Double
  var height: Double
  var w: Double
  var width: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
  def merge(box: Box): Box
  def transform(m: Matrix): Box
}

object Box {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    h: Double,
    height: Double,
    merge: Box => Box,
    transform: Matrix => Box,
    w: Double,
    width: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): Box = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, h = h, height = height, merge = js.Any.fromFunction1(merge), transform = js.Any.fromFunction1(transform), w = w, width = width, x = x, x2 = x2, y = y, y2 = y2)
  
    __obj.asInstanceOf[Box]
  }
}

