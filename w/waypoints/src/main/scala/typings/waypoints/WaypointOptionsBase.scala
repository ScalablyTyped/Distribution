package typings.waypoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointOptionsBase extends StObject {
  
  var continuous: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[String | Double | js.Function0[Double]] = js.native
}
object WaypointOptionsBase {
  
  @scala.inline
  def apply(): WaypointOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptionsBase]
  }
  
  @scala.inline
  implicit class WaypointOptionsBaseMutableBuilder[Self <: WaypointOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setOffset(value: String | Double | js.Function0[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetFunction0(value: () => Double): Self = StObject.set(x, "offset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
