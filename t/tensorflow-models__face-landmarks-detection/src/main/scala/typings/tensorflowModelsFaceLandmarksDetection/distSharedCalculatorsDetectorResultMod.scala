package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsDetectorResultMod {
  
  trait detectorResult extends StObject {
    
    var boxes: Tensor2D
    
    var logits: Tensor1D
  }
  object detectorResult {
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/detector_result", "detectorResult")
    @js.native
    def apply(detectionResult: Tensor3D): detectorResult = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: detectorResult] (val x: Self) extends AnyVal {
      
      inline def setBoxes(value: Tensor2D): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
      
      inline def setLogits(value: Tensor1D): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    }
  }
}
