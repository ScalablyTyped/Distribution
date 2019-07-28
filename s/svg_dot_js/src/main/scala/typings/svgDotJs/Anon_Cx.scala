package typings.svgDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cx extends js.Object {
  var cx: Double
  var cy: Double
  var fill: String
  var `fill-opacity`: Double
  var `font-family`: String
  var `font-size`: Double
  var height: Double
  var offset: Double
  var opacity: Double
  var r: Double
  var rx: Double
  var ry: Double
  var `stop-color`: String
  var `stop-opacity`: Double
  var stroke: String
  var `stroke-linecap`: String
  var `stroke-linejoin`: String
  var `stroke-opacity`: Double
  var `stroke-width`: Double
  var `text-anchor`: String
  var width: Double
  var x: Double
  var y: Double
}

object Anon_Cx {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    fill: String,
    `fill-opacity`: Double,
    `font-family`: String,
    `font-size`: Double,
    height: Double,
    offset: Double,
    opacity: Double,
    r: Double,
    rx: Double,
    ry: Double,
    `stop-color`: String,
    `stop-opacity`: Double,
    stroke: String,
    `stroke-linecap`: String,
    `stroke-linejoin`: String,
    `stroke-opacity`: Double,
    `stroke-width`: Double,
    `text-anchor`: String,
    width: Double,
    x: Double,
    y: Double
  ): Anon_Cx = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, fill = fill, height = height, offset = offset, opacity = opacity, r = r, rx = rx, ry = ry, stroke = stroke, width = width, x = x, y = y)
    __obj.updateDynamic("fill-opacity")(`fill-opacity`)
    __obj.updateDynamic("font-family")(`font-family`)
    __obj.updateDynamic("font-size")(`font-size`)
    __obj.updateDynamic("stop-color")(`stop-color`)
    __obj.updateDynamic("stop-opacity")(`stop-opacity`)
    __obj.updateDynamic("stroke-linecap")(`stroke-linecap`)
    __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`)
    __obj.updateDynamic("stroke-opacity")(`stroke-opacity`)
    __obj.updateDynamic("stroke-width")(`stroke-width`)
    __obj.updateDynamic("text-anchor")(`text-anchor`)
    __obj.asInstanceOf[Anon_Cx]
  }
}

