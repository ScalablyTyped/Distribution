package typings.testcafe.mod.global

import typings.testcafe.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOptions extends StObject {
  
  /**
    * Specifies the timeout in milliseconds to complete the AJAX requests (XHR or fetch)
    */
  var ajaxRequestTimeout: Double
  
  /**
    * Specifies the time (in milliseconds) within which TestCafe makes attempts to successfully execute an assertion if a selector property or a client function was passed as an actual value.
    */
  var assertionTimeout: Double
  
  /**
    * Specifies the time (in milliseconds) TestCafe waits for the browser to start
    */
  var browserInitTimeout: Double
  
  /**
    * Specifies if tests run in the debug mode. If this option is enabled, test execution is paused before the first action or assertion allowing you to invoke the developer tools and debug. In the debug mode, you can execute the test step-by-step to reproduce its incorrect behavior. You can also use the Unlock Page switch in the footer to unlock the tested page and interact with its elements.
    */
  var debugMode: Boolean
  
  /**
    * Specifies whether to enter the debug mode when a test fails. If enabled, the test is paused at the moment it fails, so that you can explore the tested page to determine what caused the failure.
    */
  var debugOnFail: Boolean
  
  /**
    * Disables support for multi-window testing in Chrome and Firefox. Use this option if you encounter compatibility issues with your existing tests.
    */
  var disableMultipleWindows: Boolean
  
  /**
    * Defines whether to disable page caching during test execution.
    */
  var disablePageCaching: Boolean
  
  /**
    * Prevents TestCafe from taking screenshots. When this option is specified, screenshots are not taken whenever a test fails or when t.takeScreenshot or t.takeElementScreenshot is executed.
    */
  var disableScreenshots: Boolean
  
  /**
    * Specifies the time (in milliseconds) TestCafe waits for the  window.load event to fire after the  DOMContentLoaded event. After the timeout passes or the window.load event is raised (whichever happens first), TestCafe starts the test. You can set this timeout to 0 to skip waiting for window.load.
    */
  var pageLoadTimeout: Double
  
  /**
    * Specifies the timeout in milliseconds to complete the request for the page's HTML
    */
  var pageRequestTimeout: Double
  
  /**
    * Defines whether to enable quarantine mode and (optionally) what settings to use.
    */
  var quarantineMode: Boolean | QuarantineModeOptions
  
  /**
    * Time (in milliseconds). If TestCafe is idle for the specified length of time, TestCafe terminates the test run. Applies to actions inside and outside tests.
    */
  var runExecutionTimeout: Double
  
  /**
    * Specifies the time (in milliseconds) within which selectors make attempts to obtain a node to be returned.
    */
  var selectorTimeout: Double
  
  /**
    * Defines the framework's response to client-side JavaScript errors. If `false` (the default value), tests fail after the website yields a client-side error. If `true`, TestCafe ignores JavaScript errors. Additional options set custom error handling criteria.
    */
  var skipJsErrors: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
  
  /**
    * Defines whether to continue running a test after an uncaught error or unhandled promise rejection occurs on the server (`true`), or consider such a test failed (`false`).
    */
  var skipUncaughtErrors: Boolean
  
  /**
    * Specifies the test execution speed. A number between 1 (fastest) and 0.01 (slowest). If an individual action's speed is also specified, the action speed setting overrides the test speed.
    */
  var speed: Double
  
  /**
    * Defines whether to stop a test run if a test fails. This allows you not to wait for all the tests to finish and to focus on the first error.
    */
  var stopOnFirstFail: Boolean
  
  /**
    * Time (in milliseconds). If a test is unresponsive for the specified length of time, TestCafe terminates it. Only applies to test contents.
    */
  var testExecutionTimeout: Double
}
object RunOptions {
  
  inline def apply(
    ajaxRequestTimeout: Double,
    assertionTimeout: Double,
    browserInitTimeout: Double,
    debugMode: Boolean,
    debugOnFail: Boolean,
    disableMultipleWindows: Boolean,
    disablePageCaching: Boolean,
    disableScreenshots: Boolean,
    pageLoadTimeout: Double,
    pageRequestTimeout: Double,
    quarantineMode: Boolean | QuarantineModeOptions,
    runExecutionTimeout: Double,
    selectorTimeout: Double,
    skipJsErrors: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject,
    skipUncaughtErrors: Boolean,
    speed: Double,
    stopOnFirstFail: Boolean,
    testExecutionTimeout: Double
  ): RunOptions = {
    val __obj = js.Dynamic.literal(ajaxRequestTimeout = ajaxRequestTimeout.asInstanceOf[js.Any], assertionTimeout = assertionTimeout.asInstanceOf[js.Any], browserInitTimeout = browserInitTimeout.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], debugOnFail = debugOnFail.asInstanceOf[js.Any], disableMultipleWindows = disableMultipleWindows.asInstanceOf[js.Any], disablePageCaching = disablePageCaching.asInstanceOf[js.Any], disableScreenshots = disableScreenshots.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pageRequestTimeout = pageRequestTimeout.asInstanceOf[js.Any], quarantineMode = quarantineMode.asInstanceOf[js.Any], runExecutionTimeout = runExecutionTimeout.asInstanceOf[js.Any], selectorTimeout = selectorTimeout.asInstanceOf[js.Any], skipJsErrors = skipJsErrors.asInstanceOf[js.Any], skipUncaughtErrors = skipUncaughtErrors.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], stopOnFirstFail = stopOnFirstFail.asInstanceOf[js.Any], testExecutionTimeout = testExecutionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    inline def setAjaxRequestTimeout(value: Double): Self = StObject.set(x, "ajaxRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setAssertionTimeout(value: Double): Self = StObject.set(x, "assertionTimeout", value.asInstanceOf[js.Any])
    
    inline def setBrowserInitTimeout(value: Double): Self = StObject.set(x, "browserInitTimeout", value.asInstanceOf[js.Any])
    
    inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    inline def setDebugOnFail(value: Boolean): Self = StObject.set(x, "debugOnFail", value.asInstanceOf[js.Any])
    
    inline def setDisableMultipleWindows(value: Boolean): Self = StObject.set(x, "disableMultipleWindows", value.asInstanceOf[js.Any])
    
    inline def setDisablePageCaching(value: Boolean): Self = StObject.set(x, "disablePageCaching", value.asInstanceOf[js.Any])
    
    inline def setDisableScreenshots(value: Boolean): Self = StObject.set(x, "disableScreenshots", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPageRequestTimeout(value: Double): Self = StObject.set(x, "pageRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setQuarantineMode(value: Boolean | QuarantineModeOptions): Self = StObject.set(x, "quarantineMode", value.asInstanceOf[js.Any])
    
    inline def setRunExecutionTimeout(value: Double): Self = StObject.set(x, "runExecutionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSelectorTimeout(value: Double): Self = StObject.set(x, "selectorTimeout", value.asInstanceOf[js.Any])
    
    inline def setSkipJsErrors(
      value: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
    ): Self = StObject.set(x, "skipJsErrors", value.asInstanceOf[js.Any])
    
    inline def setSkipJsErrorsFunction1(value: /* opts */ js.UndefOr[Message] => Boolean): Self = StObject.set(x, "skipJsErrors", js.Any.fromFunction1(value))
    
    inline def setSkipUncaughtErrors(value: Boolean): Self = StObject.set(x, "skipUncaughtErrors", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setStopOnFirstFail(value: Boolean): Self = StObject.set(x, "stopOnFirstFail", value.asInstanceOf[js.Any])
    
    inline def setTestExecutionTimeout(value: Double): Self = StObject.set(x, "testExecutionTimeout", value.asInstanceOf[js.Any])
  }
}
