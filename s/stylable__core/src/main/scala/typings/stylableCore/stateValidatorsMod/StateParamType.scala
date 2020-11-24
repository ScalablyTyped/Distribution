package typings.stylableCore.stateValidatorsMod

import typings.std.Record
import typings.stylableCore.typesMod.StateArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateParamType extends js.Object {
  
  var subValidators: js.UndefOr[Record[String, SubValidator]] = js.native
  
  def validate(
    value: js.Any,
    args: StateArguments,
    resolveParam: js.Any,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
}
object StateParamType {
  
  @scala.inline
  def apply(validate: (js.Any, StateArguments, js.Any, Boolean, Boolean) => StateResult): StateParamType = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction5(validate))
    __obj.asInstanceOf[StateParamType]
  }
  
  @scala.inline
  implicit class StateParamTypeOps[Self <: StateParamType] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: (js.Any, StateArguments, js.Any, Boolean, Boolean) => StateResult): Self = this.set("validate", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSubValidators(value: Record[String, SubValidator]): Self = this.set("subValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubValidators: Self = this.set("subValidators", js.undefined)
  }
}
