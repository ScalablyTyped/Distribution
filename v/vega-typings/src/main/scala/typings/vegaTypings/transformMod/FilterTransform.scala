package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterTransform extends _Transforms {
  
  var expr: ExprString = js.native
  
  var `type`: filter = js.native
}
object FilterTransform {
  
  @scala.inline
  def apply(expr: ExprString, `type`: filter): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
