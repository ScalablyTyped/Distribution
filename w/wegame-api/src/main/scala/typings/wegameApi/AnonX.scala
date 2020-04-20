package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  /**
    * x 轴的角速度
    */
  var x: Double
  /**
    * y 轴的角速度
    */
  var y: Double
  /**
    * z 轴的角速度
    */
  var z: Double
}

object AnonX {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

