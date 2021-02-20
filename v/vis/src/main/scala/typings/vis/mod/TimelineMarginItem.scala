package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineMarginItem extends StObject {
  
  var horizontal: js.UndefOr[Double] = js.native
  
  var vertical: js.UndefOr[Double] = js.native
}
object TimelineMarginItem {
  
  @scala.inline
  def apply(): TimelineMarginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineMarginItem]
  }
  
  @scala.inline
  implicit class TimelineMarginItemMutableBuilder[Self <: TimelineMarginItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
