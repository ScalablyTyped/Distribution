package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineRollingModeOption extends StObject {
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
}
object TimelineRollingModeOption {
  
  @scala.inline
  def apply(): TimelineRollingModeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineRollingModeOption]
  }
  
  @scala.inline
  implicit class TimelineRollingModeOptionMutableBuilder[Self <: TimelineRollingModeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
