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
  
  val Error: Error with java.lang.String = js.native
  val RemoteFunctionError: RemoteFunctionError with java.lang.String = js.native
  val RosterError: RosterError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMErrorType with java.lang.String
  ] = js.native
}

