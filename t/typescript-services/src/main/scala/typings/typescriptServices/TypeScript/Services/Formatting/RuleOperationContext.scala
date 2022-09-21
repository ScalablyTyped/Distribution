package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleOperationContext extends StObject {
  
  def InContext(context: FormattingContext): Boolean
  
  def IsAny(): Boolean
  
  /* private */ var customContextChecks: Any
}
object RuleOperationContext {
  
  inline def apply(InContext: FormattingContext => Boolean, IsAny: () => Boolean, customContextChecks: Any): RuleOperationContext = {
    val __obj = js.Dynamic.literal(InContext = js.Any.fromFunction1(InContext), IsAny = js.Any.fromFunction0(IsAny), customContextChecks = customContextChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperationContext]
  }
  
  extension [Self <: RuleOperationContext](x: Self) {
    
    inline def setCustomContextChecks(value: Any): Self = StObject.set(x, "customContextChecks", value.asInstanceOf[js.Any])
    
    inline def setInContext(value: FormattingContext => Boolean): Self = StObject.set(x, "InContext", js.Any.fromFunction1(value))
    
    inline def setIsAny(value: () => Boolean): Self = StObject.set(x, "IsAny", js.Any.fromFunction0(value))
  }
}
