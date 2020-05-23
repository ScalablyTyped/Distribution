package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionManager extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var getDetectedSourcesAtTimestamp: js.Any
   /* unmapped type */ var oninteractiondetected: js.Any
   /* unmapped type */ var onsourcedetected: js.Any
   /* unmapped type */ var onsourcelost: js.Any
   /* unmapped type */ var onsourcepressed: js.Any
   /* unmapped type */ var onsourcereleased: js.Any
   /* unmapped type */ var onsourceupdated: js.Any
   /* unmapped type */ var removeEventListener: js.Any
}

object SpatialInteractionManager {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    getDetectedSourcesAtTimestamp: js.Any,
    oninteractiondetected: js.Any,
    onsourcedetected: js.Any,
    onsourcelost: js.Any,
    onsourcepressed: js.Any,
    onsourcereleased: js.Any,
    onsourceupdated: js.Any,
    removeEventListener: js.Any
  ): SpatialInteractionManager = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getDetectedSourcesAtTimestamp = getDetectedSourcesAtTimestamp.asInstanceOf[js.Any], oninteractiondetected = oninteractiondetected.asInstanceOf[js.Any], onsourcedetected = onsourcedetected.asInstanceOf[js.Any], onsourcelost = onsourcelost.asInstanceOf[js.Any], onsourcepressed = onsourcepressed.asInstanceOf[js.Any], onsourcereleased = onsourcereleased.asInstanceOf[js.Any], onsourceupdated = onsourceupdated.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionManager]
  }
}

