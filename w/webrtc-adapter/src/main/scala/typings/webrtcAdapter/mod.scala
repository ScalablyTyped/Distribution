package typings.webrtcAdapter

import org.scalablytyped.runtime.Shortcut
import typings.std.MediaStreamConstraints
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("webrtc-adapter", JSImport.Default)
  @js.native
  val default: IAdapter = js.native
  
  trait IAdapter extends StObject {
    
    var browserDetails: IBrowserDetails
    
    var browserShim: js.UndefOr[IChromeShim | IFirefoxShim | ISafariShim] = js.undefined
    
    var commonShim: ICommonShim
    
    def disableLog(disable: Boolean): Unit
    
    def disableWarnings(disable: Boolean): Unit
    
    def extractVersion(uastring: String, expr: String, pos: Double): Double
  }
  object IAdapter {
    
    inline def apply(
      browserDetails: IBrowserDetails,
      commonShim: ICommonShim,
      disableLog: Boolean => Unit,
      disableWarnings: Boolean => Unit,
      extractVersion: (String, String, Double) => Double
    ): IAdapter = {
      val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any], commonShim = commonShim.asInstanceOf[js.Any], disableLog = js.Any.fromFunction1(disableLog), disableWarnings = js.Any.fromFunction1(disableWarnings), extractVersion = js.Any.fromFunction3(extractVersion))
      __obj.asInstanceOf[IAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAdapter] (val x: Self) extends AnyVal {
      
      inline def setBrowserDetails(value: IBrowserDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
      
      inline def setBrowserShim(value: IChromeShim | IFirefoxShim | ISafariShim): Self = StObject.set(x, "browserShim", value.asInstanceOf[js.Any])
      
      inline def setBrowserShimUndefined: Self = StObject.set(x, "browserShim", js.undefined)
      
      inline def setCommonShim(value: ICommonShim): Self = StObject.set(x, "commonShim", value.asInstanceOf[js.Any])
      
      inline def setDisableLog(value: Boolean => Unit): Self = StObject.set(x, "disableLog", js.Any.fromFunction1(value))
      
      inline def setDisableWarnings(value: Boolean => Unit): Self = StObject.set(x, "disableWarnings", js.Any.fromFunction1(value))
      
      inline def setExtractVersion(value: (String, String, Double) => Double): Self = StObject.set(x, "extractVersion", js.Any.fromFunction3(value))
    }
  }
  
  trait IBrowserDetails extends StObject {
    
    var browser: String
    
    var supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object IBrowserDetails {
    
    inline def apply(browser: String): IBrowserDetails = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBrowserDetails] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setSupportsUnifiedPlan(value: Boolean): Self = StObject.set(x, "supportsUnifiedPlan", value.asInstanceOf[js.Any])
      
      inline def setSupportsUnifiedPlanUndefined: Self = StObject.set(x, "supportsUnifiedPlan", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IChromeShim extends StObject {
    
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IChromeShim] (val x: Self) extends AnyVal {
      
      inline def setFixNegotiationNeeded(value: Window => Unit): Self = StObject.set(x, "fixNegotiationNeeded", js.Any.fromFunction1(value))
      
      inline def setShimAddTrackRemoveTrack(value: Window => Unit): Self = StObject.set(x, "shimAddTrackRemoveTrack", js.Any.fromFunction1(value))
      
      inline def setShimAddTrackRemoveTrackWithNative(value: Window => Unit): Self = StObject.set(x, "shimAddTrackRemoveTrackWithNative", js.Any.fromFunction1(value))
      
      inline def setShimGetSendersWithDtmf(value: Window => Unit): Self = StObject.set(x, "shimGetSendersWithDtmf", js.Any.fromFunction1(value))
      
      inline def setShimGetStats(value: Window => Unit): Self = StObject.set(x, "shimGetStats", js.Any.fromFunction1(value))
      
      inline def setShimMediaStream(value: Window => Unit): Self = StObject.set(x, "shimMediaStream", js.Any.fromFunction1(value))
      
      inline def setShimOnTrack(value: Window => Unit): Self = StObject.set(x, "shimOnTrack", js.Any.fromFunction1(value))
      
      inline def setShimPeerConnection(value: Window => Unit): Self = StObject.set(x, "shimPeerConnection", js.Any.fromFunction1(value))
      
      inline def setShimSenderReceiverGetStats(value: Window => Unit): Self = StObject.set(x, "shimSenderReceiverGetStats", js.Any.fromFunction1(value))
    }
  }
  
  trait ICommonShim extends StObject {
    
    def removeAllowExtmapMixed(window: Window): Unit
    
    def shimConnectionState(window: Window): Unit
    
    def shimMaxMessageSize(window: Window): Unit
    
    def shimRTCIceCandidate(window: Window): Unit
    
    def shimSendThrowTypeError(window: Window): Unit
  }
  object ICommonShim {
    
    inline def apply(
      removeAllowExtmapMixed: Window => Unit,
      shimConnectionState: Window => Unit,
      shimMaxMessageSize: Window => Unit,
      shimRTCIceCandidate: Window => Unit,
      shimSendThrowTypeError: Window => Unit
    ): ICommonShim = {
      val __obj = js.Dynamic.literal(removeAllowExtmapMixed = js.Any.fromFunction1(removeAllowExtmapMixed), shimConnectionState = js.Any.fromFunction1(shimConnectionState), shimMaxMessageSize = js.Any.fromFunction1(shimMaxMessageSize), shimRTCIceCandidate = js.Any.fromFunction1(shimRTCIceCandidate), shimSendThrowTypeError = js.Any.fromFunction1(shimSendThrowTypeError))
      __obj.asInstanceOf[ICommonShim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICommonShim] (val x: Self) extends AnyVal {
      
      inline def setRemoveAllowExtmapMixed(value: Window => Unit): Self = StObject.set(x, "removeAllowExtmapMixed", js.Any.fromFunction1(value))
      
      inline def setShimConnectionState(value: Window => Unit): Self = StObject.set(x, "shimConnectionState", js.Any.fromFunction1(value))
      
      inline def setShimMaxMessageSize(value: Window => Unit): Self = StObject.set(x, "shimMaxMessageSize", js.Any.fromFunction1(value))
      
      inline def setShimRTCIceCandidate(value: Window => Unit): Self = StObject.set(x, "shimRTCIceCandidate", js.Any.fromFunction1(value))
      
      inline def setShimSendThrowTypeError(value: Window => Unit): Self = StObject.set(x, "shimSendThrowTypeError", js.Any.fromFunction1(value))
    }
  }
  
  trait IFirefoxShim extends StObject {
    
    def shimOnTrack(window: Window): Unit
    
    def shimPeerConnection(window: Window): Unit
    
    def shimRTCDataChannel(window: Window): Unit
    
    def shimReceiverGetStats(window: Window): Unit
    
    def shimRemoveStream(window: Window): Unit
    
    def shimSenderGetStats(window: Window): Unit
  }
  object IFirefoxShim {
    
    inline def apply(
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFirefoxShim] (val x: Self) extends AnyVal {
      
      inline def setShimOnTrack(value: Window => Unit): Self = StObject.set(x, "shimOnTrack", js.Any.fromFunction1(value))
      
      inline def setShimPeerConnection(value: Window => Unit): Self = StObject.set(x, "shimPeerConnection", js.Any.fromFunction1(value))
      
      inline def setShimRTCDataChannel(value: Window => Unit): Self = StObject.set(x, "shimRTCDataChannel", js.Any.fromFunction1(value))
      
      inline def setShimReceiverGetStats(value: Window => Unit): Self = StObject.set(x, "shimReceiverGetStats", js.Any.fromFunction1(value))
      
      inline def setShimRemoveStream(value: Window => Unit): Self = StObject.set(x, "shimRemoveStream", js.Any.fromFunction1(value))
      
      inline def setShimSenderGetStats(value: Window => Unit): Self = StObject.set(x, "shimSenderGetStats", js.Any.fromFunction1(value))
    }
  }
  
  trait ISafariShim extends StObject {
    
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ISafariShim] (val x: Self) extends AnyVal {
      
      inline def setShimCallbacksAPI(value: Window => Unit): Self = StObject.set(x, "shimCallbacksAPI", js.Any.fromFunction1(value))
      
      inline def setShimConstraints(value: MediaStreamConstraints => Unit): Self = StObject.set(x, "shimConstraints", js.Any.fromFunction1(value))
      
      inline def setShimCreateOfferLegacy(value: Window => Unit): Self = StObject.set(x, "shimCreateOfferLegacy", js.Any.fromFunction1(value))
      
      inline def setShimGetUserMedia(value: Window => Unit): Self = StObject.set(x, "shimGetUserMedia", js.Any.fromFunction1(value))
      
      inline def setShimLocalStreamsAPI(value: Window => Unit): Self = StObject.set(x, "shimLocalStreamsAPI", js.Any.fromFunction1(value))
      
      inline def setShimRTCIceServerUrls(value: Window => Unit): Self = StObject.set(x, "shimRTCIceServerUrls", js.Any.fromFunction1(value))
      
      inline def setShimRemoteStreamsAPI(value: Window => Unit): Self = StObject.set(x, "shimRemoteStreamsAPI", js.Any.fromFunction1(value))
      
      inline def setShimTrackEventTransceiver(value: Window => Unit): Self = StObject.set(x, "shimTrackEventTransceiver", js.Any.fromFunction1(value))
    }
  }
  
  type _To = IAdapter
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IAdapter = default
}
