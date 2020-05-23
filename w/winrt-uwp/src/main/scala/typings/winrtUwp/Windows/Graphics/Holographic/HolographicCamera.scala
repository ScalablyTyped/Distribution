package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicCamera extends js.Object {
  var id: js.Any
   /* unmapped type */ var isStereo: js.Any
   /* unmapped type */ var renderTargetSize: js.Any
   /* unmapped type */ var setFarPlaneDistance: js.Any
   /* unmapped type */ var setNearPlaneDistance: js.Any
   /* unmapped type */ var viewportScaleFactor: js.Any
}

object HolographicCamera {
  @scala.inline
  def apply(
    id: js.Any,
    isStereo: js.Any,
    renderTargetSize: js.Any,
    setFarPlaneDistance: js.Any,
    setNearPlaneDistance: js.Any,
    viewportScaleFactor: js.Any
  ): HolographicCamera = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isStereo = isStereo.asInstanceOf[js.Any], renderTargetSize = renderTargetSize.asInstanceOf[js.Any], setFarPlaneDistance = setFarPlaneDistance.asInstanceOf[js.Any], setNearPlaneDistance = setNearPlaneDistance.asInstanceOf[js.Any], viewportScaleFactor = viewportScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCamera]
  }
}

