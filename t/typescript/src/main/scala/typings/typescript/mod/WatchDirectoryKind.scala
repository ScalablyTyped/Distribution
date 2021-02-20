package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends StObject
@JSImport("typescript", "WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryKind with Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling extends WatchDirectoryKind
  /* 2 */ val DynamicPriorityPolling: typings.typescript.mod.WatchDirectoryKind.DynamicPriorityPolling with Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval extends WatchDirectoryKind
  /* 1 */ val FixedPollingInterval: typings.typescript.mod.WatchDirectoryKind.FixedPollingInterval with Double = js.native
  
  @js.native
  sealed trait UseFsEvents extends WatchDirectoryKind
  /* 0 */ val UseFsEvents: typings.typescript.mod.WatchDirectoryKind.UseFsEvents with Double = js.native
}
