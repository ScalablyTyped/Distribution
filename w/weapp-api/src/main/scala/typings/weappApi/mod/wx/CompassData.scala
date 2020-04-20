package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassData extends js.Object {
  /** 面对的方向度数 */
  var direction: Double
}

object CompassData {
  @scala.inline
  def apply(direction: Double): CompassData = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassData]
  }
}

