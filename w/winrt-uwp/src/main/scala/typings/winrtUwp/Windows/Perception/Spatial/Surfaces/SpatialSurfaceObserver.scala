package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialSurfaceObserver extends js.Object {
  
   /* unmapped type */ var addEventListener: js.Any = js.native
  
   /* unmapped type */ var getObservedSurfaces: js.Any = js.native
  
   /* unmapped type */ var onobservedsurfaceschanged: js.Any = js.native
  
   /* unmapped type */ var removeEventListener: js.Any = js.native
  
   /* unmapped type */ var setBoundingVolume: js.Any = js.native
  
   /* unmapped type */ var setBoundingVolumes: js.Any = js.native
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
  
  @scala.inline
  implicit class SpatialSurfaceObserverOps[Self <: SpatialSurfaceObserver] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: js.Any): Self = this.set("addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObservedSurfaces(value: js.Any): Self = this.set("getObservedSurfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnobservedsurfaceschanged(value: js.Any): Self = this.set("onobservedsurfaceschanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBoundingVolume(value: js.Any): Self = this.set("setBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBoundingVolumes(value: js.Any): Self = this.set("setBoundingVolumes", value.asInstanceOf[js.Any])
  }
}
