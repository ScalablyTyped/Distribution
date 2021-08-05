package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocator extends StObject {
  
  /* unmapped type */
  var addEventListener: js.Any
  
  /* unmapped type */
  var createAttachedFrameOfReferenceAtCurrentHeading: js.Any
  
  /* unmapped type */
  var createStationaryFrameOfReferenceAtCurrentLocation: js.Any
  
  /* unmapped type */
  var locatability: js.Any
  
  /* unmapped type */
  var onlocatabilitychanged: js.Any
  
  /* unmapped type */
  var onpositionaltrackingdeactivating: js.Any
  
  /* unmapped type */
  var removeEventListener: js.Any
  
  /* unmapped type */
  var tryLocateAtTimestamp: js.Any
}
object SpatialLocator {
  
  inline def apply(
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
  
  extension [Self <: SpatialLocator](x: Self) {
    
    inline def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setCreateAttachedFrameOfReferenceAtCurrentHeading(value: js.Any): Self = StObject.set(x, "createAttachedFrameOfReferenceAtCurrentHeading", value.asInstanceOf[js.Any])
    
    inline def setCreateStationaryFrameOfReferenceAtCurrentLocation(value: js.Any): Self = StObject.set(x, "createStationaryFrameOfReferenceAtCurrentLocation", value.asInstanceOf[js.Any])
    
    inline def setLocatability(value: js.Any): Self = StObject.set(x, "locatability", value.asInstanceOf[js.Any])
    
    inline def setOnlocatabilitychanged(value: js.Any): Self = StObject.set(x, "onlocatabilitychanged", value.asInstanceOf[js.Any])
    
    inline def setOnpositionaltrackingdeactivating(value: js.Any): Self = StObject.set(x, "onpositionaltrackingdeactivating", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
    
    inline def setTryLocateAtTimestamp(value: js.Any): Self = StObject.set(x, "tryLocateAtTimestamp", value.asInstanceOf[js.Any])
  }
}
