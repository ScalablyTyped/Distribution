package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocator extends StObject {
  
  /* unmapped type */
  var addEventListener: Any
  
  /* unmapped type */
  var createAttachedFrameOfReferenceAtCurrentHeading: Any
  
  /* unmapped type */
  var createStationaryFrameOfReferenceAtCurrentLocation: Any
  
  /* unmapped type */
  var locatability: Any
  
  /* unmapped type */
  var onlocatabilitychanged: Any
  
  /* unmapped type */
  var onpositionaltrackingdeactivating: Any
  
  /* unmapped type */
  var removeEventListener: Any
  
  /* unmapped type */
  var tryLocateAtTimestamp: Any
}
object SpatialLocator {
  
  inline def apply(
    addEventListener: Any,
    createAttachedFrameOfReferenceAtCurrentHeading: Any,
    createStationaryFrameOfReferenceAtCurrentLocation: Any,
    locatability: Any,
    onlocatabilitychanged: Any,
    onpositionaltrackingdeactivating: Any,
    removeEventListener: Any,
    tryLocateAtTimestamp: Any
  ): SpatialLocator = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createAttachedFrameOfReferenceAtCurrentHeading = createAttachedFrameOfReferenceAtCurrentHeading.asInstanceOf[js.Any], createStationaryFrameOfReferenceAtCurrentLocation = createStationaryFrameOfReferenceAtCurrentLocation.asInstanceOf[js.Any], locatability = locatability.asInstanceOf[js.Any], onlocatabilitychanged = onlocatabilitychanged.asInstanceOf[js.Any], onpositionaltrackingdeactivating = onpositionaltrackingdeactivating.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], tryLocateAtTimestamp = tryLocateAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocator]
  }
  
  extension [Self <: SpatialLocator](x: Self) {
    
    inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setCreateAttachedFrameOfReferenceAtCurrentHeading(value: Any): Self = StObject.set(x, "createAttachedFrameOfReferenceAtCurrentHeading", value.asInstanceOf[js.Any])
    
    inline def setCreateStationaryFrameOfReferenceAtCurrentLocation(value: Any): Self = StObject.set(x, "createStationaryFrameOfReferenceAtCurrentLocation", value.asInstanceOf[js.Any])
    
    inline def setLocatability(value: Any): Self = StObject.set(x, "locatability", value.asInstanceOf[js.Any])
    
    inline def setOnlocatabilitychanged(value: Any): Self = StObject.set(x, "onlocatabilitychanged", value.asInstanceOf[js.Any])
    
    inline def setOnpositionaltrackingdeactivating(value: Any): Self = StObject.set(x, "onpositionaltrackingdeactivating", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
    
    inline def setTryLocateAtTimestamp(value: Any): Self = StObject.set(x, "tryLocateAtTimestamp", value.asInstanceOf[js.Any])
  }
}
