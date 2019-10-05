package typings.winrtDashUwp.Windows.Web

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
  sealed trait badGateway extends WebErrorStatus
  
  /** The request cannot be fulfilled due to bad syntax. */
  @js.native
  sealed trait badRequest extends WebErrorStatus
  
  /** Cannot connect to destination. */
  @js.native
  sealed trait cannotConnect extends WebErrorStatus
  
  /** The SSL certificate common name does not match the web address. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect extends WebErrorStatus
  
  /** The SSL certificate contains errors. */
  @js.native
  sealed trait certificateContainsErrors extends WebErrorStatus
  
  /** The SSL certificate has expired. */
  @js.native
  sealed trait certificateExpired extends WebErrorStatus
  
  /** The SSL certificate is invalid. */
  @js.native
  sealed trait certificateIsInvalid extends WebErrorStatus
  
  /** The SSL certificate has been revoked. */
  @js.native
  sealed trait certificateRevoked extends WebErrorStatus
  
  /** Indicates that the request could not be processed because of conflict in the request. */
  @js.native
  sealed trait conflict extends WebErrorStatus
  
  /** The connection was aborted. */
  @js.native
  sealed trait connectionAborted extends WebErrorStatus
  
  /** The connection was reset. */
  @js.native
  sealed trait connectionReset extends WebErrorStatus
  
  /** The connection was ended. */
  @js.native
  sealed trait disconnected extends WebErrorStatus
  
  /** The server returned an invalid or unrecognized response. */
  @js.native
  sealed trait errorHttpInvalidServerResponse extends WebErrorStatus
  
  /** The server cannot meet the requirements of the Expect request-header field. */
  @js.native
  sealed trait expectationFailed extends WebErrorStatus
  
  /** The server has refused the request. */
  @js.native
  sealed trait forbidden extends WebErrorStatus
  
  /** The resource was found but is available in a location different from the one included in the request. */
  @js.native
  sealed trait found extends WebErrorStatus
  
  /** The server was acting as a gateway or proxy and did not receive a timely response from the upstream server. */
  @js.native
  sealed trait gatewayTimeout extends WebErrorStatus
  
  /** Indicates that the resource requested is no longer available and will not be available again. */
  @js.native
  sealed trait gone extends WebErrorStatus
  
  /** Could not resolve provided host name. */
  @js.native
  sealed trait hostNameNotResolved extends WebErrorStatus
  
  /** Redirected from a location to a secure location. */
  @js.native
  sealed trait httpToHttpsOnRedirection extends WebErrorStatus
  
  /** The server does not support the HTTP protocol version used in the request. */
  @js.native
  sealed trait httpVersionNotSupported extends WebErrorStatus
  
  /** Redirected from a secure location to an unsecure location. */
  @js.native
  sealed trait httpsToHttpOnRedirection extends WebErrorStatus
  
  /** A generic error message, given when no more specific message is suitable. */
  @js.native
  sealed trait internalServerError extends WebErrorStatus
  
  /** The request did not specify the length of its content, which is required by the requested resource. */
  @js.native
  sealed trait lengthRequired extends WebErrorStatus
  
  /** A request was made of a resource using a request method not supported by that resource. */
  @js.native
  sealed trait methodNotAllowed extends WebErrorStatus
  
  /** This and all future requests should be directed to the given URI. */
  @js.native
  sealed trait movedPermanently extends WebErrorStatus
  
  /** The requested URL represents a high level grouping of which lower level selections need to be made. */
  @js.native
  sealed trait multipleChoices extends WebErrorStatus
  
  /** The requested resource is only capable of generating content not acceptable according to the Accept headers sent in the request. */
  @js.native
  sealed trait notAcceptable extends WebErrorStatus
  
  /** The requested resource could not be found but may be available again in the future. */
  @js.native
  sealed trait notFound extends WebErrorStatus
  
  /** The server either does not recognize the request method, or it lacks the ability to fulfill the request. */
  @js.native
  sealed trait notImplemented extends WebErrorStatus
  
  /** Indicates the resource has not been modified since last requested. */
  @js.native
  sealed trait notModified extends WebErrorStatus
  
  /** The operation was canceled. */
  @js.native
  sealed trait operationCanceled extends WebErrorStatus
  
  /** Reserved. */
  @js.native
  sealed trait paymentRequired extends WebErrorStatus
  
  /** The server does not meet one of the preconditions that the requester put on the request. */
  @js.native
  sealed trait preconditionFailed extends WebErrorStatus
  
  /** The client must first authenticate itself with the proxy. */
  @js.native
  sealed trait proxyAuthenticationRequired extends WebErrorStatus
  
  /** The request redirect failed. */
  @js.native
  sealed trait redirectFailed extends WebErrorStatus
  
  /** The request is larger than the server is willing or able to process. */
  @js.native
  sealed trait requestEntityTooLarge extends WebErrorStatus
  
  /** The server timed out waiting for the request. */
  @js.native
  sealed trait requestTimeout extends WebErrorStatus
  
  /** Provided URI length exceeds the maximum length the server can process. */
  @js.native
  sealed trait requestUriTooLong extends WebErrorStatus
  
  /** The client has asked for a portion of the file, but the server cannot supply that portion. */
  @js.native
  sealed trait requestedRangeNotSatisfiable extends WebErrorStatus
  
  /** The response to the request can be found under another URI using a GET method. */
  @js.native
  sealed trait seeOther extends WebErrorStatus
  
  /** The server is not responding. */
  @js.native
  sealed trait serverUnreachable extends WebErrorStatus
  
  /** The server is currently unavailable. */
  @js.native
  sealed trait serviceUnavailable extends WebErrorStatus
  
  /** The requested resource resides temporarily under a different URI. */
  @js.native
  sealed trait temporaryRedirect extends WebErrorStatus
  
  /** The connection has timed out. */
  @js.native
  sealed trait timeout extends WebErrorStatus
  
  /** Authentication has failed or credentials have not yet been provided. */
  @js.native
  sealed trait unauthorized extends WebErrorStatus
  
  /** An unexpected client-side error has occurred. */
  @js.native
  sealed trait unexpectedClientError extends WebErrorStatus
  
  /** A request was unexpectedly redirected. */
  @js.native
  sealed trait unexpectedRedirection extends WebErrorStatus
  
  /** An unexpected server-side error has occurred. */
  @js.native
  sealed trait unexpectedServerError extends WebErrorStatus
  
  /** An unexpected status code indicating a failure was received. */
  @js.native
  sealed trait unexpectedStatusCode extends WebErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown extends WebErrorStatus
  
  /** The request entity has a media type which the server or resource does not support. */
  @js.native
  sealed trait unsupportedMediaType extends WebErrorStatus
  
  /** The requested resource must be accessed through the proxy given by the Location field. */
  @js.native
  sealed trait useProxy extends WebErrorStatus
  
  /* 49 */ val badGateway: typings.winrtDashUwp.Windows.Web.WebErrorStatus.badGateway with Double = js.native
  /* 29 */ val badRequest: typings.winrtDashUwp.Windows.Web.WebErrorStatus.badRequest with Double = js.native
  /* 14 */ val cannotConnect: typings.winrtDashUwp.Windows.Web.WebErrorStatus.cannotConnect with Double = js.native
  /* 1 */ val certificateCommonNameIsIncorrect: typings.winrtDashUwp.Windows.Web.WebErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
  /* 3 */ val certificateContainsErrors: typings.winrtDashUwp.Windows.Web.WebErrorStatus.certificateContainsErrors with Double = js.native
  /* 2 */ val certificateExpired: typings.winrtDashUwp.Windows.Web.WebErrorStatus.certificateExpired with Double = js.native
  /* 5 */ val certificateIsInvalid: typings.winrtDashUwp.Windows.Web.WebErrorStatus.certificateIsInvalid with Double = js.native
  /* 4 */ val certificateRevoked: typings.winrtDashUwp.Windows.Web.WebErrorStatus.certificateRevoked with Double = js.native
  /* 38 */ val conflict: typings.winrtDashUwp.Windows.Web.WebErrorStatus.conflict with Double = js.native
  /* 9 */ val connectionAborted: typings.winrtDashUwp.Windows.Web.WebErrorStatus.connectionAborted with Double = js.native
  /* 10 */ val connectionReset: typings.winrtDashUwp.Windows.Web.WebErrorStatus.connectionReset with Double = js.native
  /* 11 */ val disconnected: typings.winrtDashUwp.Windows.Web.WebErrorStatus.disconnected with Double = js.native
  /* 8 */ val errorHttpInvalidServerResponse: typings.winrtDashUwp.Windows.Web.WebErrorStatus.errorHttpInvalidServerResponse with Double = js.native
  /* 46 */ val expectationFailed: typings.winrtDashUwp.Windows.Web.WebErrorStatus.expectationFailed with Double = js.native
  /* 32 */ val forbidden: typings.winrtDashUwp.Windows.Web.WebErrorStatus.forbidden with Double = js.native
  /* 24 */ val found: typings.winrtDashUwp.Windows.Web.WebErrorStatus.found with Double = js.native
  /* 51 */ val gatewayTimeout: typings.winrtDashUwp.Windows.Web.WebErrorStatus.gatewayTimeout with Double = js.native
  /* 39 */ val gone: typings.winrtDashUwp.Windows.Web.WebErrorStatus.gone with Double = js.native
  /* 15 */ val hostNameNotResolved: typings.winrtDashUwp.Windows.Web.WebErrorStatus.hostNameNotResolved with Double = js.native
  /* 12 */ val httpToHttpsOnRedirection: typings.winrtDashUwp.Windows.Web.WebErrorStatus.httpToHttpsOnRedirection with Double = js.native
  /* 52 */ val httpVersionNotSupported: typings.winrtDashUwp.Windows.Web.WebErrorStatus.httpVersionNotSupported with Double = js.native
  /* 13 */ val httpsToHttpOnRedirection: typings.winrtDashUwp.Windows.Web.WebErrorStatus.httpsToHttpOnRedirection with Double = js.native
  /* 47 */ val internalServerError: typings.winrtDashUwp.Windows.Web.WebErrorStatus.internalServerError with Double = js.native
  /* 40 */ val lengthRequired: typings.winrtDashUwp.Windows.Web.WebErrorStatus.lengthRequired with Double = js.native
  /* 34 */ val methodNotAllowed: typings.winrtDashUwp.Windows.Web.WebErrorStatus.methodNotAllowed with Double = js.native
  /* 23 */ val movedPermanently: typings.winrtDashUwp.Windows.Web.WebErrorStatus.movedPermanently with Double = js.native
  /* 22 */ val multipleChoices: typings.winrtDashUwp.Windows.Web.WebErrorStatus.multipleChoices with Double = js.native
  /* 35 */ val notAcceptable: typings.winrtDashUwp.Windows.Web.WebErrorStatus.notAcceptable with Double = js.native
  /* 33 */ val notFound: typings.winrtDashUwp.Windows.Web.WebErrorStatus.notFound with Double = js.native
  /* 48 */ val notImplemented: typings.winrtDashUwp.Windows.Web.WebErrorStatus.notImplemented with Double = js.native
  /* 26 */ val notModified: typings.winrtDashUwp.Windows.Web.WebErrorStatus.notModified with Double = js.native
  /* 16 */ val operationCanceled: typings.winrtDashUwp.Windows.Web.WebErrorStatus.operationCanceled with Double = js.native
  /* 31 */ val paymentRequired: typings.winrtDashUwp.Windows.Web.WebErrorStatus.paymentRequired with Double = js.native
  /* 41 */ val preconditionFailed: typings.winrtDashUwp.Windows.Web.WebErrorStatus.preconditionFailed with Double = js.native
  /* 36 */ val proxyAuthenticationRequired: typings.winrtDashUwp.Windows.Web.WebErrorStatus.proxyAuthenticationRequired with Double = js.native
  /* 17 */ val redirectFailed: typings.winrtDashUwp.Windows.Web.WebErrorStatus.redirectFailed with Double = js.native
  /* 42 */ val requestEntityTooLarge: typings.winrtDashUwp.Windows.Web.WebErrorStatus.requestEntityTooLarge with Double = js.native
  /* 37 */ val requestTimeout: typings.winrtDashUwp.Windows.Web.WebErrorStatus.requestTimeout with Double = js.native
  /* 43 */ val requestUriTooLong: typings.winrtDashUwp.Windows.Web.WebErrorStatus.requestUriTooLong with Double = js.native
  /* 45 */ val requestedRangeNotSatisfiable: typings.winrtDashUwp.Windows.Web.WebErrorStatus.requestedRangeNotSatisfiable with Double = js.native
  /* 25 */ val seeOther: typings.winrtDashUwp.Windows.Web.WebErrorStatus.seeOther with Double = js.native
  /* 6 */ val serverUnreachable: typings.winrtDashUwp.Windows.Web.WebErrorStatus.serverUnreachable with Double = js.native
  /* 50 */ val serviceUnavailable: typings.winrtDashUwp.Windows.Web.WebErrorStatus.serviceUnavailable with Double = js.native
  /* 28 */ val temporaryRedirect: typings.winrtDashUwp.Windows.Web.WebErrorStatus.temporaryRedirect with Double = js.native
  /* 7 */ val timeout: typings.winrtDashUwp.Windows.Web.WebErrorStatus.timeout with Double = js.native
  /* 30 */ val unauthorized: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unauthorized with Double = js.native
  /* 20 */ val unexpectedClientError: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unexpectedClientError with Double = js.native
  /* 19 */ val unexpectedRedirection: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unexpectedRedirection with Double = js.native
  /* 21 */ val unexpectedServerError: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unexpectedServerError with Double = js.native
  /* 18 */ val unexpectedStatusCode: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unexpectedStatusCode with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unknown with Double = js.native
  /* 44 */ val unsupportedMediaType: typings.winrtDashUwp.Windows.Web.WebErrorStatus.unsupportedMediaType with Double = js.native
  /* 27 */ val useProxy: typings.winrtDashUwp.Windows.Web.WebErrorStatus.useProxy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebErrorStatus with Double] = js.native
}

