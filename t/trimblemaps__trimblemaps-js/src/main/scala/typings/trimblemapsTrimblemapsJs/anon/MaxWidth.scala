package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidth extends StObject {
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
}
object MaxWidth {
  
  inline def apply(): MaxWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth]
  }
  
  extension [Self <: MaxWidth](x: Self) {
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
