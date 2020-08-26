package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Error
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriverio.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookFunctions extends js.Object {
  /**
    * Gets executed after all tests are done. You still have access to all global variables from
    * the test.
    * @param result        number of total failing tests
    * @param capabilities  list of capabilities details
    * @param specs         list of spec file paths that are to be run
    */
  var after: js.UndefOr[
    js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
  /**
    * Runs after a WebdriverIO command gets executed
    * @param commandName  command name
    * @param args         arguments that command would receive
    * @param result       result of the command
    * @param error        error in case something went wrong
    */
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.native
  /**
    * Hook that gets executed _after_ a hook within the suite ends (e.g. runs after calling
    * afterEach in Mocha). `stepData` and `world` are Cucumber framework specific.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    * @param result    test result
    * @param stepData  Cucumber step data
    * @param world     Cucumber world
    */
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ Duration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * Gets executed right after terminating the webdriver session.
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    * @param specs         list of spec file paths that are to be run
    */
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
  /**
    * Hook that gets executed after the suite has ended
    * @param suite suite details
    */
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  /**
    * Function to be executed after a test (in Mocha/Jasmine) ends.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    * @param result    test result
    */
  var afterTest: js.UndefOr[js.Function3[/* test */ Test, /* context */ js.Any, /* result */ Duration, Unit]] = js.native
  /**
    * Gets executed before test execution begins. At this point you can access to all global
    * variables like `browser`. It is the perfect place to define custom commands.
    * @param capabilities  list of capabilities details
    * @param specs         specs to be run in the worker process
    */
  var before: js.UndefOr[
    js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
  ] = js.native
  /**
    * Runs before a WebdriverIO command gets executed.
    * @param commandName command name
    * @param args        arguments that command would receive
    */
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.native
  /**
    * Hook that gets executed _before_ a hook within the suite starts (e.g. runs before calling
    * beforeEach in Mocha). `stepData` and `world` are Cucumber framework specific properties.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    * @param stepData  Cucumber step data
    * @param world     Cucumber world
    */
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * Gets executed just before initialising the webdriver session and test framework. It allows you
    * to manipulate configurations depending on the capability or spec.
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    * @param specs         list of spec file paths that are to be run
    */
  var beforeSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.native
  /**
    * Hook that gets executed before the suite starts.
    * @param suite suite details
    */
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  /**
    * Function to be executed before a test (in Mocha/Jasmine) starts.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    */
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.native
  /**
    * Gets executed after all workers got shut down and the process is about to exit. An error
    * thrown in the onComplete hook will result in the test run failing.
    * @param exitCode      runner exit code
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    * @param results       test results
    */
  var onComplete: js.UndefOr[
    js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]
  ] = js.native
  /**
    * Gets executed once before all workers get launched.
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    */
  var onPrepare: js.UndefOr[
    js.Function2[/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]
  ] = js.native
  /**
    * Gets executed when a refresh happens.
    * @param oldSessionId session id of old session
    * @param newSessionId session id of new session
    */
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.native
  /**
    * Gets executed before a worker process is spawned and can be used to initialise specific service
    * for that worker as well as modify runtime environments in an async fashion.
    * @param cid       capability id (e.g 0-0)
    * @param caps      object containing capabilities for session that will be spawn in the worker
    * @param specs     specs to be run in the worker process
    * @param args      object that will be merged with the main configuration once worker is initialised
    * @param execArgv  list of string arguments passed to the worker process
    */
  var onWorkerStart: js.UndefOr[
    js.Function5[
      /* cid */ String, 
      /* caps */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      /* args */ Config, 
      /* execArgv */ js.Array[String], 
      Unit
    ]
  ] = js.native
}

object HookFunctions {
  @scala.inline
  def apply(): HookFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookFunctions]
  }
  @scala.inline
  implicit class HookFunctionsOps[Self <: HookFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfter(
      value: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterCommand(
      value: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit
    ): Self = this.set("afterCommand", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterCommand: Self = this.set("afterCommand", js.undefined)
    @scala.inline
    def setAfterHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ Duration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("afterHook", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterHook: Self = this.set("afterHook", js.undefined)
    @scala.inline
    def setAfterSession(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("afterSession", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterSession: Self = this.set("afterSession", js.undefined)
    @scala.inline
    def setAfterSuite(value: /* suite */ Suite => Unit): Self = this.set("afterSuite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterSuite: Self = this.set("afterSuite", js.undefined)
    @scala.inline
    def setAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ Duration) => Unit): Self = this.set("afterTest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterTest: Self = this.set("afterTest", js.undefined)
    @scala.inline
    def setBefore(value: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[_]) => Unit): Self = this.set("beforeCommand", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeCommand: Self = this.set("beforeCommand", js.undefined)
    @scala.inline
    def setBeforeHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("beforeHook", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeHook: Self = this.set("beforeHook", js.undefined)
    @scala.inline
    def setBeforeSession(
      value: (/* config */ Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("beforeSession", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeSession: Self = this.set("beforeSession", js.undefined)
    @scala.inline
    def setBeforeSuite(value: /* suite */ Suite => Unit): Self = this.set("beforeSuite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSuite: Self = this.set("beforeSuite", js.undefined)
    @scala.inline
    def setBeforeTest(value: (/* test */ Test, /* context */ js.Any) => Unit): Self = this.set("beforeTest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeTest: Self = this.set("beforeTest", js.undefined)
    @scala.inline
    def setOnComplete(
      value: (/* exitCode */ Double, /* config */ Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit
    ): Self = this.set("onComplete", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnPrepare(value: (/* config */ Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit): Self = this.set("onPrepare", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPrepare: Self = this.set("onPrepare", js.undefined)
    @scala.inline
    def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = this.set("onReload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReload: Self = this.set("onReload", js.undefined)
    @scala.inline
    def setOnWorkerStart(
      value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], /* args */ Config, /* execArgv */ js.Array[String]) => Unit
    ): Self = this.set("onWorkerStart", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnWorkerStart: Self = this.set("onWorkerStart", js.undefined)
  }
  
}

