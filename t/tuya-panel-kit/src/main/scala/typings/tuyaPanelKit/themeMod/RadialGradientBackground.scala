package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientBackground
  extends StObject
     with _BackgroundProps {
  
  var cx: js.UndefOr[String] = js.undefined
  
  var cy: js.UndefOr[String] = js.undefined
  
  var fx: js.UndefOr[String] = js.undefined
  
  var fy: js.UndefOr[String] = js.undefined
  
  var rx: js.UndefOr[String] = js.undefined
  
  var ry: js.UndefOr[String] = js.undefined
  
  var stops: js.UndefOr[js.Array[StopsProps]] = js.undefined
}
object RadialGradientBackground {
  
  @scala.inline
  def apply(): RadialGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientBackground]
  }
  
  @scala.inline
  implicit class RadialGradientBackgroundMutableBuilder[Self <: RadialGradientBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setFy(value: String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
    @scala.inline
    def setRx(value: String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[StopsProps]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: StopsProps*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
