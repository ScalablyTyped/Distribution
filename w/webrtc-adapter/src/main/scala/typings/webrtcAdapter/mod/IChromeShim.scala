package typings.webrtcAdapter.mod

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChromeShim extends js.Object {
  def fixNegotiationNeeded(window: Window_): Unit
  def shimAddTrackRemoveTrack(window: Window_): Unit
  def shimAddTrackRemoveTrackWithNative(window: Window_): Unit
  def shimGetSendersWithDtmf(window: Window_): Unit
  def shimGetStats(window: Window_): Unit
  def shimMediaStream(window: Window_): Unit
  def shimOnTrack(window: Window_): Unit
  def shimPeerConnection(window: Window_): Unit
  def shimSenderReceiverGetStats(window: Window_): Unit
}

object IChromeShim {
  @scala.inline
  def apply(
    fixNegotiationNeeded: Window_ => Unit,
    shimAddTrackRemoveTrack: Window_ => Unit,
    shimAddTrackRemoveTrackWithNative: Window_ => Unit,
    shimGetSendersWithDtmf: Window_ => Unit,
    shimGetStats: Window_ => Unit,
    shimMediaStream: Window_ => Unit,
    shimOnTrack: Window_ => Unit,
    shimPeerConnection: Window_ => Unit,
    shimSenderReceiverGetStats: Window_ => Unit
  ): IChromeShim = {
    val __obj = js.Dynamic.literal(fixNegotiationNeeded = js.Any.fromFunction1(fixNegotiationNeeded), shimAddTrackRemoveTrack = js.Any.fromFunction1(shimAddTrackRemoveTrack), shimAddTrackRemoveTrackWithNative = js.Any.fromFunction1(shimAddTrackRemoveTrackWithNative), shimGetSendersWithDtmf = js.Any.fromFunction1(shimGetSendersWithDtmf), shimGetStats = js.Any.fromFunction1(shimGetStats), shimMediaStream = js.Any.fromFunction1(shimMediaStream), shimOnTrack = js.Any.fromFunction1(shimOnTrack), shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimSenderReceiverGetStats = js.Any.fromFunction1(shimSenderReceiverGetStats))
  
    __obj.asInstanceOf[IChromeShim]
  }
}

