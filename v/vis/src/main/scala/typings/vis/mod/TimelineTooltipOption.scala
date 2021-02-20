package typings.vis.mod

import typings.vis.visStrings.cap
import typings.vis.visStrings.flip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTooltipOption extends StObject {
  
  var followMouse: js.UndefOr[Boolean] = js.native
  
  var overflowMethod: js.UndefOr[cap | flip] = js.native
}
object TimelineTooltipOption {
  
  @scala.inline
  def apply(): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTooltipOption]
  }
  
  @scala.inline
  implicit class TimelineTooltipOptionMutableBuilder[Self <: TimelineTooltipOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowMouse(value: Boolean): Self = StObject.set(x, "followMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowMouseUndefined: Self = StObject.set(x, "followMouse", js.undefined)
    
    @scala.inline
    def setOverflowMethod(value: cap | flip): Self = StObject.set(x, "overflowMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowMethodUndefined: Self = StObject.set(x, "overflowMethod", js.undefined)
  }
}
