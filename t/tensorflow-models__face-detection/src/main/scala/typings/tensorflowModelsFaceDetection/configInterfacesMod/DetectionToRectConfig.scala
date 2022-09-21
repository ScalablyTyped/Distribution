package typings.tensorflowModelsFaceDetection.configInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectionToRectConfig extends StObject {
  
  var rotationVectorEndKeypointIndex: Double
  
  var rotationVectorStartKeypointIndex: Double
  
  var rotationVectorTargetAngle: js.UndefOr[Double] = js.undefined
  
  var rotationVectorTargetAngleDegree: js.UndefOr[Double] = js.undefined
}
object DetectionToRectConfig {
  
  inline def apply(rotationVectorEndKeypointIndex: Double, rotationVectorStartKeypointIndex: Double): DetectionToRectConfig = {
    val __obj = js.Dynamic.literal(rotationVectorEndKeypointIndex = rotationVectorEndKeypointIndex.asInstanceOf[js.Any], rotationVectorStartKeypointIndex = rotationVectorStartKeypointIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectionToRectConfig]
  }
  
  extension [Self <: DetectionToRectConfig](x: Self) {
    
    inline def setRotationVectorEndKeypointIndex(value: Double): Self = StObject.set(x, "rotationVectorEndKeypointIndex", value.asInstanceOf[js.Any])
    
    inline def setRotationVectorStartKeypointIndex(value: Double): Self = StObject.set(x, "rotationVectorStartKeypointIndex", value.asInstanceOf[js.Any])
    
    inline def setRotationVectorTargetAngle(value: Double): Self = StObject.set(x, "rotationVectorTargetAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationVectorTargetAngleDegree(value: Double): Self = StObject.set(x, "rotationVectorTargetAngleDegree", value.asInstanceOf[js.Any])
    
    inline def setRotationVectorTargetAngleDegreeUndefined: Self = StObject.set(x, "rotationVectorTargetAngleDegree", js.undefined)
    
    inline def setRotationVectorTargetAngleUndefined: Self = StObject.set(x, "rotationVectorTargetAngle", js.undefined)
  }
}
