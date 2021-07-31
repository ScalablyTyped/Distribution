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
  
  @scala.inline
  def apply(): DoubleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleProps]
  }
  
  @scala.inline
  implicit class DoublePropsMutableBuilder[Self <: DoubleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinThumbFill(value: String): Self = StObject.set(x, "minThumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinThumbFillUndefined: Self = StObject.set(x, "minThumbFill", js.undefined)
    
    @scala.inline
    def setMinThumbStroke(value: String): Self = StObject.set(x, "minThumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinThumbStrokeUndefined: Self = StObject.set(x, "minThumbStroke", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* argus */ MaxValue => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    @scala.inline
    def setThumbFill(value: String): Self = StObject.set(x, "thumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbFillUndefined: Self = StObject.set(x, "thumbFill", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidth(value: Double): Self = StObject.set(x, "thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStrokeWidthUndefined: Self = StObject.set(x, "thumbStrokeWidth", js.undefined)
  }
}
