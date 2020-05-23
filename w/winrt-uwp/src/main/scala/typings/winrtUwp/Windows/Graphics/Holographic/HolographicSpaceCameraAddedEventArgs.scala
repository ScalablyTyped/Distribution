package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicSpaceCameraAddedEventArgs extends js.Object {
  var camera: js.Any
   /* unmapped type */ var getDeferral: js.Any
}

object HolographicSpaceCameraAddedEventArgs {
  @scala.inline
  def apply(camera: js.Any, getDeferral: js.Any): HolographicSpaceCameraAddedEventArgs = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], getDeferral = getDeferral.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpaceCameraAddedEventArgs]
  }
}

