package typings.webrtcAdapter.mod

import typings.std.MediaStreamConstraints
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISafariShim extends js.Object {
  def shimCallbacksAPI(window: Window): Unit
  def shimConstraints(constraints: MediaStreamConstraints): Unit
  def shimCreateOfferLegacy(window: Window): Unit
  def shimGetUserMedia(window: Window): Unit
  def shimLocalStreamsAPI(window: Window): Unit
  def shimRTCIceServerUrls(window: Window): Unit
  def shimRemoteStreamsAPI(window: Window): Unit
  def shimTrackEventTransceiver(window: Window): Unit
}

object ISafariShim {
  @scala.inline
  def apply(
    shimCallbacksAPI: Window => Unit,
    shimConstraints: MediaStreamConstraints => Unit,
    shimCreateOfferLegacy: Window => Unit,
    shimGetUserMedia: Window => Unit,
    shimLocalStreamsAPI: Window => Unit,
    shimRTCIceServerUrls: Window => Unit,
    shimRemoteStreamsAPI: Window => Unit,
    shimTrackEventTransceiver: Window => Unit
  ): ISafariShim = {
    val __obj = js.Dynamic.literal(shimCallbacksAPI = js.Any.fromFunction1(shimCallbacksAPI), shimConstraints = js.Any.fromFunction1(shimConstraints), shimCreateOfferLegacy = js.Any.fromFunction1(shimCreateOfferLegacy), shimGetUserMedia = js.Any.fromFunction1(shimGetUserMedia), shimLocalStreamsAPI = js.Any.fromFunction1(shimLocalStreamsAPI), shimRTCIceServerUrls = js.Any.fromFunction1(shimRTCIceServerUrls), shimRemoteStreamsAPI = js.Any.fromFunction1(shimRemoteStreamsAPI), shimTrackEventTransceiver = js.Any.fromFunction1(shimTrackEventTransceiver))
    __obj.asInstanceOf[ISafariShim]
  }
}

