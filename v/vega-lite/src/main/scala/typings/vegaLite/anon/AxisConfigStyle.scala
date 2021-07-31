package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisConfigStyle extends StObject {
  
  var axisConfigStyle: js.Any
  
  var vgAxisConfig: js.Any
  
  var vlOnlyAxisConfig: js.Any
}
object AxisConfigStyle {
  
  @scala.inline
  def apply(axisConfigStyle: js.Any, vgAxisConfig: js.Any, vlOnlyAxisConfig: js.Any): AxisConfigStyle = {
    val __obj = js.Dynamic.literal(axisConfigStyle = axisConfigStyle.asInstanceOf[js.Any], vgAxisConfig = vgAxisConfig.asInstanceOf[js.Any], vlOnlyAxisConfig = vlOnlyAxisConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisConfigStyle]
  }
  
  @scala.inline
  implicit class AxisConfigStyleMutableBuilder[Self <: AxisConfigStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisConfigStyle(value: js.Any): Self = StObject.set(x, "axisConfigStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgAxisConfig(value: js.Any): Self = StObject.set(x, "vgAxisConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlOnlyAxisConfig(value: js.Any): Self = StObject.set(x, "vlOnlyAxisConfig", value.asInstanceOf[js.Any])
  }
}
