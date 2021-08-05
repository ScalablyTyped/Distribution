package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormulaTransform
  extends StObject
     with _Transforms {
  
  var as: String | SignalRef
  
  var expr: ExprString
  
  var initonly: js.UndefOr[Boolean] = js.undefined
  
  var `type`: formula
}
object FormulaTransform {
  
  inline def apply(as: String | SignalRef, expr: ExprString): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("formula")
    __obj.asInstanceOf[FormulaTransform]
  }
  
  extension [Self <: FormulaTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: ExprString): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setInitonly(value: Boolean): Self = StObject.set(x, "initonly", value.asInstanceOf[js.Any])
    
    inline def setInitonlyUndefined: Self = StObject.set(x, "initonly", js.undefined)
    
    inline def setType(value: formula): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
