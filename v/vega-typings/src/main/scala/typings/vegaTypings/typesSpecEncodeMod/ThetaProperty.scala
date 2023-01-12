package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThetaProperty extends StObject {
  
  var theta: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}
object ThetaProperty {
  
  inline def apply(): ThetaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThetaProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThetaProperty] (val x: Self) extends AnyVal {
    
    inline def setTheta(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    inline def setThetaVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "theta", js.Array(value*))
  }
}
