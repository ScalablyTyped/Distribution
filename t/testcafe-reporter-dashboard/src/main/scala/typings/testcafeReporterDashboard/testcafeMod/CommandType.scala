package typings.testcafeReporterDashboard.testcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandType extends StObject
@JSImport("testcafe-reporter-dashboard/lib/types/testcafe", "CommandType")
@js.native
object CommandType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandType & String] = js.native
  
  @js.native
  sealed trait assertion
    extends StObject
       with CommandType
  /* "assertion" */ val assertion: typings.testcafeReporterDashboard.testcafeMod.CommandType.assertion & String = js.native
  
  @js.native
  sealed trait backupStorages
    extends StObject
       with CommandType
  /* "backup-storages" */ val backupStorages: typings.testcafeReporterDashboard.testcafeMod.CommandType.backupStorages & String = js.native
  
  @js.native
  sealed trait clearUpload
    extends StObject
       with CommandType
  /* "clear-upload" */ val clearUpload: typings.testcafeReporterDashboard.testcafeMod.CommandType.clearUpload & String = js.native
  
  @js.native
  sealed trait click
    extends StObject
       with CommandType
  /* "click" */ val click: typings.testcafeReporterDashboard.testcafeMod.CommandType.click & String = js.native
  
  @js.native
  sealed trait debug
    extends StObject
       with CommandType
  /* "debug" */ val debug: typings.testcafeReporterDashboard.testcafeMod.CommandType.debug & String = js.native
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with CommandType
  /* "double-click" */ val doubleClick: typings.testcafeReporterDashboard.testcafeMod.CommandType.doubleClick & String = js.native
  
  @js.native
  sealed trait drag
    extends StObject
       with CommandType
  /* "drag" */ val drag: typings.testcafeReporterDashboard.testcafeMod.CommandType.drag & String = js.native
  
  @js.native
  sealed trait dragToElement
    extends StObject
       with CommandType
  /* "drag-to-element" */ val dragToElement: typings.testcafeReporterDashboard.testcafeMod.CommandType.dragToElement & String = js.native
  
  @js.native
  sealed trait executeAsyncExpression
    extends StObject
       with CommandType
  /* "execute-async-expression" */ val executeAsyncExpression: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeAsyncExpression & String = js.native
  
  @js.native
  sealed trait executeClientFunction
    extends StObject
       with CommandType
  /* "execute-client-function" */ val executeClientFunction: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeClientFunction & String = js.native
  
  @js.native
  sealed trait executeExpression
    extends StObject
       with CommandType
  /* "execute-expression" */ val executeExpression: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeExpression & String = js.native
  
  @js.native
  sealed trait executeSelector
    extends StObject
       with CommandType
  /* "execute-selector" */ val executeSelector: typings.testcafeReporterDashboard.testcafeMod.CommandType.executeSelector & String = js.native
  
  @js.native
  sealed trait getBrowserConsoleMessages
    extends StObject
       with CommandType
  /* "get-browser-console-messages" */ val getBrowserConsoleMessages: typings.testcafeReporterDashboard.testcafeMod.CommandType.getBrowserConsoleMessages & String = js.native
  
  @js.native
  sealed trait getNativeDialogHistory
    extends StObject
       with CommandType
  /* "get-native-dialog-history" */ val getNativeDialogHistory: typings.testcafeReporterDashboard.testcafeMod.CommandType.getNativeDialogHistory & String = js.native
  
  @js.native
  sealed trait hideAssertionRetriesStatus
    extends StObject
       with CommandType
  /* "hide-assertion-retries-status" */ val hideAssertionRetriesStatus: typings.testcafeReporterDashboard.testcafeMod.CommandType.hideAssertionRetriesStatus & String = js.native
  
  @js.native
  sealed trait hover
    extends StObject
       with CommandType
  /* "hover" */ val hover: typings.testcafeReporterDashboard.testcafeMod.CommandType.hover & String = js.native
  
  @js.native
  sealed trait maximizeWindow
    extends StObject
       with CommandType
  /* "maximize-window" */ val maximizeWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.maximizeWindow & String = js.native
  
  @js.native
  sealed trait navigateTo
    extends StObject
       with CommandType
  /* "navigate-to" */ val navigateTo: typings.testcafeReporterDashboard.testcafeMod.CommandType.navigateTo & String = js.native
  
  @js.native
  sealed trait prepareBrowserManipulation
    extends StObject
       with CommandType
  /* "prepare-browser-manipulation" */ val prepareBrowserManipulation: typings.testcafeReporterDashboard.testcafeMod.CommandType.prepareBrowserManipulation & String = js.native
  
  @js.native
  sealed trait pressKey
    extends StObject
       with CommandType
  /* "press-key" */ val pressKey: typings.testcafeReporterDashboard.testcafeMod.CommandType.pressKey & String = js.native
  
  @js.native
  sealed trait recorder
    extends StObject
       with CommandType
  /* "recorder" */ val recorder: typings.testcafeReporterDashboard.testcafeMod.CommandType.recorder & String = js.native
  
  @js.native
  sealed trait resizeWindow
    extends StObject
       with CommandType
  /* "resize-window" */ val resizeWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.resizeWindow & String = js.native
  
  @js.native
  sealed trait resizeWindowToFitDevice
    extends StObject
       with CommandType
  /* "resize-window-to-fit-device" */ val resizeWindowToFitDevice: typings.testcafeReporterDashboard.testcafeMod.CommandType.resizeWindowToFitDevice & String = js.native
  
  @js.native
  sealed trait rightClick
    extends StObject
       with CommandType
  /* "right-click" */ val rightClick: typings.testcafeReporterDashboard.testcafeMod.CommandType.rightClick & String = js.native
  
  @js.native
  sealed trait selectEditableContent
    extends StObject
       with CommandType
  /* "select-editable-content" */ val selectEditableContent: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectEditableContent & String = js.native
  
  @js.native
  sealed trait selectText
    extends StObject
       with CommandType
  /* "select-text" */ val selectText: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectText & String = js.native
  
  @js.native
  sealed trait selectTextAreaContent
    extends StObject
       with CommandType
  /* "select-text-area-content" */ val selectTextAreaContent: typings.testcafeReporterDashboard.testcafeMod.CommandType.selectTextAreaContent & String = js.native
  
  @js.native
  sealed trait setBreakpoint
    extends StObject
       with CommandType
  /* "set-breakpoint" */ val setBreakpoint: typings.testcafeReporterDashboard.testcafeMod.CommandType.setBreakpoint & String = js.native
  
  @js.native
  sealed trait setFilesToUpload
    extends StObject
       with CommandType
  /* "set-files-to-upload" */ val setFilesToUpload: typings.testcafeReporterDashboard.testcafeMod.CommandType.setFilesToUpload & String = js.native
  
  @js.native
  sealed trait setNativeDialogHandler
    extends StObject
       with CommandType
  /* "set-native-dialog-handler" */ val setNativeDialogHandler: typings.testcafeReporterDashboard.testcafeMod.CommandType.setNativeDialogHandler & String = js.native
  
  @js.native
  sealed trait setPageLoadTimeout
    extends StObject
       with CommandType
  /* "set-page-load-timeout" */ val setPageLoadTimeout: typings.testcafeReporterDashboard.testcafeMod.CommandType.setPageLoadTimeout & String = js.native
  
  @js.native
  sealed trait setTestSpeed
    extends StObject
       with CommandType
  /* "set-test-speed" */ val setTestSpeed: typings.testcafeReporterDashboard.testcafeMod.CommandType.setTestSpeed & String = js.native
  
  @js.native
  sealed trait showAssertionRetriesStatus
    extends StObject
       with CommandType
  /* "show-assertion-retries-status" */ val showAssertionRetriesStatus: typings.testcafeReporterDashboard.testcafeMod.CommandType.showAssertionRetriesStatus & String = js.native
  
  @js.native
  sealed trait switchToIframe
    extends StObject
       with CommandType
  /* "switch-to-iframe" */ val switchToIframe: typings.testcafeReporterDashboard.testcafeMod.CommandType.switchToIframe & String = js.native
  
  @js.native
  sealed trait switchToMainWindow
    extends StObject
       with CommandType
  /* "switch-to-main-window" */ val switchToMainWindow: typings.testcafeReporterDashboard.testcafeMod.CommandType.switchToMainWindow & String = js.native
  
  @js.native
  sealed trait takeElementScreenshot
    extends StObject
       with CommandType
  /* "take-element-screenshot" */ val takeElementScreenshot: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeElementScreenshot & String = js.native
  
  @js.native
  sealed trait takeScreenshot
    extends StObject
       with CommandType
  /* "take-screenshot" */ val takeScreenshot: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeScreenshot & String = js.native
  
  @js.native
  sealed trait takeScreenshotOnFail
    extends StObject
       with CommandType
  /* "take-screenshot-on-fail" */ val takeScreenshotOnFail: typings.testcafeReporterDashboard.testcafeMod.CommandType.takeScreenshotOnFail & String = js.native
  
  @js.native
  sealed trait testDone
    extends StObject
       with CommandType
  /* "test-done" */ val testDone: typings.testcafeReporterDashboard.testcafeMod.CommandType.testDone & String = js.native
  
  @js.native
  sealed trait typeText
    extends StObject
       with CommandType
  /* "type-text" */ val typeText: typings.testcafeReporterDashboard.testcafeMod.CommandType.typeText & String = js.native
  
  @js.native
  sealed trait unlockPage
    extends StObject
       with CommandType
  /* "unlock-page" */ val unlockPage: typings.testcafeReporterDashboard.testcafeMod.CommandType.unlockPage & String = js.native
  
  @js.native
  sealed trait useRole
    extends StObject
       with CommandType
  /* "useRole" */ val useRole: typings.testcafeReporterDashboard.testcafeMod.CommandType.useRole & String = js.native
  
  @js.native
  sealed trait wait
    extends StObject
       with CommandType
  /* "wait" */ @JSName("wait")
  val wait_ : wait & String = js.native
}
