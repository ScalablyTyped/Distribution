package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOperationContext extends StObject {
  
  def InContext(context: FormattingContext): Boolean = js.native
  
  def IsAny(): Boolean = js.native
  
  var customContextChecks: js.Any = js.native
}
object RuleOperationContext {
  
  @scala.inline
  def apply(InContext: FormattingContext => Boolean, IsAny: () => Boolean, customContextChecks: js.Any): RuleOperationContext = {
    val __obj = js.Dynamic.literal(InContext = js.Any.fromFunction1(InContext), IsAny = js.Any.fromFunction0(IsAny), customContextChecks = customContextChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperationContext]
  }
  
  @scala.inline
  implicit class RuleOperationContextMutableBuilder[Self <: RuleOperationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomContextChecks(value: js.Any): Self = StObject.set(x, "customContextChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInContext(value: FormattingContext => Boolean): Self = StObject.set(x, "InContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAny(value: () => Boolean): Self = StObject.set(x, "IsAny", js.Any.fromFunction0(value))
  }
}
