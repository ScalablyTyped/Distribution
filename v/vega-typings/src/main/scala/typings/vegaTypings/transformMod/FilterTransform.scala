package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterTransform
  extends StObject
     with _Transforms {
  
  var expr: ExprString
  
  var `type`: filter
}
object FilterTransform {
  
  @scala.inline
  def apply(expr: ExprString): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[FilterTransform]
  }
  
  @scala.inline
  implicit class FilterTransformMutableBuilder[Self <: FilterTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpr(value: ExprString): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: filter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
