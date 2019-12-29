package typings.typedDashRestDashClient.httpClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCodes extends js.Object

@JSImport("typed-rest-client/HttpClient", "HttpCodes")
@js.native
object HttpCodes extends js.Object {
  @js.native
  sealed trait BadGateway extends HttpCodes
  
  @js.native
  sealed trait BadRequest extends HttpCodes
  
  @js.native
  sealed trait Conflict extends HttpCodes
  
  @js.native
  sealed trait Forbidden extends HttpCodes
  
  @js.native
  sealed trait GatewayTimeout extends HttpCodes
  
  @js.native
  sealed trait Gone extends HttpCodes
  
  @js.native
  sealed trait InternalServerError extends HttpCodes
  
  @js.native
  sealed trait MethodNotAllowed extends HttpCodes
  
  @js.native
  sealed trait MovedPermanently extends HttpCodes
  
  @js.native
  sealed trait MultipleChoices extends HttpCodes
  
  @js.native
  sealed trait NotAcceptable extends HttpCodes
  
  @js.native
  sealed trait NotFound extends HttpCodes
  
  @js.native
  sealed trait NotImplemented extends HttpCodes
  
  @js.native
  sealed trait NotModified extends HttpCodes
  
  @js.native
  sealed trait OK extends HttpCodes
  
  @js.native
  sealed trait PaymentRequired extends HttpCodes
  
  @js.native
  sealed trait PermanentRedirect extends HttpCodes
  
  @js.native
  sealed trait ProxyAuthenticationRequired extends HttpCodes
  
  @js.native
  sealed trait RequestTimeout extends HttpCodes
  
  @js.native
  sealed trait ResourceMoved extends HttpCodes
  
  @js.native
  sealed trait SeeOther extends HttpCodes
  
  @js.native
  sealed trait ServiceUnavailable extends HttpCodes
  
  @js.native
  sealed trait SwitchProxy extends HttpCodes
  
  @js.native
  sealed trait TemporaryRedirect extends HttpCodes
  
  @js.native
  sealed trait TooManyRequests extends HttpCodes
  
  @js.native
  sealed trait Unauthorized extends HttpCodes
  
  @js.native
  sealed trait UseProxy extends HttpCodes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCodes with Double] = js.native
  /* 502 */ @js.native
  object BadGateway extends TopLevel[BadGateway with Double]
  
  /* 400 */ @js.native
  object BadRequest extends TopLevel[BadRequest with Double]
  
  /* 409 */ @js.native
  object Conflict extends TopLevel[Conflict with Double]
  
  /* 403 */ @js.native
  object Forbidden extends TopLevel[Forbidden with Double]
  
  /* 504 */ @js.native
  object GatewayTimeout extends TopLevel[GatewayTimeout with Double]
  
  /* 410 */ @js.native
  object Gone extends TopLevel[Gone with Double]
  
  /* 500 */ @js.native
  object InternalServerError extends TopLevel[InternalServerError with Double]
  
  /* 405 */ @js.native
  object MethodNotAllowed extends TopLevel[MethodNotAllowed with Double]
  
  /* 301 */ @js.native
  object MovedPermanently extends TopLevel[MovedPermanently with Double]
  
  /* 300 */ @js.native
  object MultipleChoices extends TopLevel[MultipleChoices with Double]
  
  /* 406 */ @js.native
  object NotAcceptable extends TopLevel[NotAcceptable with Double]
  
  /* 404 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
  /* 501 */ @js.native
  object NotImplemented extends TopLevel[NotImplemented with Double]
  
  /* 304 */ @js.native
  object NotModified extends TopLevel[NotModified with Double]
  
  /* 200 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 402 */ @js.native
  object PaymentRequired extends TopLevel[PaymentRequired with Double]
  
  /* 308 */ @js.native
  object PermanentRedirect extends TopLevel[PermanentRedirect with Double]
  
  /* 407 */ @js.native
  object ProxyAuthenticationRequired extends TopLevel[ProxyAuthenticationRequired with Double]
  
  /* 408 */ @js.native
  object RequestTimeout extends TopLevel[RequestTimeout with Double]
  
  /* 302 */ @js.native
  object ResourceMoved extends TopLevel[ResourceMoved with Double]
  
  /* 303 */ @js.native
  object SeeOther extends TopLevel[SeeOther with Double]
  
  /* 503 */ @js.native
  object ServiceUnavailable extends TopLevel[ServiceUnavailable with Double]
  
  /* 306 */ @js.native
  object SwitchProxy extends TopLevel[SwitchProxy with Double]
  
  /* 307 */ @js.native
  object TemporaryRedirect extends TopLevel[TemporaryRedirect with Double]
  
  /* 429 */ @js.native
  object TooManyRequests extends TopLevel[TooManyRequests with Double]
  
  /* 401 */ @js.native
  object Unauthorized extends TopLevel[Unauthorized with Double]
  
  /* 305 */ @js.native
  object UseProxy extends TopLevel[UseProxy with Double]
  
}

