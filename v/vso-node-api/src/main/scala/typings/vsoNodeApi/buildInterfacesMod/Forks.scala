package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Forks extends js.Object {
  
  /**
    * Indicates whether a build should use secrets when building forks of the selected repository.
    */
  var allowSecrets: Boolean = js.native
  
  /**
    * Indicates whether the trigger should queue builds for forks of the selected repository.
    */
  var enabled: Boolean = js.native
}
object Forks {
  
  @scala.inline
  def apply(allowSecrets: Boolean, enabled: Boolean): Forks = {
    val __obj = js.Dynamic.literal(allowSecrets = allowSecrets.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forks]
  }
  
  @scala.inline
  implicit class ForksOps[Self <: Forks] (val x: Self) extends AnyVal {
    
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
    def setAllowSecrets(value: Boolean): Self = this.set("allowSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
