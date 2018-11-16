package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IMErrorType extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "IMErrorType")
@js.native
object IMErrorType extends js.Object {
  @js.native
  sealed trait Error
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMErrorType
  
  @js.native
  sealed trait RemoteFunctionError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMErrorType
  
  @js.native
  sealed trait RosterError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMErrorType
  
}

