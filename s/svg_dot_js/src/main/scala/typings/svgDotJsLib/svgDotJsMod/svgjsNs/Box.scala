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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cx")(cx)
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("transform")(transform)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Box]
  }
}

