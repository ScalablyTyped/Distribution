package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for the [accept](Titanium.Network.Socket.TCP.accept) method.
  */
@js.native
trait AcceptDict extends js.Object {
  
  /**
    * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ ErrorCallbackArgs, Unit]] = js.native
  
  /**
    * Timeout, in milliseconds, for all `write` operations.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object AcceptDict {
  
  @scala.inline
  def apply(): AcceptDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDict]
  }
  
  @scala.inline
  implicit class AcceptDictOps[Self <: AcceptDict] (val x: Self) extends AnyVal {
    
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
    def setError(value: /* param0 */ ErrorCallbackArgs => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
