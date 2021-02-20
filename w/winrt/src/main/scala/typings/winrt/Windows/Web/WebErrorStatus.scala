package typings.winrt.Windows.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebErrorStatus extends StObject
@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends StObject {
  
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
}
