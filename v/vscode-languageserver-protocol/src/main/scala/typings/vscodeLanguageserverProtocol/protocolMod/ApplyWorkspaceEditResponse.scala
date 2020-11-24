package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyWorkspaceEditResponse extends js.Object {
  
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean = js.native
  
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[Double] = js.native
  
  /**
    * An optional textual description for why the edit was not applied.
    * This may be used by the server for diagnostic logging or to provide
    * a suitable error for a request that triggered the edit.
    */
  var failureReason: js.UndefOr[String] = js.native
}
object ApplyWorkspaceEditResponse {
  
  @scala.inline
  def apply(applied: Boolean): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
  
  @scala.inline
  implicit class ApplyWorkspaceEditResponseOps[Self <: ApplyWorkspaceEditResponse] (val x: Self) extends AnyVal {
    
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
    def setApplied(value: Boolean): Self = this.set("applied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedChange(value: Double): Self = this.set("failedChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedChange: Self = this.set("failedChange", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
  }
}
