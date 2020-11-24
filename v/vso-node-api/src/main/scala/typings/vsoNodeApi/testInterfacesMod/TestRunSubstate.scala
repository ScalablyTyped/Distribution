package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunSubstate extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunSubstate")
@js.native
object TestRunSubstate extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunSubstate with Double] = js.native
  
  @js.native
  sealed trait AbortedBySystem extends TestRunSubstate
  /* 4 */ @js.native
  object AbortedBySystem extends TopLevel[AbortedBySystem with Double]
  
  @js.native
  sealed trait Analyzed extends TestRunSubstate
  /* 7 */ @js.native
  object Analyzed extends TopLevel[Analyzed with Double]
  
  @js.native
  sealed trait CanceledByUser extends TestRunSubstate
  /* 3 */ @js.native
  object CanceledByUser extends TopLevel[CanceledByUser with Double]
  
  @js.native
  sealed trait CancellationInProgress extends TestRunSubstate
  /* 8 */ @js.native
  object CancellationInProgress extends TopLevel[CancellationInProgress with Double]
  
  @js.native
  sealed trait CreatingEnvironment extends TestRunSubstate
  /* 1 */ @js.native
  object CreatingEnvironment extends TopLevel[CreatingEnvironment with Double]
  
  @js.native
  sealed trait None extends TestRunSubstate
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait PendingAnalysis extends TestRunSubstate
  /* 6 */ @js.native
  object PendingAnalysis extends TopLevel[PendingAnalysis with Double]
  
  @js.native
  sealed trait RunningTests extends TestRunSubstate
  /* 2 */ @js.native
  object RunningTests extends TopLevel[RunningTests with Double]
  
  @js.native
  sealed trait TimedOut extends TestRunSubstate
  /* 5 */ @js.native
  object TimedOut extends TopLevel[TimedOut with Double]
}
