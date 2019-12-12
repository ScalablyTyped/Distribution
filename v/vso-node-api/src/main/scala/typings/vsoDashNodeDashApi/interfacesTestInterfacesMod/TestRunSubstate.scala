package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.AbortedBySystem
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.Analyzed
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CanceledByUser
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CancellationInProgress
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CreatingEnvironment
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.None
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.PendingAnalysis
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.RunningTests
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.TimedOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestRunSubstate extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunSubstate")
@js.native
object TestRunSubstate extends js.Object {
  @js.native
  sealed trait AbortedBySystem extends TestRunSubstate
  
  @js.native
  sealed trait Analyzed extends TestRunSubstate
  
  @js.native
  sealed trait CanceledByUser extends TestRunSubstate
  
  @js.native
  sealed trait CancellationInProgress extends TestRunSubstate
  
  @js.native
  sealed trait CreatingEnvironment extends TestRunSubstate
  
  @js.native
  sealed trait None extends TestRunSubstate
  
  @js.native
  sealed trait PendingAnalysis extends TestRunSubstate
  
  @js.native
  sealed trait RunningTests extends TestRunSubstate
  
  @js.native
  sealed trait TimedOut extends TestRunSubstate
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunSubstate with Double] = js.native
  /* 4 */ @js.native
  object AbortedBySystem extends TopLevel[AbortedBySystem with Double]
  
  /* 7 */ @js.native
  object Analyzed extends TopLevel[Analyzed with Double]
  
  /* 3 */ @js.native
  object CanceledByUser extends TopLevel[CanceledByUser with Double]
  
  /* 8 */ @js.native
  object CancellationInProgress extends TopLevel[CancellationInProgress with Double]
  
  /* 1 */ @js.native
  object CreatingEnvironment extends TopLevel[CreatingEnvironment with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 6 */ @js.native
  object PendingAnalysis extends TopLevel[PendingAnalysis with Double]
  
  /* 2 */ @js.native
  object RunningTests extends TopLevel[RunningTests with Double]
  
  /* 5 */ @js.native
  object TimedOut extends TopLevel[TimedOut with Double]
  
}

