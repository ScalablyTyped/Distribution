package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestOutcome extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestOutcome")
@js.native
object TestOutcome extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestOutcome with Double] = js.native
  
  /**
    * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
    */
  @js.native
  sealed trait Aborted extends TestOutcome
  /* 6 */ val Aborted: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Aborted with Double = js.native
  
  /**
    * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
    */
  @js.native
  sealed trait Blocked extends TestOutcome
  /* 7 */ val Blocked: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Blocked with Double = js.native
  
  /**
    * There was a system error while we were trying to execute a test.
    */
  @js.native
  sealed trait Error extends TestOutcome
  /* 10 */ val Error: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Error with Double = js.native
  
  /**
    * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
    */
  @js.native
  sealed trait Failed extends TestOutcome
  /* 3 */ val Failed: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Failed with Double = js.native
  
  /**
    * Test is currently executing. Added this for TCM charts
    */
  @js.native
  sealed trait InProgress extends TestOutcome
  /* 13 */ val InProgress: typings.vsoNodeApi.testInterfacesMod.TestOutcome.InProgress with Double = js.native
  
  /**
    * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
    */
  @js.native
  sealed trait Inconclusive extends TestOutcome
  /* 4 */ val Inconclusive: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Inconclusive with Double = js.native
  
  @js.native
  sealed trait MaxValue extends TestOutcome
  /* 14 */ val MaxValue: typings.vsoNodeApi.testInterfacesMod.TestOutcome.MaxValue with Double = js.native
  
  /**
    * Test has not been completed, or the test type does not report pass/failure.
    */
  @js.native
  sealed trait None extends TestOutcome
  /* 1 */ val None: typings.vsoNodeApi.testInterfacesMod.TestOutcome.None with Double = js.native
  
  /**
    * Test is Not Applicable for execution.
    */
  @js.native
  sealed trait NotApplicable extends TestOutcome
  /* 11 */ val NotApplicable: typings.vsoNodeApi.testInterfacesMod.TestOutcome.NotApplicable with Double = js.native
  
  /**
    * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
    */
  @js.native
  sealed trait NotExecuted extends TestOutcome
  /* 8 */ val NotExecuted: typings.vsoNodeApi.testInterfacesMod.TestOutcome.NotExecuted with Double = js.native
  
  /**
    * Test is not impacted. Added fot TIA.
    */
  @js.native
  sealed trait NotImpacted extends TestOutcome
  /* 14 */ val NotImpacted: typings.vsoNodeApi.testInterfacesMod.TestOutcome.NotImpacted with Double = js.native
  
  /**
    * Test was executed w/o any issues.
    */
  @js.native
  sealed trait Passed extends TestOutcome
  /* 2 */ val Passed: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Passed with Double = js.native
  
  /**
    * Test is paused.
    */
  @js.native
  sealed trait Paused extends TestOutcome
  /* 12 */ val Paused: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Paused with Double = js.native
  
  /**
    * The test timed out
    */
  @js.native
  sealed trait Timeout extends TestOutcome
  /* 5 */ val Timeout: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Timeout with Double = js.native
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified extends TestOutcome
  /* 0 */ val Unspecified: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Unspecified with Double = js.native
  
  /**
    * To be used by Run level results. This is not a failure.
    */
  @js.native
  sealed trait Warning extends TestOutcome
  /* 9 */ val Warning: typings.vsoNodeApi.testInterfacesMod.TestOutcome.Warning with Double = js.native
}
