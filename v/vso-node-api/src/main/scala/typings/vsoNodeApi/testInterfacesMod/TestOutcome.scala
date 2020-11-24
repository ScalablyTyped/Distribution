package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestOutcome extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestOutcome")
@js.native
object TestOutcome extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestOutcome with Double] = js.native
  
  /**
    * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
    */
  @js.native
  sealed trait Aborted extends TestOutcome
  /* 6 */ @js.native
  object Aborted extends TopLevel[Aborted with Double]
  
  /**
    * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
    */
  @js.native
  sealed trait Blocked extends TestOutcome
  /* 7 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  /**
    * There was a system error while we were trying to execute a test.
    */
  @js.native
  sealed trait Error extends TestOutcome
  /* 10 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /**
    * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
    */
  @js.native
  sealed trait Failed extends TestOutcome
  /* 3 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * Test is currently executing. Added this for TCM charts
    */
  @js.native
  sealed trait InProgress extends TestOutcome
  /* 13 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
    */
  @js.native
  sealed trait Inconclusive extends TestOutcome
  /* 4 */ @js.native
  object Inconclusive extends TopLevel[Inconclusive with Double]
  
  @js.native
  sealed trait MaxValue extends TestOutcome
  /* 14 */ @js.native
  object MaxValue extends TopLevel[MaxValue with Double]
  
  /**
    * Test has not been completed, or the test type does not report pass/failure.
    */
  @js.native
  sealed trait None extends TestOutcome
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Test is Not Applicable for execution.
    */
  @js.native
  sealed trait NotApplicable extends TestOutcome
  /* 11 */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with Double]
  
  /**
    * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
    */
  @js.native
  sealed trait NotExecuted extends TestOutcome
  /* 8 */ @js.native
  object NotExecuted extends TopLevel[NotExecuted with Double]
  
  /**
    * Test is not impacted. Added fot TIA.
    */
  @js.native
  sealed trait NotImpacted extends TestOutcome
  /* 14 */ @js.native
  object NotImpacted extends TopLevel[NotImpacted with Double]
  
  /**
    * Test was executed w/o any issues.
    */
  @js.native
  sealed trait Passed extends TestOutcome
  /* 2 */ @js.native
  object Passed extends TopLevel[Passed with Double]
  
  /**
    * Test is paused.
    */
  @js.native
  sealed trait Paused extends TestOutcome
  /* 12 */ @js.native
  object Paused extends TopLevel[Paused with Double]
  
  /**
    * The test timed out
    */
  @js.native
  sealed trait Timeout extends TestOutcome
  /* 5 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestOutcome
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
  /**
    * To be used by Run level results. This is not a failure.
    */
  @js.native
  sealed trait Warning extends TestOutcome
  /* 9 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
