package typings.winrtUwp.Windows.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebErrorStatus extends StObject
/** Defines errors encountered during operations involving web services, such as authentication, proxy configuration, and destination URIs. */
@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends StObject {
  
  /** The server was acting as a gateway or proxy and received an invalid response from the upstream server. */
  @js.native
  sealed trait badGateway
    extends StObject
       with WebErrorStatus
  
  /** The request cannot be fulfilled due to bad syntax. */
  @js.native
  sealed trait badRequest
    extends StObject
       with WebErrorStatus
  
  /** Cannot connect to destination. */
  @js.native
  sealed trait cannotConnect
    extends StObject
       with WebErrorStatus
  
  /** The SSL certificate common name does not match the web address. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends StObject
       with WebErrorStatus
  
  /** The SSL certificate contains errors. */
  @js.native
  sealed trait certificateContainsErrors
    extends StObject
       with WebErrorStatus
  
  /** The SSL certificate has expired. */
  @js.native
  sealed trait certificateExpired
    extends StObject
       with WebErrorStatus
  
  /** The SSL certificate is invalid. */
  @js.native
  sealed trait certificateIsInvalid
    extends StObject
       with WebErrorStatus
  
  /** The SSL certificate has been revoked. */
  @js.native
  sealed trait certificateRevoked
    extends StObject
       with WebErrorStatus
  
  /** Indicates that the request could not be processed because of conflict in the request. */
  @js.native
  sealed trait conflict
    extends StObject
       with WebErrorStatus
  
  /** The connection was aborted. */
  @js.native
  sealed trait connectionAborted
    extends StObject
       with WebErrorStatus
  
  /** The connection was reset. */
  @js.native
  sealed trait connectionReset
    extends StObject
       with WebErrorStatus
  
  /** The connection was ended. */
  @js.native
  sealed trait disconnected
    extends StObject
       with WebErrorStatus
  
  /** The server returned an invalid or unrecognized response. */
  @js.native
  sealed trait errorHttpInvalidServerResponse
    extends StObject
       with WebErrorStatus
  
  /** The server cannot meet the requirements of the Expect request-header field. */
  @js.native
  sealed trait expectationFailed
    extends StObject
       with WebErrorStatus
  
  /** The server has refused the request. */
  @js.native
  sealed trait forbidden
    extends StObject
       with WebErrorStatus
  
  /** The resource was found but is available in a location different from the one included in the request. */
  @js.native
  sealed trait found
    extends StObject
       with WebErrorStatus
  
  /** The server was acting as a gateway or proxy and did not receive a timely response from the upstream server. */
  @js.native
  sealed trait gatewayTimeout
    extends StObject
       with WebErrorStatus
  
  /** Indicates that the resource requested is no longer available and will not be available again. */
  @js.native
  sealed trait gone
    extends StObject
       with WebErrorStatus
  
  /** Could not resolve provided host name. */
  @js.native
  sealed trait hostNameNotResolved
    extends StObject
       with WebErrorStatus
  
  /** Redirected from a location to a secure location. */
  @js.native
  sealed trait httpToHttpsOnRedirection
    extends StObject
       with WebErrorStatus
  
  /** The server does not support the HTTP protocol version used in the request. */
  @js.native
  sealed trait httpVersionNotSupported
    extends StObject
       with WebErrorStatus
  
  /** Redirected from a secure location to an unsecure location. */
  @js.native
  sealed trait httpsToHttpOnRedirection
    extends StObject
       with WebErrorStatus
  
  /** A generic error message, given when no more specific message is suitable. */
  @js.native
  sealed trait internalServerError
    extends StObject
       with WebErrorStatus
  
  /** The request did not specify the length of its content, which is required by the requested resource. */
  @js.native
  sealed trait lengthRequired
    extends StObject
       with WebErrorStatus
  
  /** A request was made of a resource using a request method not supported by that resource. */
  @js.native
  sealed trait methodNotAllowed
    extends StObject
       with WebErrorStatus
  
  /** This and all future requests should be directed to the given URI. */
  @js.native
  sealed trait movedPermanently
    extends StObject
       with WebErrorStatus
  
  /** The requested URL represents a high level grouping of which lower level selections need to be made. */
  @js.native
  sealed trait multipleChoices
    extends StObject
       with WebErrorStatus
  
  /** The requested resource is only capable of generating content not acceptable according to the Accept headers sent in the request. */
  @js.native
  sealed trait notAcceptable
    extends StObject
       with WebErrorStatus
  
  /** The requested resource could not be found but may be available again in the future. */
  @js.native
  sealed trait notFound
    extends StObject
       with WebErrorStatus
  
  /** The server either does not recognize the request method, or it lacks the ability to fulfill the request. */
  @js.native
  sealed trait notImplemented
    extends StObject
       with WebErrorStatus
  
  /** Indicates the resource has not been modified since last requested. */
  @js.native
  sealed trait notModified
    extends StObject
       with WebErrorStatus
  
  /** The operation was canceled. */
  @js.native
  sealed trait operationCanceled
    extends StObject
       with WebErrorStatus
  
  /** Reserved. */
  @js.native
  sealed trait paymentRequired
    extends StObject
       with WebErrorStatus
  
  /** The server does not meet one of the preconditions that the requester put on the request. */
  @js.native
  sealed trait preconditionFailed
    extends StObject
       with WebErrorStatus
  
  /** The client must first authenticate itself with the proxy. */
  @js.native
  sealed trait proxyAuthenticationRequired
    extends StObject
       with WebErrorStatus
  
  /** The request redirect failed. */
  @js.native
  sealed trait redirectFailed
    extends StObject
       with WebErrorStatus
  
  /** The request is larger than the server is willing or able to process. */
  @js.native
  sealed trait requestEntityTooLarge
    extends StObject
       with WebErrorStatus
  
  /** The server timed out waiting for the request. */
  @js.native
  sealed trait requestTimeout
    extends StObject
       with WebErrorStatus
  
  /** Provided URI length exceeds the maximum length the server can process. */
  @js.native
  sealed trait requestUriTooLong
    extends StObject
       with WebErrorStatus
  
  /** The client has asked for a portion of the file, but the server cannot supply that portion. */
  @js.native
  sealed trait requestedRangeNotSatisfiable
    extends StObject
       with WebErrorStatus
  
  /** The response to the request can be found under another URI using a GET method. */
  @js.native
  sealed trait seeOther
    extends StObject
       with WebErrorStatus
  
  /** The server is not responding. */
  @js.native
  sealed trait serverUnreachable
    extends StObject
       with WebErrorStatus
  
  /** The server is currently unavailable. */
  @js.native
  sealed trait serviceUnavailable
    extends StObject
       with WebErrorStatus
  
  /** The requested resource resides temporarily under a different URI. */
  @js.native
  sealed trait temporaryRedirect
    extends StObject
       with WebErrorStatus
  
  /** The connection has timed out. */
  @js.native
  sealed trait timeout
    extends StObject
       with WebErrorStatus
  
  /** Authentication has failed or credentials have not yet been provided. */
  @js.native
  sealed trait unauthorized
    extends StObject
       with WebErrorStatus
  
  /** An unexpected client-side error has occurred. */
  @js.native
  sealed trait unexpectedClientError
    extends StObject
       with WebErrorStatus
  
  /** A request was unexpectedly redirected. */
  @js.native
  sealed trait unexpectedRedirection
    extends StObject
       with WebErrorStatus
  
  /** An unexpected server-side error has occurred. */
  @js.native
  sealed trait unexpectedServerError
    extends StObject
       with WebErrorStatus
  
  /** An unexpected status code indicating a failure was received. */
  @js.native
  sealed trait unexpectedStatusCode
    extends StObject
       with WebErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown
    extends StObject
       with WebErrorStatus
  
  /** The request entity has a media type which the server or resource does not support. */
  @js.native
  sealed trait unsupportedMediaType
    extends StObject
       with WebErrorStatus
  
  /** The requested resource must be accessed through the proxy given by the Location field. */
  @js.native
  sealed trait useProxy
    extends StObject
       with WebErrorStatus
}
