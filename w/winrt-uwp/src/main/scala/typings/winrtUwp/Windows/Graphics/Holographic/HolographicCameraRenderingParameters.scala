package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicCameraRenderingParameters extends js.Object {
  var direct3D11BackBuffer: js.Any
   /* unmapped type */ var direct3D11Device: js.Any
   /* unmapped type */ var setFocusPoint: js.Any
}

object HolographicCameraRenderingParameters {
  @scala.inline
  def apply(direct3D11BackBuffer: js.Any, direct3D11Device: js.Any, setFocusPoint: js.Any): HolographicCameraRenderingParameters = {
    val __obj = js.Dynamic.literal(direct3D11BackBuffer = direct3D11BackBuffer.asInstanceOf[js.Any], direct3D11Device = direct3D11Device.asInstanceOf[js.Any], setFocusPoint = setFocusPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCameraRenderingParameters]
  }
}

