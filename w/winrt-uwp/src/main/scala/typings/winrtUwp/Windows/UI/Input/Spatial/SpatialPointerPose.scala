package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialPointerPose extends js.Object {
   /* unmapped type */ var head: js.Any = js.native
   /* unmapped type */ var timestamp: js.Any = js.native
}

object SpatialPointerPose {
  @scala.inline
  def apply(head: js.Any, timestamp: js.Any): SpatialPointerPose = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialPointerPose]
  }
  @scala.inline
  implicit class SpatialPointerPoseOps[Self <: SpatialPointerPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHead(value: js.Any): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

