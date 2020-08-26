package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionManager extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var getDetectedSourcesAtTimestamp: js.Any = js.native
   /* unmapped type */ var oninteractiondetected: js.Any = js.native
   /* unmapped type */ var onsourcedetected: js.Any = js.native
   /* unmapped type */ var onsourcelost: js.Any = js.native
   /* unmapped type */ var onsourcepressed: js.Any = js.native
   /* unmapped type */ var onsourcereleased: js.Any = js.native
   /* unmapped type */ var onsourceupdated: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
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
  @scala.inline
  implicit class SpatialInteractionManagerOps[Self <: SpatialInteractionManager] (val x: Self) extends AnyVal {
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
    def setGetDetectedSourcesAtTimestamp(value: js.Any): Self = this.set("getDetectedSourcesAtTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOninteractiondetected(value: js.Any): Self = this.set("oninteractiondetected", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourcedetected(value: js.Any): Self = this.set("onsourcedetected", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourcelost(value: js.Any): Self = this.set("onsourcelost", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourcepressed(value: js.Any): Self = this.set("onsourcepressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourcereleased(value: js.Any): Self = this.set("onsourcereleased", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsourceupdated(value: js.Any): Self = this.set("onsourceupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
  }
  
}

