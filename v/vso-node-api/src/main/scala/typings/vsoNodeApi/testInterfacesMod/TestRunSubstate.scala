package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunSubstate extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunSubstate")
@js.native
object TestRunSubstate extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunSubstate & Double] = js.native
  
  @js.native
  sealed trait AbortedBySystem
    extends StObject
       with TestRunSubstate
  /* 4 */ val AbortedBySystem: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.AbortedBySystem & Double = js.native
  
  @js.native
  sealed trait Analyzed
    extends StObject
       with TestRunSubstate
  /* 7 */ val Analyzed: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.Analyzed & Double = js.native
  
  @js.native
  sealed trait CanceledByUser
    extends StObject
       with TestRunSubstate
  /* 3 */ val CanceledByUser: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.CanceledByUser & Double = js.native
  
  @js.native
  sealed trait CancellationInProgress
    extends StObject
       with TestRunSubstate
  /* 8 */ val CancellationInProgress: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.CancellationInProgress & Double = js.native
  
  @js.native
  sealed trait CreatingEnvironment
    extends StObject
       with TestRunSubstate
  /* 1 */ val CreatingEnvironment: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.CreatingEnvironment & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TestRunSubstate
  /* 0 */ val None: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.None & Double = js.native
  
  @js.native
  sealed trait PendingAnalysis
    extends StObject
       with TestRunSubstate
  /* 6 */ val PendingAnalysis: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.PendingAnalysis & Double = js.native
  
  @js.native
  sealed trait RunningTests
    extends StObject
       with TestRunSubstate
  /* 2 */ val RunningTests: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.RunningTests & Double = js.native
  
  @js.native
  sealed trait TimedOut
    extends StObject
       with TestRunSubstate
  /* 5 */ val TimedOut: typings.vsoNodeApi.testInterfacesMod.TestRunSubstate.TimedOut & Double = js.native
}
