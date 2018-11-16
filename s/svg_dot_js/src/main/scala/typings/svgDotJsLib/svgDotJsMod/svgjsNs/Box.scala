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

