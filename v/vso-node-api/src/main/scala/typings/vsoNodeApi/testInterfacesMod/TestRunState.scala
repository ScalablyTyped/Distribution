package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunState extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunState")
@js.native
object TestRunState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunState with Double] = js.native
  
  /**
    * Run is stopped and remaing tests have been aborted
    */
  @js.native
  sealed trait Aborted extends TestRunState
  /* 4 */ @js.native
  object Aborted extends TopLevel[Aborted with Double]
  
  /**
    * All tests have completed or been skipped.
    */
  @js.native
  sealed trait Completed extends TestRunState
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * Tests are running.
    */
  @js.native
  sealed trait InProgress extends TestRunState
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * Run requires investigation because of a test point failure This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait NeedsInvestigation extends TestRunState
  /* 6 */ @js.native
  object NeedsInvestigation extends TopLevel[NeedsInvestigation with Double]
  
  /**
    * The run is still being created.  No tests have started yet.
    */
  @js.native
  sealed trait NotStarted extends TestRunState
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestRunState
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
  /**
    * Run is currently initializing This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait Waiting extends TestRunState
  /* 5 */ @js.native
  object Waiting extends TopLevel[Waiting with Double]
}
