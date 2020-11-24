package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Construction options for a model validation state.
@js.native
trait ModelValidationStateOptions extends js.Object {
  
  def applicable(): Boolean = js.native
  
  var excludeFromSummary: Boolean = js.native
  
  var failureMessage: String = js.native
  
  def name(): String = js.native
  
  def paused(): Boolean = js.native
}
object ModelValidationStateOptions {
  
  @scala.inline
  def apply(
    applicable: () => Boolean,
    excludeFromSummary: Boolean,
    failureMessage: String,
    name: () => String,
    paused: () => Boolean
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction0(applicable), excludeFromSummary = excludeFromSummary.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), paused = js.Any.fromFunction0(paused))
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
  
  @scala.inline
  implicit class ModelValidationStateOptionsOps[Self <: ModelValidationStateOptions] (val x: Self) extends AnyVal {
    
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
    def setApplicable(value: () => Boolean): Self = this.set("applicable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludeFromSummary(value: Boolean): Self = this.set("excludeFromSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: () => String): Self = this.set("name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: () => Boolean): Self = this.set("paused", js.Any.fromFunction0(value))
  }
}
