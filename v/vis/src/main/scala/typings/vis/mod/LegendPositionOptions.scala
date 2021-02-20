package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendPositionOptions extends StObject {
  
  var position: js.UndefOr[LegendPositionType] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object LegendPositionOptions {
  
  @scala.inline
  def apply(): LegendPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendPositionOptions]
  }
  
  @scala.inline
  implicit class LegendPositionOptionsMutableBuilder[Self <: LegendPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: LegendPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
