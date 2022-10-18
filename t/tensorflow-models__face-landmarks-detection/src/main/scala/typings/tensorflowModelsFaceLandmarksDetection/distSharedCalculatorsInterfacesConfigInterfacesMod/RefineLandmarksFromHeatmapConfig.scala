package typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefineLandmarksFromHeatmapConfig extends StObject {
  
  var kernelSize: js.UndefOr[Double] = js.undefined
  
  var minConfidenceToRefine: Double
}
object RefineLandmarksFromHeatmapConfig {
  
  inline def apply(minConfidenceToRefine: Double): RefineLandmarksFromHeatmapConfig = {
    val __obj = js.Dynamic.literal(minConfidenceToRefine = minConfidenceToRefine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefineLandmarksFromHeatmapConfig]
  }
  
  extension [Self <: RefineLandmarksFromHeatmapConfig](x: Self) {
    
    inline def setKernelSize(value: Double): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
    
    inline def setKernelSizeUndefined: Self = StObject.set(x, "kernelSize", js.undefined)
    
    inline def setMinConfidenceToRefine(value: Double): Self = StObject.set(x, "minConfidenceToRefine", value.asInstanceOf[js.Any])
  }
}
