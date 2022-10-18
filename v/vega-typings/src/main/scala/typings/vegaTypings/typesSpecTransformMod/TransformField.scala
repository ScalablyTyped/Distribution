package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecExprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecSignalMod.SignalRef
  - typings.vegaTypings.typesSpecTransformMod.FieldParam
  - typings.vegaTypings.typesSpecExprMod.ExprRef
*/
trait TransformField extends StObject
object TransformField {
  
  inline def ExprRef(expr: Expr): typings.vegaTypings.typesSpecExprMod.ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecExprMod.ExprRef]
  }
  
  inline def FieldParam(field: String): typings.vegaTypings.typesSpecTransformMod.FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.FieldParam]
  }
  
  inline def SignalRef(signal: String): typings.vegaTypings.typesSpecSignalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.SignalRef]
  }
}
