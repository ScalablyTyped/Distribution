package typings
package winrtDashUwpLib.WindowsNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebErrorStatus extends js.Object

/** Defines errors encountered during operations involving web services, such as authentication, proxy configuration, and destination URIs. */
@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends js.Object {
  /** The server was acting as a gateway or proxy and received an invalid response from the upstream server. */
  @js.native
  sealed trait badGateway
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The request cannot be fulfilled due to bad syntax. */
  @js.native
  sealed trait badRequest
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Cannot connect to destination. */
  @js.native
  sealed trait cannotConnect
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The SSL certificate common name does not match the web address. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The SSL certificate contains errors. */
  @js.native
  sealed trait certificateContainsErrors
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The SSL certificate has expired. */
  @js.native
  sealed trait certificateExpired
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The SSL certificate is invalid. */
  @js.native
  sealed trait certificateIsInvalid
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The SSL certificate has been revoked. */
  @js.native
  sealed trait certificateRevoked
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Indicates that the request could not be processed because of conflict in the request. */
  @js.native
  sealed trait conflict
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The connection was aborted. */
  @js.native
  sealed trait connectionAborted
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The connection was reset. */
  @js.native
  sealed trait connectionReset
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The connection was ended. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server returned an invalid or unrecognized response. */
  @js.native
  sealed trait errorHttpInvalidServerResponse
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server cannot meet the requirements of the Expect request-header field. */
  @js.native
  sealed trait expectationFailed
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server has refused the request. */
  @js.native
  sealed trait forbidden
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The resource was found but is available in a location different from the one included in the request. */
  @js.native
  sealed trait found
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server was acting as a gateway or proxy and did not receive a timely response from the upstream server. */
  @js.native
  sealed trait gatewayTimeout
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Indicates that the resource requested is no longer available and will not be available again. */
  @js.native
  sealed trait gone
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Could not resolve provided host name. */
  @js.native
  sealed trait hostNameNotResolved
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Redirected from a location to a secure location. */
  @js.native
  sealed trait httpToHttpsOnRedirection
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server does not support the HTTP protocol version used in the request. */
  @js.native
  sealed trait httpVersionNotSupported
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Redirected from a secure location to an unsecure location. */
  @js.native
  sealed trait httpsToHttpOnRedirection
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** A generic error message, given when no more specific message is suitable. */
  @js.native
  sealed trait internalServerError
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The request did not specify the length of its content, which is required by the requested resource. */
  @js.native
  sealed trait lengthRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** A request was made of a resource using a request method not supported by that resource. */
  @js.native
  sealed trait methodNotAllowed
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** This and all future requests should be directed to the given URI. */
  @js.native
  sealed trait movedPermanently
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The requested URL represents a high level grouping of which lower level selections need to be made. */
  @js.native
  sealed trait multipleChoices
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The requested resource is only capable of generating content not acceptable according to the Accept headers sent in the request. */
  @js.native
  sealed trait notAcceptable
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The requested resource could not be found but may be available again in the future. */
  @js.native
  sealed trait notFound
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server either does not recognize the request method, or it lacks the ability to fulfill the request. */
  @js.native
  sealed trait notImplemented
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Indicates the resource has not been modified since last requested. */
  @js.native
  sealed trait notModified
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The operation was canceled. */
  @js.native
  sealed trait operationCanceled
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Reserved. */
  @js.native
  sealed trait paymentRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server does not meet one of the preconditions that the requester put on the request. */
  @js.native
  sealed trait preconditionFailed
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The client must first authenticate itself with the proxy. */
  @js.native
  sealed trait proxyAuthenticationRequired
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The request redirect failed. */
  @js.native
  sealed trait redirectFailed
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The request is larger than the server is willing or able to process. */
  @js.native
  sealed trait requestEntityTooLarge
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server timed out waiting for the request. */
  @js.native
  sealed trait requestTimeout
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Provided URI length exceeds the maximum length the server can process. */
  @js.native
  sealed trait requestUriTooLong
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The client has asked for a portion of the file, but the server cannot supply that portion. */
  @js.native
  sealed trait requestedRangeNotSatisfiable
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The response to the request can be found under another URI using a GET method. */
  @js.native
  sealed trait seeOther
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server is not responding. */
  @js.native
  sealed trait serverUnreachable
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The server is currently unavailable. */
  @js.native
  sealed trait serviceUnavailable
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The requested resource resides temporarily under a different URI. */
  @js.native
  sealed trait temporaryRedirect
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The connection has timed out. */
  @js.native
  sealed trait timeout
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** Authentication has failed or credentials have not yet been provided. */
  @js.native
  sealed trait unauthorized
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** An unexpected client-side error has occurred. */
  @js.native
  sealed trait unexpectedClientError
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** A request was unexpectedly redirected. */
  @js.native
  sealed trait unexpectedRedirection
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** An unexpected server-side error has occurred. */
  @js.native
  sealed trait unexpectedServerError
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** An unexpected status code indicating a failure was received. */
  @js.native
  sealed trait unexpectedStatusCode
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The request entity has a media type which the server or resource does not support. */
  @js.native
  sealed trait unsupportedMediaType
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  /** The requested resource must be accessed through the proxy given by the Location field. */
  @js.native
  sealed trait useProxy
    extends winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus
  
  val badGateway: badGateway with java.lang.String = js.native
  val badRequest: badRequest with java.lang.String = js.native
  val cannotConnect: cannotConnect with java.lang.String = js.native
  val certificateCommonNameIsIncorrect: certificateCommonNameIsIncorrect with java.lang.String = js.native
  val certificateContainsErrors: certificateContainsErrors with java.lang.String = js.native
  val certificateExpired: certificateExpired with java.lang.String = js.native
  val certificateIsInvalid: certificateIsInvalid with java.lang.String = js.native
  val certificateRevoked: certificateRevoked with java.lang.String = js.native
  val conflict: conflict with java.lang.String = js.native
  val connectionAborted: connectionAborted with java.lang.String = js.native
  val connectionReset: connectionReset with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val errorHttpInvalidServerResponse: errorHttpInvalidServerResponse with java.lang.String = js.native
  val expectationFailed: expectationFailed with java.lang.String = js.native
  val forbidden: forbidden with java.lang.String = js.native
  val found: found with java.lang.String = js.native
  val gatewayTimeout: gatewayTimeout with java.lang.String = js.native
  val gone: gone with java.lang.String = js.native
  val hostNameNotResolved: hostNameNotResolved with java.lang.String = js.native
  val httpToHttpsOnRedirection: httpToHttpsOnRedirection with java.lang.String = js.native
  val httpVersionNotSupported: httpVersionNotSupported with java.lang.String = js.native
  val httpsToHttpOnRedirection: httpsToHttpOnRedirection with java.lang.String = js.native
  val internalServerError: internalServerError with java.lang.String = js.native
  val lengthRequired: lengthRequired with java.lang.String = js.native
  val methodNotAllowed: methodNotAllowed with java.lang.String = js.native
  val movedPermanently: movedPermanently with java.lang.String = js.native
  val multipleChoices: multipleChoices with java.lang.String = js.native
  val notAcceptable: notAcceptable with java.lang.String = js.native
  val notFound: notFound with java.lang.String = js.native
  val notImplemented: notImplemented with java.lang.String = js.native
  val notModified: notModified with java.lang.String = js.native
  val operationCanceled: operationCanceled with java.lang.String = js.native
  val paymentRequired: paymentRequired with java.lang.String = js.native
  val preconditionFailed: preconditionFailed with java.lang.String = js.native
  val proxyAuthenticationRequired: proxyAuthenticationRequired with java.lang.String = js.native
  val redirectFailed: redirectFailed with java.lang.String = js.native
  val requestEntityTooLarge: requestEntityTooLarge with java.lang.String = js.native
  val requestTimeout: requestTimeout with java.lang.String = js.native
  val requestUriTooLong: requestUriTooLong with java.lang.String = js.native
  val requestedRangeNotSatisfiable: requestedRangeNotSatisfiable with java.lang.String = js.native
  val seeOther: seeOther with java.lang.String = js.native
  val serverUnreachable: serverUnreachable with java.lang.String = js.native
  val serviceUnavailable: serviceUnavailable with java.lang.String = js.native
  val temporaryRedirect: temporaryRedirect with java.lang.String = js.native
  val timeout: timeout with java.lang.String = js.native
  val unauthorized: unauthorized with java.lang.String = js.native
  val unexpectedClientError: unexpectedClientError with java.lang.String = js.native
  val unexpectedRedirection: unexpectedRedirection with java.lang.String = js.native
  val unexpectedServerError: unexpectedServerError with java.lang.String = js.native
  val unexpectedStatusCode: unexpectedStatusCode with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unsupportedMediaType: unsupportedMediaType with java.lang.String = js.native
  val useProxy: useProxy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus with java.lang.String] = js.native
}

