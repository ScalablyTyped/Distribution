package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IMErrorType extends js.Object

@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends js.Object {
  @js.native
  sealed trait Error extends IMErrorType
  
  @js.native
  sealed trait RemoteFunctionError extends IMErrorType
  
  @js.native
  sealed trait RosterError extends IMErrorType
  
  /* 1 */ val Error: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMErrorType.Error with Double = js.native
  /* 0 */ val RemoteFunctionError: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMErrorType.RemoteFunctionError with Double = js.native
  /* 2 */ val RosterError: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMErrorType.RosterError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType with Double] = js.native
}

