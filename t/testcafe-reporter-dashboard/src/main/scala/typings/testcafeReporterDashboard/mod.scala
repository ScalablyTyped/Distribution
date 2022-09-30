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
import typings.testcafeReporterDashboard.anon.Duration
import typings.testcafeReporterDashboard.anon.EndTime
import typings.testcafeReporterDashboard.anon.FailedCount
import typings.testcafeReporterDashboard.anon.Fixture
import typings.testcafeReporterDashboard.anon.Id
import typings.testcafeReporterDashboard.anon.Name
import typings.testcafeReporterDashboard.anon.TestId
import typings.testcafeReporterDashboard.commonMod.MaxLengthString
import typings.testcafeReporterDashboard.testcafeMod.CommandType.wait
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
    def apply(value: String): js.UndefOr[typings.testcafeReporterDashboard.testcafeMod.CommandType & String] = js.native
    
    /* "assertion" */ val assertion: typings.testcafeReporterDashboard.testcafeMod.CommandType.assertion & String = js.native
    
    /* "backup-storages" */ val backupStorages: typings.testcafeReporterDashboard.testcafeMod.CommandType.backupStorages & String = js.native
    
    /* "clear-upload" */ val clearUpload: typings.testcafeReporterDashboard.testcafeMod.CommandType.clearUpload & String = js.native
    
    /* "click" */ val click: typings.testcafeReporterDashboard.testcafeMod.CommandType.click & String = js.native
    
    /* "debug" */ val debug: typings.testcafeReporterDashboard.testcafeMod.CommandType.debug & String = js.native
    
    /* "double-click" */ val doubleClick: typings.testcafeReporterDashboard.testcafeMod.CommandType.doubleClick & String = js.native
    
    /* "drag" */ val drag: typings.testcafeReporterDashboard.testcafeMod.CommandType.drag & String = js.native
    
    /* "drag-to-element" */ val dragToElement: typings.testcafeReporterDashboard.testcafeMod.CommandType.dragToElement & String = js.native
    
    /* "execute-async-expression" */ val executeAsyncExpression: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeAsyncExpression & String = js.native
    
    /* "execute-client-function" */ val executeClientFunction: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeClientFunction & String = js.native
    
    /* "execute-expression" */ val executeExpression: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeExpression & String = js.native
    
    /* "execute-selector" */ val executeSelector: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeSelector & String = js.native
    
    /* "get-browser-console-messages" */ val getBrowserConsoleMessages: typings.testcafeReporterDashboard.testcafeMod.CommandType.getBrowserConsoleMessages & String = js.native
    
    /* "get-native-dialog-history" */ val getNativeDialogHistory: typings.testcafeReporterDashboard.testcafeMod.CommandType.getNativeDialogHistory & String = js.native
    
    /* "hide-assertion-retries-status" */ val hideAssertionRetriesStatus: typings.testcafeReporterDashboard.testcafeMod.CommandType.hideAssertionRetriesStatus & String = js.native
    
    /* "hover" */ val hover: typings.testcafeReporterDashboard.testcafeMod.CommandType.hover & String = js.native
    
    /* "maximize-window" */ val maximizeWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.maximizeWindow & String = js.native
    
    /* "navigate-to" */ val navigateTo: typings.testcafeReporterDashboard.testcafeMod.CommandType.navigateTo & String = js.native
    
    /* "prepare-browser-manipulation" */ val prepareBrowserManipulation: typings.testcafeReporterDashboard.testcafeMod.CommandType.prepareBrowserManipulation & String = js.native
    
    /* "press-key" */ val pressKey: typings.testcafeReporterDashboard.testcafeMod.CommandType.pressKey & String = js.native
    
    /* "recorder" */ val recorder: typings.testcafeReporterDashboard.testcafeMod.CommandType.recorder & String = js.native
    
    /* "resize-window" */ val resizeWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.resizeWindow & String = js.native
    
    /* "resize-window-to-fit-device" */ val resizeWindowToFitDevice: typings.testcafeReporterDashboard.testcafeMod.CommandType.resizeWindowToFitDevice & String = js.native
    
    /* "right-click" */ val rightClick: typings.testcafeReporterDashboard.testcafeMod.CommandType.rightClick & String = js.native
    
    /* "select-editable-content" */ val selectEditableContent: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectEditableContent & String = js.native
    
    /* "select-text" */ val selectText: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectText & String = js.native
    
    /* "select-text-area-content" */ val selectTextAreaContent: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectTextAreaContent & String = js.native
    
    /* "set-breakpoint" */ val setBreakpoint: typings.testcafeReporterDashboard.testcafeMod.CommandType.setBreakpoint & String = js.native
    
    /* "set-files-to-upload" */ val setFilesToUpload: typings.testcafeReporterDashboard.testcafeMod.CommandType.setFilesToUpload & String = js.native
    
    /* "set-native-dialog-handler" */ val setNativeDialogHandler: typings.testcafeReporterDashboard.testcafeMod.CommandType.setNativeDialogHandler & String = js.native
    
    /* "set-page-load-timeout" */ val setPageLoadTimeout: typings.testcafeReporterDashboard.testcafeMod.CommandType.setPageLoadTimeout & String = js.native
    
    /* "set-test-speed" */ val setTestSpeed: typings.testcafeReporterDashboard.testcafeMod.CommandType.setTestSpeed & String = js.native
    
    /* "show-assertion-retries-status" */ val showAssertionRetriesStatus: typings.testcafeReporterDashboard.testcafeMod.CommandType.showAssertionRetriesStatus & String = js.native
    
    /* "switch-to-iframe" */ val switchToIframe: typings.testcafeReporterDashboard.testcafeMod.CommandType.switchToIframe & String = js.native
    
    /* "switch-to-main-window" */ val switchToMainWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.switchToMainWindow & String = js.native
    
    /* "take-element-screenshot" */ val takeElementScreenshot: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeElementScreenshot & String = js.native
    
    /* "take-screenshot" */ val takeScreenshot: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeScreenshot & String = js.native
    
    /* "take-screenshot-on-fail" */ val takeScreenshotOnFail: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeScreenshotOnFail & String = js.native
    
    /* "test-done" */ val testDone: typings.testcafeReporterDashboard.testcafeMod.CommandType.testDone & String = js.native
    
    /* "type-text" */ val typeText: typings.testcafeReporterDashboard.testcafeMod.CommandType.typeText & String = js.native
    
    /* "unlock-page" */ val unlockPage: typings.testcafeReporterDashboard.testcafeMod.CommandType.unlockPage & String = js.native
    
    /* "useRole" */ val useRole: typings.testcafeReporterDashboard.testcafeMod.CommandType.useRole & String = js.native
    
    /* "wait" */ @JSName("wait")
    val wait_ : wait & String = js.native
  }
  
  inline def MaxLengthString[N /* <: Double */](len: N): BrandC[StringC, typings.testcafeReporterDashboard.commonMod.MaxLengthString[N]] = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLengthString")(len.asInstanceOf[js.Any]).asInstanceOf[BrandC[StringC, typings.testcafeReporterDashboard.commonMod.MaxLengthString[N]]]
  
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
  val TaskDoneArgsSchema: ReadonlyC[ExactC[TypeC[EndTime]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskResultSchema")
  @js.native
  val TaskResultSchema: ReadonlyC[ExactC[TypeC[FailedCount]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskStartArgsSchema")
  @js.native
  val TaskStartArgsSchema: ReadonlyC[ExactC[TypeC[BuildId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestDoneArgsSchema")
  @js.native
  val TestDoneArgsSchema: ReadonlyC[ExactC[TypeC[Duration]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestPhase")
  @js.native
  object TestPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.testcafeReporterDashboard.testcafeMod.TestPhase & String] = js.native
    
    /* "inBookmarkRestore" */ val inBookmarkRestore: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inBookmarkRestore & String = js.native
    
    /* "inFixtureAfterEachHook" */ val inFixtureAfterEachHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureAfterEachHook & String = js.native
    
    /* "inFixtureAfterHook" */ val inFixtureAfterHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureAfterHook & String = js.native
    
    /* "inFixtureBeforeEachHook" */ val inFixtureBeforeEachHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureBeforeEachHook & String = js.native
    
    /* "inFixtureBeforeHook" */ val inFixtureBeforeHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inFixtureBeforeHook & String = js.native
    
    /* "inRoleInitializer" */ val inRoleInitializer: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inRoleInitializer & String = js.native
    
    /* "inTest" */ val inTest: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTest & String = js.native
    
    /* "inTestAfterHook" */ val inTestAfterHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTestAfterHook & String = js.native
    
    /* "inTestBeforeHook" */ val inTestBeforeHook: typings.testcafeReporterDashboard.testcafeMod.TestPhase.inTestBeforeHook & String = js.native
    
    /* "initial" */ val initial: typings.testcafeReporterDashboard.testcafeMod.TestPhase.initial & String = js.native
  }
  
  @JSImport("testcafe-reporter-dashboard", "TestStartArgsSchema")
  @js.native
  val TestStartArgsSchema: ReadonlyC[ExactC[TypeC[TestId]]] = js.native
}
