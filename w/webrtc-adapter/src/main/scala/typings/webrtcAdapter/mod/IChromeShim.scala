package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChromeShim extends js.Object {
  def fixNegotiationNeeded(window: Window): Unit
  def shimAddTrackRemoveTrack(window: Window): Unit
  def shimAddTrackRemoveTrackWithNative(window: Window): Unit
  def shimGetSendersWithDtmf(window: Window): Unit
  def shimGetStats(window: Window): Unit
  def shimMediaStream(window: Window): Unit
  def shimOnTrack(window: Window): Unit
  def shimPeerConnection(window: Window): Unit
  def shimSenderReceiverGetStats(window: Window): Unit
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
}

