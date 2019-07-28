package typings.winrt.WindowsNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebErrorStatus extends js.Object

@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends js.Object {
  @js.native
  sealed trait badGateway extends WebErrorStatus
  
  @js.native
  sealed trait badRequest extends WebErrorStatus
  
  @js.native
  sealed trait cannotConnect extends WebErrorStatus
  
  @js.native
  sealed trait certificateCommonNameIsIncorrect extends WebErrorStatus
  
  @js.native
  sealed trait certificateContainsErrors extends WebErrorStatus
  
  @js.native
  sealed trait certificateExpired extends WebErrorStatus
  
  @js.native
  sealed trait certificateIsInvalid extends WebErrorStatus
  
  @js.native
  sealed trait certificateRevoked extends WebErrorStatus
  
  @js.native
  sealed trait conflict extends WebErrorStatus
  
  @js.native
  sealed trait connectionAborted extends WebErrorStatus
  
  @js.native
  sealed trait connectionReset extends WebErrorStatus
  
  @js.native
  sealed trait disconnected extends WebErrorStatus
  
  @js.native
  sealed trait errorHttpInvalidServerResponse extends WebErrorStatus
  
  @js.native
  sealed trait expectationFailed extends WebErrorStatus
  
  @js.native
  sealed trait forbidden extends WebErrorStatus
  
  @js.native
  sealed trait found extends WebErrorStatus
  
  @js.native
  sealed trait gatewayTimeout extends WebErrorStatus
  
  @js.native
  sealed trait gone extends WebErrorStatus
  
  @js.native
  sealed trait hostNameNotResolved extends WebErrorStatus
  
  @js.native
  sealed trait httpToHttpsOnRedirection extends WebErrorStatus
  
  @js.native
  sealed trait httpVersionNotSupported extends WebErrorStatus
  
  @js.native
  sealed trait httpsToHttpOnRedirection extends WebErrorStatus
  
  @js.native
  sealed trait internalServerError extends WebErrorStatus
  
  @js.native
  sealed trait lengthRequired extends WebErrorStatus
  
  @js.native
  sealed trait methodNotAllowed extends WebErrorStatus
  
  @js.native
  sealed trait movedPermanently extends WebErrorStatus
  
  @js.native
  sealed trait multipleChoices extends WebErrorStatus
  
  @js.native
  sealed trait notAcceptable extends WebErrorStatus
  
  @js.native
  sealed trait notFound extends WebErrorStatus
  
  @js.native
  sealed trait notImplemented extends WebErrorStatus
  
  @js.native
  sealed trait notModified extends WebErrorStatus
  
  @js.native
  sealed trait operationCanceled extends WebErrorStatus
  
  @js.native
  sealed trait paymentRequired extends WebErrorStatus
  
  @js.native
  sealed trait preconditionFailed extends WebErrorStatus
  
  @js.native
  sealed trait proxyAuthenticationRequired extends WebErrorStatus
  
  @js.native
  sealed trait redirectFailed extends WebErrorStatus
  
  @js.native
  sealed trait requestEntityTooLarge extends WebErrorStatus
  
  @js.native
  sealed trait requestTimeout extends WebErrorStatus
  
  @js.native
  sealed trait requestUriTooLong extends WebErrorStatus
  
  @js.native
  sealed trait requestedRangeNotSatisfiable extends WebErrorStatus
  
  @js.native
  sealed trait seeOther extends WebErrorStatus
  
  @js.native
  sealed trait serverUnreachable extends WebErrorStatus
  
  @js.native
  sealed trait serviceUnavailable extends WebErrorStatus
  
  @js.native
  sealed trait temporaryRedirect extends WebErrorStatus
  
  @js.native
  sealed trait timeout extends WebErrorStatus
  
  @js.native
  sealed trait unauthorized extends WebErrorStatus
  
  @js.native
  sealed trait unexpectedClientError extends WebErrorStatus
  
  @js.native
  sealed trait unexpectedRedirection extends WebErrorStatus
  
  @js.native
  sealed trait unexpectedServerError extends WebErrorStatus
  
  @js.native
  sealed trait unexpectedStatusCode extends WebErrorStatus
  
  @js.native
  sealed trait unknown extends WebErrorStatus
  
  @js.native
  sealed trait unsupportedMediaType extends WebErrorStatus
  
  @js.native
  sealed trait useProxy extends WebErrorStatus
  
  /* 49 */ val badGateway: typings.winrt.WindowsNs.WebNs.WebErrorStatus.badGateway with Double = js.native
  /* 29 */ val badRequest: typings.winrt.WindowsNs.WebNs.WebErrorStatus.badRequest with Double = js.native
  /* 14 */ val cannotConnect: typings.winrt.WindowsNs.WebNs.WebErrorStatus.cannotConnect with Double = js.native
  /* 1 */ val certificateCommonNameIsIncorrect: typings.winrt.WindowsNs.WebNs.WebErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
  /* 3 */ val certificateContainsErrors: typings.winrt.WindowsNs.WebNs.WebErrorStatus.certificateContainsErrors with Double = js.native
  /* 2 */ val certificateExpired: typings.winrt.WindowsNs.WebNs.WebErrorStatus.certificateExpired with Double = js.native
  /* 5 */ val certificateIsInvalid: typings.winrt.WindowsNs.WebNs.WebErrorStatus.certificateIsInvalid with Double = js.native
  /* 4 */ val certificateRevoked: typings.winrt.WindowsNs.WebNs.WebErrorStatus.certificateRevoked with Double = js.native
  /* 38 */ val conflict: typings.winrt.WindowsNs.WebNs.WebErrorStatus.conflict with Double = js.native
  /* 9 */ val connectionAborted: typings.winrt.WindowsNs.WebNs.WebErrorStatus.connectionAborted with Double = js.native
  /* 10 */ val connectionReset: typings.winrt.WindowsNs.WebNs.WebErrorStatus.connectionReset with Double = js.native
  /* 11 */ val disconnected: typings.winrt.WindowsNs.WebNs.WebErrorStatus.disconnected with Double = js.native
  /* 8 */ val errorHttpInvalidServerResponse: typings.winrt.WindowsNs.WebNs.WebErrorStatus.errorHttpInvalidServerResponse with Double = js.native
  /* 46 */ val expectationFailed: typings.winrt.WindowsNs.WebNs.WebErrorStatus.expectationFailed with Double = js.native
  /* 32 */ val forbidden: typings.winrt.WindowsNs.WebNs.WebErrorStatus.forbidden with Double = js.native
  /* 24 */ val found: typings.winrt.WindowsNs.WebNs.WebErrorStatus.found with Double = js.native
  /* 51 */ val gatewayTimeout: typings.winrt.WindowsNs.WebNs.WebErrorStatus.gatewayTimeout with Double = js.native
  /* 39 */ val gone: typings.winrt.WindowsNs.WebNs.WebErrorStatus.gone with Double = js.native
  /* 15 */ val hostNameNotResolved: typings.winrt.WindowsNs.WebNs.WebErrorStatus.hostNameNotResolved with Double = js.native
  /* 12 */ val httpToHttpsOnRedirection: typings.winrt.WindowsNs.WebNs.WebErrorStatus.httpToHttpsOnRedirection with Double = js.native
  /* 52 */ val httpVersionNotSupported: typings.winrt.WindowsNs.WebNs.WebErrorStatus.httpVersionNotSupported with Double = js.native
  /* 13 */ val httpsToHttpOnRedirection: typings.winrt.WindowsNs.WebNs.WebErrorStatus.httpsToHttpOnRedirection with Double = js.native
  /* 47 */ val internalServerError: typings.winrt.WindowsNs.WebNs.WebErrorStatus.internalServerError with Double = js.native
  /* 40 */ val lengthRequired: typings.winrt.WindowsNs.WebNs.WebErrorStatus.lengthRequired with Double = js.native
  /* 34 */ val methodNotAllowed: typings.winrt.WindowsNs.WebNs.WebErrorStatus.methodNotAllowed with Double = js.native
  /* 23 */ val movedPermanently: typings.winrt.WindowsNs.WebNs.WebErrorStatus.movedPermanently with Double = js.native
  /* 22 */ val multipleChoices: typings.winrt.WindowsNs.WebNs.WebErrorStatus.multipleChoices with Double = js.native
  /* 35 */ val notAcceptable: typings.winrt.WindowsNs.WebNs.WebErrorStatus.notAcceptable with Double = js.native
  /* 33 */ val notFound: typings.winrt.WindowsNs.WebNs.WebErrorStatus.notFound with Double = js.native
  /* 48 */ val notImplemented: typings.winrt.WindowsNs.WebNs.WebErrorStatus.notImplemented with Double = js.native
  /* 26 */ val notModified: typings.winrt.WindowsNs.WebNs.WebErrorStatus.notModified with Double = js.native
  /* 16 */ val operationCanceled: typings.winrt.WindowsNs.WebNs.WebErrorStatus.operationCanceled with Double = js.native
  /* 31 */ val paymentRequired: typings.winrt.WindowsNs.WebNs.WebErrorStatus.paymentRequired with Double = js.native
  /* 41 */ val preconditionFailed: typings.winrt.WindowsNs.WebNs.WebErrorStatus.preconditionFailed with Double = js.native
  /* 36 */ val proxyAuthenticationRequired: typings.winrt.WindowsNs.WebNs.WebErrorStatus.proxyAuthenticationRequired with Double = js.native
  /* 17 */ val redirectFailed: typings.winrt.WindowsNs.WebNs.WebErrorStatus.redirectFailed with Double = js.native
  /* 42 */ val requestEntityTooLarge: typings.winrt.WindowsNs.WebNs.WebErrorStatus.requestEntityTooLarge with Double = js.native
  /* 37 */ val requestTimeout: typings.winrt.WindowsNs.WebNs.WebErrorStatus.requestTimeout with Double = js.native
  /* 43 */ val requestUriTooLong: typings.winrt.WindowsNs.WebNs.WebErrorStatus.requestUriTooLong with Double = js.native
  /* 45 */ val requestedRangeNotSatisfiable: typings.winrt.WindowsNs.WebNs.WebErrorStatus.requestedRangeNotSatisfiable with Double = js.native
  /* 25 */ val seeOther: typings.winrt.WindowsNs.WebNs.WebErrorStatus.seeOther with Double = js.native
  /* 6 */ val serverUnreachable: typings.winrt.WindowsNs.WebNs.WebErrorStatus.serverUnreachable with Double = js.native
  /* 50 */ val serviceUnavailable: typings.winrt.WindowsNs.WebNs.WebErrorStatus.serviceUnavailable with Double = js.native
  /* 28 */ val temporaryRedirect: typings.winrt.WindowsNs.WebNs.WebErrorStatus.temporaryRedirect with Double = js.native
  /* 7 */ val timeout: typings.winrt.WindowsNs.WebNs.WebErrorStatus.timeout with Double = js.native
  /* 30 */ val unauthorized: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unauthorized with Double = js.native
  /* 20 */ val unexpectedClientError: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unexpectedClientError with Double = js.native
  /* 19 */ val unexpectedRedirection: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unexpectedRedirection with Double = js.native
  /* 21 */ val unexpectedServerError: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unexpectedServerError with Double = js.native
  /* 18 */ val unexpectedStatusCode: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unexpectedStatusCode with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unknown with Double = js.native
  /* 44 */ val unsupportedMediaType: typings.winrt.WindowsNs.WebNs.WebErrorStatus.unsupportedMediaType with Double = js.native
  /* 27 */ val useProxy: typings.winrt.WindowsNs.WebNs.WebErrorStatus.useProxy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebErrorStatus with Double] = js.native
}

