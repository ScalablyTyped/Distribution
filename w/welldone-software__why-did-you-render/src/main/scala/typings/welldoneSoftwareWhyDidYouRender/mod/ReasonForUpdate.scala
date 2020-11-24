package typings.welldoneSoftwareWhyDidYouRender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReasonForUpdate extends js.Object {
  
  var hookDifferences: js.Array[HookDifference] = js.native
  
  var propsDifferences: Boolean = js.native
  
  var stateDifferences: Boolean = js.native
}
object ReasonForUpdate {
  
  @scala.inline
  def apply(hookDifferences: js.Array[HookDifference], propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
    val __obj = js.Dynamic.literal(hookDifferences = hookDifferences.asInstanceOf[js.Any], propsDifferences = propsDifferences.asInstanceOf[js.Any], stateDifferences = stateDifferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonForUpdate]
  }
  
  @scala.inline
  implicit class ReasonForUpdateOps[Self <: ReasonForUpdate] (val x: Self) extends AnyVal {
    
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
    def setHookDifferencesVarargs(value: HookDifference*): Self = this.set("hookDifferences", js.Array(value :_*))
    
    @scala.inline
    def setHookDifferences(value: js.Array[HookDifference]): Self = this.set("hookDifferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsDifferences(value: Boolean): Self = this.set("propsDifferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDifferences(value: Boolean): Self = this.set("stateDifferences", value.asInstanceOf[js.Any])
  }
}
