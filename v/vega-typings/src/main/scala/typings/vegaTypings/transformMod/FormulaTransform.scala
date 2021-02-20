package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormulaTransform extends _Transforms {
  
  var as: String | SignalRef = js.native
  
  var expr: ExprString = js.native
  
  var initonly: js.UndefOr[Boolean] = js.native
  
  var `type`: formula = js.native
}
object FormulaTransform {
  
  @scala.inline
  def apply(as: String | SignalRef, expr: ExprString, `type`: formula): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaTransform]
  }
  
  @scala.inline
  implicit class FormulaTransformMutableBuilder[Self <: FormulaTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: ExprString): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitonly(value: Boolean): Self = StObject.set(x, "initonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitonlyUndefined: Self = StObject.set(x, "initonly", js.undefined)
    
    @scala.inline
    def setType(value: formula): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
