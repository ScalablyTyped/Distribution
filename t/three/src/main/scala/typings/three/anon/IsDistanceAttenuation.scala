package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDistanceAttenuation extends StObject {
  
  var MAX_STEP: Double
  
  var isDistanceAttenuation: Boolean
  
  var isFresnel: Boolean
  
  var isInfiniteThick: Boolean
  
  var isPerspectiveCamera: Boolean
  
  var isSelective: Boolean
}
object IsDistanceAttenuation {
  
  inline def apply(
    MAX_STEP: Double,
    isDistanceAttenuation: Boolean,
    isFresnel: Boolean,
    isInfiniteThick: Boolean,
    isPerspectiveCamera: Boolean,
    isSelective: Boolean
  ): IsDistanceAttenuation = {
    val __obj = js.Dynamic.literal(MAX_STEP = MAX_STEP.asInstanceOf[js.Any], isDistanceAttenuation = isDistanceAttenuation.asInstanceOf[js.Any], isFresnel = isFresnel.asInstanceOf[js.Any], isInfiniteThick = isInfiniteThick.asInstanceOf[js.Any], isPerspectiveCamera = isPerspectiveCamera.asInstanceOf[js.Any], isSelective = isSelective.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDistanceAttenuation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDistanceAttenuation] (val x: Self) extends AnyVal {
    
    inline def setIsDistanceAttenuation(value: Boolean): Self = StObject.set(x, "isDistanceAttenuation", value.asInstanceOf[js.Any])
    
    inline def setIsFresnel(value: Boolean): Self = StObject.set(x, "isFresnel", value.asInstanceOf[js.Any])
    
    inline def setIsInfiniteThick(value: Boolean): Self = StObject.set(x, "isInfiniteThick", value.asInstanceOf[js.Any])
    
    inline def setIsPerspectiveCamera(value: Boolean): Self = StObject.set(x, "isPerspectiveCamera", value.asInstanceOf[js.Any])
    
    inline def setIsSelective(value: Boolean): Self = StObject.set(x, "isSelective", value.asInstanceOf[js.Any])
    
    inline def setMAX_STEP(value: Double): Self = StObject.set(x, "MAX_STEP", value.asInstanceOf[js.Any])
  }
}
