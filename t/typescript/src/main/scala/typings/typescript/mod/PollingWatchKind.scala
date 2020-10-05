package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends js.Object

@JSImport("typescript", "PollingWatchKind")
@js.native
object PollingWatchKind extends js.Object {
  @js.native
  sealed trait DynamicPriority extends PollingWatchKind
  
  @js.native
  sealed trait FixedInterval extends PollingWatchKind
  
  @js.native
  sealed trait PriorityInterval extends PollingWatchKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PollingWatchKind with Double] = js.native
  /* 2 */ @js.native
  object DynamicPriority extends TopLevel[DynamicPriority with Double]
  
  /* 0 */ @js.native
  object FixedInterval extends TopLevel[FixedInterval with Double]
  
  /* 1 */ @js.native
  object PriorityInterval extends TopLevel[PriorityInterval with Double]
  
}

