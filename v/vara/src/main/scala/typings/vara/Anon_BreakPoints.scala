package typings.vara

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreakPoints extends js.Object {
  var breakPoints: js.Array[js.Array[String | Double]]
  var width: Double
}

object Anon_BreakPoints {
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): Anon_BreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints, width = width)
  
    __obj.asInstanceOf[Anon_BreakPoints]
  }
}

