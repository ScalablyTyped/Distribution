package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommonShim extends js.Object {
  
  def removeAllowExtmapMixed(window: Window): Unit = js.native
  
  def shimConnectionState(window: Window): Unit = js.native
  
  def shimMaxMessageSize(window: Window): Unit = js.native
  
  def shimRTCIceCandidate(window: Window): Unit = js.native
  
  def shimSendThrowTypeError(window: Window): Unit = js.native
}
object ICommonShim {
  
  @scala.inline
  def apply(
    removeAllowExtmapMixed: Window => Unit,
    shimConnectionState: Window => Unit,
    shimMaxMessageSize: Window => Unit,
    shimRTCIceCandidate: Window => Unit,
    shimSendThrowTypeError: Window => Unit
  ): ICommonShim = {
    val __obj = js.Dynamic.literal(removeAllowExtmapMixed = js.Any.fromFunction1(removeAllowExtmapMixed), shimConnectionState = js.Any.fromFunction1(shimConnectionState), shimMaxMessageSize = js.Any.fromFunction1(shimMaxMessageSize), shimRTCIceCandidate = js.Any.fromFunction1(shimRTCIceCandidate), shimSendThrowTypeError = js.Any.fromFunction1(shimSendThrowTypeError))
    __obj.asInstanceOf[ICommonShim]
  }
  
  @scala.inline
  implicit class ICommonShimOps[Self <: ICommonShim] (val x: Self) extends AnyVal {
    
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
    def setRemoveAllowExtmapMixed(value: Window => Unit): Self = this.set("removeAllowExtmapMixed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimConnectionState(value: Window => Unit): Self = this.set("shimConnectionState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimMaxMessageSize(value: Window => Unit): Self = this.set("shimMaxMessageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimRTCIceCandidate(value: Window => Unit): Self = this.set("shimRTCIceCandidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimSendThrowTypeError(value: Window => Unit): Self = this.set("shimSendThrowTypeError", js.Any.fromFunction1(value))
  }
}
