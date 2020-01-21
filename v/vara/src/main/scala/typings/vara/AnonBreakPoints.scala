package typings.vara

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreakPoints extends js.Object {
  var breakPoints: js.Array[js.Array[String | Double]]
  var width: Double
}

object AnonBreakPoints {
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): AnonBreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBreakPoints]
  }
}

