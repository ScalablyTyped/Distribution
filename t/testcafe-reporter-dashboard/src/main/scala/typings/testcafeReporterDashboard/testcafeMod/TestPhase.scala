package typings.testcafeReporterDashboard.testcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestPhase extends StObject
@JSImport("testcafe-reporter-dashboard/lib/types/testcafe", "TestPhase")
@js.native
object TestPhase extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TestPhase & String] = js.native
  
  @js.native
  sealed trait inBookmarkRestore
    extends StObject
       with TestPhase
  /* "inBookmarkRestore" */ val inBookmarkRestore: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inBookmarkRestore & String = js.native
  
  @js.native
  sealed trait inFixtureAfterEachHook
    extends StObject
       with TestPhase
  /* "inFixtureAfterEachHook" */ val inFixtureAfterEachHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureAfterEachHook & String = js.native
  
  @js.native
  sealed trait inFixtureAfterHook
    extends StObject
       with TestPhase
  /* "inFixtureAfterHook" */ val inFixtureAfterHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureAfterHook & String = js.native
  
  @js.native
  sealed trait inFixtureBeforeEachHook
    extends StObject
       with TestPhase
  /* "inFixtureBeforeEachHook" */ val inFixtureBeforeEachHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureBeforeEachHook & String = js.native
  
  @js.native
  sealed trait inFixtureBeforeHook
    extends StObject
       with TestPhase
  /* "inFixtureBeforeHook" */ val inFixtureBeforeHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureBeforeHook & String = js.native
  
  @js.native
  sealed trait inRoleInitializer
    extends StObject
       with TestPhase
  /* "inRoleInitializer" */ val inRoleInitializer: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inRoleInitializer & String = js.native
  
  @js.native
  sealed trait inTest
    extends StObject
       with TestPhase
  /* "inTest" */ val inTest: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTest & String = js.native
  
  @js.native
  sealed trait inTestAfterHook
    extends StObject
       with TestPhase
  /* "inTestAfterHook" */ val inTestAfterHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTestAfterHook & String = js.native
  
  @js.native
  sealed trait inTestBeforeHook
    extends StObject
       with TestPhase
  /* "inTestBeforeHook" */ val inTestBeforeHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTestBeforeHook & String = js.native
  
  @js.native
  sealed trait initial
    extends StObject
       with TestPhase
  /* "initial" */ val initial: typings.testcafeReporterDashboard.testcafeMod.TestPhase.initial & String = js.native
}
