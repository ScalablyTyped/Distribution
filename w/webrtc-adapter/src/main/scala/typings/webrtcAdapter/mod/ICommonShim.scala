package typings.webrtcAdapter.mod

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommonShim extends js.Object {
  def removeAllowExtmapMixed(window: Window_): Unit
  def shimConnectionState(window: Window_): Unit
  def shimMaxMessageSize(window: Window_): Unit
  def shimRTCIceCandidate(window: Window_): Unit
  def shimSendThrowTypeError(window: Window_): Unit
}

object ICommonShim {
  @scala.inline
  def apply(
    removeAllowExtmapMixed: Window_ => Unit,
    shimConnectionState: Window_ => Unit,
    shimMaxMessageSize: Window_ => Unit,
    shimRTCIceCandidate: Window_ => Unit,
    shimSendThrowTypeError: Window_ => Unit
  ): ICommonShim = {
    val __obj = js.Dynamic.literal(removeAllowExtmapMixed = js.Any.fromFunction1(removeAllowExtmapMixed), shimConnectionState = js.Any.fromFunction1(shimConnectionState), shimMaxMessageSize = js.Any.fromFunction1(shimMaxMessageSize), shimRTCIceCandidate = js.Any.fromFunction1(shimRTCIceCandidate), shimSendThrowTypeError = js.Any.fromFunction1(shimSendThrowTypeError))
  
    __obj.asInstanceOf[ICommonShim]
  }
}

