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
  
  val AfterService: AfterService with java.lang.String = js.native
  val DND: DND with java.lang.String = js.native
  val InService: InService with java.lang.String = js.native
  val Offline: Offline with java.lang.String = js.native
  val Online: Online with java.lang.String = js.native
  val Ready: Ready with java.lang.String = js.native
  val Timeout: Timeout with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    voximplantDashWebsdkLib.voximplantDashWebsdkMod.OperatorACDStatuses with java.lang.String
  ] = js.native
}

