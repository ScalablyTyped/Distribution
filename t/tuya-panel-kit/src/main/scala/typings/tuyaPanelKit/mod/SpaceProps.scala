package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceProps
  extends StObject
     with ProgressProps {
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var scaleNumber: js.UndefOr[Double] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object SpaceProps {
  
  inline def apply(): SpaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps]
  }
  
  extension [Self <: SpaceProps](x: Self) {
    
    inline def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setScaleNumber(value: Double): Self = StObject.set(x, "scaleNumber", value.asInstanceOf[js.Any])
    
    inline def setScaleNumberUndefined: Self = StObject.set(x, "scaleNumber", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
