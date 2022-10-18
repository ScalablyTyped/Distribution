package typings.testcafeReporterDashboard

import typings.ioTs.mod.BrandC
import typings.ioTs.mod.ExactC
import typings.ioTs.mod.PartialC
import typings.ioTs.mod.ReadonlyC
import typings.ioTs.mod.StringC
import typings.ioTs.mod.TypeC
import typings.ioTs.mod.UndefinedC
import typings.ioTs.mod.UnionC
import typings.testcafeReporterDashboard.anon.Author
import typings.testcafeReporterDashboard.anon.BuildId
import typings.testcafeReporterDashboard.anon.CiInfo
import typings.testcafeReporterDashboard.anon.Duration
import typings.testcafeReporterDashboard.anon.FailedCount
import typings.testcafeReporterDashboard.anon.Fixture
import typings.testcafeReporterDashboard.anon.Id
import typings.testcafeReporterDashboard.anon.Name
import typings.testcafeReporterDashboard.anon.TestId
import typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.wait
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`190`
import typings.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("testcafe-reporter-dashboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("testcafe-reporter-dashboard", "AggregateId")
  @js.native
  val AggregateId: BrandC[StringC, MaxLengthString[`190`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "BuildIdSchema")
  @js.native
  val BuildIdSchema: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "CIInfoSchema")
  @js.native
  val CIInfoSchema: ReadonlyC[ExactC[PartialC[Author]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "CommandType")
  @js.native
  object CommandType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType & String] = js.native
    
    /* "assertion" */ val assertion: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.assertion & String = js.native
    
    /* "backup-storages" */ val backupStorages: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.backupStorages & String = js.native
    
    /* "clear-upload" */ val clearUpload: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.clearUpload & String = js.native
    
    /* "click" */ val click: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.click & String = js.native
    
    /* "debug" */ val debug: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.debug & String = js.native
    
    /* "double-click" */ val doubleClick: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.doubleClick & String = js.native
    
    /* "drag" */ val drag: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.drag & String = js.native
    
    /* "drag-to-element" */ val dragToElement: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.dragToElement & String = js.native
    
    /* "execute-async-expression" */ val executeAsyncExpression: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeAsyncExpression & String = js.native
    
    /* "execute-client-function" */ val executeClientFunction: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeClientFunction & String = js.native
    
    /* "execute-expression" */ val executeExpression: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeExpression & String = js.native
    
    /* "execute-selector" */ val executeSelector: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeSelector & String = js.native
    
    /* "get-browser-console-messages" */ val getBrowserConsoleMessages: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getBrowserConsoleMessages & String = js.native
    
    /* "get-native-dialog-history" */ val getNativeDialogHistory: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getNativeDialogHistory & String = js.native
    
    /* "hide-assertion-retries-status" */ val hideAssertionRetriesStatus: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hideAssertionRetriesStatus & String = js.native
    
    /* "hover" */ val hover: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hover & String = js.native
    
    /* "maximize-window" */ val maximizeWindow: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.maximizeWindow & String = js.native
    
    /* "navigate-to" */ val navigateTo: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.navigateTo & String = js.native
    
    /* "prepare-browser-manipulation" */ val prepareBrowserManipulation: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.prepareBrowserManipulation & String = js.native
    
    /* "press-key" */ val pressKey: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.pressKey & String = js.native
    
    /* "recorder" */ val recorder: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.recorder & String = js.native
    
    /* "resize-window" */ val resizeWindow: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindow & String = js.native
    
    /* "resize-window-to-fit-device" */ val resizeWindowToFitDevice: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindowToFitDevice & String = js.native
    
    /* "right-click" */ val rightClick: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.rightClick & String = js.native
    
    /* "select-editable-content" */ val selectEditableContent: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectEditableContent & String = js.native
    
    /* "select-text" */ val selectText: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectText & String = js.native
    
    /* "select-text-area-content" */ val selectTextAreaContent: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectTextAreaContent & String = js.native
    
    /* "set-breakpoint" */ val setBreakpoint: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setBreakpoint & String = js.native
    
    /* "set-files-to-upload" */ val setFilesToUpload: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setFilesToUpload & String = js.native
    
    /* "set-native-dialog-handler" */ val setNativeDialogHandler: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setNativeDialogHandler & String = js.native
    
    /* "set-page-load-timeout" */ val setPageLoadTimeout: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setPageLoadTimeout & String = js.native
    
    /* "set-test-speed" */ val setTestSpeed: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setTestSpeed & String = js.native
    
    /* "show-assertion-retries-status" */ val showAssertionRetriesStatus: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.showAssertionRetriesStatus & String = js.native
    
    /* "switch-to-iframe" */ val switchToIframe: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToIframe & String = js.native
    
    /* "switch-to-main-window" */ val switchToMainWindow: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToMainWindow & String = js.native
    
    /* "take-element-screenshot" */ val takeElementScreenshot: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeElementScreenshot & String = js.native
    
    /* "take-screenshot" */ val takeScreenshot: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshot & String = js.native
    
    /* "take-screenshot-on-fail" */ val takeScreenshotOnFail: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshotOnFail & String = js.native
    
    /* "test-done" */ val testDone: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.testDone & String = js.native
    
    /* "type-text" */ val typeText: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.typeText & String = js.native
    
    /* "unlock-page" */ val unlockPage: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.unlockPage & String = js.native
    
    /* "useRole" */ val useRole: typings.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.useRole & String = js.native
    
    /* "wait" */ @JSName("wait")
    val wait_ : wait & String = js.native
  }
  
  inline def MaxLengthString[N /* <: Double */](len: N): BrandC[StringC, typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString[N]] = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLengthString")(len.asInstanceOf[js.Any]).asInstanceOf[BrandC[StringC, typings.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString[N]]]
  
  @JSImport("testcafe-reporter-dashboard", "NameSchema")
  @js.native
  val NameSchema: BrandC[StringC, MaxLengthString[`300`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportWarningsSchema")
  @js.native
  val ReportWarningsSchema: ReadonlyC[ExactC[TypeC[TestId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedFixtureItemSchema")
  @js.native
  val ReportedFixtureItemSchema: ReadonlyC[ExactC[TypeC[Name]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedTestItemSchema")
  @js.native
  val ReportedTestItemSchema: ReadonlyC[ExactC[TypeC[Id]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedTestStructureItemSchema")
  @js.native
  val ReportedTestStructureItemSchema: ReadonlyC[ExactC[TypeC[Fixture]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ShortIdSchema")
  @js.native
  val ShortIdSchema: BrandC[StringC, MaxLengthString[`10`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskDoneArgsSchema")
  @js.native
  val TaskDoneArgsSchema: ReadonlyC[ExactC[TypeC[BuildId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskResultSchema")
  @js.native
  val TaskResultSchema: ReadonlyC[ExactC[TypeC[FailedCount]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskStartArgsSchema")
  @js.native
  val TaskStartArgsSchema: ReadonlyC[ExactC[TypeC[CiInfo]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestDoneArgsSchema")
  @js.native
  val TestDoneArgsSchema: ReadonlyC[ExactC[TypeC[Duration]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestPhase")
  @js.native
  object TestPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase & String] = js.native
    
    /* "inBookmarkRestore" */ val inBookmarkRestore: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inBookmarkRestore & String = js.native
    
    /* "inFixtureAfterEachHook" */ val inFixtureAfterEachHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterEachHook & String = js.native
    
    /* "inFixtureAfterHook" */ val inFixtureAfterHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterHook & String = js.native
    
    /* "inFixtureBeforeEachHook" */ val inFixtureBeforeEachHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeEachHook & String = js.native
    
    /* "inFixtureBeforeHook" */ val inFixtureBeforeHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeHook & String = js.native
    
    /* "inRoleInitializer" */ val inRoleInitializer: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inRoleInitializer & String = js.native
    
    /* "inTest" */ val inTest: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTest & String = js.native
    
    /* "inTestAfterHook" */ val inTestAfterHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestAfterHook & String = js.native
    
    /* "inTestBeforeHook" */ val inTestBeforeHook: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestBeforeHook & String = js.native
    
    /* "initial" */ val initial: typings.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.initial & String = js.native
  }
  
  @JSImport("testcafe-reporter-dashboard", "TestStartArgsSchema")
  @js.native
  val TestStartArgsSchema: ReadonlyC[ExactC[TypeC[TestId]]] = js.native
}
