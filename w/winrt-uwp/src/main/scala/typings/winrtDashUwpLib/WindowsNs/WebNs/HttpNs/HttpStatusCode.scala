package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpStatusCode extends js.Object

/** Contains the values of status codes defined for HTTP in the response to an HTTP request. */
@JSGlobal("Windows.Web.Http.HttpStatusCode")
@js.native
object HttpStatusCode extends js.Object {
  /** The request has been accepted for further processing. */
  @js.native
  sealed trait accepted
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** Some of the results of the requested operation were already reported. */
  @js.native
  sealed trait alreadyReported
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** An intermediate proxy server received a bad response from another proxy or the origin server. */
  @js.native
  sealed trait badGateway
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request could not be understood by the server. This status code is sent when no other error is applicable, or if the exact error is unknown or does not have its own error code. */
  @js.native
  sealed trait badRequest
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request could not be carried out because of a conflict on the server. */
  @js.native
  sealed trait conflict
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client should continue with its request. */
  @js.native
  sealed trait continue
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request resulted in a new resource created before the response was sent. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** An expectation given in an Expect header could not be met by the server. */
  @js.native
  sealed trait expectationFailed
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The method could not be performed on the resource because the requested action depended on another action and that action failed. */
  @js.native
  sealed trait failedDependency
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server refuses to fulfill the request. */
  @js.native
  sealed trait forbidden
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will use the GET method. */
  @js.native
  sealed trait found
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** An intermediate proxy server timed out while waiting for a response from another proxy or the origin server. */
  @js.native
  sealed trait gatewayTimeout
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested resource is no longer available. */
  @js.native
  sealed trait gone
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested HTTP version is not supported by the server. */
  @js.native
  sealed trait httpVersionNotSupported
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server has fulfilled a GET request for the resource and the response is the result of one or more actions applied to the current instance. */
  @js.native
  sealed trait imUsed
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request. This condition is considered to be temporary. */
  @js.native
  sealed trait insufficientStorage
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** A generic error has occurred on the server. */
  @js.native
  sealed trait internalServerError
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The required Content-Length header is missing. */
  @js.native
  sealed trait lengthRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The source or destination resource of a method is locked. This response should contain an appropriate precondition or post-condition code. */
  @js.native
  sealed trait locked
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server terminated an operation because it encountered an infinite loop while processing a request. This status indicates that the entire operation failed. */
  @js.native
  sealed trait loopDetected
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The HTTP method in the request is not allowed on the requested resource. */
  @js.native
  sealed trait methodNotAllowed
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested information has been moved to the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. */
  @js.native
  sealed trait movedPermanently
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The response provides status for multiple independent operations. Specific error messages appear in the body of the multi- status response. */
  @js.native
  sealed trait multiStatus
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested information has multiple representations. The default action is to treat this status as a redirect and follow the contents of the Location header associated with this response. */
  @js.native
  sealed trait multipleChoices
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server indicates that the client needs to authenticate to gain network access. The response should contain a link to a resource that allows the user to submit credentials. */
  @js.native
  sealed trait networkAuthenticationRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request has been successfully processed and that the response is intentionally blank. */
  @js.native
  sealed trait noContent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The returned meta-information is from a cached copy instead of the origin server and therefore may be incorrect. */
  @js.native
  sealed trait nonAuthoritativeInformation
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client request was successful. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client has indicated with Accept headers that it will not accept any of the available representations of the resource. */
  @js.native
  sealed trait notAcceptable
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The policy for accessing the resource has not been met in the request. */
  @js.native
  sealed trait notExtended
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested resource does not exist on the server. */
  @js.native
  sealed trait notFound
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server does not support the requested function. */
  @js.native
  sealed trait notImplemented
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client's cached copy is up to date. The contents of the resource are not transferred. */
  @js.native
  sealed trait notModified
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request succeeded and that the requested information is in the response. This is the most common status code to receive. */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The response is a partial response as requested by a GET request that includes a byte range. */
  @js.native
  sealed trait partialContent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** This code is reserved for future use. */
  @js.native
  sealed trait paymentRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The target resource has been assigned a new permanent URI and any future references to this resource should use one of the returned URIs specified in the Location header. */
  @js.native
  sealed trait permanentRedirect
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** A condition set for this request failed, and the request cannot be carried out. Conditions are set with conditional request headers like If-Match, If-None-Match, or If-Unmodified-Since. */
  @js.native
  sealed trait preconditionFailed
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The origin server requires the request to be conditional. */
  @js.native
  sealed trait preconditionRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server has received a Web Distributed Authoring and Versioning (WebDAV) request and is processing the request. */
  @js.native
  sealed trait processing
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested proxy requires authentication. The Proxy-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait proxyAuthenticationRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request is too large for the server to process. */
  @js.native
  sealed trait requestEntityTooLarge
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server is unwilling to process the request because its header fields are too large. The request may be resubmitted after reducing the size of the request header fields. */
  @js.native
  sealed trait requestHeaderFieldsTooLarge
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client did not send a request within the time the server was expecting the request. */
  @js.native
  sealed trait requestTimeout
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The URI is too long. */
  @js.native
  sealed trait requestUriTooLong
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The range of data requested from the resource cannot be returned, either because the beginning of the range is before the beginning of the resource, or the end of the range is after the end of the resource. */
  @js.native
  sealed trait requestedRangeNotSatisfiable
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client should reset (not reload) the current resource. */
  @js.native
  sealed trait resetContent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** Automatically redirects the client to the URI specified in the Location header as the result of a POST. The request to the resource specified by the Location header will be made with the GET method. */
  @js.native
  sealed trait seeOther
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server is temporarily unavailable, usually due to high load or maintenance. */
  @js.native
  sealed trait serviceUnavailable
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The HTTP protocol version or protocol is being changed. */
  @js.native
  sealed trait switchingProtocols
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will also use the POST method. */
  @js.native
  sealed trait temporaryRedirect
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The user has sent too many requests in a given amount of time. The response should include details explaining the condition, and may include a Retry-After header indicating how long to wait before making a new request. */
  @js.native
  sealed trait tooManyRequests
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The requested resource requires authentication. The WWW-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait unauthorized
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server understands the content type of the request entity and the syntax of the request entity is correct, but the server was unable to process the contained instructions. */
  @js.native
  sealed trait unprocessableEntity
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request is an unsupported type. */
  @js.native
  sealed trait unsupportedMediaType
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The client should switch to a different protocol such as TLS/1.0. */
  @js.native
  sealed trait upgradeRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The request should use the proxy server at the URI specified in the Location header. */
  @js.native
  sealed trait useProxy
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /** The server has an internal configuration error. The chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process. */
  @js.native
  sealed trait variantAlsoNegotiates
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode
  
  /* 6 */ val accepted: accepted with scala.Double = js.native
  /* 12 */ val alreadyReported: alreadyReported with scala.Double = js.native
  /* 49 */ val badGateway: badGateway with scala.Double = js.native
  /* 22 */ val badRequest: badRequest with scala.Double = js.native
  /* 31 */ val conflict: conflict with scala.Double = js.native
  /* 1 */ val continue: continue with scala.Double = js.native
  /* 5 */ val created: created with scala.Double = js.native
  /* 39 */ val expectationFailed: expectationFailed with scala.Double = js.native
  /* 42 */ val failedDependency: failedDependency with scala.Double = js.native
  /* 25 */ val forbidden: forbidden with scala.Double = js.native
  /* 16 */ val found: found with scala.Double = js.native
  /* 51 */ val gatewayTimeout: gatewayTimeout with scala.Double = js.native
  /* 32 */ val gone: gone with scala.Double = js.native
  /* 52 */ val httpVersionNotSupported: httpVersionNotSupported with scala.Double = js.native
  /* 13 */ val imUsed: imUsed with scala.Double = js.native
  /* 54 */ val insufficientStorage: insufficientStorage with scala.Double = js.native
  /* 47 */ val internalServerError: internalServerError with scala.Double = js.native
  /* 33 */ val lengthRequired: lengthRequired with scala.Double = js.native
  /* 41 */ val locked: locked with scala.Double = js.native
  /* 55 */ val loopDetected: loopDetected with scala.Double = js.native
  /* 27 */ val methodNotAllowed: methodNotAllowed with scala.Double = js.native
  /* 15 */ val movedPermanently: movedPermanently with scala.Double = js.native
  /* 11 */ val multiStatus: multiStatus with scala.Double = js.native
  /* 14 */ val multipleChoices: multipleChoices with scala.Double = js.native
  /* 57 */ val networkAuthenticationRequired: networkAuthenticationRequired with scala.Double = js.native
  /* 8 */ val noContent: noContent with scala.Double = js.native
  /* 7 */ val nonAuthoritativeInformation: nonAuthoritativeInformation with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 28 */ val notAcceptable: notAcceptable with scala.Double = js.native
  /* 56 */ val notExtended: notExtended with scala.Double = js.native
  /* 26 */ val notFound: notFound with scala.Double = js.native
  /* 48 */ val notImplemented: notImplemented with scala.Double = js.native
  /* 18 */ val notModified: notModified with scala.Double = js.native
  /* 4 */ val ok: ok with scala.Double = js.native
  /* 10 */ val partialContent: partialContent with scala.Double = js.native
  /* 24 */ val paymentRequired: paymentRequired with scala.Double = js.native
  /* 21 */ val permanentRedirect: permanentRedirect with scala.Double = js.native
  /* 34 */ val preconditionFailed: preconditionFailed with scala.Double = js.native
  /* 44 */ val preconditionRequired: preconditionRequired with scala.Double = js.native
  /* 3 */ val processing: processing with scala.Double = js.native
  /* 29 */ val proxyAuthenticationRequired: proxyAuthenticationRequired with scala.Double = js.native
  /* 35 */ val requestEntityTooLarge: requestEntityTooLarge with scala.Double = js.native
  /* 46 */ val requestHeaderFieldsTooLarge: requestHeaderFieldsTooLarge with scala.Double = js.native
  /* 30 */ val requestTimeout: requestTimeout with scala.Double = js.native
  /* 36 */ val requestUriTooLong: requestUriTooLong with scala.Double = js.native
  /* 38 */ val requestedRangeNotSatisfiable: requestedRangeNotSatisfiable with scala.Double = js.native
  /* 9 */ val resetContent: resetContent with scala.Double = js.native
  /* 17 */ val seeOther: seeOther with scala.Double = js.native
  /* 50 */ val serviceUnavailable: serviceUnavailable with scala.Double = js.native
  /* 2 */ val switchingProtocols: switchingProtocols with scala.Double = js.native
  /* 20 */ val temporaryRedirect: temporaryRedirect with scala.Double = js.native
  /* 45 */ val tooManyRequests: tooManyRequests with scala.Double = js.native
  /* 23 */ val unauthorized: unauthorized with scala.Double = js.native
  /* 40 */ val unprocessableEntity: unprocessableEntity with scala.Double = js.native
  /* 37 */ val unsupportedMediaType: unsupportedMediaType with scala.Double = js.native
  /* 43 */ val upgradeRequired: upgradeRequired with scala.Double = js.native
  /* 19 */ val useProxy: useProxy with scala.Double = js.native
  /* 53 */ val variantAlsoNegotiates: variantAlsoNegotiates with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode with scala.Double] = js.native
}

