package typings.testcafeReporterDashboard.libTypesTestcafeMod

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
  /* "inBookmarkRestore" */ val inBookmarkRestore: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inBookmarkRestore & String = js.native
  
  @js.native
  sealed trait inFixtureAfterEachHook
    extends StObject
       with TestPhase
  /* "inFixtureAfterEachHook" */ val inFixtureAfterEachHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterEachHook & String = js.native
  
  @js.native
  sealed trait inFixtureAfterHook
    extends StObject
       with TestPhase
  /* "inFixtureAfterHook" */ val inFixtureAfterHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterHook & String = js.native
  
  @js.native
  sealed trait inFixtureBeforeEachHook
    extends StObject
       with TestPhase
  /* "inFixtureBeforeEachHook" */ val inFixtureBeforeEachHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeEachHook & String = js.native
  
  @js.native
  sealed trait inFixtureBeforeHook
    extends StObject
       with TestPhase
  /* "inFixtureBeforeHook" */ val inFixtureBeforeHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeHook & String = js.native
  
  @js.native
  sealed trait inRoleInitializer
    extends StObject
       with TestPhase
  /* "inRoleInitializer" */ val inRoleInitializer: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inRoleInitializer & String = js.native
  
  @js.native
  sealed trait inTest
    extends StObject
       with TestPhase
  /* "inTest" */ val inTest: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTest & String = js.native
  
  @js.native
  sealed trait inTestAfterHook
    extends StObject
       with TestPhase
  /* "inTestAfterHook" */ val inTestAfterHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestAfterHook & String = js.native
  
  @js.native
  sealed trait inTestBeforeHook
    extends StObject
       with TestPhase
  /* "inTestBeforeHook" */ val inTestBeforeHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestBeforeHook & String = js.native
  
  @js.native
  sealed trait initial
    extends StObject
       with TestPhase
  /* "initial" */ val initial: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.initial & String = js.native
}
