package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionVariable extends js.Object {
  
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: Boolean = js.native
  
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: Boolean = js.native
  
  /**
    * The value of the variable.
    */
  var value: String = js.native
}
object BuildDefinitionVariable {
  
  @scala.inline
  def apply(allowOverride: Boolean, isSecret: Boolean, value: String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
  
  @scala.inline
  implicit class BuildDefinitionVariableOps[Self <: BuildDefinitionVariable] (val x: Self) extends AnyVal {
    
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
    def setAllowOverride(value: Boolean): Self = this.set("allowOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecret(value: Boolean): Self = this.set("isSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
