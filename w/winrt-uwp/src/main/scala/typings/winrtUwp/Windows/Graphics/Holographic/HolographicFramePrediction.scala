package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicFramePrediction extends js.Object {
  var cameraPoses: js.Any
   /* unmapped type */ var timestamp: js.Any
}

object HolographicFramePrediction {
  @scala.inline
  def apply(cameraPoses: js.Any, timestamp: js.Any): HolographicFramePrediction = {
    val __obj = js.Dynamic.literal(cameraPoses = cameraPoses.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicFramePrediction]
  }
}

