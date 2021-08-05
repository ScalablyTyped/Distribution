package typings.vis.mod

import typings.vis.visStrings.cap
import typings.vis.visStrings.flip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineTooltipOption extends StObject {
  
  var followMouse: js.UndefOr[Boolean] = js.undefined
  
  var overflowMethod: js.UndefOr[cap | flip] = js.undefined
}
object TimelineTooltipOption {
  
  inline def apply(): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTooltipOption]
  }
  
  extension [Self <: TimelineTooltipOption](x: Self) {
    
    inline def setFollowMouse(value: Boolean): Self = StObject.set(x, "followMouse", value.asInstanceOf[js.Any])
    
    inline def setFollowMouseUndefined: Self = StObject.set(x, "followMouse", js.undefined)
    
    inline def setOverflowMethod(value: cap | flip): Self = StObject.set(x, "overflowMethod", value.asInstanceOf[js.Any])
    
    inline def setOverflowMethodUndefined: Self = StObject.set(x, "overflowMethod", js.undefined)
  }
}
