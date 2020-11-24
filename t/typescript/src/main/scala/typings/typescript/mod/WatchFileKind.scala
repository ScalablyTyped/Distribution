package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends js.Object
@JSImport("typescript", "WatchFileKind")
@js.native
object WatchFileKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind with Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling extends WatchFileKind
  /* 2 */ @js.native
  object DynamicPriorityPolling extends TopLevel[DynamicPriorityPolling with Double]
  
  @js.native
  sealed trait FixedPollingInterval extends WatchFileKind
  /* 0 */ @js.native
  object FixedPollingInterval extends TopLevel[FixedPollingInterval with Double]
  
  @js.native
  sealed trait PriorityPollingInterval extends WatchFileKind
  /* 1 */ @js.native
  object PriorityPollingInterval extends TopLevel[PriorityPollingInterval with Double]
  
  @js.native
  sealed trait UseFsEvents extends WatchFileKind
  /* 3 */ @js.native
  object UseFsEvents extends TopLevel[UseFsEvents with Double]
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory extends WatchFileKind
  /* 4 */ @js.native
  object UseFsEventsOnParentDirectory extends TopLevel[UseFsEventsOnParentDirectory with Double]
}
