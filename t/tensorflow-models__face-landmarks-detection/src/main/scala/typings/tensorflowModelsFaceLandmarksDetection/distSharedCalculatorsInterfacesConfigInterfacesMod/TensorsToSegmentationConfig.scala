package typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.none
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.sigmoid
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.softmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorsToSegmentationConfig extends StObject {
  
  var activation: none | sigmoid | softmax
}
object TensorsToSegmentationConfig {
  
  inline def apply(activation: none | sigmoid | softmax): TensorsToSegmentationConfig = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorsToSegmentationConfig]
  }
  
  extension [Self <: TensorsToSegmentationConfig](x: Self) {
    
    inline def setActivation(value: none | sigmoid | softmax): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
  }
}
