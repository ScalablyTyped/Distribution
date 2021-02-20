package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineOrientationOption extends StObject {
  
  var axis: js.UndefOr[String] = js.native
  
  var item: js.UndefOr[String] = js.native
}
object TimelineOrientationOption {
  
  @scala.inline
  def apply(): TimelineOrientationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOrientationOption]
  }
  
  @scala.inline
  implicit class TimelineOrientationOptionMutableBuilder[Self <: TimelineOrientationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
