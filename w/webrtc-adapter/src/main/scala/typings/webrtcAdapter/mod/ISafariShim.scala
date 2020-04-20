package typings.webrtcAdapter.mod

import typings.std.MediaStreamConstraints
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISafariShim extends js.Object {
  def shimCallbacksAPI(window: Window_): Unit
  def shimConstraints(constraints: MediaStreamConstraints): Unit
  def shimCreateOfferLegacy(window: Window_): Unit
  def shimGetUserMedia(window: Window_): Unit
  def shimLocalStreamsAPI(window: Window_): Unit
  def shimRTCIceServerUrls(window: Window_): Unit
  def shimRemoteStreamsAPI(window: Window_): Unit
  def shimTrackEventTransceiver(window: Window_): Unit
}

object ISafariShim {
  @scala.inline
  def apply(
    shimCallbacksAPI: Window_ => Unit,
    shimConstraints: MediaStreamConstraints => Unit,
    shimCreateOfferLegacy: Window_ => Unit,
    shimGetUserMedia: Window_ => Unit,
    shimLocalStreamsAPI: Window_ => Unit,
    shimRTCIceServerUrls: Window_ => Unit,
    shimRemoteStreamsAPI: Window_ => Unit,
    shimTrackEventTransceiver: Window_ => Unit
  ): ISafariShim = {
    val __obj = js.Dynamic.literal(shimCallbacksAPI = js.Any.fromFunction1(shimCallbacksAPI), shimConstraints = js.Any.fromFunction1(shimConstraints), shimCreateOfferLegacy = js.Any.fromFunction1(shimCreateOfferLegacy), shimGetUserMedia = js.Any.fromFunction1(shimGetUserMedia), shimLocalStreamsAPI = js.Any.fromFunction1(shimLocalStreamsAPI), shimRTCIceServerUrls = js.Any.fromFunction1(shimRTCIceServerUrls), shimRemoteStreamsAPI = js.Any.fromFunction1(shimRemoteStreamsAPI), shimTrackEventTransceiver = js.Any.fromFunction1(shimTrackEventTransceiver))
    __obj.asInstanceOf[ISafariShim]
  }
}

