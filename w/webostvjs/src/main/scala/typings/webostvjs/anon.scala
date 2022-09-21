package typings.webostvjs

import typings.std.Record
import typings.webostvjs.mod.DRMError
import typings.webostvjs.mod.DRMType_
import typings.webostvjs.mod.GetConnectionStatusParameters
import typings.webostvjs.mod.MediaOptionsAdaptiveStreaming
import typings.webostvjs.mod.MediaOptionsDrm
import typings.webostvjs.mod.MediaOptionsMediaFormat
import typings.webostvjs.mod.MediaOptionsTransmission
import typings.webostvjs.mod.OnCompleteFailureResponse
import typings.webostvjs.mod.OnCompleteSuccessResponse
import typings.webostvjs.webostvjsBooleans.`true`
import typings.webostvjs.webostvjsStrings.`2D`
import typings.webostvjs.webostvjsStrings.`frame-sequential`
import typings.webostvjs.webostvjsStrings.bottom_top
import typings.webostvjs.webostvjsStrings.check_board
import typings.webostvjs.webostvjsStrings.column_interleave
import typings.webostvjs.webostvjsStrings.field_alternative
import typings.webostvjs.webostvjsStrings.frame_packing
import typings.webostvjs.webostvjsStrings.line_alternative
import typings.webostvjs.webostvjsStrings.side_by_side_LR
import typings.webostvjs.webostvjsStrings.side_by_side_RL
import typings.webostvjs.webostvjsStrings.side_by_side_full_LR
import typings.webostvjs.webostvjsStrings.side_by_side_full_RL
import typings.webostvjs.webostvjsStrings.top_bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `3dMode` extends StObject {
    
    /**
      * 3D Mode Type
      */
    var `3dMode`: js.UndefOr[
        `2D` | top_bottom | bottom_top | side_by_side_LR | side_by_side_RL | check_board | `frame-sequential` | column_interleave | frame_packing | field_alternative | line_alternative | side_by_side_full_LR | side_by_side_full_RL
      ] = js.undefined
    
    /**
      * The object that holds information of network transmission status.
      */
    var adaptiveStreaming: js.UndefOr[MediaOptionsAdaptiveStreaming] = js.undefined
    
    /**
      * Object that holds DRM information.
      */
    var drm: js.UndefOr[MediaOptionsDrm] = js.undefined
    
    /**
      * The object that holds information of media format.
      */
    var mediaFormat: js.UndefOr[MediaOptionsMediaFormat] = js.undefined
    
    /**
      * The object that holds information of media content which is specific
      * by server type and transmission protocol.
      * This object is sent to the media pipeline.
      */
    var transmission: js.UndefOr[MediaOptionsTransmission] = js.undefined
  }
  object `3dMode` {
    
    inline def apply(): `3dMode` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`3dMode`]
    }
    
    extension [Self <: `3dMode`](x: Self) {
      
      inline def set3dMode(
        value: `2D` | top_bottom | bottom_top | side_by_side_LR | side_by_side_RL | check_board | `frame-sequential` | column_interleave | frame_packing | field_alternative | line_alternative | side_by_side_full_LR | side_by_side_full_RL
      ): Self = StObject.set(x, "3dMode", value.asInstanceOf[js.Any])
      
      inline def set3dModeUndefined: Self = StObject.set(x, "3dMode", js.undefined)
      
      inline def setAdaptiveStreaming(value: MediaOptionsAdaptiveStreaming): Self = StObject.set(x, "adaptiveStreaming", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveStreamingUndefined: Self = StObject.set(x, "adaptiveStreaming", js.undefined)
      
      inline def setDrm(value: MediaOptionsDrm): Self = StObject.set(x, "drm", value.asInstanceOf[js.Any])
      
      inline def setDrmUndefined: Self = StObject.set(x, "drm", js.undefined)
      
      inline def setMediaFormat(value: MediaOptionsMediaFormat): Self = StObject.set(x, "mediaFormat", value.asInstanceOf[js.Any])
      
      inline def setMediaFormatUndefined: Self = StObject.set(x, "mediaFormat", js.undefined)
      
      inline def setTransmission(value: MediaOptionsTransmission): Self = StObject.set(x, "transmission", value.asInstanceOf[js.Any])
      
      inline def setTransmissionUndefined: Self = StObject.set(x, "transmission", js.undefined)
    }
  }
  
  trait BROWSER extends StObject {
    
    /** The built-in browser on the webOS TV */
    var BROWSER: String
  }
  object BROWSER {
    
    inline def apply(BROWSER: String): BROWSER = {
      val __obj = js.Dynamic.literal(BROWSER = BROWSER.asInstanceOf[js.Any])
      __obj.asInstanceOf[BROWSER]
    }
    
    extension [Self <: BROWSER](x: Self) {
      
      inline def setBROWSER(value: String): Self = StObject.set(x, "BROWSER", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cancel[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */] extends StObject {
    
    /**
      * Cancels the service request and any associated subscription. No argument is required.
      */
    def cancel(): Unit
    
    /**
      * The callback function called when a request is complete (regardless of success or failure).
      */
    var onComplete: js.UndefOr[js.Function1[/* response */ TData | TError, Unit]] = js.undefined
    
    /**
      * The callback function called when the method fails.
      */
    var onFailure: js.UndefOr[js.Function1[/* error */ TError, Unit]] = js.undefined
    
    /**
      * The callback function called when the method succeeds.
      */
    var onSuccess: js.UndefOr[js.Function1[/* response */ TData, Unit]] = js.undefined
    
    /**
      * The JSON object of the request parameters to send.
      */
    var params: TParams
    
    /**
      * Indicates whether the request should resubscribe after a failure has occurred.
      * - true: resubscribed
      * - false: not resubscribed
      */
    var resubscribe: Boolean
    
    /**
      * Sends the request. It is automatically called on creation. No argument is required.
      */
    def send(): Unit
    
    /**
      * Indicates whether a subscription is desired for this request.
      * - true: subscribed
      * - false: not subscribed
      */
    var subscribe: Boolean
    
    /**
      * The full-service request URI, including method name.
      */
    var uri: String
  }
  object Cancel {
    
    inline def apply[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](
      cancel: () => Unit,
      params: TParams,
      resubscribe: Boolean,
      send: () => Unit,
      subscribe: Boolean,
      uri: String
    ): Cancel[TParams, TData, TError] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), params = params.asInstanceOf[js.Any], resubscribe = resubscribe.asInstanceOf[js.Any], send = js.Any.fromFunction0(send), subscribe = subscribe.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel[TParams, TData, TError]]
    }
    
    extension [Self <: Cancel[?, ?, ?], TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](x: Self & (Cancel[TParams, TData, TError])) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setOnComplete(value: /* response */ TData | TError => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnFailure(value: /* error */ TError => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOnSuccess(value: /* response */ TData => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setParams(value: TParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setResubscribe(value: Boolean): Self = StObject.set(x, "resubscribe", value.asInstanceOf[js.Any])
      
      inline def setSend(value: () => Unit): Self = StObject.set(x, "send", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    /** The error number from DRM service */
    var Error: DRMError
    
    /** The type of DRM */
    var Type: DRMType_
  }
  object Error {
    
    inline def apply(Error: DRMError, Type: DRMType_): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: DRMError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setType(value: DRMType_): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetStatus extends StObject {
    
    /**
      * Returns the network connection state.
      */
    def getStatus(parameters: GetConnectionStatusParameters): Unit
  }
  object GetStatus {
    
    inline def apply(getStatus: GetConnectionStatusParameters => Unit): GetStatus = {
      val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
      __obj.asInstanceOf[GetStatus]
    }
    
    extension [Self <: GetStatus](x: Self) {
      
      inline def setGetStatus(value: GetConnectionStatusParameters => Unit): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
    }
  }
  
  trait IsShowing extends StObject {
    
    /**
      * Checks whether the virtual keyboard is visible.
      *
      * @returns Indicates whether the virtual keyboard is displayed or hidden
      * - true: the virtual keyboard is displayed
      * - false: the virtual keyboard is hidden
      */
    def isShowing(): Boolean
  }
  object IsShowing {
    
    inline def apply(isShowing: () => Boolean): IsShowing = {
      val __obj = js.Dynamic.literal(isShowing = js.Any.fromFunction0(isShowing))
      __obj.asInstanceOf[IsShowing]
    }
    
    extension [Self <: IsShowing](x: Self) {
      
      inline def setIsShowing(value: () => Boolean): Self = StObject.set(x, "isShowing", js.Any.fromFunction0(value))
    }
  }
  
  trait Method[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */] extends StObject {
    
    /**
      * The service method being called.
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * The callback function called when a request is complete (regardless of success or failure).
      */
    var onComplete: js.UndefOr[js.Function1[/* response */ TData | TError, Unit]] = js.undefined
    
    /**
      * The callback function called when the method fails.
      */
    var onFailure: js.UndefOr[js.Function1[/* error */ TError, Unit]] = js.undefined
    
    /**
      * The callback function called when the method succeeds.
      */
    var onSuccess: js.UndefOr[js.Function1[/* response */ TData, Unit]] = js.undefined
    
    /**
      * The JSON object of the request parameters to send.
      */
    var parameters: js.UndefOr[TParams] = js.undefined
    
    /**
      * Indicates whether the request should resubscribe after a failure has occurred.
      * - true: Request the re-subscription.
      * - false: Not request the re-subscription.
      */
    var resubscribe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether a subscription is desired for this request.
      * - true: Request the subscription.
      * - false: Not request the subscription.
      */
    var subscribe: js.UndefOr[Boolean] = js.undefined
  }
  object Method {
    
    inline def apply[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](): Method[TParams, TData, TError] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Method[TParams, TData, TError]]
    }
    
    extension [Self <: Method[?, ?, ?], TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](x: Self & (Method[TParams, TData, TError])) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnComplete(value: /* response */ TData | TError => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnFailure(value: /* error */ TError => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOnSuccess(value: /* response */ TData => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setParameters(value: TParams): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setResubscribe(value: Boolean): Self = StObject.set(x, "resubscribe", value.asInstanceOf[js.Any])
      
      inline def setResubscribeUndefined: Self = StObject.set(x, "resubscribe", js.undefined)
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    /**
      * Creates and sends a service request to the system of the webOS TV
      *
      * @param uri
      * The service URI.
      * It accepts the normal service URI format, as well as the extended format with the service method included.
      *
      * @param parameters
      * Service request options.
      *
      * @returns Resulting request object. This object can be used to cancel subscriptions.
      */
    def request[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](uri: String): Cancel[TParams, TData, TError] = js.native
    def request[TParams /* <: Record[String, Any] */, TData /* <: OnCompleteSuccessResponse */, TError /* <: OnCompleteFailureResponse */](uri: String, parameters: Method[TParams, TData, TError]): Cancel[TParams, TData, TError] = js.native
  }
  
  trait SeperatedStream extends StObject {
    
    var seperatedStream: Boolean
  }
  object SeperatedStream {
    
    inline def apply(seperatedStream: Boolean): SeperatedStream = {
      val __obj = js.Dynamic.literal(seperatedStream = seperatedStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeperatedStream]
    }
    
    extension [Self <: SeperatedStream](x: Self) {
      
      inline def setSeperatedStream(value: Boolean): Self = StObject.set(x, "seperatedStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start extends StObject {
    
    /**
      * Starting speed of network transmission. (bps)
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object Start {
    
    inline def apply(): Start = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Tv extends StObject {
    
    /**
      * Indicate whether the platform identification is webOS TV.
      * If the platform identification is not webOS TV, undefined is returned.
      */
    var tv: js.UndefOr[`true`] = js.undefined
  }
  object Tv {
    
    inline def apply(): Tv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tv]
    }
    
    extension [Self <: Tv](x: Self) {
      
      inline def setTv(value: `true`): Self = StObject.set(x, "tv", value.asInstanceOf[js.Any])
      
      inline def setTvUndefined: Self = StObject.set(x, "tv", js.undefined)
    }
  }
}
