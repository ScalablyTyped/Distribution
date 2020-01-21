package typings.victor.mod

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
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VictorCoordinates]
  }
}

