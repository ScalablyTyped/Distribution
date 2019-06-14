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
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.WebNs.WebErrorStatus with scala.Double] = js.native
}

