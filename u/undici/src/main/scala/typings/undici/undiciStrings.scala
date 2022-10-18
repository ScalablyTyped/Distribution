package typings.undici

import typings.undici.libLlhttpConstantsMod.HTTPMode
import typings.undici.typesDispatcherMod.HttpMethod
import typings.undici.typesFetchMod.ReferrerPolicy
import typings.undici.typesFetchMod.RequestCache
import typings.undici.typesFetchMod.RequestCredentials
import typings.undici.typesFetchMod.RequestDestination
import typings.undici.typesFetchMod.RequestMode
import typings.undici.typesFetchMod.RequestRedirect
import typings.undici.typesFetchMod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undiciStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with RequestCache
       with ResponseType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait BodyTimeoutError extends StObject
  inline def BodyTimeoutError: BodyTimeoutError = "BodyTimeoutError".asInstanceOf[BodyTimeoutError]
  
  @js.native
  sealed trait CONNECT
    extends StObject
       with HttpMethod
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait ClientClosedError extends StObject
  inline def ClientClosedError: ClientClosedError = "ClientClosedError".asInstanceOf[ClientClosedError]
  
  @js.native
  sealed trait ClientDestroyedError extends StObject
  inline def ClientDestroyedError: ClientDestroyedError = "ClientDestroyedError".asInstanceOf[ClientDestroyedError]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait HeadersTimeoutError extends StObject
  inline def HeadersTimeoutError: HeadersTimeoutError = "HeadersTimeoutError".asInstanceOf[HeadersTimeoutError]
  
  @js.native
  sealed trait InformationalError extends StObject
  inline def InformationalError: InformationalError = "InformationalError".asInstanceOf[InformationalError]
  
  @js.native
  sealed trait InvalidArgumentError extends StObject
  inline def InvalidArgumentError: InvalidArgumentError = "InvalidArgumentError".asInstanceOf[InvalidArgumentError]
  
  @js.native
  sealed trait InvalidReturnError extends StObject
  inline def InvalidReturnError: InvalidReturnError = "InvalidReturnError".asInstanceOf[InvalidReturnError]
  
  @js.native
  sealed trait MockNotMatchedError extends StObject
  inline def MockNotMatchedError: MockNotMatchedError = "MockNotMatchedError".asInstanceOf[MockNotMatchedError]
  
  @js.native
  sealed trait NotSupportedError extends StObject
  inline def NotSupportedError: NotSupportedError = "NotSupportedError".asInstanceOf[NotSupportedError]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait RequestAbortedError extends StObject
  inline def RequestAbortedError: RequestAbortedError = "RequestAbortedError".asInstanceOf[RequestAbortedError]
  
  @js.native
  sealed trait RequestContentLengthMismatchError extends StObject
  inline def RequestContentLengthMismatchError: RequestContentLengthMismatchError = "RequestContentLengthMismatchError".asInstanceOf[RequestContentLengthMismatchError]
  
  @js.native
  sealed trait ResponseStatusCodeError extends StObject
  inline def ResponseStatusCodeError: ResponseStatusCodeError = "ResponseStatusCodeError".asInstanceOf[ResponseStatusCodeError]
  
  @js.native
  sealed trait SocketError extends StObject
  inline def SocketError: SocketError = "SocketError".asInstanceOf[SocketError]
  
  @js.native
  sealed trait SocketTimeoutError extends StObject
  inline def SocketTimeoutError: SocketTimeoutError = "SocketTimeoutError".asInstanceOf[SocketTimeoutError]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HttpMethod
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UND_ERR_ABORTED extends StObject
  inline def UND_ERR_ABORTED: UND_ERR_ABORTED = "UND_ERR_ABORTED".asInstanceOf[UND_ERR_ABORTED]
  
  @js.native
  sealed trait UND_ERR_BODY_TIMEOUT extends StObject
  inline def UND_ERR_BODY_TIMEOUT: UND_ERR_BODY_TIMEOUT = "UND_ERR_BODY_TIMEOUT".asInstanceOf[UND_ERR_BODY_TIMEOUT]
  
  @js.native
  sealed trait UND_ERR_CLOSED extends StObject
  inline def UND_ERR_CLOSED: UND_ERR_CLOSED = "UND_ERR_CLOSED".asInstanceOf[UND_ERR_CLOSED]
  
  @js.native
  sealed trait UND_ERR_DESTROYED extends StObject
  inline def UND_ERR_DESTROYED: UND_ERR_DESTROYED = "UND_ERR_DESTROYED".asInstanceOf[UND_ERR_DESTROYED]
  
  @js.native
  sealed trait UND_ERR_HEADERS_TIMEOUT extends StObject
  inline def UND_ERR_HEADERS_TIMEOUT: UND_ERR_HEADERS_TIMEOUT = "UND_ERR_HEADERS_TIMEOUT".asInstanceOf[UND_ERR_HEADERS_TIMEOUT]
  
  @js.native
  sealed trait UND_ERR_INFO extends StObject
  inline def UND_ERR_INFO: UND_ERR_INFO = "UND_ERR_INFO".asInstanceOf[UND_ERR_INFO]
  
  @js.native
  sealed trait UND_ERR_INVALID_ARG extends StObject
  inline def UND_ERR_INVALID_ARG: UND_ERR_INVALID_ARG = "UND_ERR_INVALID_ARG".asInstanceOf[UND_ERR_INVALID_ARG]
  
  @js.native
  sealed trait UND_ERR_INVALID_RETURN_VALUE extends StObject
  inline def UND_ERR_INVALID_RETURN_VALUE: UND_ERR_INVALID_RETURN_VALUE = "UND_ERR_INVALID_RETURN_VALUE".asInstanceOf[UND_ERR_INVALID_RETURN_VALUE]
  
  @js.native
  sealed trait UND_ERR_NOT_SUPPORTED extends StObject
  inline def UND_ERR_NOT_SUPPORTED: UND_ERR_NOT_SUPPORTED = "UND_ERR_NOT_SUPPORTED".asInstanceOf[UND_ERR_NOT_SUPPORTED]
  
  @js.native
  sealed trait UND_ERR_REQ_CONTENT_LENGTH_MISMATCH extends StObject
  inline def UND_ERR_REQ_CONTENT_LENGTH_MISMATCH: UND_ERR_REQ_CONTENT_LENGTH_MISMATCH = "UND_ERR_REQ_CONTENT_LENGTH_MISMATCH".asInstanceOf[UND_ERR_REQ_CONTENT_LENGTH_MISMATCH]
  
  @js.native
  sealed trait UND_ERR_RESPONSE_STATUS_CODE extends StObject
  inline def UND_ERR_RESPONSE_STATUS_CODE: UND_ERR_RESPONSE_STATUS_CODE = "UND_ERR_RESPONSE_STATUS_CODE".asInstanceOf[UND_ERR_RESPONSE_STATUS_CODE]
  
  @js.native
  sealed trait UND_ERR_SOCKET extends StObject
  inline def UND_ERR_SOCKET: UND_ERR_SOCKET = "UND_ERR_SOCKET".asInstanceOf[UND_ERR_SOCKET]
  
  @js.native
  sealed trait UND_ERR_SOCKET_TIMEOUT extends StObject
  inline def UND_ERR_SOCKET_TIMEOUT: UND_ERR_SOCKET_TIMEOUT = "UND_ERR_SOCKET_TIMEOUT".asInstanceOf[UND_ERR_SOCKET_TIMEOUT]
  
  @js.native
  sealed trait UND_MOCK_ERR_MOCK_NOT_MATCHED extends StObject
  inline def UND_MOCK_ERR_MOCK_NOT_MATCHED: UND_MOCK_ERR_MOCK_NOT_MATCHED = "UND_MOCK_ERR_MOCK_NOT_MATCHED".asInstanceOf[UND_MOCK_ERR_MOCK_NOT_MATCHED]
  
  @js.native
  sealed trait _empty
    extends StObject
       with ReferrerPolicy
       with RequestDestination
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait audio
    extends StObject
       with RequestDestination
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audioworklet
    extends StObject
       with RequestDestination
  inline def audioworklet: audioworklet = "audioworklet".asInstanceOf[audioworklet]
  
  @js.native
  sealed trait basic
    extends StObject
       with ResponseType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait connect_ extends StObject
  inline def connect_ : connect_ = "connect".asInstanceOf[connect_]
  
  @js.native
  sealed trait connectionError extends StObject
  inline def connectionError: connectionError = "connectionError".asInstanceOf[connectionError]
  
  @js.native
  sealed trait cors
    extends StObject
       with RequestMode
       with ResponseType
  inline def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait disconnect extends StObject
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait document
    extends StObject
       with RequestDestination
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait drain extends StObject
  inline def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait embed
    extends StObject
       with RequestDestination
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait error
    extends StObject
       with RequestRedirect
       with ResponseType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait follow
    extends StObject
       with RequestRedirect
  inline def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait font
    extends StObject
       with RequestDestination
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait `force-cache`
    extends StObject
       with RequestCache
  inline def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  
  @js.native
  sealed trait image
    extends StObject
       with RequestDestination
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait include
    extends StObject
       with RequestCredentials
  inline def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait loose
    extends StObject
       with HTTPMode
  inline def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait manifest
    extends StObject
       with RequestDestination
  inline def manifest: manifest = "manifest".asInstanceOf[manifest]
  
  @js.native
  sealed trait manual
    extends StObject
       with RequestRedirect
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait native extends StObject
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait navigate
    extends StObject
       with RequestMode
  inline def navigate: navigate = "navigate".asInstanceOf[navigate]
  
  @js.native
  sealed trait `no-cache`
    extends StObject
       with RequestCache
  inline def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  
  @js.native
  sealed trait `no-cors`
    extends StObject
       with RequestMode
  inline def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait `no-store`
    extends StObject
       with RequestCache
  inline def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  
  @js.native
  sealed trait `object`
    extends StObject
       with RequestDestination
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait omit
    extends StObject
       with RequestCredentials
  inline def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait `only-if-cached`
    extends StObject
       with RequestCache
  inline def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  
  @js.native
  sealed trait opaque
    extends StObject
       with ResponseType
  inline def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait opaqueredirect
    extends StObject
       with ResponseType
  inline def opaqueredirect: opaqueredirect = "opaqueredirect".asInstanceOf[opaqueredirect]
  
  @js.native
  sealed trait origin
    extends StObject
       with ReferrerPolicy
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait paintworklet
    extends StObject
       with RequestDestination
  inline def paintworklet: paintworklet = "paintworklet".asInstanceOf[paintworklet]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait reload
    extends StObject
       with RequestCache
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait report
    extends StObject
       with RequestDestination
  inline def report: report = "report".asInstanceOf[report]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with ReferrerPolicy
       with RequestCredentials
       with RequestMode
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait script
    extends StObject
       with RequestDestination
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait sharedworker
    extends StObject
       with RequestDestination
  inline def sharedworker: sharedworker = "sharedworker".asInstanceOf[sharedworker]
  
  @js.native
  sealed trait strict
    extends StObject
       with HTTPMode
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait style
    extends StObject
       with RequestDestination
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait track
    extends StObject
       with RequestDestination
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transparent extends StObject
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with ReferrerPolicy
  inline def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait video
    extends StObject
       with RequestDestination
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait worker
    extends StObject
       with RequestDestination
  inline def worker: worker = "worker".asInstanceOf[worker]
  
  @js.native
  sealed trait xslt
    extends StObject
       with RequestDestination
  inline def xslt: xslt = "xslt".asInstanceOf[xslt]
}
