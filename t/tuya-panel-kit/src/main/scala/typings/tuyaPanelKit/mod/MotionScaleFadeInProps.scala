package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionScaleFadeInProps
  extends StObject
     with MotionProps {
  
  var finalScale: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var initScale: js.UndefOr[Double] = js.undefined
  
  var isAlign: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MotionScaleFadeInProps {
  
  inline def apply(): MotionScaleFadeInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScaleFadeInProps]
  }
  
  extension [Self <: MotionScaleFadeInProps](x: Self) {
    
    inline def setFinalScale(value: Double): Self = StObject.set(x, "finalScale", value.asInstanceOf[js.Any])
    
    inline def setFinalScaleUndefined: Self = StObject.set(x, "finalScale", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    inline def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
