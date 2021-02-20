package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.signalMod.SignalRef
  - typings.vegaTypings.transformMod.FieldParam
  - typings.vegaTypings.exprMod.ExprRef
*/
trait TransformField extends StObject
object TransformField {
  
  @scala.inline
  def ExprRef(expr: Expr): typings.vegaTypings.exprMod.ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.exprMod.ExprRef]
  }
  
  @scala.inline
  def FieldParam(field: String): typings.vegaTypings.transformMod.FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FieldParam]
  }
  
  @scala.inline
  def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
  }
}
