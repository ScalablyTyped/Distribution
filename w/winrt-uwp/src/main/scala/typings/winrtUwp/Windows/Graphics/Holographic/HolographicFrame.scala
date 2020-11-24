package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolographicFrame extends js.Object {
  
  var addedCameras: js.Any = js.native
  
   /* unmapped type */ var currentPrediction: js.Any = js.native
  
   /* unmapped type */ var duration: js.Any = js.native
  
   /* unmapped type */ var getRenderingParameters: js.Any = js.native
  
   /* unmapped type */ var presentUsingCurrentPrediction: js.Any = js.native
  
   /* unmapped type */ var removedCameras: js.Any = js.native
  
   /* unmapped type */ var updateCurrentPrediction: js.Any = js.native
  
   /* unmapped type */ var waitForFrameToFinish: js.Any = js.native
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
  
  @scala.inline
  implicit class HolographicFrameOps[Self <: HolographicFrame] (val x: Self) extends AnyVal {
    
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
    def setAddedCameras(value: js.Any): Self = this.set("addedCameras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPrediction(value: js.Any): Self = this.set("currentPrediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRenderingParameters(value: js.Any): Self = this.set("getRenderingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentUsingCurrentPrediction(value: js.Any): Self = this.set("presentUsingCurrentPrediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedCameras(value: js.Any): Self = this.set("removedCameras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCurrentPrediction(value: js.Any): Self = this.set("updateCurrentPrediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForFrameToFinish(value: js.Any): Self = this.set("waitForFrameToFinish", value.asInstanceOf[js.Any])
  }
}
