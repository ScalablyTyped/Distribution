package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignProperty extends StObject {
  
  var align: js.UndefOr[ProductionRule[ScaledValueRef[Align]]] = js.undefined
}
object AlignProperty {
  
  inline def apply(): AlignProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignProperty]
  }
  
  extension [Self <: AlignProperty](x: Self) {
    
    inline def setAlign(value: ProductionRule[ScaledValueRef[Align]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlignVarargs(value: (Test & ScaledValueRef[Align])*): Self = StObject.set(x, "align", js.Array(value*))
  }
}
