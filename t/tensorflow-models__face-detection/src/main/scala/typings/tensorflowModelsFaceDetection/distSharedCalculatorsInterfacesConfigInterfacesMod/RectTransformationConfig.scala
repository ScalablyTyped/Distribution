package typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectTransformationConfig extends StObject {
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationDegree: js.UndefOr[Double] = js.undefined
  
  var scaleX: js.UndefOr[Double] = js.undefined
  
  var scaleY: js.UndefOr[Double] = js.undefined
  
  var shiftX: js.UndefOr[Double] = js.undefined
  
  var shiftY: js.UndefOr[Double] = js.undefined
  
  var squareLong: js.UndefOr[Boolean] = js.undefined
  
  var squareShort: js.UndefOr[Boolean] = js.undefined
}
object RectTransformationConfig {
  
  inline def apply(): RectTransformationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectTransformationConfig]
  }
  
  extension [Self <: RectTransformationConfig](x: Self) {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationDegree(value: Double): Self = StObject.set(x, "rotationDegree", value.asInstanceOf[js.Any])
    
    inline def setRotationDegreeUndefined: Self = StObject.set(x, "rotationDegree", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setShiftX(value: Double): Self = StObject.set(x, "shiftX", value.asInstanceOf[js.Any])
    
    inline def setShiftXUndefined: Self = StObject.set(x, "shiftX", js.undefined)
    
    inline def setShiftY(value: Double): Self = StObject.set(x, "shiftY", value.asInstanceOf[js.Any])
    
    inline def setShiftYUndefined: Self = StObject.set(x, "shiftY", js.undefined)
    
    inline def setSquareLong(value: Boolean): Self = StObject.set(x, "squareLong", value.asInstanceOf[js.Any])
    
    inline def setSquareLongUndefined: Self = StObject.set(x, "squareLong", js.undefined)
    
    inline def setSquareShort(value: Boolean): Self = StObject.set(x, "squareShort", value.asInstanceOf[js.Any])
    
    inline def setSquareShortUndefined: Self = StObject.set(x, "squareShort", js.undefined)
  }
}
