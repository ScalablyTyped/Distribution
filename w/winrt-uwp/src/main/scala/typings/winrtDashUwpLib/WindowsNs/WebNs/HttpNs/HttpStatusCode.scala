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
  
  val accepted: accepted with java.lang.String = js.native
  val alreadyReported: alreadyReported with java.lang.String = js.native
  val badGateway: badGateway with java.lang.String = js.native
  val badRequest: badRequest with java.lang.String = js.native
  val conflict: conflict with java.lang.String = js.native
  val continue: continue with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val expectationFailed: expectationFailed with java.lang.String = js.native
  val failedDependency: failedDependency with java.lang.String = js.native
  val forbidden: forbidden with java.lang.String = js.native
  val found: found with java.lang.String = js.native
  val gatewayTimeout: gatewayTimeout with java.lang.String = js.native
  val gone: gone with java.lang.String = js.native
  val httpVersionNotSupported: httpVersionNotSupported with java.lang.String = js.native
  val imUsed: imUsed with java.lang.String = js.native
  val insufficientStorage: insufficientStorage with java.lang.String = js.native
  val internalServerError: internalServerError with java.lang.String = js.native
  val lengthRequired: lengthRequired with java.lang.String = js.native
  val locked: locked with java.lang.String = js.native
  val loopDetected: loopDetected with java.lang.String = js.native
  val methodNotAllowed: methodNotAllowed with java.lang.String = js.native
  val movedPermanently: movedPermanently with java.lang.String = js.native
  val multiStatus: multiStatus with java.lang.String = js.native
  val multipleChoices: multipleChoices with java.lang.String = js.native
  val networkAuthenticationRequired: networkAuthenticationRequired with java.lang.String = js.native
  val noContent: noContent with java.lang.String = js.native
  val nonAuthoritativeInformation: nonAuthoritativeInformation with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val notAcceptable: notAcceptable with java.lang.String = js.native
  val notExtended: notExtended with java.lang.String = js.native
  val notFound: notFound with java.lang.String = js.native
  val notImplemented: notImplemented with java.lang.String = js.native
  val notModified: notModified with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  val partialContent: partialContent with java.lang.String = js.native
  val paymentRequired: paymentRequired with java.lang.String = js.native
  val permanentRedirect: permanentRedirect with java.lang.String = js.native
  val preconditionFailed: preconditionFailed with java.lang.String = js.native
  val preconditionRequired: preconditionRequired with java.lang.String = js.native
  val processing: processing with java.lang.String = js.native
  val proxyAuthenticationRequired: proxyAuthenticationRequired with java.lang.String = js.native
  val requestEntityTooLarge: requestEntityTooLarge with java.lang.String = js.native
  val requestHeaderFieldsTooLarge: requestHeaderFieldsTooLarge with java.lang.String = js.native
  val requestTimeout: requestTimeout with java.lang.String = js.native
  val requestUriTooLong: requestUriTooLong with java.lang.String = js.native
  val requestedRangeNotSatisfiable: requestedRangeNotSatisfiable with java.lang.String = js.native
  val resetContent: resetContent with java.lang.String = js.native
  val seeOther: seeOther with java.lang.String = js.native
  val serviceUnavailable: serviceUnavailable with java.lang.String = js.native
  val switchingProtocols: switchingProtocols with java.lang.String = js.native
  val temporaryRedirect: temporaryRedirect with java.lang.String = js.native
  val tooManyRequests: tooManyRequests with java.lang.String = js.native
  val unauthorized: unauthorized with java.lang.String = js.native
  val unprocessableEntity: unprocessableEntity with java.lang.String = js.native
  val unsupportedMediaType: unsupportedMediaType with java.lang.String = js.native
  val upgradeRequired: upgradeRequired with java.lang.String = js.native
  val useProxy: useProxy with java.lang.String = js.native
  val variantAlsoNegotiates: variantAlsoNegotiates with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpStatusCode with java.lang.String] = js.native
}

