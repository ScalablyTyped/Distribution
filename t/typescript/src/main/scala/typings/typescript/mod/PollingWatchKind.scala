package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends StObject
@JSImport("typescript", "PollingWatchKind")
@js.native
object PollingWatchKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PollingWatchKind with Double] = js.native
  
  @js.native
  sealed trait DynamicPriority extends PollingWatchKind
  /* 2 */ val DynamicPriority: typings.typescript.mod.PollingWatchKind.DynamicPriority with Double = js.native
  
  @js.native
  sealed trait FixedInterval extends PollingWatchKind
  /* 0 */ val FixedInterval: typings.typescript.mod.PollingWatchKind.FixedInterval with Double = js.native
  
  @js.native
  sealed trait PriorityInterval extends PollingWatchKind
  /* 1 */ val PriorityInterval: typings.typescript.mod.PollingWatchKind.PriorityInterval with Double = js.native
}
