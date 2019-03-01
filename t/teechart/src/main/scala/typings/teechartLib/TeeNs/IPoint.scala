package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object IPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IPoint]
  }
}

