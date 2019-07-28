package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestRunState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunState")
@js.native
object TestRunState extends js.Object {
  /**
    * Run is stopped and remaing tests have been aborted
    */
  @js.native
  sealed trait Aborted extends TestRunState
  
  /**
    * All tests have completed or been skipped.
    */
  @js.native
  sealed trait Completed extends TestRunState
  
  /**
    * Tests are running.
    */
  @js.native
  sealed trait InProgress extends TestRunState
  
  /**
    * Run requires investigation because of a test point failure This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait NeedsInvestigation extends TestRunState
  
  /**
    * The run is still being created.  No tests have started yet.
    */
  @js.native
  sealed trait NotStarted extends TestRunState
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestRunState
  
  /**
    * Run is currently initializing This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait Waiting extends TestRunState
  
  /* 4 */ val Aborted: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.Aborted with Double = js.native
  /* 3 */ val Completed: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.Completed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.InProgress with Double = js.native
  /* 6 */ val NeedsInvestigation: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.NeedsInvestigation with Double = js.native
  /* 1 */ val NotStarted: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.NotStarted with Double = js.native
  /* 0 */ val Unspecified: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.Unspecified with Double = js.native
  /* 5 */ val Waiting: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState.Waiting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunState with Double] = js.native
}

