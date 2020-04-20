package typings.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoCuePoint extends js.Object {
  var data: VimeoCuePointData
  var id: String
  var time: Double
}

object VimeoCuePoint {
  @scala.inline
  def apply(data: VimeoCuePointData, id: String, time: Double): VimeoCuePoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoCuePoint]
  }
}

