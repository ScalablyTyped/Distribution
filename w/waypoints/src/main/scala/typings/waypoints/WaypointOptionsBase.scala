package typings.waypoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointOptionsBase extends StObject {
  
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[String | Double | js.Function0[Double]] = js.undefined
}
object WaypointOptionsBase {
  
  inline def apply(): WaypointOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptionsBase]
  }
  
  extension [Self <: WaypointOptionsBase](x: Self) {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setOffset(value: String | Double | js.Function0[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetFunction0(value: () => Double): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
