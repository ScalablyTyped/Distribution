package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicCameraPose extends js.Object {
  var farPlaneDistance: js.Any
   /* unmapped type */ var holographicCamera: js.Any
   /* unmapped type */ var nearPlaneDistance: js.Any
   /* unmapped type */ var projectionTransform: js.Any
   /* unmapped type */ var tryGetCullingFrustum: js.Any
   /* unmapped type */ var tryGetViewTransform: js.Any
   /* unmapped type */ var tryGetVisibleFrustum: js.Any
   /* unmapped type */ var viewport: js.Any
}

object HolographicCameraPose {
  @scala.inline
  def apply(
    farPlaneDistance: js.Any,
    holographicCamera: js.Any,
    nearPlaneDistance: js.Any,
    projectionTransform: js.Any,
    tryGetCullingFrustum: js.Any,
    tryGetViewTransform: js.Any,
    tryGetVisibleFrustum: js.Any,
    viewport: js.Any
  ): HolographicCameraPose = {
    val __obj = js.Dynamic.literal(farPlaneDistance = farPlaneDistance.asInstanceOf[js.Any], holographicCamera = holographicCamera.asInstanceOf[js.Any], nearPlaneDistance = nearPlaneDistance.asInstanceOf[js.Any], projectionTransform = projectionTransform.asInstanceOf[js.Any], tryGetCullingFrustum = tryGetCullingFrustum.asInstanceOf[js.Any], tryGetViewTransform = tryGetViewTransform.asInstanceOf[js.Any], tryGetVisibleFrustum = tryGetVisibleFrustum.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicCameraPose]
  }
}

