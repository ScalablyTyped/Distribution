package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends js.Object
@JSImport("typescript", "WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryKind with Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling extends WatchDirectoryKind
  /* 2 */ @js.native
  object DynamicPriorityPolling extends TopLevel[DynamicPriorityPolling with Double]
  
  @js.native
  sealed trait FixedPollingInterval extends WatchDirectoryKind
  /* 1 */ @js.native
  object FixedPollingInterval extends TopLevel[FixedPollingInterval with Double]
  
  @js.native
  sealed trait UseFsEvents extends WatchDirectoryKind
  /* 0 */ @js.native
  object UseFsEvents extends TopLevel[UseFsEvents with Double]
}
