package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAboveNormal extends js.Object {
  var aboveNormal: Double
  var belowNormal: Double
  var high: Double
  var low: Double
  var normal: Double
}

object AnonAboveNormal {
  @scala.inline
  def apply(aboveNormal: Double, belowNormal: Double, high: Double, low: Double, normal: Double): AnonAboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAboveNormal]
  }
}

