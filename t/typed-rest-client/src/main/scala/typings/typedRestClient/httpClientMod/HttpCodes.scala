package typings.typedRestClient.httpClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpCodes extends js.Object
@JSImport("typed-rest-client/HttpClient", "HttpCodes")
@js.native
object HttpCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCodes with Double] = js.native
  
  @js.native
  sealed trait BadGateway extends HttpCodes
  /* 502 */ @js.native
  object BadGateway extends TopLevel[BadGateway with Double]
  
  @js.native
  sealed trait BadRequest extends HttpCodes
  /* 400 */ @js.native
  object BadRequest extends TopLevel[BadRequest with Double]
  
  @js.native
  sealed trait Conflict extends HttpCodes
  /* 409 */ @js.native
  object Conflict extends TopLevel[Conflict with Double]
  
  @js.native
  sealed trait Forbidden extends HttpCodes
  /* 403 */ @js.native
  object Forbidden extends TopLevel[Forbidden with Double]
  
  @js.native
  sealed trait GatewayTimeout extends HttpCodes
  /* 504 */ @js.native
  object GatewayTimeout extends TopLevel[GatewayTimeout with Double]
  
  @js.native
  sealed trait Gone extends HttpCodes
  /* 410 */ @js.native
  object Gone extends TopLevel[Gone with Double]
  
  @js.native
  sealed trait InternalServerError extends HttpCodes
  /* 500 */ @js.native
  object InternalServerError extends TopLevel[InternalServerError with Double]
  
  @js.native
  sealed trait MethodNotAllowed extends HttpCodes
  /* 405 */ @js.native
  object MethodNotAllowed extends TopLevel[MethodNotAllowed with Double]
  
  @js.native
  sealed trait MovedPermanently extends HttpCodes
  /* 301 */ @js.native
  object MovedPermanently extends TopLevel[MovedPermanently with Double]
  
  @js.native
  sealed trait MultipleChoices extends HttpCodes
  /* 300 */ @js.native
  object MultipleChoices extends TopLevel[MultipleChoices with Double]
  
  @js.native
  sealed trait NotAcceptable extends HttpCodes
  /* 406 */ @js.native
  object NotAcceptable extends TopLevel[NotAcceptable with Double]
  
  @js.native
  sealed trait NotFound extends HttpCodes
  /* 404 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
  @js.native
  sealed trait NotImplemented extends HttpCodes
  /* 501 */ @js.native
  object NotImplemented extends TopLevel[NotImplemented with Double]
  
  @js.native
  sealed trait NotModified extends HttpCodes
  /* 304 */ @js.native
  object NotModified extends TopLevel[NotModified with Double]
  
  @js.native
  sealed trait OK extends HttpCodes
  /* 200 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait PaymentRequired extends HttpCodes
  /* 402 */ @js.native
  object PaymentRequired extends TopLevel[PaymentRequired with Double]
  
  @js.native
  sealed trait PermanentRedirect extends HttpCodes
  /* 308 */ @js.native
  object PermanentRedirect extends TopLevel[PermanentRedirect with Double]
  
  @js.native
  sealed trait ProxyAuthenticationRequired extends HttpCodes
  /* 407 */ @js.native
  object ProxyAuthenticationRequired extends TopLevel[ProxyAuthenticationRequired with Double]
  
  @js.native
  sealed trait RequestTimeout extends HttpCodes
  /* 408 */ @js.native
  object RequestTimeout extends TopLevel[RequestTimeout with Double]
  
  @js.native
  sealed trait ResourceMoved extends HttpCodes
  /* 302 */ @js.native
  object ResourceMoved extends TopLevel[ResourceMoved with Double]
  
  @js.native
  sealed trait SeeOther extends HttpCodes
  /* 303 */ @js.native
  object SeeOther extends TopLevel[SeeOther with Double]
  
  @js.native
  sealed trait ServiceUnavailable extends HttpCodes
  /* 503 */ @js.native
  object ServiceUnavailable extends TopLevel[ServiceUnavailable with Double]
  
  @js.native
  sealed trait SwitchProxy extends HttpCodes
  /* 306 */ @js.native
  object SwitchProxy extends TopLevel[SwitchProxy with Double]
  
  @js.native
  sealed trait TemporaryRedirect extends HttpCodes
  /* 307 */ @js.native
  object TemporaryRedirect extends TopLevel[TemporaryRedirect with Double]
  
  @js.native
  sealed trait TooManyRequests extends HttpCodes
  /* 429 */ @js.native
  object TooManyRequests extends TopLevel[TooManyRequests with Double]
  
  @js.native
  sealed trait Unauthorized extends HttpCodes
  /* 401 */ @js.native
  object Unauthorized extends TopLevel[Unauthorized with Double]
  
  @js.native
  sealed trait UseProxy extends HttpCodes
  /* 305 */ @js.native
  object UseProxy extends TopLevel[UseProxy with Double]
}
