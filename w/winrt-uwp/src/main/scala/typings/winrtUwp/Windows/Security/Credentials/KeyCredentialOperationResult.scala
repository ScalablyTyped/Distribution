package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a key credential operation. */
@js.native
trait KeyCredentialOperationResult extends js.Object {
  
  /** Gets the result of the key credential operation. */
  var result: IBuffer = js.native
  
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}
object KeyCredentialOperationResult {
  
  @scala.inline
  def apply(result: IBuffer, status: KeyCredentialStatus): KeyCredentialOperationResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialOperationResult]
  }
  
  @scala.inline
  implicit class KeyCredentialOperationResultOps[Self <: KeyCredentialOperationResult] (val x: Self) extends AnyVal {
    
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
    def setResult(value: IBuffer): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: KeyCredentialStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
