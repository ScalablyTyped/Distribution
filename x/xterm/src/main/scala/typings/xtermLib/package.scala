package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xtermLib {
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AlignSetting = xtermLib.xtermLibStrings.start | xtermLib.xtermLibStrings.center | xtermLib.xtermLibStrings.end | xtermLib.xtermLibStrings.left | xtermLib.xtermLibStrings.right
  type AnimationPlayState = xtermLib.xtermLibStrings.idle | xtermLib.xtermLibStrings.running | xtermLib.xtermLibStrings.paused | xtermLib.xtermLibStrings.finished
  type AppendMode = xtermLib.xtermLibStrings.segments | xtermLib.xtermLibStrings.sequence
  type AudioContextLatencyCategory = xtermLib.xtermLibStrings.balanced | xtermLib.xtermLibStrings.interactive | xtermLib.xtermLibStrings.playback
  type AudioContextState = xtermLib.xtermLibStrings.suspended | xtermLib.xtermLibStrings.running | xtermLib.xtermLibStrings.closed
  type AudioWorklet = Worklet
  type AutoKeyword = xtermLib.xtermLibStrings.auto
  type AutomationRate = xtermLib.xtermLibStrings.`a-rate` | xtermLib.xtermLibStrings.`k-rate`
  type BigInteger = stdLib.Uint8Array
  type BinaryType = xtermLib.xtermLibStrings.blob | xtermLib.xtermLibStrings.arraybuffer
  type BiquadFilterType = xtermLib.xtermLibStrings.lowpass | xtermLib.xtermLibStrings.highpass | xtermLib.xtermLibStrings.bandpass | xtermLib.xtermLibStrings.lowshelf | xtermLib.xtermLibStrings.highshelf | xtermLib.xtermLibStrings.peaking | xtermLib.xtermLibStrings.notch | xtermLib.xtermLibStrings.allpass
  type BlobCallback = js.Function1[/* blob */ Blob | scala.Null, scala.Unit]
  type BlobPart = BufferSource | Blob | java.lang.String
  type BodyInit = Blob | BufferSource | FormData | URLSearchParams | ReadableStream[stdLib.Uint8Array] | java.lang.String
  type BufferSource = stdLib.ArrayBufferView | stdLib.ArrayBuffer
  type CDATASection = Text
  type CSSSupportsRule = CSSConditionRule
  type CanPlayTypeResult = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.maybe | xtermLib.xtermLibStrings.probably
  type CanvasDirection = xtermLib.xtermLibStrings.ltr | xtermLib.xtermLibStrings.rtl | xtermLib.xtermLibStrings.inherit
  type CanvasFillRule = xtermLib.xtermLibStrings.nonzero | xtermLib.xtermLibStrings.evenodd
  type CanvasImageSource = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap
  type CanvasLineCap = xtermLib.xtermLibStrings.butt | xtermLib.xtermLibStrings.round | xtermLib.xtermLibStrings.square
  type CanvasLineJoin = xtermLib.xtermLibStrings.round | xtermLib.xtermLibStrings.bevel | xtermLib.xtermLibStrings.miter
  type CanvasTextAlign = xtermLib.xtermLibStrings.start | xtermLib.xtermLibStrings.end | xtermLib.xtermLibStrings.left | xtermLib.xtermLibStrings.right | xtermLib.xtermLibStrings.center
  type CanvasTextBaseline = xtermLib.xtermLibStrings.top | xtermLib.xtermLibStrings.hanging | xtermLib.xtermLibStrings.middle | xtermLib.xtermLibStrings.alphabetic | xtermLib.xtermLibStrings.ideographic | xtermLib.xtermLibStrings.bottom
  type ChannelCountMode = xtermLib.xtermLibStrings.max | xtermLib.xtermLibStrings.`clamped-max` | xtermLib.xtermLibStrings.explicit
  type ChannelInterpretation = xtermLib.xtermLibStrings.speakers | xtermLib.xtermLibStrings.discrete
  type ChannelMergerNode = AudioNode
  type ChannelSplitterNode = AudioNode
  type ClientTypes = xtermLib.xtermLibStrings.window | xtermLib.xtermLibStrings.worker | xtermLib.xtermLibStrings.sharedworker | xtermLib.xtermLibStrings.all
  type Comment = CharacterData
  type CompositeOperation = xtermLib.xtermLibStrings.replace | xtermLib.xtermLibStrings.add | xtermLib.xtermLibStrings.accumulate
  type CompositeOperationOrAuto = xtermLib.xtermLibStrings.replace | xtermLib.xtermLibStrings.add | xtermLib.xtermLibStrings.accumulate | xtermLib.xtermLibStrings.auto
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | ConstrainDoubleRange
  type ConstrainLong = scala.Double | ConstrainLongRange
  type DOMHighResTimeStamp = scala.Double
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, scala.Unit]
  type DirectionSetting = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.rl | xtermLib.xtermLibStrings.lr
  type DisplayCaptureSurfaceType = xtermLib.xtermLibStrings.monitor | xtermLib.xtermLibStrings.window | xtermLib.xtermLibStrings.application | xtermLib.xtermLibStrings.browser
  type DistanceModelType = xtermLib.xtermLibStrings.linear | xtermLib.xtermLibStrings.inverse | xtermLib.xtermLibStrings.exponential
  type DocumentReadyState = xtermLib.xtermLibStrings.loading | xtermLib.xtermLibStrings.interactive | xtermLib.xtermLibStrings.complete
  type DocumentTimeline = AnimationTimeline
  type EndOfStreamError = xtermLib.xtermLibStrings.network | xtermLib.xtermLibStrings.decode
  type EndingType = xtermLib.xtermLibStrings.transparent | xtermLib.xtermLibStrings.native
  type ErrorEventHandler = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* fileno */ js.UndefOr[scala.Double], 
    /* columnNumber */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[stdLib.Error], 
    scala.Unit
  ]
  type EventHandlerNonNull = js.Function1[/* event */ Event, js.Any]
  type EventListener = js.Function1[/* evt */ Event, scala.Unit]
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  type FillMode = xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.forwards | xtermLib.xtermLibStrings.backwards | xtermLib.xtermLibStrings.both | xtermLib.xtermLibStrings.auto
  type Float32List = stdLib.Float32Array | js.Array[GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | scala.Null, 
    /* status */ MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GamepadHand = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.left | xtermLib.xtermLibStrings.right
  type GamepadHapticActuatorType = xtermLib.xtermLibStrings.vibration
  type GamepadInputEmulationType = xtermLib.xtermLibStrings.mouse | xtermLib.xtermLibStrings.keyboard | xtermLib.xtermLibStrings.gamepad
  type GamepadMappingType = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.standard
  type HTMLOrSVGImageElement = HTMLImageElement | SVGImageElement
  type HTMLOrSVGScriptElement = HTMLScriptElement | SVGScriptElement
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | (stdLib.Record[java.lang.String, java.lang.String])
  type IDBCursorDirection = xtermLib.xtermLibStrings.next | xtermLib.xtermLibStrings.nextunique | xtermLib.xtermLibStrings.prev | xtermLib.xtermLibStrings.prevunique
  type IDBKeyPath = java.lang.String
  type IDBRequestReadyState = xtermLib.xtermLibStrings.pending | xtermLib.xtermLibStrings.done
  type IDBTransactionMode = xtermLib.xtermLibStrings.readonly | xtermLib.xtermLibStrings.readwrite | xtermLib.xtermLibStrings.versionchange
  type IDBValidKey = scala.Double | java.lang.String | stdLib.Date | BufferSource | IDBArrayKey
  type ImageBitmapSource = CanvasImageSource | Blob | ImageData
  type ImageSmoothingQuality = xtermLib.xtermLibStrings.low | xtermLib.xtermLibStrings.medium | xtermLib.xtermLibStrings.high
  type InsertPosition = xtermLib.xtermLibStrings.beforebegin | xtermLib.xtermLibStrings.afterbegin | xtermLib.xtermLibStrings.beforeend | xtermLib.xtermLibStrings.afterend
  type Int32List = stdLib.Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    scala.Unit
  ]
  type IterationCompositeOperation = xtermLib.xtermLibStrings.replace | xtermLib.xtermLibStrings.accumulate
  type KeyFormat = xtermLib.xtermLibStrings.raw | xtermLib.xtermLibStrings.spki | xtermLib.xtermLibStrings.pkcs8 | xtermLib.xtermLibStrings.jwk
  type KeyType = xtermLib.xtermLibStrings.public | xtermLib.xtermLibStrings.`private` | xtermLib.xtermLibStrings.secret
  type KeyUsage = xtermLib.xtermLibStrings.encrypt | xtermLib.xtermLibStrings.decrypt | xtermLib.xtermLibStrings.sign | xtermLib.xtermLibStrings.verify | xtermLib.xtermLibStrings.deriveKey | xtermLib.xtermLibStrings.deriveBits | xtermLib.xtermLibStrings.wrapKey | xtermLib.xtermLibStrings.unwrapKey
  type LineAlignSetting = xtermLib.xtermLibStrings.start | xtermLib.xtermLibStrings.center | xtermLib.xtermLibStrings.end
  type LineAndPositionSetting = scala.Double | AutoKeyword
  type ListeningState = xtermLib.xtermLibStrings.inactive | xtermLib.xtermLibStrings.active | xtermLib.xtermLibStrings.disambiguation
  type MSCredentialType = xtermLib.xtermLibStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MSTransportType = xtermLib.xtermLibStrings.Embedded | xtermLib.xtermLibStrings.USB | xtermLib.xtermLibStrings.NFC | xtermLib.xtermLibStrings.BT
  type MSWebViewPermissionState = xtermLib.xtermLibStrings.unknown | xtermLib.xtermLibStrings.defer | xtermLib.xtermLibStrings.allow | xtermLib.xtermLibStrings.deny
  type MSWebViewPermissionType = xtermLib.xtermLibStrings.geolocation | xtermLib.xtermLibStrings.unlimitedIndexedDBQuota | xtermLib.xtermLibStrings.media | xtermLib.xtermLibStrings.pointerlock | xtermLib.xtermLibStrings.webnotifications
  type MediaDeviceKind = xtermLib.xtermLibStrings.audioinput | xtermLib.xtermLibStrings.audiooutput | xtermLib.xtermLibStrings.videoinput
  type MediaKeyMessageType = xtermLib.xtermLibStrings.`license-request` | xtermLib.xtermLibStrings.`license-renewal` | xtermLib.xtermLibStrings.`license-release` | xtermLib.xtermLibStrings.`individualization-request`
  type MediaKeySessionType = xtermLib.xtermLibStrings.temporary | xtermLib.xtermLibStrings.`persistent-license` | xtermLib.xtermLibStrings.`persistent-release-message`
  type MediaKeyStatus = xtermLib.xtermLibStrings.usable | xtermLib.xtermLibStrings.expired | xtermLib.xtermLibStrings.`output-downscaled` | xtermLib.xtermLibStrings.`output-not-allowed` | xtermLib.xtermLibStrings.`status-pending` | xtermLib.xtermLibStrings.`internal-error`
  type MediaKeysRequirement = xtermLib.xtermLibStrings.required | xtermLib.xtermLibStrings.optional | xtermLib.xtermLibStrings.`not-allowed`
  type MediaStreamTrackAudioSourceNode = AudioNode
  type MediaStreamTrackState = xtermLib.xtermLibStrings.live | xtermLib.xtermLibStrings.ended
  type MessageEventSource = WindowProxy | MessagePort | ServiceWorker
  /** @deprecated */
  type MouseWheelEvent = WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[MutationRecord], 
    /* observer */ MutationObserver, 
    scala.Unit
  ]
  type MutationRecordType = xtermLib.xtermLibStrings.attributes | xtermLib.xtermLibStrings.characterData | xtermLib.xtermLibStrings.childList
  type NamedCurve = java.lang.String
  type NavigationReason = xtermLib.xtermLibStrings.up | xtermLib.xtermLibStrings.down | xtermLib.xtermLibStrings.left | xtermLib.xtermLibStrings.right
  type NavigationType = xtermLib.xtermLibStrings.navigate | xtermLib.xtermLibStrings.reload | xtermLib.xtermLibStrings.back_forward | xtermLib.xtermLibStrings.prerender
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, scala.Unit]
  type NotificationDirection = xtermLib.xtermLibStrings.auto | xtermLib.xtermLibStrings.ltr | xtermLib.xtermLibStrings.rtl
  type NotificationPermission = xtermLib.xtermLibStrings.default | xtermLib.xtermLibStrings.denied | xtermLib.xtermLibStrings.granted
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, scala.Unit]
  type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | scala.Null]
  type OnErrorEventHandler = OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Any], 
    js.Any
  ]
  type OrientationLockType = xtermLib.xtermLibStrings.any | xtermLib.xtermLibStrings.natural | xtermLib.xtermLibStrings.landscape | xtermLib.xtermLibStrings.portrait | xtermLib.xtermLibStrings.`portrait-primary` | xtermLib.xtermLibStrings.`portrait-secondary` | xtermLib.xtermLibStrings.`landscape-primary` | xtermLib.xtermLibStrings.`landscape-secondary`
  type OrientationType = xtermLib.xtermLibStrings.`portrait-primary` | xtermLib.xtermLibStrings.`portrait-secondary` | xtermLib.xtermLibStrings.`landscape-primary` | xtermLib.xtermLibStrings.`landscape-secondary`
  type OscillatorType = xtermLib.xtermLibStrings.sine | xtermLib.xtermLibStrings.square | xtermLib.xtermLibStrings.sawtooth | xtermLib.xtermLibStrings.triangle | xtermLib.xtermLibStrings.custom
  type OverSampleType = xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.`2x` | xtermLib.xtermLibStrings.`4x`
  type PanningModelType = xtermLib.xtermLibStrings.equalpower | xtermLib.xtermLibStrings.HRTF
  type PaymentComplete = xtermLib.xtermLibStrings.success | xtermLib.xtermLibStrings.fail | xtermLib.xtermLibStrings.unknown
  type PaymentRequestUpdateEventInit = EventInit
  type PaymentShippingType = xtermLib.xtermLibStrings.shipping | xtermLib.xtermLibStrings.delivery | xtermLib.xtermLibStrings.pickup
  type PerformanceEntryList = js.Array[PerformanceEntry]
  type PerformanceMark = PerformanceEntry
  type PerformanceMeasure = PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ PerformanceObserverEntryList, 
    /* observer */ PerformanceObserver, 
    scala.Unit
  ]
  type PlaybackDirection = xtermLib.xtermLibStrings.normal | xtermLib.xtermLibStrings.reverse | xtermLib.xtermLibStrings.alternate | xtermLib.xtermLibStrings.`alternate-reverse`
  type PositionAlignSetting = xtermLib.xtermLibStrings.`line-left` | xtermLib.xtermLibStrings.center | xtermLib.xtermLibStrings.`line-right` | xtermLib.xtermLibStrings.auto
  type PositionCallback = js.Function1[/* position */ Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ PositionError, scala.Unit]
  type PushEncryptionKeyName = xtermLib.xtermLibStrings.p256dh | xtermLib.xtermLibStrings.auth
  type PushPermissionState = xtermLib.xtermLibStrings.denied | xtermLib.xtermLibStrings.granted | xtermLib.xtermLibStrings.prompt
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCBundlePolicy = xtermLib.xtermLibStrings.balanced | xtermLib.xtermLibStrings.`max-compat` | xtermLib.xtermLibStrings.`max-bundle`
  type RTCDataChannelState = xtermLib.xtermLibStrings.connecting | xtermLib.xtermLibStrings.open | xtermLib.xtermLibStrings.closing | xtermLib.xtermLibStrings.closed
  type RTCDegradationPreference = xtermLib.xtermLibStrings.`maintain-framerate` | xtermLib.xtermLibStrings.`maintain-resolution` | xtermLib.xtermLibStrings.balanced
  type RTCDtlsRole = xtermLib.xtermLibStrings.auto | xtermLib.xtermLibStrings.client | xtermLib.xtermLibStrings.server
  type RTCDtlsTransportState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.connecting | xtermLib.xtermLibStrings.connected | xtermLib.xtermLibStrings.closed | xtermLib.xtermLibStrings.failed
  type RTCDtxStatus = xtermLib.xtermLibStrings.disabled | xtermLib.xtermLibStrings.enabled
  type RTCErrorDetailType = xtermLib.xtermLibStrings.`data-channel-failure` | xtermLib.xtermLibStrings.`dtls-failure` | xtermLib.xtermLibStrings.`fingerprint-failure` | xtermLib.xtermLibStrings.`idp-bad-script-failure` | xtermLib.xtermLibStrings.`idp-execution-failure` | xtermLib.xtermLibStrings.`idp-load-failure` | xtermLib.xtermLibStrings.`idp-need-login` | xtermLib.xtermLibStrings.`idp-timeout` | xtermLib.xtermLibStrings.`idp-tls-failure` | xtermLib.xtermLibStrings.`idp-token-expired` | xtermLib.xtermLibStrings.`idp-token-invalid` | xtermLib.xtermLibStrings.`sctp-failure` | xtermLib.xtermLibStrings.`sdp-syntax-error` | xtermLib.xtermLibStrings.`hardware-encoder-not-available` | xtermLib.xtermLibStrings.`hardware-encoder-error`
  type RTCIceCandidateType = xtermLib.xtermLibStrings.host | xtermLib.xtermLibStrings.srflx | xtermLib.xtermLibStrings.prflx | xtermLib.xtermLibStrings.relay
  type RTCIceComponent = xtermLib.xtermLibStrings.rtp | xtermLib.xtermLibStrings.rtcp
  type RTCIceConnectionState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.checking | xtermLib.xtermLibStrings.connected | xtermLib.xtermLibStrings.completed | xtermLib.xtermLibStrings.disconnected | xtermLib.xtermLibStrings.failed | xtermLib.xtermLibStrings.closed
  type RTCIceCredentialType = xtermLib.xtermLibStrings.password | xtermLib.xtermLibStrings.oauth
  type RTCIceGatherCandidate = RTCIceCandidateDictionary | RTCIceCandidateComplete
  type RTCIceGatherPolicy = xtermLib.xtermLibStrings.all | xtermLib.xtermLibStrings.nohost | xtermLib.xtermLibStrings.relay
  type RTCIceGathererState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.gathering | xtermLib.xtermLibStrings.complete
  type RTCIceGatheringState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.gathering | xtermLib.xtermLibStrings.complete
  type RTCIceProtocol = xtermLib.xtermLibStrings.udp | xtermLib.xtermLibStrings.tcp
  type RTCIceRole = xtermLib.xtermLibStrings.controlling | xtermLib.xtermLibStrings.controlled
  type RTCIceTcpCandidateType = xtermLib.xtermLibStrings.active | xtermLib.xtermLibStrings.passive | xtermLib.xtermLibStrings.so
  type RTCIceTransportPolicy = xtermLib.xtermLibStrings.relay | xtermLib.xtermLibStrings.all
  type RTCIceTransportState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.checking | xtermLib.xtermLibStrings.connected | xtermLib.xtermLibStrings.completed | xtermLib.xtermLibStrings.disconnected | xtermLib.xtermLibStrings.failed | xtermLib.xtermLibStrings.closed
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type RTCPeerConnectionState = xtermLib.xtermLibStrings.`new` | xtermLib.xtermLibStrings.connecting | xtermLib.xtermLibStrings.connected | xtermLib.xtermLibStrings.disconnected | xtermLib.xtermLibStrings.failed | xtermLib.xtermLibStrings.closed
  type RTCPriorityType = xtermLib.xtermLibStrings.`very-low` | xtermLib.xtermLibStrings.low | xtermLib.xtermLibStrings.medium | xtermLib.xtermLibStrings.high
  type RTCRtcpMuxPolicy = xtermLib.xtermLibStrings.negotiate | xtermLib.xtermLibStrings.require
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCRtpTransceiverDirection = xtermLib.xtermLibStrings.sendrecv | xtermLib.xtermLibStrings.sendonly | xtermLib.xtermLibStrings.recvonly | xtermLib.xtermLibStrings.inactive
  type RTCSctpTransportState = xtermLib.xtermLibStrings.connecting | xtermLib.xtermLibStrings.connected | xtermLib.xtermLibStrings.closed
  type RTCSdpType = xtermLib.xtermLibStrings.offer | xtermLib.xtermLibStrings.pranswer | xtermLib.xtermLibStrings.answer | xtermLib.xtermLibStrings.rollback
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, scala.Unit]
  type RTCSignalingState = xtermLib.xtermLibStrings.stable | xtermLib.xtermLibStrings.`have-local-offer` | xtermLib.xtermLibStrings.`have-remote-offer` | xtermLib.xtermLibStrings.`have-local-pranswer` | xtermLib.xtermLibStrings.`have-remote-pranswer` | xtermLib.xtermLibStrings.closed
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, scala.Unit]
  type RTCStatsIceCandidatePairState = xtermLib.xtermLibStrings.frozen | xtermLib.xtermLibStrings.waiting | xtermLib.xtermLibStrings.inprogress | xtermLib.xtermLibStrings.failed | xtermLib.xtermLibStrings.succeeded | xtermLib.xtermLibStrings.cancelled
  type RTCStatsIceCandidateType = xtermLib.xtermLibStrings.host | xtermLib.xtermLibStrings.serverreflexive | xtermLib.xtermLibStrings.peerreflexive | xtermLib.xtermLibStrings.relayed
  type RTCStatsType = xtermLib.xtermLibStrings.inboundrtp | xtermLib.xtermLibStrings.outboundrtp | xtermLib.xtermLibStrings.session | xtermLib.xtermLibStrings.datachannel | xtermLib.xtermLibStrings.track | xtermLib.xtermLibStrings.transport | xtermLib.xtermLibStrings.candidatepair | xtermLib.xtermLibStrings.localcandidate | xtermLib.xtermLibStrings.remotecandidate
  type RTCTransport = RTCDtlsTransport | RTCSrtpSdesTransport
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type ReadyState = xtermLib.xtermLibStrings.closed | xtermLib.xtermLibStrings.open | xtermLib.xtermLibStrings.ended
  type ReferrerPolicy = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.`no-referrer` | xtermLib.xtermLibStrings.`no-referrer-when-downgrade` | xtermLib.xtermLibStrings.`origin-only` | xtermLib.xtermLibStrings.`origin-when-cross-origin` | xtermLib.xtermLibStrings.`unsafe-url`
  type RenderingContext = CanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext
  type RequestCache = xtermLib.xtermLibStrings.default | xtermLib.xtermLibStrings.`no-store` | xtermLib.xtermLibStrings.reload | xtermLib.xtermLibStrings.`no-cache` | xtermLib.xtermLibStrings.`force-cache` | xtermLib.xtermLibStrings.`only-if-cached`
  type RequestCredentials = xtermLib.xtermLibStrings.omit | xtermLib.xtermLibStrings.`same-origin` | xtermLib.xtermLibStrings.include
  type RequestDestination = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.audio | xtermLib.xtermLibStrings.audioworklet | xtermLib.xtermLibStrings.document | xtermLib.xtermLibStrings.embed | xtermLib.xtermLibStrings.font | xtermLib.xtermLibStrings.image | xtermLib.xtermLibStrings.manifest | xtermLib.xtermLibStrings.`object` | xtermLib.xtermLibStrings.paintworklet | xtermLib.xtermLibStrings.report | xtermLib.xtermLibStrings.script | xtermLib.xtermLibStrings.sharedworker | xtermLib.xtermLibStrings.style | xtermLib.xtermLibStrings.track | xtermLib.xtermLibStrings.video | xtermLib.xtermLibStrings.worker | xtermLib.xtermLibStrings.xslt
  type RequestInfo = Request | java.lang.String
  type RequestMode = xtermLib.xtermLibStrings.navigate | xtermLib.xtermLibStrings.`same-origin` | xtermLib.xtermLibStrings.`no-cors` | xtermLib.xtermLibStrings.cors
  type RequestRedirect = xtermLib.xtermLibStrings.follow | xtermLib.xtermLibStrings.error | xtermLib.xtermLibStrings.manual
  type ResponseType = xtermLib.xtermLibStrings.basic | xtermLib.xtermLibStrings.cors | xtermLib.xtermLibStrings.default | xtermLib.xtermLibStrings.error | xtermLib.xtermLibStrings.opaque | xtermLib.xtermLibStrings.opaqueredirect
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = xtermLib.xtermLibStrings.ScopedCred
  type ScrollBehavior = xtermLib.xtermLibStrings.auto | xtermLib.xtermLibStrings.smooth
  type ScrollLogicalPosition = xtermLib.xtermLibStrings.start | xtermLib.xtermLibStrings.center | xtermLib.xtermLibStrings.end | xtermLib.xtermLibStrings.nearest
  type ScrollRestoration = xtermLib.xtermLibStrings.auto | xtermLib.xtermLibStrings.manual
  type ScrollSetting = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.up
  type SelectionMode = xtermLib.xtermLibStrings.select | xtermLib.xtermLibStrings.start | xtermLib.xtermLibStrings.end | xtermLib.xtermLibStrings.preserve
  type ServiceWorkerState = xtermLib.xtermLibStrings.installing | xtermLib.xtermLibStrings.installed | xtermLib.xtermLibStrings.activating | xtermLib.xtermLibStrings.activated | xtermLib.xtermLibStrings.redundant
  type ServiceWorkerUpdateViaCache = xtermLib.xtermLibStrings.imports | xtermLib.xtermLibStrings.all | xtermLib.xtermLibStrings.none
  type ShadowRootMode = xtermLib.xtermLibStrings.open | xtermLib.xtermLibStrings.closed
  type SpeechRecognitionErrorCode = xtermLib.xtermLibStrings.`no-speech` | xtermLib.xtermLibStrings.aborted | xtermLib.xtermLibStrings.`audio-capture` | xtermLib.xtermLibStrings.network | xtermLib.xtermLibStrings.`not-allowed` | xtermLib.xtermLibStrings.`service-not-allowed` | xtermLib.xtermLibStrings.`bad-grammar` | xtermLib.xtermLibStrings.`language-not-supported`
  type SpeechSynthesisErrorCode = xtermLib.xtermLibStrings.canceled | xtermLib.xtermLibStrings.interrupted | xtermLib.xtermLibStrings.`audio-busy` | xtermLib.xtermLibStrings.`audio-hardware` | xtermLib.xtermLibStrings.network | xtermLib.xtermLibStrings.`synthesis-unavailable` | xtermLib.xtermLibStrings.`synthesis-failed` | xtermLib.xtermLibStrings.`language-unavailable` | xtermLib.xtermLibStrings.`voice-unavailable` | xtermLib.xtermLibStrings.`text-too-long` | xtermLib.xtermLibStrings.`invalid-argument`
  type StaticRange = AbstractRange
  type SupportedType = xtermLib.xtermLibStrings.`text/html` | xtermLib.xtermLibStrings.`text/xml` | xtermLib.xtermLibStrings.`application/xml` | xtermLib.xtermLibStrings.`application/xhtml+xml` | xtermLib.xtermLibStrings.`image/svg+xml`
  type TexImageSource = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
  type TextTrackKind = xtermLib.xtermLibStrings.subtitles | xtermLib.xtermLibStrings.captions | xtermLib.xtermLibStrings.descriptions | xtermLib.xtermLibStrings.chapters | xtermLib.xtermLibStrings.metadata
  type TextTrackMode = xtermLib.xtermLibStrings.disabled | xtermLib.xtermLibStrings.hidden | xtermLib.xtermLibStrings.showing
  type TimerHandler = java.lang.String | js.Function
  type TouchType = xtermLib.xtermLibStrings.direct | xtermLib.xtermLibStrings.stylus
  type Transferable = stdLib.ArrayBuffer | MessagePort | ImageBitmap
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type Transport = xtermLib.xtermLibStrings.usb | xtermLib.xtermLibStrings.nfc | xtermLib.xtermLibStrings.ble
  type VRDisplayEventReason = xtermLib.xtermLibStrings.mounted | xtermLib.xtermLibStrings.navigation | xtermLib.xtermLibStrings.requested | xtermLib.xtermLibStrings.unmounted
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VideoFacingModeEnum = xtermLib.xtermLibStrings.user | xtermLib.xtermLibStrings.environment | xtermLib.xtermLibStrings.left | xtermLib.xtermLibStrings.right
  type VisibilityState = xtermLib.xtermLibStrings.hidden | xtermLib.xtermLibStrings.visible | xtermLib.xtermLibStrings.prerender
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = WebGLObject
  type WebGLFramebuffer = WebGLObject
  type WebGLPowerPreference = xtermLib.xtermLibStrings.default | xtermLib.xtermLibStrings.`low-power` | xtermLib.xtermLibStrings.`high-performance`
  type WebGLProgram = WebGLObject
  type WebGLRenderbuffer = WebGLObject
  type WebGLRenderingContext = WebGLRenderingContextBase
  type WebGLShader = WebGLObject
  type WebGLTexture = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
  type WorkerType = xtermLib.xtermLibStrings.classic | xtermLib.xtermLibStrings.module
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type XMLHttpRequestResponseType = xtermLib.xtermLibStrings.Empty | xtermLib.xtermLibStrings.arraybuffer | xtermLib.xtermLibStrings.blob | xtermLib.xtermLibStrings.document | xtermLib.xtermLibStrings.json | xtermLib.xtermLibStrings.text
  type webkitURL = URL
}
