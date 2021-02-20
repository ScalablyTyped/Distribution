package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperatorACDStatuses extends StObject
@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses with Double] = js.native
  
  @js.native
  sealed trait AfterService extends OperatorACDStatuses
  /* 0 */ val AfterService: typings.voximplantWebsdk.mod.OperatorACDStatuses.AfterService with Double = js.native
  
  @js.native
  sealed trait DND extends OperatorACDStatuses
  /* 1 */ val DND: typings.voximplantWebsdk.mod.OperatorACDStatuses.DND with Double = js.native
  
  @js.native
  sealed trait InService extends OperatorACDStatuses
  /* 2 */ val InService: typings.voximplantWebsdk.mod.OperatorACDStatuses.InService with Double = js.native
  
  @js.native
  sealed trait Offline extends OperatorACDStatuses
  /* 3 */ val Offline: typings.voximplantWebsdk.mod.OperatorACDStatuses.Offline with Double = js.native
  
  @js.native
  sealed trait Online extends OperatorACDStatuses
  /* 4 */ val Online: typings.voximplantWebsdk.mod.OperatorACDStatuses.Online with Double = js.native
  
  @js.native
  sealed trait Ready extends OperatorACDStatuses
  /* 5 */ val Ready: typings.voximplantWebsdk.mod.OperatorACDStatuses.Ready with Double = js.native
  
  @js.native
  sealed trait Timeout extends OperatorACDStatuses
  /* 6 */ val Timeout: typings.voximplantWebsdk.mod.OperatorACDStatuses.Timeout with Double = js.native
}
