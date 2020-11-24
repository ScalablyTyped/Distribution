package typings.webrtcAdapter.mod

import typings.std.MediaStreamConstraints
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISafariShim extends js.Object {
  
  def shimCallbacksAPI(window: Window): Unit = js.native
  
  def shimConstraints(constraints: MediaStreamConstraints): Unit = js.native
  
  def shimCreateOfferLegacy(window: Window): Unit = js.native
  
  def shimGetUserMedia(window: Window): Unit = js.native
  
  def shimLocalStreamsAPI(window: Window): Unit = js.native
  
  def shimRTCIceServerUrls(window: Window): Unit = js.native
  
  def shimRemoteStreamsAPI(window: Window): Unit = js.native
  
  def shimTrackEventTransceiver(window: Window): Unit = js.native
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
  
  @scala.inline
  implicit class ISafariShimOps[Self <: ISafariShim] (val x: Self) extends AnyVal {
    
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
    def setShimCallbacksAPI(value: Window => Unit): Self = this.set("shimCallbacksAPI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimConstraints(value: MediaStreamConstraints => Unit): Self = this.set("shimConstraints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimCreateOfferLegacy(value: Window => Unit): Self = this.set("shimCreateOfferLegacy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimGetUserMedia(value: Window => Unit): Self = this.set("shimGetUserMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimLocalStreamsAPI(value: Window => Unit): Self = this.set("shimLocalStreamsAPI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimRTCIceServerUrls(value: Window => Unit): Self = this.set("shimRTCIceServerUrls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimRemoteStreamsAPI(value: Window => Unit): Self = this.set("shimRemoteStreamsAPI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimTrackEventTransceiver(value: Window => Unit): Self = this.set("shimTrackEventTransceiver", js.Any.fromFunction1(value))
  }
}
