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
  
  @scala.inline
  def apply(): SpaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps]
  }
  
  @scala.inline
  implicit class SpacePropsMutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setScaleNumber(value: Double): Self = StObject.set(x, "scaleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleNumberUndefined: Self = StObject.set(x, "scaleNumber", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
