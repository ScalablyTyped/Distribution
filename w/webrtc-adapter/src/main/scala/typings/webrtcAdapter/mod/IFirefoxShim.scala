package typings.webrtcAdapter.mod

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFirefoxShim extends js.Object {
  def shimOnTrack(window: Window_): Unit
  def shimPeerConnection(window: Window_): Unit
  def shimRTCDataChannel(window: Window_): Unit
  def shimReceiverGetStats(window: Window_): Unit
  def shimRemoveStream(window: Window_): Unit
  def shimSenderGetStats(window: Window_): Unit
}

object IFirefoxShim {
  @scala.inline
  def apply(
    shimOnTrack: Window_ => Unit,
    shimPeerConnection: Window_ => Unit,
    shimRTCDataChannel: Window_ => Unit,
    shimReceiverGetStats: Window_ => Unit,
    shimRemoveStream: Window_ => Unit,
    shimSenderGetStats: Window_ => Unit
  ): IFirefoxShim = {
    val __obj = js.Dynamic.literal(shimOnTrack = js.Any.fromFunction1(shimOnTrack), shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimRTCDataChannel = js.Any.fromFunction1(shimRTCDataChannel), shimReceiverGetStats = js.Any.fromFunction1(shimReceiverGetStats), shimRemoveStream = js.Any.fromFunction1(shimRemoveStream), shimSenderGetStats = js.Any.fromFunction1(shimSenderGetStats))
    __obj.asInstanceOf[IFirefoxShim]
  }
}

