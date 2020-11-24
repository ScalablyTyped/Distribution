package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOperationContext extends js.Object {
  
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
  implicit class RuleOperationContextOps[Self <: RuleOperationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInContext(value: FormattingContext => Boolean): Self = this.set("InContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAny(value: () => Boolean): Self = this.set("IsAny", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomContextChecks(value: js.Any): Self = this.set("customContextChecks", value.asInstanceOf[js.Any])
  }
}
