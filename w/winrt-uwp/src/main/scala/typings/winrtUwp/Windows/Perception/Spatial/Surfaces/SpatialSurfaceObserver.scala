package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialSurfaceObserver extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var getObservedSurfaces: js.Any
   /* unmapped type */ var onobservedsurfaceschanged: js.Any
   /* unmapped type */ var removeEventListener: js.Any
   /* unmapped type */ var setBoundingVolume: js.Any
   /* unmapped type */ var setBoundingVolumes: js.Any
}

object SpatialSurfaceObserver {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    getObservedSurfaces: js.Any,
    onobservedsurfaceschanged: js.Any,
    removeEventListener: js.Any,
    setBoundingVolume: js.Any,
    setBoundingVolumes: js.Any
  ): SpatialSurfaceObserver = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getObservedSurfaces = getObservedSurfaces.asInstanceOf[js.Any], onobservedsurfaceschanged = onobservedsurfaceschanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setBoundingVolume = setBoundingVolume.asInstanceOf[js.Any], setBoundingVolumes = setBoundingVolumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceObserver]
  }
}

