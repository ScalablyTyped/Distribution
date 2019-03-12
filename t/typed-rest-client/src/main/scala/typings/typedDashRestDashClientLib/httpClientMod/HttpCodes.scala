package typings
package typedDashRestDashClientLib.httpClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCodes extends js.Object

@JSImport("typed-rest-client/HttpClient", "HttpCodes")
@js.native
object HttpCodes extends js.Object {
  @js.native
  sealed trait BadGateway
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait BadRequest
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait Conflict
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait Forbidden
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait GatewayTimeout
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait Gone
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait InternalServerError
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait MethodNotAllowed
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait MovedPermanently
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait MultipleChoices
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait NotAcceptable
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait NotFound
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait NotImplemented
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait NotModified
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait OK
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait PaymentRequired
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait PermanentRedirect
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait ProxyAuthenticationRequired
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait RequestTimeout
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait ResourceMoved
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait SeeOther
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait ServiceUnavailable
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait SwitchProxy
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait TemporaryRedirect
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait Unauthorized
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  @js.native
  sealed trait UseProxy
    extends typedDashRestDashClientLib.httpClientMod.HttpCodes
  
  /* 502 */ val BadGateway: BadGateway with scala.Double = js.native
  /* 400 */ val BadRequest: BadRequest with scala.Double = js.native
  /* 409 */ val Conflict: Conflict with scala.Double = js.native
  /* 403 */ val Forbidden: Forbidden with scala.Double = js.native
  /* 504 */ val GatewayTimeout: GatewayTimeout with scala.Double = js.native
  /* 410 */ val Gone: Gone with scala.Double = js.native
  /* 500 */ val InternalServerError: InternalServerError with scala.Double = js.native
  /* 405 */ val MethodNotAllowed: MethodNotAllowed with scala.Double = js.native
  /* 301 */ val MovedPermanently: MovedPermanently with scala.Double = js.native
  /* 300 */ val MultipleChoices: MultipleChoices with scala.Double = js.native
  /* 406 */ val NotAcceptable: NotAcceptable with scala.Double = js.native
  /* 404 */ val NotFound: NotFound with scala.Double = js.native
  /* 501 */ val NotImplemented: NotImplemented with scala.Double = js.native
  /* 304 */ val NotModified: NotModified with scala.Double = js.native
  /* 200 */ val OK: OK with scala.Double = js.native
  /* 402 */ val PaymentRequired: PaymentRequired with scala.Double = js.native
  /* 308 */ val PermanentRedirect: PermanentRedirect with scala.Double = js.native
  /* 407 */ val ProxyAuthenticationRequired: ProxyAuthenticationRequired with scala.Double = js.native
  /* 408 */ val RequestTimeout: RequestTimeout with scala.Double = js.native
  /* 302 */ val ResourceMoved: ResourceMoved with scala.Double = js.native
  /* 303 */ val SeeOther: SeeOther with scala.Double = js.native
  /* 503 */ val ServiceUnavailable: ServiceUnavailable with scala.Double = js.native
  /* 306 */ val SwitchProxy: SwitchProxy with scala.Double = js.native
  /* 307 */ val TemporaryRedirect: TemporaryRedirect with scala.Double = js.native
  /* 401 */ val Unauthorized: Unauthorized with scala.Double = js.native
  /* 305 */ val UseProxy: UseProxy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedDashRestDashClientLib.httpClientMod.HttpCodes with scala.Double] = js.native
}

