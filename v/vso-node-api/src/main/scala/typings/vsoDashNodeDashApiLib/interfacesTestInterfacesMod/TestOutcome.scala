package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestOutcome extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestOutcome")
@js.native
object TestOutcome extends js.Object {
  /**
       * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
       */
  @js.native
  sealed trait Aborted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
       */
  @js.native
  sealed trait Blocked
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * There was a system error while we were trying to execute a test.
       */
  @js.native
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test is currently executing. Added this for TCM charts
       */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
       */
  @js.native
  sealed trait Inconclusive
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  @js.native
  sealed trait MaxValue
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test has not been completed, or the test type does not report pass/failure.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test is Not Applicable for execution.
       */
  @js.native
  sealed trait NotApplicable
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
       */
  @js.native
  sealed trait NotExecuted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test is not impacted. Added fot TIA.
       */
  @js.native
  sealed trait NotImpacted
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test was executed w/o any issues.
       */
  @js.native
  sealed trait Passed
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Test is paused.
       */
  @js.native
  sealed trait Paused
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * The test timed out
       */
  @js.native
  sealed trait Timeout
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * Only used during an update to preserve the existing value.
       */
  @js.native
  sealed trait Unspecified
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /**
       * To be used by Run level results. This is not a failure.
       */
  @js.native
  sealed trait Warning
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome
  
  /* 6 */ val Aborted: Aborted with scala.Double = js.native
  /* 7 */ val Blocked: Blocked with scala.Double = js.native
  /* 10 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Failed: Failed with scala.Double = js.native
  /* 13 */ val InProgress: InProgress with scala.Double = js.native
  /* 4 */ val Inconclusive: Inconclusive with scala.Double = js.native
  /* 14 */ val MaxValue: MaxValue with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 11 */ val NotApplicable: NotApplicable with scala.Double = js.native
  /* 8 */ val NotExecuted: NotExecuted with scala.Double = js.native
  /* 14 */ val NotImpacted: NotImpacted with scala.Double = js.native
  /* 2 */ val Passed: Passed with scala.Double = js.native
  /* 12 */ val Paused: Paused with scala.Double = js.native
  /* 5 */ val Timeout: Timeout with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  /* 9 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome with scala.Double] = js.native
}

