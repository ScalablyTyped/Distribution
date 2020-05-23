package typings.vara.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakPoints extends js.Object {
  var breakPoints: js.Array[js.Array[String | Double]]
  var width: Double
}

object BreakPoints {
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): BreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakPoints]
  }
}

