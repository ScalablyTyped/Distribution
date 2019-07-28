package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  
  /* 4 */ val AbortedBySystem: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.AbortedBySystem with Double = js.native
  /* 7 */ val Analyzed: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.Analyzed with Double = js.native
  /* 3 */ val CanceledByUser: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CanceledByUser with Double = js.native
  /* 8 */ val CancellationInProgress: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CancellationInProgress with Double = js.native
  /* 1 */ val CreatingEnvironment: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.CreatingEnvironment with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.None with Double = js.native
  /* 6 */ val PendingAnalysis: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.PendingAnalysis with Double = js.native
  /* 2 */ val RunningTests: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.RunningTests with Double = js.native
  /* 5 */ val TimedOut: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunSubstate.TimedOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunSubstate with Double] = js.native
}

