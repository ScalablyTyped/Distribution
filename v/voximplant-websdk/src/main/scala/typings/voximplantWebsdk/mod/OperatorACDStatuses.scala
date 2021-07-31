package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperatorACDStatuses extends StObject
@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses & Double] = js.native
  
  @js.native
  sealed trait AfterService
    extends StObject
       with OperatorACDStatuses
  /* 0 */ val AfterService: typings.voximplantWebsdk.mod.OperatorACDStatuses.AfterService & Double = js.native
  
  @js.native
  sealed trait DND
    extends StObject
       with OperatorACDStatuses
  /* 1 */ val DND: typings.voximplantWebsdk.mod.OperatorACDStatuses.DND & Double = js.native
  
  @js.native
  sealed trait InService
    extends StObject
       with OperatorACDStatuses
  /* 2 */ val InService: typings.voximplantWebsdk.mod.OperatorACDStatuses.InService & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with OperatorACDStatuses
  /* 3 */ val Offline: typings.voximplantWebsdk.mod.OperatorACDStatuses.Offline & Double = js.native
  
  @js.native
  sealed trait Online
    extends StObject
       with OperatorACDStatuses
  /* 4 */ val Online: typings.voximplantWebsdk.mod.OperatorACDStatuses.Online & Double = js.native
  
  @js.native
  sealed trait Ready
    extends StObject
       with OperatorACDStatuses
  /* 5 */ val Ready: typings.voximplantWebsdk.mod.OperatorACDStatuses.Ready & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with OperatorACDStatuses
  /* 6 */ val Timeout: typings.voximplantWebsdk.mod.OperatorACDStatuses.Timeout & Double = js.native
}
