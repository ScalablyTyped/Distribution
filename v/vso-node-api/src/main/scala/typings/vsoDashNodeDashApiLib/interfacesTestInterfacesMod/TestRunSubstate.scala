package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestRunSubstate extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunSubstate")
@js.native
object TestRunSubstate extends js.Object {
  @js.native
  sealed trait AbortedBySystem
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait Analyzed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait CanceledByUser
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait CancellationInProgress
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait CreatingEnvironment
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait PendingAnalysis
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait RunningTests
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  @js.native
  sealed trait TimedOut
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate
  
  /* 4 */ val AbortedBySystem: AbortedBySystem with scala.Double = js.native
  /* 7 */ val Analyzed: Analyzed with scala.Double = js.native
  /* 3 */ val CanceledByUser: CanceledByUser with scala.Double = js.native
  /* 8 */ val CancellationInProgress: CancellationInProgress with scala.Double = js.native
  /* 1 */ val CreatingEnvironment: CreatingEnvironment with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 6 */ val PendingAnalysis: PendingAnalysis with scala.Double = js.native
  /* 2 */ val RunningTests: RunningTests with scala.Double = js.native
  /* 5 */ val TimedOut: TimedOut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunSubstate with scala.Double
  ] = js.native
}

