package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolographicFrame extends js.Object {
  var addedCameras: js.Any
   /* unmapped type */ var currentPrediction: js.Any
   /* unmapped type */ var duration: js.Any
   /* unmapped type */ var getRenderingParameters: js.Any
   /* unmapped type */ var presentUsingCurrentPrediction: js.Any
   /* unmapped type */ var removedCameras: js.Any
   /* unmapped type */ var updateCurrentPrediction: js.Any
   /* unmapped type */ var waitForFrameToFinish: js.Any
}

object HolographicFrame {
  @scala.inline
  def apply(
    addedCameras: js.Any,
    currentPrediction: js.Any,
    duration: js.Any,
    getRenderingParameters: js.Any,
    presentUsingCurrentPrediction: js.Any,
    removedCameras: js.Any,
    updateCurrentPrediction: js.Any,
    waitForFrameToFinish: js.Any
  ): HolographicFrame = {
    val __obj = js.Dynamic.literal(addedCameras = addedCameras.asInstanceOf[js.Any], currentPrediction = currentPrediction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], getRenderingParameters = getRenderingParameters.asInstanceOf[js.Any], presentUsingCurrentPrediction = presentUsingCurrentPrediction.asInstanceOf[js.Any], removedCameras = removedCameras.asInstanceOf[js.Any], updateCurrentPrediction = updateCurrentPrediction.asInstanceOf[js.Any], waitForFrameToFinish = waitForFrameToFinish.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicFrame]
  }
}

