package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommonShim extends js.Object {
  def removeAllowExtmapMixed(window: Window): Unit
  def shimConnectionState(window: Window): Unit
  def shimMaxMessageSize(window: Window): Unit
  def shimRTCIceCandidate(window: Window): Unit
  def shimSendThrowTypeError(window: Window): Unit
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
}

