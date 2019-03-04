package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Baseline extends js.Object {
  var has_baseline: scala.Boolean
  var x0: scala.Double
  var x1: scala.Double
  var y0: scala.Double
  var y1: scala.Double
}

object Baseline {
  @scala.inline
  def apply(
    has_baseline: scala.Boolean,
    x0: scala.Double,
    x1: scala.Double,
    y0: scala.Double,
    y1: scala.Double
  ): Baseline = {
    val __obj = js.Dynamic.literal(has_baseline = has_baseline, x0 = x0, x1 = x1, y0 = y0, y1 = y1)
  
    __obj.asInstanceOf[Baseline]
  }
}

