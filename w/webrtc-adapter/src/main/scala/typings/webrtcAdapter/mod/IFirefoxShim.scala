package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFirefoxShim extends js.Object {
  def shimOnTrack(window: Window): Unit
  def shimPeerConnection(window: Window): Unit
  def shimRTCDataChannel(window: Window): Unit
  def shimReceiverGetStats(window: Window): Unit
  def shimRemoveStream(window: Window): Unit
  def shimSenderGetStats(window: Window): Unit
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
}

