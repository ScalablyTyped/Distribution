package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.MaxValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleProps
  extends StObject
     with ProgressProps {
  
  var endColor: js.UndefOr[String] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minThumbFill: js.UndefOr[String] = js.undefined
  
  var minThumbStroke: js.UndefOr[String] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.undefined
  
  var startColor: js.UndefOr[String] = js.undefined
  
  var thumbFill: js.UndefOr[String] = js.undefined
  
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  var thumbStroke: js.UndefOr[String] = js.undefined
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.undefined
}
object DoubleProps {
  
  inline def apply(): DoubleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleProps]
  }
  
  extension [Self <: DoubleProps](x: Self) {
    
    inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinThumbFill(value: String): Self = StObject.set(x, "minThumbFill", value.asInstanceOf[js.Any])
    
    inline def setMinThumbFillUndefined: Self = StObject.set(x, "minThumbFill", js.undefined)
    
    inline def setMinThumbStroke(value: String): Self = StObject.set(x, "minThumbStroke", value.asInstanceOf[js.Any])
    
    inline def setMinThumbStrokeUndefined: Self = StObject.set(x, "minThumbStroke", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnSlidingComplete(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    inline def setThumbFill(value: String): Self = StObject.set(x, "thumbFill", value.asInstanceOf[js.Any])
    
    inline def setThumbFillUndefined: Self = StObject.set(x, "thumbFill", js.undefined)
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    inline def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
    
    inline def setThumbStrokeWidth(value: Double): Self = StObject.set(x, "thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbStrokeWidthUndefined: Self = StObject.set(x, "thumbStrokeWidth", js.undefined)
  }
}
