package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunState with Double] = js.native
  /* 4 */ @js.native
  object Aborted extends TopLevel[Aborted with Double]
  
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 6 */ @js.native
  object NeedsInvestigation extends TopLevel[NeedsInvestigation with Double]
  
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
  /* 5 */ @js.native
  object Waiting extends TopLevel[Waiting with Double]
  
}

