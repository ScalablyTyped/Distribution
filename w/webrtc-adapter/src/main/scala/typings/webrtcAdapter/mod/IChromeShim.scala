package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChromeShim extends js.Object {
  def fixNegotiationNeeded(window: Window): Unit = js.native
  def shimAddTrackRemoveTrack(window: Window): Unit = js.native
  def shimAddTrackRemoveTrackWithNative(window: Window): Unit = js.native
  def shimGetSendersWithDtmf(window: Window): Unit = js.native
  def shimGetStats(window: Window): Unit = js.native
  def shimMediaStream(window: Window): Unit = js.native
  def shimOnTrack(window: Window): Unit = js.native
  def shimPeerConnection(window: Window): Unit = js.native
  def shimSenderReceiverGetStats(window: Window): Unit = js.native
}

object IChromeShim {
  @scala.inline
  def apply(
    fixNegotiationNeeded: Window => Unit,
    shimAddTrackRemoveTrack: Window => Unit,
    shimAddTrackRemoveTrackWithNative: Window => Unit,
    shimGetSendersWithDtmf: Window => Unit,
    shimGetStats: Window => Unit,
    shimMediaStream: Window => Unit,
    shimOnTrack: Window => Unit,
    shimPeerConnection: Window => Unit,
    shimSenderReceiverGetStats: Window => Unit
  ): IChromeShim = {
    val __obj = js.Dynamic.literal(fixNegotiationNeeded = js.Any.fromFunction1(fixNegotiationNeeded), shimAddTrackRemoveTrack = js.Any.fromFunction1(shimAddTrackRemoveTrack), shimAddTrackRemoveTrackWithNative = js.Any.fromFunction1(shimAddTrackRemoveTrackWithNative), shimGetSendersWithDtmf = js.Any.fromFunction1(shimGetSendersWithDtmf), shimGetStats = js.Any.fromFunction1(shimGetStats), shimMediaStream = js.Any.fromFunction1(shimMediaStream), shimOnTrack = js.Any.fromFunction1(shimOnTrack), shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimSenderReceiverGetStats = js.Any.fromFunction1(shimSenderReceiverGetStats))
    __obj.asInstanceOf[IChromeShim]
  }
  @scala.inline
  implicit class IChromeShimOps[Self <: IChromeShim] (val x: Self) extends AnyVal {
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
    def setFixNegotiationNeeded(value: Window => Unit): Self = this.set("fixNegotiationNeeded", js.Any.fromFunction1(value))
    @scala.inline
    def setShimAddTrackRemoveTrack(value: Window => Unit): Self = this.set("shimAddTrackRemoveTrack", js.Any.fromFunction1(value))
    @scala.inline
    def setShimAddTrackRemoveTrackWithNative(value: Window => Unit): Self = this.set("shimAddTrackRemoveTrackWithNative", js.Any.fromFunction1(value))
    @scala.inline
    def setShimGetSendersWithDtmf(value: Window => Unit): Self = this.set("shimGetSendersWithDtmf", js.Any.fromFunction1(value))
    @scala.inline
    def setShimGetStats(value: Window => Unit): Self = this.set("shimGetStats", js.Any.fromFunction1(value))
    @scala.inline
    def setShimMediaStream(value: Window => Unit): Self = this.set("shimMediaStream", js.Any.fromFunction1(value))
    @scala.inline
    def setShimOnTrack(value: Window => Unit): Self = this.set("shimOnTrack", js.Any.fromFunction1(value))
    @scala.inline
    def setShimPeerConnection(value: Window => Unit): Self = this.set("shimPeerConnection", js.Any.fromFunction1(value))
    @scala.inline
    def setShimSenderReceiverGetStats(value: Window => Unit): Self = this.set("shimSenderReceiverGetStats", js.Any.fromFunction1(value))
  }
  
}

