package typings.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpStatusCode extends StObject
/** Contains the values of status codes defined for HTTP in the response to an HTTP request. */
@JSGlobal("Windows.Web.Http.HttpStatusCode")
@js.native
object HttpStatusCode extends StObject {
  
  /** The request has been accepted for further processing. */
  @js.native
  sealed trait accepted
    extends StObject
       with HttpStatusCode
  
  /** Some of the results of the requested operation were already reported. */
  @js.native
  sealed trait alreadyReported
    extends StObject
       with HttpStatusCode
  
  /** An intermediate proxy server received a bad response from another proxy or the origin server. */
  @js.native
  sealed trait badGateway
    extends StObject
       with HttpStatusCode
  
  /** The request could not be understood by the server. This status code is sent when no other error is applicable, or if the exact error is unknown or does not have its own error code. */
  @js.native
  sealed trait badRequest
    extends StObject
       with HttpStatusCode
  
  /** The request could not be carried out because of a conflict on the server. */
  @js.native
  sealed trait conflict
    extends StObject
       with HttpStatusCode
  
  /** The client should continue with its request. */
  @js.native
  sealed trait continue
    extends StObject
       with HttpStatusCode
  
  /** The request resulted in a new resource created before the response was sent. */
  @js.native
  sealed trait created
    extends StObject
       with HttpStatusCode
  
  /** An expectation given in an Expect header could not be met by the server. */
  @js.native
  sealed trait expectationFailed
    extends StObject
       with HttpStatusCode
  
  /** The method could not be performed on the resource because the requested action depended on another action and that action failed. */
  @js.native
  sealed trait failedDependency
    extends StObject
       with HttpStatusCode
  
  /** The server refuses to fulfill the request. */
  @js.native
  sealed trait forbidden
    extends StObject
       with HttpStatusCode
  
  /** The requested information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will use the GET method. */
  @js.native
  sealed trait found
    extends StObject
       with HttpStatusCode
  
  /** An intermediate proxy server timed out while waiting for a response from another proxy or the origin server. */
  @js.native
  sealed trait gatewayTimeout
    extends StObject
       with HttpStatusCode
  
  /** The requested resource is no longer available. */
  @js.native
  sealed trait gone
    extends StObject
       with HttpStatusCode
  
  /** The requested HTTP version is not supported by the server. */
  @js.native
  sealed trait httpVersionNotSupported
    extends StObject
       with HttpStatusCode
  
  /** The server has fulfilled a GET request for the resource and the response is the result of one or more actions applied to the current instance. */
  @js.native
  sealed trait imUsed
    extends StObject
       with HttpStatusCode
  
  /** The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request. This condition is considered to be temporary. */
  @js.native
  sealed trait insufficientStorage
    extends StObject
       with HttpStatusCode
  
  /** A generic error has occurred on the server. */
  @js.native
  sealed trait internalServerError
    extends StObject
       with HttpStatusCode
  
  /** The required Content-Length header is missing. */
  @js.native
  sealed trait lengthRequired
    extends StObject
       with HttpStatusCode
  
  /** The source or destination resource of a method is locked. This response should contain an appropriate precondition or post-condition code. */
  @js.native
  sealed trait locked
    extends StObject
       with HttpStatusCode
  
  /** The server terminated an operation because it encountered an infinite loop while processing a request. This status indicates that the entire operation failed. */
  @js.native
  sealed trait loopDetected
    extends StObject
       with HttpStatusCode
  
  /** The HTTP method in the request is not allowed on the requested resource. */
  @js.native
  sealed trait methodNotAllowed
    extends StObject
       with HttpStatusCode
  
  /** The requested information has been moved to the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. */
  @js.native
  sealed trait movedPermanently
    extends StObject
       with HttpStatusCode
  
  /** The response provides status for multiple independent operations. Specific error messages appear in the body of the multi- status response. */
  @js.native
  sealed trait multiStatus
    extends StObject
       with HttpStatusCode
  
  /** The requested information has multiple representations. The default action is to treat this status as a redirect and follow the contents of the Location header associated with this response. */
  @js.native
  sealed trait multipleChoices
    extends StObject
       with HttpStatusCode
  
  /** The server indicates that the client needs to authenticate to gain network access. The response should contain a link to a resource that allows the user to submit credentials. */
  @js.native
  sealed trait networkAuthenticationRequired
    extends StObject
       with HttpStatusCode
  
  /** The request has been successfully processed and that the response is intentionally blank. */
  @js.native
  sealed trait noContent
    extends StObject
       with HttpStatusCode
  
  /** The returned meta-information is from a cached copy instead of the origin server and therefore may be incorrect. */
  @js.native
  sealed trait nonAuthoritativeInformation
    extends StObject
       with HttpStatusCode
  
  /** The client request was successful. */
  @js.native
  sealed trait none
    extends StObject
       with HttpStatusCode
  
  /** The client has indicated with Accept headers that it will not accept any of the available representations of the resource. */
  @js.native
  sealed trait notAcceptable
    extends StObject
       with HttpStatusCode
  
  /** The policy for accessing the resource has not been met in the request. */
  @js.native
  sealed trait notExtended
    extends StObject
       with HttpStatusCode
  
  /** The requested resource does not exist on the server. */
  @js.native
  sealed trait notFound
    extends StObject
       with HttpStatusCode
  
  /** The server does not support the requested function. */
  @js.native
  sealed trait notImplemented
    extends StObject
       with HttpStatusCode
  
  /** The client's cached copy is up to date. The contents of the resource are not transferred. */
  @js.native
  sealed trait notModified
    extends StObject
       with HttpStatusCode
  
  /** The request succeeded and that the requested information is in the response. This is the most common status code to receive. */
  @js.native
  sealed trait ok
    extends StObject
       with HttpStatusCode
  
  /** The response is a partial response as requested by a GET request that includes a byte range. */
  @js.native
  sealed trait partialContent
    extends StObject
       with HttpStatusCode
  
  /** This code is reserved for future use. */
  @js.native
  sealed trait paymentRequired
    extends StObject
       with HttpStatusCode
  
  /** The target resource has been assigned a new permanent URI and any future references to this resource should use one of the returned URIs specified in the Location header. */
  @js.native
  sealed trait permanentRedirect
    extends StObject
       with HttpStatusCode
  
  /** A condition set for this request failed, and the request cannot be carried out. Conditions are set with conditional request headers like If-Match, If-None-Match, or If-Unmodified-Since. */
  @js.native
  sealed trait preconditionFailed
    extends StObject
       with HttpStatusCode
  
  /** The origin server requires the request to be conditional. */
  @js.native
  sealed trait preconditionRequired
    extends StObject
       with HttpStatusCode
  
  /** The server has received a Web Distributed Authoring and Versioning (WebDAV) request and is processing the request. */
  @js.native
  sealed trait processing
    extends StObject
       with HttpStatusCode
  
  /** The requested proxy requires authentication. The Proxy-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait proxyAuthenticationRequired
    extends StObject
       with HttpStatusCode
  
  /** The request is too large for the server to process. */
  @js.native
  sealed trait requestEntityTooLarge
    extends StObject
       with HttpStatusCode
  
  /** The server is unwilling to process the request because its header fields are too large. The request may be resubmitted after reducing the size of the request header fields. */
  @js.native
  sealed trait requestHeaderFieldsTooLarge
    extends StObject
       with HttpStatusCode
  
  /** The client did not send a request within the time the server was expecting the request. */
  @js.native
  sealed trait requestTimeout
    extends StObject
       with HttpStatusCode
  
  /** The URI is too long. */
  @js.native
  sealed trait requestUriTooLong
    extends StObject
       with HttpStatusCode
  
  /** The range of data requested from the resource cannot be returned, either because the beginning of the range is before the beginning of the resource, or the end of the range is after the end of the resource. */
  @js.native
  sealed trait requestedRangeNotSatisfiable
    extends StObject
       with HttpStatusCode
  
  /** The client should reset (not reload) the current resource. */
  @js.native
  sealed trait resetContent
    extends StObject
       with HttpStatusCode
  
  /** Automatically redirects the client to the URI specified in the Location header as the result of a POST. The request to the resource specified by the Location header will be made with the GET method. */
  @js.native
  sealed trait seeOther
    extends StObject
       with HttpStatusCode
  
  /** The server is temporarily unavailable, usually due to high load or maintenance. */
  @js.native
  sealed trait serviceUnavailable
    extends StObject
       with HttpStatusCode
  
  /** The HTTP protocol version or protocol is being changed. */
  @js.native
  sealed trait switchingProtocols
    extends StObject
       with HttpStatusCode
  
  /** The request information is located at the URI specified in the Location header. The default action when this status is received is to follow the Location header associated with the response. When the original request method was POST, the redirected request will also use the POST method. */
  @js.native
  sealed trait temporaryRedirect
    extends StObject
       with HttpStatusCode
  
  /** The user has sent too many requests in a given amount of time. The response should include details explaining the condition, and may include a Retry-After header indicating how long to wait before making a new request. */
  @js.native
  sealed trait tooManyRequests
    extends StObject
       with HttpStatusCode
  
  /** The requested resource requires authentication. The WWW-Authenticate header contains the details of how to perform the authentication. */
  @js.native
  sealed trait unauthorized
    extends StObject
       with HttpStatusCode
  
  /** The server understands the content type of the request entity and the syntax of the request entity is correct, but the server was unable to process the contained instructions. */
  @js.native
  sealed trait unprocessableEntity
    extends StObject
       with HttpStatusCode
  
  /** The request is an unsupported type. */
  @js.native
  sealed trait unsupportedMediaType
    extends StObject
       with HttpStatusCode
  
  /** The client should switch to a different protocol such as TLS/1.0. */
  @js.native
  sealed trait upgradeRequired
    extends StObject
       with HttpStatusCode
  
  /** The request should use the proxy server at the URI specified in the Location header. */
  @js.native
  sealed trait useProxy
    extends StObject
       with HttpStatusCode
  
  /** The server has an internal configuration error. The chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process. */
  @js.native
  sealed trait variantAlsoNegotiates
    extends StObject
       with HttpStatusCode
}
