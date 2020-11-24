package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperatorACDStatuses extends js.Object
@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses with Double] = js.native
  
  @js.native
  sealed trait AfterService extends OperatorACDStatuses
  /* 0 */ @js.native
  object AfterService extends TopLevel[AfterService with Double]
  
  @js.native
  sealed trait DND extends OperatorACDStatuses
  /* 1 */ @js.native
  object DND extends TopLevel[DND with Double]
  
  @js.native
  sealed trait InService extends OperatorACDStatuses
  /* 2 */ @js.native
  object InService extends TopLevel[InService with Double]
  
  @js.native
  sealed trait Offline extends OperatorACDStatuses
  /* 3 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  @js.native
  sealed trait Online extends OperatorACDStatuses
  /* 4 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  @js.native
  sealed trait Ready extends OperatorACDStatuses
  /* 5 */ @js.native
  object Ready extends TopLevel[Ready with Double]
  
  @js.native
  sealed trait Timeout extends OperatorACDStatuses
  /* 6 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
}
