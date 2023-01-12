package typings.undici

import typings.node.NodeJS.ArrayBufferView
import typings.node.streamWebMod.ReadableStream
import typings.node.urlMod.URLSearchParams
import typings.node.urlMod.URL_
import typings.std.AbortSignal
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.IteratorResult
import typings.std.Record
import typings.undici.typesFormdataMod.FormData
import typings.undici.undiciStrings.half
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFetchMod {
  
  @JSImport("undici/types/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("undici/types/fetch", "Headers")
  @js.native
  open class Headers ()
    extends StObject
       with SpecIterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): SpecIterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* iterable */ this.type, Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* iterable */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): SpecIterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): SpecIterableIterator[String] = js.native
  }
  
  @JSImport("undici/types/fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with BodyMixin {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream[Any] | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    val cache: RequestCache = js.native
    
    val credentials: RequestCredentials = js.native
    
    val destination: RequestDestination = js.native
    
    val duplex: RequestDuplex = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    val integrity: String = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val keepalive: Boolean = js.native
    
    val method: String = js.native
    
    val mode: RequestMode = js.native
    
    val redirect: RequestRedirect = js.native
    
    val referrerPolicy: String = js.native
    
    val signal: AbortSignal = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val url: String = js.native
  }
  
  @JSImport("undici/types/fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with BodyMixin {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream[Any] | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val `type`: ResponseType = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("undici/types/fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def json(data: Any): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def json(data: Any, init: ResponseInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Response]
    
    inline def redirect(url: String, status: ResponseRedirectStatus): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def redirect(url: URL_, status: ResponseRedirectStatus): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  inline def fetch(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  type BodyInit = js.typedarray.ArrayBuffer | AsyncIterable[js.typedarray.Uint8Array] | Blob | FormData | js.Iterable[js.typedarray.Uint8Array] | ArrayBufferView | URLSearchParams | Null | String
  
  trait BodyMixin extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Blob]
    
    val body: ReadableStream[Any] | Null
    
    val bodyUsed: Boolean
    
    def formData(): js.Promise[FormData]
    
    def json(): js.Promise[Any]
    
    def text(): js.Promise[String]
  }
  object BodyMixin {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      json: () => js.Promise[Any],
      text: () => js.Promise[String]
    ): BodyMixin = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
      __obj.asInstanceOf[BodyMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyMixin] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: ReadableStream[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type HeadersInit = js.Array[js.Array[String]] | (Record[String, String | js.Array[String]]) | Headers
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings._empty
    - typings.undici.undiciStrings.`no-referrer`
    - typings.undici.undiciStrings.`no-referrer-when-downgrade`
    - typings.undici.undiciStrings.origin
    - typings.undici.undiciStrings.`origin-when-cross-origin`
    - typings.undici.undiciStrings.`same-origin`
    - typings.undici.undiciStrings.`strict-origin`
    - typings.undici.undiciStrings.`strict-origin-when-cross-origin`
    - typings.undici.undiciStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typings.undici.undiciStrings._empty = "".asInstanceOf[typings.undici.undiciStrings._empty]
    
    inline def `no-referrer`: typings.undici.undiciStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.undici.undiciStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typings.undici.undiciStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.undici.undiciStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typings.undici.undiciStrings.origin = "origin".asInstanceOf[typings.undici.undiciStrings.origin]
    
    inline def `origin-when-cross-origin`: typings.undici.undiciStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.undici.undiciStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typings.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typings.undici.undiciStrings.`same-origin`]
    
    inline def `strict-origin`: typings.undici.undiciStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.undici.undiciStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typings.undici.undiciStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.undici.undiciStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typings.undici.undiciStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.undici.undiciStrings.`unsafe-url`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.default
    - typings.undici.undiciStrings.`force-cache`
    - typings.undici.undiciStrings.`no-cache`
    - typings.undici.undiciStrings.`no-store`
    - typings.undici.undiciStrings.`only-if-cached`
    - typings.undici.undiciStrings.reload
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    inline def default: typings.undici.undiciStrings.default = "default".asInstanceOf[typings.undici.undiciStrings.default]
    
    inline def `force-cache`: typings.undici.undiciStrings.`force-cache` = "force-cache".asInstanceOf[typings.undici.undiciStrings.`force-cache`]
    
    inline def `no-cache`: typings.undici.undiciStrings.`no-cache` = "no-cache".asInstanceOf[typings.undici.undiciStrings.`no-cache`]
    
    inline def `no-store`: typings.undici.undiciStrings.`no-store` = "no-store".asInstanceOf[typings.undici.undiciStrings.`no-store`]
    
    inline def `only-if-cached`: typings.undici.undiciStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typings.undici.undiciStrings.`only-if-cached`]
    
    inline def reload: typings.undici.undiciStrings.reload = "reload".asInstanceOf[typings.undici.undiciStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.omit
    - typings.undici.undiciStrings.include
    - typings.undici.undiciStrings.`same-origin`
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    inline def include: typings.undici.undiciStrings.include = "include".asInstanceOf[typings.undici.undiciStrings.include]
    
    inline def omit: typings.undici.undiciStrings.omit = "omit".asInstanceOf[typings.undici.undiciStrings.omit]
    
    inline def `same-origin`: typings.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typings.undici.undiciStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings._empty
    - typings.undici.undiciStrings.audio
    - typings.undici.undiciStrings.audioworklet
    - typings.undici.undiciStrings.document
    - typings.undici.undiciStrings.embed
    - typings.undici.undiciStrings.font
    - typings.undici.undiciStrings.image
    - typings.undici.undiciStrings.manifest
    - typings.undici.undiciStrings.`object`
    - typings.undici.undiciStrings.paintworklet
    - typings.undici.undiciStrings.report
    - typings.undici.undiciStrings.script
    - typings.undici.undiciStrings.sharedworker
    - typings.undici.undiciStrings.style
    - typings.undici.undiciStrings.track
    - typings.undici.undiciStrings.video
    - typings.undici.undiciStrings.worker
    - typings.undici.undiciStrings.xslt
  */
  trait RequestDestination extends StObject
  object RequestDestination {
    
    inline def _empty: typings.undici.undiciStrings._empty = "".asInstanceOf[typings.undici.undiciStrings._empty]
    
    inline def audio: typings.undici.undiciStrings.audio = "audio".asInstanceOf[typings.undici.undiciStrings.audio]
    
    inline def audioworklet: typings.undici.undiciStrings.audioworklet = "audioworklet".asInstanceOf[typings.undici.undiciStrings.audioworklet]
    
    inline def document: typings.undici.undiciStrings.document = "document".asInstanceOf[typings.undici.undiciStrings.document]
    
    inline def embed: typings.undici.undiciStrings.embed = "embed".asInstanceOf[typings.undici.undiciStrings.embed]
    
    inline def font: typings.undici.undiciStrings.font = "font".asInstanceOf[typings.undici.undiciStrings.font]
    
    inline def image: typings.undici.undiciStrings.image = "image".asInstanceOf[typings.undici.undiciStrings.image]
    
    inline def manifest: typings.undici.undiciStrings.manifest = "manifest".asInstanceOf[typings.undici.undiciStrings.manifest]
    
    inline def `object`: typings.undici.undiciStrings.`object` = "object".asInstanceOf[typings.undici.undiciStrings.`object`]
    
    inline def paintworklet: typings.undici.undiciStrings.paintworklet = "paintworklet".asInstanceOf[typings.undici.undiciStrings.paintworklet]
    
    inline def report: typings.undici.undiciStrings.report = "report".asInstanceOf[typings.undici.undiciStrings.report]
    
    inline def script: typings.undici.undiciStrings.script = "script".asInstanceOf[typings.undici.undiciStrings.script]
    
    inline def sharedworker: typings.undici.undiciStrings.sharedworker = "sharedworker".asInstanceOf[typings.undici.undiciStrings.sharedworker]
    
    inline def style: typings.undici.undiciStrings.style = "style".asInstanceOf[typings.undici.undiciStrings.style]
    
    inline def track: typings.undici.undiciStrings.track = "track".asInstanceOf[typings.undici.undiciStrings.track]
    
    inline def video: typings.undici.undiciStrings.video = "video".asInstanceOf[typings.undici.undiciStrings.video]
    
    inline def worker: typings.undici.undiciStrings.worker = "worker".asInstanceOf[typings.undici.undiciStrings.worker]
    
    inline def xslt: typings.undici.undiciStrings.xslt = "xslt".asInstanceOf[typings.undici.undiciStrings.xslt]
  }
  
  type RequestDuplex = half
  
  type RequestInfo = String | URL_ | Request
  
  trait RequestInit extends StObject {
    
    var body: js.UndefOr[BodyInit] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var dispatcher: js.UndefOr[typings.undici.typesDispatcherMod.^] = js.undefined
    
    var duplex: js.UndefOr[RequestDuplex] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDispatcher(value: typings.undici.typesDispatcherMod.^): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setDuplex(value: RequestDuplex): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
      
      inline def setDuplexUndefined: Self = StObject.set(x, "duplex", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.cors
    - typings.undici.undiciStrings.navigate
    - typings.undici.undiciStrings.`no-cors`
    - typings.undici.undiciStrings.`same-origin`
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    inline def cors: typings.undici.undiciStrings.cors = "cors".asInstanceOf[typings.undici.undiciStrings.cors]
    
    inline def navigate: typings.undici.undiciStrings.navigate = "navigate".asInstanceOf[typings.undici.undiciStrings.navigate]
    
    inline def `no-cors`: typings.undici.undiciStrings.`no-cors` = "no-cors".asInstanceOf[typings.undici.undiciStrings.`no-cors`]
    
    inline def `same-origin`: typings.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typings.undici.undiciStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.error
    - typings.undici.undiciStrings.follow
    - typings.undici.undiciStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    inline def error: typings.undici.undiciStrings.error = "error".asInstanceOf[typings.undici.undiciStrings.error]
    
    inline def follow: typings.undici.undiciStrings.follow = "follow".asInstanceOf[typings.undici.undiciStrings.follow]
    
    inline def manual: typings.undici.undiciStrings.manual = "manual".asInstanceOf[typings.undici.undiciStrings.manual]
  }
  
  trait ResponseInit extends StObject {
    
    val headers: js.UndefOr[HeadersInit] = js.undefined
    
    val status: js.UndefOr[Double] = js.undefined
    
    val statusText: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciInts.`301`
    - typings.undici.undiciInts.`302`
    - typings.undici.undiciInts.`303`
    - typings.undici.undiciInts.`307`
    - typings.undici.undiciInts.`308`
  */
  trait ResponseRedirectStatus extends StObject
  object ResponseRedirectStatus {
    
    inline def `301`: typings.undici.undiciInts.`301` = 301.asInstanceOf[typings.undici.undiciInts.`301`]
    
    inline def `302`: typings.undici.undiciInts.`302` = 302.asInstanceOf[typings.undici.undiciInts.`302`]
    
    inline def `303`: typings.undici.undiciInts.`303` = 303.asInstanceOf[typings.undici.undiciInts.`303`]
    
    inline def `307`: typings.undici.undiciInts.`307` = 307.asInstanceOf[typings.undici.undiciInts.`307`]
    
    inline def `308`: typings.undici.undiciInts.`308` = 308.asInstanceOf[typings.undici.undiciInts.`308`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.undici.undiciStrings.basic
    - typings.undici.undiciStrings.cors
    - typings.undici.undiciStrings.default
    - typings.undici.undiciStrings.error
    - typings.undici.undiciStrings.opaque
    - typings.undici.undiciStrings.opaqueredirect
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def default: typings.undici.undiciStrings.default = "default".asInstanceOf[typings.undici.undiciStrings.default]
    
    inline def basic: typings.undici.undiciStrings.basic = "basic".asInstanceOf[typings.undici.undiciStrings.basic]
    
    inline def cors: typings.undici.undiciStrings.cors = "cors".asInstanceOf[typings.undici.undiciStrings.cors]
    
    inline def error: typings.undici.undiciStrings.error = "error".asInstanceOf[typings.undici.undiciStrings.error]
    
    inline def opaque: typings.undici.undiciStrings.opaque = "opaque".asInstanceOf[typings.undici.undiciStrings.opaque]
    
    inline def opaqueredirect: typings.undici.undiciStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typings.undici.undiciStrings.opaqueredirect]
  }
  
  @js.native
  trait SpecIterable[T] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[SpecIterator[T, Any, Unit]] = js.native
  }
  
  @js.native
  trait SpecIterableIterator[T]
    extends StObject
       with SpecIterator[T, Any, Unit] {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[SpecIterableIterator[T]] = js.native
  }
  
  @js.native
  trait SpecIterator[T, TReturn, TNext] extends StObject {
    
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [] | [TNext] is not an array type */ args: js.Array[Any | TNext]
    ): IteratorResult[T, TReturn] = js.native
  }
}
