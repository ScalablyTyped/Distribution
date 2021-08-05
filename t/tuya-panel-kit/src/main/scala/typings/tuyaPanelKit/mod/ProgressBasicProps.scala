package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBasicProps
  extends StObject
     with ProgressProps {
  
  var endColor: js.UndefOr[String] = js.undefined
  
  var needMaxCircle: js.UndefOr[Boolean] = js.undefined
  
  var needMinCircle: js.UndefOr[Boolean] = js.undefined
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var startColor: js.UndefOr[String] = js.undefined
  
  var thumbFill: js.UndefOr[String] = js.undefined
  
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  var thumbStroke: js.UndefOr[String] = js.undefined
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object ProgressBasicProps {
  
  inline def apply(): ProgressBasicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBasicProps]
  }
  
  extension [Self <: ProgressBasicProps](x: Self) {
    
    inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setNeedMaxCircle(value: Boolean): Self = StObject.set(x, "needMaxCircle", value.asInstanceOf[js.Any])
    
    inline def setNeedMaxCircleUndefined: Self = StObject.set(x, "needMaxCircle", js.undefined)
    
    inline def setNeedMinCircle(value: Boolean): Self = StObject.set(x, "needMinCircle", value.asInstanceOf[js.Any])
    
    inline def setNeedMinCircleUndefined: Self = StObject.set(x, "needMinCircle", js.undefined)
    
    inline def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
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
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
