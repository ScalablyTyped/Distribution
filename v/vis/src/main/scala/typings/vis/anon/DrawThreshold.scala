package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawThreshold extends StObject {
  
  var drawThreshold: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxVisible: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
}
object DrawThreshold {
  
  @scala.inline
  def apply(): DrawThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawThreshold]
  }
  
  @scala.inline
  implicit class DrawThresholdMutableBuilder[Self <: DrawThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawThreshold(value: Double): Self = StObject.set(x, "drawThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawThresholdUndefined: Self = StObject.set(x, "drawThreshold", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxVisible(value: Double): Self = StObject.set(x, "maxVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleUndefined: Self = StObject.set(x, "maxVisible", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
