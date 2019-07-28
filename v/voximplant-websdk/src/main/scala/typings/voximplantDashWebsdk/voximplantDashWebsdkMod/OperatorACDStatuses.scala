package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperatorACDStatuses extends js.Object

@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends js.Object {
  @js.native
  sealed trait AfterService extends OperatorACDStatuses
  
  @js.native
  sealed trait DND extends OperatorACDStatuses
  
  @js.native
  sealed trait InService extends OperatorACDStatuses
  
  @js.native
  sealed trait Offline extends OperatorACDStatuses
  
  @js.native
  sealed trait Online extends OperatorACDStatuses
  
  @js.native
  sealed trait Ready extends OperatorACDStatuses
  
  @js.native
  sealed trait Timeout extends OperatorACDStatuses
  
  /* 0 */ val AfterService: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.AfterService with Double = js.native
  /* 1 */ val DND: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.DND with Double = js.native
  /* 2 */ val InService: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.InService with Double = js.native
  /* 3 */ val Offline: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Offline with Double = js.native
  /* 4 */ val Online: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Online with Double = js.native
  /* 5 */ val Ready: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Ready with Double = js.native
  /* 6 */ val Timeout: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Timeout with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses with Double] = js.native
}

