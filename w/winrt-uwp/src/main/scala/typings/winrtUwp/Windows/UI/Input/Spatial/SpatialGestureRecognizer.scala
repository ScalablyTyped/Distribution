package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialGestureRecognizer extends js.Object {
  var addEventListener: js.Any = js.native
   /* unmapped type */ var cancelPendingGestures: js.Any = js.native
   /* unmapped type */ var captureInteraction: js.Any = js.native
   /* unmapped type */ var gestureSettings: js.Any = js.native
   /* unmapped type */ var onholdcanceled: js.Any = js.native
   /* unmapped type */ var onholdcompleted: js.Any = js.native
   /* unmapped type */ var onholdstarted: js.Any = js.native
   /* unmapped type */ var onmanipulationcanceled: js.Any = js.native
   /* unmapped type */ var onmanipulationcompleted: js.Any = js.native
   /* unmapped type */ var onmanipulationstarted: js.Any = js.native
   /* unmapped type */ var onmanipulationupdated: js.Any = js.native
   /* unmapped type */ var onnavigationcanceled: js.Any = js.native
   /* unmapped type */ var onnavigationcompleted: js.Any = js.native
   /* unmapped type */ var onnavigationstarted: js.Any = js.native
   /* unmapped type */ var onnavigationupdated: js.Any = js.native
   /* unmapped type */ var onrecognitionended: js.Any = js.native
   /* unmapped type */ var onrecognitionstarted: js.Any = js.native
   /* unmapped type */ var ontapped: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
   /* unmapped type */ var trySetGestureSettings: js.Any = js.native
}

object SpatialGestureRecognizer {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    cancelPendingGestures: js.Any,
    captureInteraction: js.Any,
    gestureSettings: js.Any,
    onholdcanceled: js.Any,
    onholdcompleted: js.Any,
    onholdstarted: js.Any,
    onmanipulationcanceled: js.Any,
    onmanipulationcompleted: js.Any,
    onmanipulationstarted: js.Any,
    onmanipulationupdated: js.Any,
    onnavigationcanceled: js.Any,
    onnavigationcompleted: js.Any,
    onnavigationstarted: js.Any,
    onnavigationupdated: js.Any,
    onrecognitionended: js.Any,
    onrecognitionstarted: js.Any,
    ontapped: js.Any,
    removeEventListener: js.Any,
    trySetGestureSettings: js.Any
  ): SpatialGestureRecognizer = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], cancelPendingGestures = cancelPendingGestures.asInstanceOf[js.Any], captureInteraction = captureInteraction.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], onholdcanceled = onholdcanceled.asInstanceOf[js.Any], onholdcompleted = onholdcompleted.asInstanceOf[js.Any], onholdstarted = onholdstarted.asInstanceOf[js.Any], onmanipulationcanceled = onmanipulationcanceled.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onnavigationcanceled = onnavigationcanceled.asInstanceOf[js.Any], onnavigationcompleted = onnavigationcompleted.asInstanceOf[js.Any], onnavigationstarted = onnavigationstarted.asInstanceOf[js.Any], onnavigationupdated = onnavigationupdated.asInstanceOf[js.Any], onrecognitionended = onrecognitionended.asInstanceOf[js.Any], onrecognitionstarted = onrecognitionstarted.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], trySetGestureSettings = trySetGestureSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialGestureRecognizer]
  }
  @scala.inline
  implicit class SpatialGestureRecognizerOps[Self <: SpatialGestureRecognizer] (val x: Self) extends AnyVal {
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
    def setCancelPendingGestures(value: js.Any): Self = this.set("cancelPendingGestures", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptureInteraction(value: js.Any): Self = this.set("captureInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureSettings(value: js.Any): Self = this.set("gestureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnholdcanceled(value: js.Any): Self = this.set("onholdcanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnholdcompleted(value: js.Any): Self = this.set("onholdcompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnholdstarted(value: js.Any): Self = this.set("onholdstarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationcanceled(value: js.Any): Self = this.set("onmanipulationcanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationcompleted(value: js.Any): Self = this.set("onmanipulationcompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationstarted(value: js.Any): Self = this.set("onmanipulationstarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnmanipulationupdated(value: js.Any): Self = this.set("onmanipulationupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnavigationcanceled(value: js.Any): Self = this.set("onnavigationcanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnavigationcompleted(value: js.Any): Self = this.set("onnavigationcompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnavigationstarted(value: js.Any): Self = this.set("onnavigationstarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnavigationupdated(value: js.Any): Self = this.set("onnavigationupdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnrecognitionended(value: js.Any): Self = this.set("onrecognitionended", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnrecognitionstarted(value: js.Any): Self = this.set("onrecognitionstarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOntapped(value: js.Any): Self = this.set("ontapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrySetGestureSettings(value: js.Any): Self = this.set("trySetGestureSettings", value.asInstanceOf[js.Any])
  }
  
}

