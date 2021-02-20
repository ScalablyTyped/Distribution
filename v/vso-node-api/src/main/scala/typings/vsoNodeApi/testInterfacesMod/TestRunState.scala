package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunState extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunState")
@js.native
object TestRunState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunState with Double] = js.native
  
  /**
    * Run is stopped and remaing tests have been aborted
    */
  @js.native
  sealed trait Aborted extends TestRunState
  /* 4 */ val Aborted: typings.vsoNodeApi.testInterfacesMod.TestRunState.Aborted with Double = js.native
  
  /**
    * All tests have completed or been skipped.
    */
  @js.native
  sealed trait Completed extends TestRunState
  /* 3 */ val Completed: typings.vsoNodeApi.testInterfacesMod.TestRunState.Completed with Double = js.native
  
  /**
    * Tests are running.
    */
  @js.native
  sealed trait InProgress extends TestRunState
  /* 2 */ val InProgress: typings.vsoNodeApi.testInterfacesMod.TestRunState.InProgress with Double = js.native
  
  /**
    * Run requires investigation because of a test point failure This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait NeedsInvestigation extends TestRunState
  /* 6 */ val NeedsInvestigation: typings.vsoNodeApi.testInterfacesMod.TestRunState.NeedsInvestigation with Double = js.native
  
  /**
    * The run is still being created.  No tests have started yet.
    */
  @js.native
  sealed trait NotStarted extends TestRunState
  /* 1 */ val NotStarted: typings.vsoNodeApi.testInterfacesMod.TestRunState.NotStarted with Double = js.native
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestRunState
  /* 0 */ val Unspecified: typings.vsoNodeApi.testInterfacesMod.TestRunState.Unspecified with Double = js.native
  
  /**
    * Run is currently initializing This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait Waiting extends TestRunState
  /* 5 */ val Waiting: typings.vsoNodeApi.testInterfacesMod.TestRunState.Waiting with Double = js.native
}
