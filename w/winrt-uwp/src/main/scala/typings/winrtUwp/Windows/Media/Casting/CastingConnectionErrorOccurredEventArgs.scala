package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents arguments for the ErrorOccurred event from the CastingConnection */
@js.native
trait CastingConnectionErrorOccurredEventArgs extends js.Object {
  
  /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
  var errorStatus: CastingConnectionErrorStatus = js.native
  
  /** Gets human-readable message to accompany the error status code, ErrorStatus . */
  var message: String = js.native
}
object CastingConnectionErrorOccurredEventArgs {
  
  @scala.inline
  def apply(errorStatus: CastingConnectionErrorStatus, message: String): CastingConnectionErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorStatus = errorStatus.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingConnectionErrorOccurredEventArgs]
  }
  
  @scala.inline
  implicit class CastingConnectionErrorOccurredEventArgsOps[Self <: CastingConnectionErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
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
    def setErrorStatus(value: CastingConnectionErrorStatus): Self = this.set("errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
