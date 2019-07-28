package typings.vueDashRouter.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends _PositionResult {
  var x: Double
  var y: Double
}

object Position {
  @scala.inline
  def apply(x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Position]
  }
}

