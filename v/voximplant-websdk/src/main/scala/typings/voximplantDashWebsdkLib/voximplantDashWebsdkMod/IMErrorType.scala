package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IMErrorType extends js.Object

@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends js.Object {
  @js.native
  sealed trait Error
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType
  
  @js.native
  sealed trait RemoteFunctionError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType
  
  @js.native
  sealed trait RosterError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType
  
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 0 */ val RemoteFunctionError: RemoteFunctionError with scala.Double = js.native
  /* 2 */ val RosterError: RosterError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType with scala.Double] = js.native
}

