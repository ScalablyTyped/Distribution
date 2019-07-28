package typings.winjs.WinJSNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object IPosition {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): IPosition = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[IPosition]
  }
}

