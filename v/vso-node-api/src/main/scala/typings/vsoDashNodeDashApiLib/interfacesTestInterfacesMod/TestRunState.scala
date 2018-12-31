package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
  sealed trait Aborted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * All tests have completed or been skipped.
    */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * Tests are running.
    */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * Run requires investigation because of a test point failure This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait NeedsInvestigation
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * The run is still being created.  No tests have started yet.
    */
  @js.native
  sealed trait NotStarted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /**
    * Run is currently initializing This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait Waiting
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState
  
  /* 4 */ val Aborted: Aborted with scala.Double = js.native
  /* 3 */ val Completed: Completed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 6 */ val NeedsInvestigation: NeedsInvestigation with scala.Double = js.native
  /* 1 */ val NotStarted: NotStarted with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  /* 5 */ val Waiting: Waiting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState with scala.Double] = js.native
}

