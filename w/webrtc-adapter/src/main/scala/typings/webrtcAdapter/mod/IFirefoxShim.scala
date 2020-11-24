package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFirefoxShim extends js.Object {
  
  def shimOnTrack(window: Window): Unit = js.native
  
  def shimPeerConnection(window: Window): Unit = js.native
  
  def shimRTCDataChannel(window: Window): Unit = js.native
  
  def shimReceiverGetStats(window: Window): Unit = js.native
  
  def shimRemoveStream(window: Window): Unit = js.native
  
  def shimSenderGetStats(window: Window): Unit = js.native
}
object IFirefoxShim {
  
  @scala.inline
  def apply(
    shimOnTrack: Window => Unit,
    shimPeerConnection: Window => Unit,
    shimRTCDataChannel: Window => Unit,
    shimReceiverGetStats: Window => Unit,
    shimRemoveStream: Window => Unit,
    shimSenderGetStats: Window => Unit
  ): IFirefoxShim = {
    val __obj = js.Dynamic.literal(shimOnTrack = js.Any.fromFunction1(shimOnTrack), shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimRTCDataChannel = js.Any.fromFunction1(shimRTCDataChannel), shimReceiverGetStats = js.Any.fromFunction1(shimReceiverGetStats), shimRemoveStream = js.Any.fromFunction1(shimRemoveStream), shimSenderGetStats = js.Any.fromFunction1(shimSenderGetStats))
    __obj.asInstanceOf[IFirefoxShim]
  }
  
  @scala.inline
  implicit class IFirefoxShimOps[Self <: IFirefoxShim] (val x: Self) extends AnyVal {
    
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
    def setShimOnTrack(value: Window => Unit): Self = this.set("shimOnTrack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimPeerConnection(value: Window => Unit): Self = this.set("shimPeerConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimRTCDataChannel(value: Window => Unit): Self = this.set("shimRTCDataChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimReceiverGetStats(value: Window => Unit): Self = this.set("shimReceiverGetStats", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimRemoveStream(value: Window => Unit): Self = this.set("shimRemoveStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimSenderGetStats(value: Window => Unit): Self = this.set("shimSenderGetStats", js.Any.fromFunction1(value))
  }
}
