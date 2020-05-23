package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialPointerPose extends js.Object {
   /* unmapped type */ var head: js.Any
   /* unmapped type */ var timestamp: js.Any
}

object SpatialPointerPose {
  @scala.inline
  def apply(head: js.Any, timestamp: js.Any): SpatialPointerPose = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialPointerPose]
  }
}

