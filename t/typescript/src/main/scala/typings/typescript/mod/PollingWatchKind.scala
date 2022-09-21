package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends StObject
@JSImport("typescript", "PollingWatchKind")
@js.native
object PollingWatchKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PollingWatchKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriority
    extends StObject
       with PollingWatchKind
  /* 2 */ val DynamicPriority: typings.typescript.mod.PollingWatchKind.DynamicPriority & Double = js.native
  
  @js.native
  sealed trait FixedChunkSize
    extends StObject
       with PollingWatchKind
  /* 3 */ val FixedChunkSize: typings.typescript.mod.PollingWatchKind.FixedChunkSize & Double = js.native
  
  @js.native
  sealed trait FixedInterval
    extends StObject
       with PollingWatchKind
  /* 0 */ val FixedInterval: typings.typescript.mod.PollingWatchKind.FixedInterval & Double = js.native
  
  @js.native
  sealed trait PriorityInterval
    extends StObject
       with PollingWatchKind
  /* 1 */ val PriorityInterval: typings.typescript.mod.PollingWatchKind.PriorityInterval & Double = js.native
}
