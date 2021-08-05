package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendPositionOptions extends StObject {
  
  var position: js.UndefOr[LegendPositionType] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object LegendPositionOptions {
  
  inline def apply(): LegendPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendPositionOptions]
  }
  
  extension [Self <: LegendPositionOptions](x: Self) {
    
    inline def setPosition(value: LegendPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
