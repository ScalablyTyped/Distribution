package typings.tensorflowModelsFaceDetection.configInterfacesMod

import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.copy
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LandmarksRefinementConfig extends StObject {
  
  var indexesMapping: js.Array[Double]
  
  var zRefinement: none | copy | AssignAverage
}
object LandmarksRefinementConfig {
  
  inline def apply(indexesMapping: js.Array[Double], zRefinement: none | copy | AssignAverage): LandmarksRefinementConfig = {
    val __obj = js.Dynamic.literal(indexesMapping = indexesMapping.asInstanceOf[js.Any], zRefinement = zRefinement.asInstanceOf[js.Any])
    __obj.asInstanceOf[LandmarksRefinementConfig]
  }
  
  extension [Self <: LandmarksRefinementConfig](x: Self) {
    
    inline def setIndexesMapping(value: js.Array[Double]): Self = StObject.set(x, "indexesMapping", value.asInstanceOf[js.Any])
    
    inline def setIndexesMappingVarargs(value: Double*): Self = StObject.set(x, "indexesMapping", js.Array(value*))
    
    inline def setZRefinement(value: none | copy | AssignAverage): Self = StObject.set(x, "zRefinement", value.asInstanceOf[js.Any])
    
    inline def setZRefinementVarargs(value: Double*): Self = StObject.set(x, "zRefinement", js.Array(value*))
  }
}
