package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import org.scalablytyped.runtime.TopLevel
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.AfterService
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.DND
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.InService
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Offline
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Online
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Ready
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.OperatorACDStatuses.Timeout
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses with Double] = js.native
  /* 0 */ @js.native
  object AfterService extends TopLevel[AfterService with Double]
  
  /* 1 */ @js.native
  object DND extends TopLevel[DND with Double]
  
  /* 2 */ @js.native
  object InService extends TopLevel[InService with Double]
  
  /* 3 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 4 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  /* 5 */ @js.native
  object Ready extends TopLevel[Ready with Double]
  
  /* 6 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
}

