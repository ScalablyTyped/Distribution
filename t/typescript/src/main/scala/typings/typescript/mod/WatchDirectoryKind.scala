package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchDirectoryKind extends js.Object

@JSImport("typescript", "WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends js.Object {
  @js.native
  sealed trait DynamicPriorityPolling extends WatchDirectoryKind
  
  @js.native
  sealed trait FixedPollingInterval extends WatchDirectoryKind
  
  @js.native
  sealed trait UseFsEvents extends WatchDirectoryKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryKind with Double] = js.native
  /* 2 */ @js.native
  object DynamicPriorityPolling extends TopLevel[DynamicPriorityPolling with Double]
  
  /* 1 */ @js.native
  object FixedPollingInterval extends TopLevel[FixedPollingInterval with Double]
  
  /* 0 */ @js.native
  object UseFsEvents extends TopLevel[UseFsEvents with Double]
  
}

