package typings.typedDashRestDashClient.httpClientMod

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
  sealed trait Unauthorized extends HttpCodes
  
  @js.native
  sealed trait UseProxy extends HttpCodes
  
  /* 502 */ val BadGateway: typings.typedDashRestDashClient.httpClientMod.HttpCodes.BadGateway with Double = js.native
  /* 400 */ val BadRequest: typings.typedDashRestDashClient.httpClientMod.HttpCodes.BadRequest with Double = js.native
  /* 409 */ val Conflict: typings.typedDashRestDashClient.httpClientMod.HttpCodes.Conflict with Double = js.native
  /* 403 */ val Forbidden: typings.typedDashRestDashClient.httpClientMod.HttpCodes.Forbidden with Double = js.native
  /* 504 */ val GatewayTimeout: typings.typedDashRestDashClient.httpClientMod.HttpCodes.GatewayTimeout with Double = js.native
  /* 410 */ val Gone: typings.typedDashRestDashClient.httpClientMod.HttpCodes.Gone with Double = js.native
  /* 500 */ val InternalServerError: typings.typedDashRestDashClient.httpClientMod.HttpCodes.InternalServerError with Double = js.native
  /* 405 */ val MethodNotAllowed: typings.typedDashRestDashClient.httpClientMod.HttpCodes.MethodNotAllowed with Double = js.native
  /* 301 */ val MovedPermanently: typings.typedDashRestDashClient.httpClientMod.HttpCodes.MovedPermanently with Double = js.native
  /* 300 */ val MultipleChoices: typings.typedDashRestDashClient.httpClientMod.HttpCodes.MultipleChoices with Double = js.native
  /* 406 */ val NotAcceptable: typings.typedDashRestDashClient.httpClientMod.HttpCodes.NotAcceptable with Double = js.native
  /* 404 */ val NotFound: typings.typedDashRestDashClient.httpClientMod.HttpCodes.NotFound with Double = js.native
  /* 501 */ val NotImplemented: typings.typedDashRestDashClient.httpClientMod.HttpCodes.NotImplemented with Double = js.native
  /* 304 */ val NotModified: typings.typedDashRestDashClient.httpClientMod.HttpCodes.NotModified with Double = js.native
  /* 200 */ val OK: typings.typedDashRestDashClient.httpClientMod.HttpCodes.OK with Double = js.native
  /* 402 */ val PaymentRequired: typings.typedDashRestDashClient.httpClientMod.HttpCodes.PaymentRequired with Double = js.native
  /* 308 */ val PermanentRedirect: typings.typedDashRestDashClient.httpClientMod.HttpCodes.PermanentRedirect with Double = js.native
  /* 407 */ val ProxyAuthenticationRequired: typings.typedDashRestDashClient.httpClientMod.HttpCodes.ProxyAuthenticationRequired with Double = js.native
  /* 408 */ val RequestTimeout: typings.typedDashRestDashClient.httpClientMod.HttpCodes.RequestTimeout with Double = js.native
  /* 302 */ val ResourceMoved: typings.typedDashRestDashClient.httpClientMod.HttpCodes.ResourceMoved with Double = js.native
  /* 303 */ val SeeOther: typings.typedDashRestDashClient.httpClientMod.HttpCodes.SeeOther with Double = js.native
  /* 503 */ val ServiceUnavailable: typings.typedDashRestDashClient.httpClientMod.HttpCodes.ServiceUnavailable with Double = js.native
  /* 306 */ val SwitchProxy: typings.typedDashRestDashClient.httpClientMod.HttpCodes.SwitchProxy with Double = js.native
  /* 307 */ val TemporaryRedirect: typings.typedDashRestDashClient.httpClientMod.HttpCodes.TemporaryRedirect with Double = js.native
  /* 401 */ val Unauthorized: typings.typedDashRestDashClient.httpClientMod.HttpCodes.Unauthorized with Double = js.native
  /* 305 */ val UseProxy: typings.typedDashRestDashClient.httpClientMod.HttpCodes.UseProxy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCodes with Double] = js.native
}

