package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchFileKind extends js.Object

@JSImport("typescript", "WatchFileKind")
@js.native
object WatchFileKind extends js.Object {
  @js.native
  sealed trait DynamicPriorityPolling extends WatchFileKind
  
  @js.native
  sealed trait FixedPollingInterval extends WatchFileKind
  
  @js.native
  sealed trait PriorityPollingInterval extends WatchFileKind
  
  @js.native
  sealed trait UseFsEvents extends WatchFileKind
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory extends WatchFileKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind with Double] = js.native
  /* 2 */ @js.native
  object DynamicPriorityPolling extends TopLevel[DynamicPriorityPolling with Double]
  
  /* 0 */ @js.native
  object FixedPollingInterval extends TopLevel[FixedPollingInterval with Double]
  
  /* 1 */ @js.native
  object PriorityPollingInterval extends TopLevel[PriorityPollingInterval with Double]
  
  /* 3 */ @js.native
  object UseFsEvents extends TopLevel[UseFsEvents with Double]
  
  /* 4 */ @js.native
  object UseFsEventsOnParentDirectory extends TopLevel[UseFsEventsOnParentDirectory with Double]
  
}

