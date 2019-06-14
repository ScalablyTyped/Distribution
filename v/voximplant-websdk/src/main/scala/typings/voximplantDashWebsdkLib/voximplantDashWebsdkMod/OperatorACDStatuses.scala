package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperatorACDStatuses extends js.Object

@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends js.Object {
  @js.native
  sealed trait AfterService
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait DND
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait InService
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait Offline
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait Online
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait Ready
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  @js.native
  sealed trait Timeout
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses
  
  /* 0 */ val AfterService: AfterService with scala.Double = js.native
  /* 1 */ val DND: DND with scala.Double = js.native
  /* 2 */ val InService: InService with scala.Double = js.native
  /* 3 */ val Offline: Offline with scala.Double = js.native
  /* 4 */ val Online: Online with scala.Double = js.native
  /* 5 */ val Ready: Ready with scala.Double = js.native
  /* 6 */ val Timeout: Timeout with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses with scala.Double
  ] = js.native
}

