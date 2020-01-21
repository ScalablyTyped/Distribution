package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
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
  sealed trait accepted extends HttpStatusCode
  
  /** Some of the results of the requested operation were already reported. */
  @js.native
  sealed trait alreadyReported extends HttpStatusCode
  
  /** An intermediate proxy server received a bad response from another proxy or the origin server. */
  @js.native
  sealed trait badGateway extends HttpStatusCode
  
  /** The request could not be understood by the server. This status code is sent when no other error is applicable, or if the exact error is unknown or does not have its own error code. */
  @js.native
  sealed trait badRequest extends HttpStatusCode
  
  /** The request could not be carried out because of a conflict on the server. */
  @js.native
  sealed trait conflict extends HttpStatusCode
  
  /** The client should continue with its request. */
  @js.native
  sealed trait continue extends HttpStatusCode
  
  /** The request resulted in a new resource created before the response was sent. */
  @js.native
  sealed trait created extends HttpStatusCode
  
  /** An expectation given in an Expect header could not be met by the server. */
  @js.native
  sealed trait expectationFailed extends HttpStatusCode
  
  /** The method could not be performed on the resource because the requested action depended on another action and that action failed. */
  @js.native
  sealed trait failedDependency extends HttpStatusCode
  
  /** The server refuses to fulfill the request. */
  @js.native
  sealed trait forbidden extends HttpStatusCode
  
  /** The requested information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will use the GET method. */
  @js.native
  sealed trait found extends HttpStatusCode
  
  /** An intermediate proxy server timed out while waiting for a response from another proxy or the origin server. */
  @js.native
  sealed trait gatewayTimeout extends HttpStatusCode
  
  /** The requested resource is no longer available. */
  @js.native
  sealed trait gone extends HttpStatusCode
  
  /** The requested HTTP version is not supported by the server. */
  @js.native
  sealed trait httpVersionNotSupported extends HttpStatusCode
  
  /** The server has fulfilled a GET request for the resource and the response is the result of one or more actions applied to the current instance. */
  @js.native
  sealed trait imUsed extends HttpStatusCode
  
  /** The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request. This condition is considered to be temporary. */
  @js.native
  sealed trait insufficientStorage extends HttpStatusCode
  
  /** A generic error has occurred on the server. */
  @js.native
  sealed trait internalServerError extends HttpStatusCode
  
  /** The required Content-Length header is missing. */
  @js.native
  sealed trait lengthRequired extends HttpStatusCode
  
  /** The source or destination resource of a method is locked. This response should contain an appropriate precondition or post-condition code. */
  @js.native
  sealed trait locked extends HttpStatusCode
  
  /** The server terminated an operation because it encountered an infinite loop while processing a request. This status indicates that the entire operation failed. */
  @js.native
  sealed trait loopDetected extends HttpStatusCode
  
  /** The HTTP method in the request is not allowed on the requested resource. */
  @js.native
  sealed trait methodNotAllowed extends HttpStatusCode
  
  /** The requested information has been moved to the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. */
  @js.native
  sealed trait movedPermanently extends HttpStatusCode
  
  /** The response provides status for multiple independent operations. Specific error messages appear in the body of the multi- status response. */
  @js.native
  sealed trait multiStatus extends HttpStatusCode
  
  /** The requested information has multiple representations. The default action is to treat this status as a redirect and follow the contents of the Location header associated with this response. */
  @js.native
  sealed trait multipleChoices extends HttpStatusCode
  
  /** The server indicates that the client needs to authenticate to gain network access. The response should contain a link to a resource that allows the user to submit credentials. */
  @js.native
  sealed trait networkAuthenticationRequired extends HttpStatusCode
  
  /** The request has been successfully processed and that the response is intentionally blank. */
  @js.native
  sealed trait noContent extends HttpStatusCode
  
  /** The returned meta-information is from a cached copy instead of the origin server and therefore may be incorrect. */
  @js.native
  sealed trait nonAuthoritativeInformation extends HttpStatusCode
  
  /** The client request was successful. */
  @js.native
  sealed trait none extends HttpStatusCode
  
  /** The client has indicated with Accept headers that it will not accept any of the available representations of the resource. */
  @js.native
  sealed trait notAcceptable extends HttpStatusCode
  
  /** The policy for accessing the resource has not been met in the request. */
  @js.native
  sealed trait notExtended extends HttpStatusCode
  
  /** The requested resource does not exist on the server. */
  @js.native
  sealed trait notFound extends HttpStatusCode
  
  /** The server does not support the requested function. */
  @js.native
  sealed trait notImplemented extends HttpStatusCode
  
  /** The client's cached copy is up to date. The contents of the resource are not transferred. */
  @js.native
  sealed trait notModified extends HttpStatusCode
  
  /** The request succeeded and that the requested information is in the response. This is the most common status code to receive. */
  @js.native
  sealed trait ok extends HttpStatusCode
  
  /** The response is a partial response as requested by a GET request that includes a byte range. */
  @js.native
  sealed trait partialContent extends HttpStatusCode
  
  /** This code is reserved for future use. */
  @js.native
  sealed trait paymentRequired extends HttpStatusCode
  
  /** The target resource has been assigned a new permanent URI and any future references to this resource should use one of the returned URIs specified in the Location header. */
  @js.native
  sealed trait permanentRedirect extends HttpStatusCode
  
  /** A condition set for this request failed, and the request cannot be carried out. Conditions are set with conditional request headers like If-Match, If-None-Match, or If-Unmodified-Since. */
  @js.native
  sealed trait preconditionFailed extends HttpStatusCode
  
  /** The origin server requires the request to be conditional. */
  @js.native
  sealed trait preconditionRequired extends HttpStatusCode
  
  /** The server has received a Web Distributed Authoring and Versioning (WebDAV) request and is processing the request. */
  @js.native
  sealed trait processing extends HttpStatusCode
  
  /** The requested proxy requires authentication. The Proxy-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait proxyAuthenticationRequired extends HttpStatusCode
  
  /** The request is too large for the server to process. */
  @js.native
  sealed trait requestEntityTooLarge extends HttpStatusCode
  
  /** The server is unwilling to process the request because its header fields are too large. The request may be resubmitted after reducing the size of the request header fields. */
  @js.native
  sealed trait requestHeaderFieldsTooLarge extends HttpStatusCode
  
  /** The client did not send a request within the time the server was expecting the request. */
  @js.native
  sealed trait requestTimeout extends HttpStatusCode
  
  /** The URI is too long. */
  @js.native
  sealed trait requestUriTooLong extends HttpStatusCode
  
  /** The range of data requested from the resource cannot be returned, either because the beginning of the range is before the beginning of the resource, or the end of the range is after the end of the resource. */
  @js.native
  sealed trait requestedRangeNotSatisfiable extends HttpStatusCode
  
  /** The client should reset (not reload) the current resource. */
  @js.native
  sealed trait resetContent extends HttpStatusCode
  
  /** Automatically redirects the client to the URI specified in the Location header as the result of a POST. The request to the resource specified by the Location header will be made with the GET method. */
  @js.native
  sealed trait seeOther extends HttpStatusCode
  
  /** The server is temporarily unavailable, usually due to high load or maintenance. */
  @js.native
  sealed trait serviceUnavailable extends HttpStatusCode
  
  /** The HTTP protocol version or protocol is being changed. */
  @js.native
  sealed trait switchingProtocols extends HttpStatusCode
  
  /** The request information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will also use the POST method. */
  @js.native
  sealed trait temporaryRedirect extends HttpStatusCode
  
  /** The user has sent too many requests in a given amount of time. The response should include details explaining the condition, and may include a Retry-After header indicating how long to wait before making a new request. */
  @js.native
  sealed trait tooManyRequests extends HttpStatusCode
  
  /** The requested resource requires authentication. The WWW-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait unauthorized extends HttpStatusCode
  
  /** The server understands the content type of the request entity and the syntax of the request entity is correct, but the server was unable to process the contained instructions. */
  @js.native
  sealed trait unprocessableEntity extends HttpStatusCode
  
  /** The request is an unsupported type. */
  @js.native
  sealed trait unsupportedMediaType extends HttpStatusCode
  
  /** The client should switch to a different protocol such as TLS/1.0. */
  @js.native
  sealed trait upgradeRequired extends HttpStatusCode
  
  /** The request should use the proxy server at the URI specified in the Location header. */
  @js.native
  sealed trait useProxy extends HttpStatusCode
  
  /** The server has an internal configuration error. The chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process. */
  @js.native
  sealed trait variantAlsoNegotiates extends HttpStatusCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpStatusCode with Double] = js.native
  /* 6 */ @js.native
  object accepted extends TopLevel[accepted with Double]
  
  /* 12 */ @js.native
  object alreadyReported extends TopLevel[alreadyReported with Double]
  
  /* 49 */ @js.native
  object badGateway extends TopLevel[badGateway with Double]
  
  /* 22 */ @js.native
  object badRequest extends TopLevel[badRequest with Double]
  
  /* 31 */ @js.native
  object conflict extends TopLevel[conflict with Double]
  
  /* 1 */ @js.native
  object continue extends TopLevel[continue with Double]
  
  /* 5 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 39 */ @js.native
  object expectationFailed extends TopLevel[expectationFailed with Double]
  
  /* 42 */ @js.native
  object failedDependency extends TopLevel[failedDependency with Double]
  
  /* 25 */ @js.native
  object forbidden extends TopLevel[forbidden with Double]
  
  /* 16 */ @js.native
  object found extends TopLevel[found with Double]
  
  /* 51 */ @js.native
  object gatewayTimeout extends TopLevel[gatewayTimeout with Double]
  
  /* 32 */ @js.native
  object gone extends TopLevel[gone with Double]
  
  /* 52 */ @js.native
  object httpVersionNotSupported extends TopLevel[httpVersionNotSupported with Double]
  
  /* 13 */ @js.native
  object imUsed extends TopLevel[imUsed with Double]
  
  /* 54 */ @js.native
  object insufficientStorage extends TopLevel[insufficientStorage with Double]
  
  /* 47 */ @js.native
  object internalServerError extends TopLevel[internalServerError with Double]
  
  /* 33 */ @js.native
  object lengthRequired extends TopLevel[lengthRequired with Double]
  
  /* 41 */ @js.native
  object locked extends TopLevel[locked with Double]
  
  /* 55 */ @js.native
  object loopDetected extends TopLevel[loopDetected with Double]
  
  /* 27 */ @js.native
  object methodNotAllowed extends TopLevel[methodNotAllowed with Double]
  
  /* 15 */ @js.native
  object movedPermanently extends TopLevel[movedPermanently with Double]
  
  /* 11 */ @js.native
  object multiStatus extends TopLevel[multiStatus with Double]
  
  /* 14 */ @js.native
  object multipleChoices extends TopLevel[multipleChoices with Double]
  
  /* 57 */ @js.native
  object networkAuthenticationRequired extends TopLevel[networkAuthenticationRequired with Double]
  
  /* 8 */ @js.native
  object noContent extends TopLevel[noContent with Double]
  
  /* 7 */ @js.native
  object nonAuthoritativeInformation extends TopLevel[nonAuthoritativeInformation with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 28 */ @js.native
  object notAcceptable extends TopLevel[notAcceptable with Double]
  
  /* 56 */ @js.native
  object notExtended extends TopLevel[notExtended with Double]
  
  /* 26 */ @js.native
  object notFound extends TopLevel[notFound with Double]
  
  /* 48 */ @js.native
  object notImplemented extends TopLevel[notImplemented with Double]
  
  /* 18 */ @js.native
  object notModified extends TopLevel[notModified with Double]
  
  /* 4 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 10 */ @js.native
  object partialContent extends TopLevel[partialContent with Double]
  
  /* 24 */ @js.native
  object paymentRequired extends TopLevel[paymentRequired with Double]
  
  /* 21 */ @js.native
  object permanentRedirect extends TopLevel[permanentRedirect with Double]
  
  /* 34 */ @js.native
  object preconditionFailed extends TopLevel[preconditionFailed with Double]
  
  /* 44 */ @js.native
  object preconditionRequired extends TopLevel[preconditionRequired with Double]
  
  /* 3 */ @js.native
  object processing extends TopLevel[processing with Double]
  
  /* 29 */ @js.native
  object proxyAuthenticationRequired extends TopLevel[proxyAuthenticationRequired with Double]
  
  /* 35 */ @js.native
  object requestEntityTooLarge extends TopLevel[requestEntityTooLarge with Double]
  
  /* 46 */ @js.native
  object requestHeaderFieldsTooLarge extends TopLevel[requestHeaderFieldsTooLarge with Double]
  
  /* 30 */ @js.native
  object requestTimeout extends TopLevel[requestTimeout with Double]
  
  /* 36 */ @js.native
  object requestUriTooLong extends TopLevel[requestUriTooLong with Double]
  
  /* 38 */ @js.native
  object requestedRangeNotSatisfiable extends TopLevel[requestedRangeNotSatisfiable with Double]
  
  /* 9 */ @js.native
  object resetContent extends TopLevel[resetContent with Double]
  
  /* 17 */ @js.native
  object seeOther extends TopLevel[seeOther with Double]
  
  /* 50 */ @js.native
  object serviceUnavailable extends TopLevel[serviceUnavailable with Double]
  
  /* 2 */ @js.native
  object switchingProtocols extends TopLevel[switchingProtocols with Double]
  
  /* 20 */ @js.native
  object temporaryRedirect extends TopLevel[temporaryRedirect with Double]
  
  /* 45 */ @js.native
  object tooManyRequests extends TopLevel[tooManyRequests with Double]
  
  /* 23 */ @js.native
  object unauthorized extends TopLevel[unauthorized with Double]
  
  /* 40 */ @js.native
  object unprocessableEntity extends TopLevel[unprocessableEntity with Double]
  
  /* 37 */ @js.native
  object unsupportedMediaType extends TopLevel[unsupportedMediaType with Double]
  
  /* 43 */ @js.native
  object upgradeRequired extends TopLevel[upgradeRequired with Double]
  
  /* 19 */ @js.native
  object useProxy extends TopLevel[useProxy with Double]
  
  /* 53 */ @js.native
  object variantAlsoNegotiates extends TopLevel[variantAlsoNegotiates with Double]
  
}

