package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExpressionRunnerInfo extends StObject {
  
  var canRun: js.UndefOr[js.Function1[/* obj */ Base, Boolean]] = js.undefined
  
  def onExecute(obj: Base, res: Any): Unit
  
  var runner: js.UndefOr[ExpressionRunner] = js.undefined
}
object IExpressionRunnerInfo {
  
  inline def apply(onExecute: (Base, Any) => Unit): IExpressionRunnerInfo = {
    val __obj = js.Dynamic.literal(onExecute = js.Any.fromFunction2(onExecute))
    __obj.asInstanceOf[IExpressionRunnerInfo]
  }
  
  extension [Self <: IExpressionRunnerInfo](x: Self) {
    
    inline def setCanRun(value: /* obj */ Base => Boolean): Self = StObject.set(x, "canRun", js.Any.fromFunction1(value))
    
    inline def setCanRunUndefined: Self = StObject.set(x, "canRun", js.undefined)
    
    inline def setOnExecute(value: (Base, Any) => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
    
    inline def setRunner(value: ExpressionRunner): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
  }
}
