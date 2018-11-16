package typings
package winrtLib.WindowsNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebErrorStatus extends js.Object

@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends js.Object {
  @js.native
  sealed trait badGateway
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait badRequest
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait cannotConnect
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait certificateCommonNameIsIncorrect
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait certificateContainsErrors
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait certificateExpired
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait certificateIsInvalid
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait certificateRevoked
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait conflict
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait connectionAborted
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait connectionReset
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait disconnected
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait errorHttpInvalidServerResponse
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait expectationFailed
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait forbidden
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait found
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait gatewayTimeout
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait gone
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait hostNameNotResolved
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait httpToHttpsOnRedirection
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait httpVersionNotSupported
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait httpsToHttpOnRedirection
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait internalServerError
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait lengthRequired
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait methodNotAllowed
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait movedPermanently
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait multipleChoices
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait notAcceptable
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait notFound
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait notImplemented
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait notModified
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait operationCanceled
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait paymentRequired
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait preconditionFailed
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait proxyAuthenticationRequired
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait redirectFailed
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait requestEntityTooLarge
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait requestTimeout
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait requestUriTooLong
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait requestedRangeNotSatisfiable
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait seeOther
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait serverUnreachable
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait serviceUnavailable
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait temporaryRedirect
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait timeout
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unauthorized
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unexpectedClientError
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unexpectedRedirection
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unexpectedServerError
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unexpectedStatusCode
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait unsupportedMediaType
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
  @js.native
  sealed trait useProxy
    extends winrtLib.WindowsNs.WebNs.WebErrorStatus
  
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
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.WebNs.WebErrorStatus with java.lang.String] = js.native
}

