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
  
  /* 49 */ val badGateway: badGateway with scala.Double = js.native
  /* 29 */ val badRequest: badRequest with scala.Double = js.native
  /* 14 */ val cannotConnect: cannotConnect with scala.Double = js.native
  /* 1 */ val certificateCommonNameIsIncorrect: certificateCommonNameIsIncorrect with scala.Double = js.native
  /* 3 */ val certificateContainsErrors: certificateContainsErrors with scala.Double = js.native
  /* 2 */ val certificateExpired: certificateExpired with scala.Double = js.native
  /* 5 */ val certificateIsInvalid: certificateIsInvalid with scala.Double = js.native
  /* 4 */ val certificateRevoked: certificateRevoked with scala.Double = js.native
  /* 38 */ val conflict: conflict with scala.Double = js.native
  /* 9 */ val connectionAborted: connectionAborted with scala.Double = js.native
  /* 10 */ val connectionReset: connectionReset with scala.Double = js.native
  /* 11 */ val disconnected: disconnected with scala.Double = js.native
  /* 8 */ val errorHttpInvalidServerResponse: errorHttpInvalidServerResponse with scala.Double = js.native
  /* 46 */ val expectationFailed: expectationFailed with scala.Double = js.native
  /* 32 */ val forbidden: forbidden with scala.Double = js.native
  /* 24 */ val found: found with scala.Double = js.native
  /* 51 */ val gatewayTimeout: gatewayTimeout with scala.Double = js.native
  /* 39 */ val gone: gone with scala.Double = js.native
  /* 15 */ val hostNameNotResolved: hostNameNotResolved with scala.Double = js.native
  /* 12 */ val httpToHttpsOnRedirection: httpToHttpsOnRedirection with scala.Double = js.native
  /* 52 */ val httpVersionNotSupported: httpVersionNotSupported with scala.Double = js.native
  /* 13 */ val httpsToHttpOnRedirection: httpsToHttpOnRedirection with scala.Double = js.native
  /* 47 */ val internalServerError: internalServerError with scala.Double = js.native
  /* 40 */ val lengthRequired: lengthRequired with scala.Double = js.native
  /* 34 */ val methodNotAllowed: methodNotAllowed with scala.Double = js.native
  /* 23 */ val movedPermanently: movedPermanently with scala.Double = js.native
  /* 22 */ val multipleChoices: multipleChoices with scala.Double = js.native
  /* 35 */ val notAcceptable: notAcceptable with scala.Double = js.native
  /* 33 */ val notFound: notFound with scala.Double = js.native
  /* 48 */ val notImplemented: notImplemented with scala.Double = js.native
  /* 26 */ val notModified: notModified with scala.Double = js.native
  /* 16 */ val operationCanceled: operationCanceled with scala.Double = js.native
  /* 31 */ val paymentRequired: paymentRequired with scala.Double = js.native
  /* 41 */ val preconditionFailed: preconditionFailed with scala.Double = js.native
  /* 36 */ val proxyAuthenticationRequired: proxyAuthenticationRequired with scala.Double = js.native
  /* 17 */ val redirectFailed: redirectFailed with scala.Double = js.native
  /* 42 */ val requestEntityTooLarge: requestEntityTooLarge with scala.Double = js.native
  /* 37 */ val requestTimeout: requestTimeout with scala.Double = js.native
  /* 43 */ val requestUriTooLong: requestUriTooLong with scala.Double = js.native
  /* 45 */ val requestedRangeNotSatisfiable: requestedRangeNotSatisfiable with scala.Double = js.native
  /* 25 */ val seeOther: seeOther with scala.Double = js.native
  /* 6 */ val serverUnreachable: serverUnreachable with scala.Double = js.native
  /* 50 */ val serviceUnavailable: serviceUnavailable with scala.Double = js.native
  /* 28 */ val temporaryRedirect: temporaryRedirect with scala.Double = js.native
  /* 7 */ val timeout: timeout with scala.Double = js.native
  /* 30 */ val unauthorized: unauthorized with scala.Double = js.native
  /* 20 */ val unexpectedClientError: unexpectedClientError with scala.Double = js.native
  /* 19 */ val unexpectedRedirection: unexpectedRedirection with scala.Double = js.native
  /* 21 */ val unexpectedServerError: unexpectedServerError with scala.Double = js.native
  /* 18 */ val unexpectedStatusCode: unexpectedStatusCode with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 44 */ val unsupportedMediaType: unsupportedMediaType with scala.Double = js.native
  /* 27 */ val useProxy: useProxy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus with scala.Double] = js.native
}

