package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialLocator extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var createAttachedFrameOfReferenceAtCurrentHeading: js.Any
   /* unmapped type */ var createStationaryFrameOfReferenceAtCurrentLocation: js.Any
   /* unmapped type */ var locatability: js.Any
   /* unmapped type */ var onlocatabilitychanged: js.Any
   /* unmapped type */ var onpositionaltrackingdeactivating: js.Any
   /* unmapped type */ var removeEventListener: js.Any
   /* unmapped type */ var tryLocateAtTimestamp: js.Any
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
}

