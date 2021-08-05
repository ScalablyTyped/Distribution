package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineRollingModeOption extends StObject {
  
  var follow: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object TimelineRollingModeOption {
  
  inline def apply(): TimelineRollingModeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineRollingModeOption]
  }
  
  extension [Self <: TimelineRollingModeOption](x: Self) {
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
