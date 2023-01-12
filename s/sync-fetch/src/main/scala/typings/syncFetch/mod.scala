package typings.syncFetch

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sync-fetch", JSImport.Namespace)
  @js.native
  val ^ : SyncFetch & typings.syncFetch.anon.FetchError = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sync-fetch", "FetchError")
  @js.native
  open class FetchError protected ()
    extends typings.nodeFetch.mod.FetchError {
    def this(message: String, `type`: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("sync-fetch", "Headers")
  @js.native
  open class HeadersCls ()
    extends typings.nodeFetch.mod.Headers
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sync-fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with SyncRequest {
    def this(input: SyncRequestInfo) = this()
    def this(input: SyncRequestInfo, init: SyncRequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    var body: ReadableStream = js.native
    
    /* CompleteClass */
    var bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def buffer(): Buffer = js.native
    
    /* CompleteClass */
    var compress: Boolean = js.native
    
    /* CompleteClass */
    var context: RequestContext = js.native
    
    /* CompleteClass */
    var counter: Double = js.native
    
    /* CompleteClass */
    var follow: Double = js.native
    
    /* CompleteClass */
    var headers: Headers = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    /* CompleteClass */
    override def json(): Any = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
    
    /* CompleteClass */
    var redirect: RequestRedirect = js.native
    
    /* CompleteClass */
    var referrer: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    var timeout: Double = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sync-fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with SyncResponse {
    def this(body: SyncBodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: SyncBodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    var body: ReadableStream = js.native
    
    /* CompleteClass */
    var bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def buffer(): Buffer = js.native
    
    /* CompleteClass */
    var headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): Any = js.native
    
    /* CompleteClass */
    var ok: Boolean = js.native
    
    /* CompleteClass */
    var redirected: Boolean = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var status: Double = js.native
    
    /* CompleteClass */
    var statusText: String = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    var timeout: Double = js.native
    
    /* CompleteClass */
    var `type`: ResponseType = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  
  type Blob = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeFetch.Blob */ Any
  
  type Headers = typings.nodeFetch.mod.Headers
  
  type HeadersInit = typings.nodeFetch.mod.HeadersInit
  
  type RequestContext = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeFetch.RequestContext */ Any
  
  type RequestRedirect = typings.nodeFetch.mod.RequestRedirect
  
  type ResponseInit = typings.nodeFetch.mod.ResponseInit
  
  type ResponseType = typings.nodeFetch.mod.ResponseType
  
  trait SyncBody extends StObject {
    
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    def blob(): js.Promise[Blob]
    
    var body: ReadableStream
    
    var bodyUsed: Boolean
    
    def buffer(): Buffer
    
    def json(): Any
    
    var size: Double
    
    def text(): String
    
    var timeout: Double
  }
  object SyncBody {
    
    inline def apply(
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      blob: () => js.Promise[Blob],
      body: ReadableStream,
      bodyUsed: Boolean,
      buffer: () => Buffer,
      json: () => Any,
      size: Double,
      text: () => String,
      timeout: Double
    ): SyncBody = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), body = body.asInstanceOf[js.Any], bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), json = js.Any.fromFunction0(json), size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncBody] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: () => Buffer): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type SyncBodyInit = String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | URLSearchParams
  
  type SyncFetch = js.Function2[/* url */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncResponse]
  
  trait SyncRequest
    extends StObject
       with SyncBody
       with _SyncRequestInfo {
    
    var compress: Boolean
    
    var context: RequestContext
    
    var counter: Double
    
    var follow: Double
    
    var headers: Headers
    
    var hostname: String
    
    var method: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var redirect: RequestRedirect
    
    var referrer: String
    
    var url: String
  }
  object SyncRequest {
    
    inline def apply(
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      blob: () => js.Promise[Blob],
      body: ReadableStream,
      bodyUsed: Boolean,
      buffer: () => Buffer,
      compress: Boolean,
      context: RequestContext,
      counter: Double,
      follow: Double,
      headers: Headers,
      hostname: String,
      json: () => Any,
      method: String,
      protocol: String,
      redirect: RequestRedirect,
      referrer: String,
      size: Double,
      text: () => String,
      timeout: Double,
      url: String
    ): SyncRequest = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), body = body.asInstanceOf[js.Any], bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), compress = compress.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncRequest] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.syncFetch.mod.URLLike
    - typings.syncFetch.mod.SyncRequest
  */
  type SyncRequestInfo = _SyncRequestInfo | String
  
  trait SyncRequestInit extends StObject {
    
    var body: js.UndefOr[SyncBodyInit] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SyncRequestInit {
    
    inline def apply(): SyncRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncRequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncRequestInit] (val x: Self) extends AnyVal {
      
      inline def setBody(value: SyncBodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait SyncResponse
    extends StObject
       with SyncBody {
    
    var headers: Headers
    
    var ok: Boolean
    
    var redirected: Boolean
    
    var status: Double
    
    var statusText: String
    
    var `type`: ResponseType
    
    var url: String
  }
  object SyncResponse {
    
    inline def apply(
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      blob: () => js.Promise[Blob],
      body: ReadableStream,
      bodyUsed: Boolean,
      buffer: () => Buffer,
      headers: Headers,
      json: () => Any,
      ok: Boolean,
      redirected: Boolean,
      size: Double,
      status: Double,
      statusText: String,
      text: () => String,
      timeout: Double,
      `type`: ResponseType,
      url: String
    ): SyncResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), body = body.asInstanceOf[js.Any], bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLLike
    extends StObject
       with _SyncRequestInfo {
    
    var href: String
  }
  object URLLike {
    
    inline def apply(href: String): URLLike = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLLike] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait _SyncRequestInfo extends StObject
  object _SyncRequestInfo {
    
    inline def SyncRequest(
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      blob: () => js.Promise[Blob],
      body: ReadableStream,
      bodyUsed: Boolean,
      buffer: () => Buffer,
      compress: Boolean,
      context: RequestContext,
      counter: Double,
      follow: Double,
      headers: Headers,
      hostname: String,
      json: () => Any,
      method: String,
      protocol: String,
      redirect: RequestRedirect,
      referrer: String,
      size: Double,
      text: () => String,
      timeout: Double,
      url: String
    ): typings.syncFetch.mod.SyncRequest = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), body = body.asInstanceOf[js.Any], bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), compress = compress.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.syncFetch.mod.SyncRequest]
    }
    
    inline def URLLike(href: String): typings.syncFetch.mod.URLLike = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.syncFetch.mod.URLLike]
    }
  }
  
  type _To = SyncFetch & typings.syncFetch.anon.FetchError
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SyncFetch & typings.syncFetch.anon.FetchError = ^
}
