package typings.victor.victorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictorCoordinates extends js.Object {
  var x: Double
  var y: Double
}

object VictorCoordinates {
  @scala.inline
  def apply(x: Double, y: Double): VictorCoordinates = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[VictorCoordinates]
  }
}

