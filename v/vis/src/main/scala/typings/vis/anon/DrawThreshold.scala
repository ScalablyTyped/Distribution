package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawThreshold extends StObject {
  
  var drawThreshold: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var maxVisible: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object DrawThreshold {
  
  inline def apply(): DrawThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawThreshold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawThreshold] (val x: Self) extends AnyVal {
    
    inline def setDrawThreshold(value: Double): Self = StObject.set(x, "drawThreshold", value.asInstanceOf[js.Any])
    
    inline def setDrawThresholdUndefined: Self = StObject.set(x, "drawThreshold", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxVisible(value: Double): Self = StObject.set(x, "maxVisible", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleUndefined: Self = StObject.set(x, "maxVisible", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
