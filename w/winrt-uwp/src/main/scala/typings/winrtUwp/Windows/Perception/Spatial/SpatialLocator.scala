package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialLocator extends js.Object {
  
   /* unmapped type */ var addEventListener: js.Any = js.native
  
   /* unmapped type */ var createAttachedFrameOfReferenceAtCurrentHeading: js.Any = js.native
  
   /* unmapped type */ var createStationaryFrameOfReferenceAtCurrentLocation: js.Any = js.native
  
   /* unmapped type */ var locatability: js.Any = js.native
  
   /* unmapped type */ var onlocatabilitychanged: js.Any = js.native
  
   /* unmapped type */ var onpositionaltrackingdeactivating: js.Any = js.native
  
   /* unmapped type */ var removeEventListener: js.Any = js.native
  
   /* unmapped type */ var tryLocateAtTimestamp: js.Any = js.native
}
object SpatialLocator {
  
  @scala.inline
  def apply(
    addEventListener: js.Any,
    createAttachedFrameOfReferenceAtCurrentHeading: js.Any,
    createStationaryFrameOfReferenceAtCurrentLocation: js.Any,
    locatability: js.Any,
    onlocatabilitychanged: js.Any,
    onpositionaltrackingdeactivating: js.Any,
    removeEventListener: js.Any,
    tryLocateAtTimestamp: js.Any
  ): SpatialLocator = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createAttachedFrameOfReferenceAtCurrentHeading = createAttachedFrameOfReferenceAtCurrentHeading.asInstanceOf[js.Any], createStationaryFrameOfReferenceAtCurrentLocation = createStationaryFrameOfReferenceAtCurrentLocation.asInstanceOf[js.Any], locatability = locatability.asInstanceOf[js.Any], onlocatabilitychanged = onlocatabilitychanged.asInstanceOf[js.Any], onpositionaltrackingdeactivating = onpositionaltrackingdeactivating.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], tryLocateAtTimestamp = tryLocateAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocator]
  }
  
  @scala.inline
  implicit class SpatialLocatorOps[Self <: SpatialLocator] (val x: Self) extends AnyVal {
    
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
    def setCreateAttachedFrameOfReferenceAtCurrentHeading(value: js.Any): Self = this.set("createAttachedFrameOfReferenceAtCurrentHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateStationaryFrameOfReferenceAtCurrentLocation(value: js.Any): Self = this.set("createStationaryFrameOfReferenceAtCurrentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocatability(value: js.Any): Self = this.set("locatability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlocatabilitychanged(value: js.Any): Self = this.set("onlocatabilitychanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpositionaltrackingdeactivating(value: js.Any): Self = this.set("onpositionaltrackingdeactivating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryLocateAtTimestamp(value: js.Any): Self = this.set("tryLocateAtTimestamp", value.asInstanceOf[js.Any])
  }
}
