package typings.tesseractDotJs.tesseractDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bbox extends js.Object {
  var x0: Double
  var x1: Double
  var y0: Double
  var y1: Double
}

object Bbox {
  @scala.inline
  def apply(x0: Double, x1: Double, y0: Double, y1: Double): Bbox = {
    val __obj = js.Dynamic.literal(x0 = x0, x1 = x1, y0 = y0, y1 = y1)
  
    __obj.asInstanceOf[Bbox]
  }
}

