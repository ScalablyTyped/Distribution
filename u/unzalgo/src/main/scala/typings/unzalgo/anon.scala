package typings.unzalgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DetectionThreshold extends StObject {
    
    var detectionThreshold: js.UndefOr[Double] = js.undefined
    
    var targetDensity: js.UndefOr[Double] = js.undefined
  }
  object DetectionThreshold {
    
    inline def apply(): DetectionThreshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetectionThreshold]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectionThreshold] (val x: Self) extends AnyVal {
      
      inline def setDetectionThreshold(value: Double): Self = StObject.set(x, "detectionThreshold", value.asInstanceOf[js.Any])
      
      inline def setDetectionThresholdUndefined: Self = StObject.set(x, "detectionThreshold", js.undefined)
      
      inline def setTargetDensity(value: Double): Self = StObject.set(x, "targetDensity", value.asInstanceOf[js.Any])
      
      inline def setTargetDensityUndefined: Self = StObject.set(x, "targetDensity", js.undefined)
    }
  }
}
