package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the result, in the form of a response message, from the PlayReady-ND messenger. */
@js.native
trait INDSendResult extends js.Object {
  
  /** Gets the response message from a messenger. */
  var response: Double = js.native
}
object INDSendResult {
  
  @scala.inline
  def apply(response: Double): INDSendResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDSendResult]
  }
  
  @scala.inline
  implicit class INDSendResultOps[Self <: INDSendResult] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: Double): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
