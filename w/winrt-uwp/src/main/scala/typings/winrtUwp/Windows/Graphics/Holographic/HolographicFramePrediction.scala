package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicFramePrediction extends js.Object {
  var cameraPoses: js.Any = js.native
   /* unmapped type */ var timestamp: js.Any = js.native
}

object HolographicFramePrediction {
  @scala.inline
  def apply(cameraPoses: js.Any, timestamp: js.Any): HolographicFramePrediction = {
    val __obj = js.Dynamic.literal(cameraPoses = cameraPoses.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicFramePrediction]
  }
  @scala.inline
  implicit class HolographicFramePredictionOps[Self <: HolographicFramePrediction] (val x: Self) extends AnyVal {
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
    def setCameraPoses(value: js.Any): Self = this.set("cameraPoses", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: js.Any): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

