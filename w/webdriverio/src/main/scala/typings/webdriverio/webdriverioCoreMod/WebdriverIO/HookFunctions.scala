package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookFunctions
  extends StObject
     with _ServiceEntry {
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  
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
      /* args */ js.Array[js.Any], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.undefined
  
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
      /* result */ TestResult, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Gets executed right after terminating the webdriver session.
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    * @param specs         list of spec file paths that are to be run
    */
  var afterSession: js.UndefOr[
    js.Function3[
      /* config */ Config, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Hook that gets executed after the suite has ended
    * @param suite suite details
    */
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  
  /**
    * Function to be executed after a test (in Mocha/Jasmine) ends.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    * @param result    test result
    */
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ TestResult, Unit]
  ] = js.undefined
  
  /**
    * Gets executed before test execution begins. At this point you can access to all global
    * variables like `browser`. It is the perfect place to define custom commands.
    * @param capabilities  list of capabilities details
    * @param specs         specs to be run in the worker process
    */
  var before: js.UndefOr[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Runs before a WebdriverIO command gets executed.
    * @param commandName command name
    * @param args        arguments that command would receive
    */
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[js.Any], Unit]] = js.undefined
  
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
  ] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Hook that gets executed before the suite starts.
    * @param suite suite details
    */
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  
  /**
    * Function to be executed before a test (in Mocha/Jasmine) starts.
    * @param test      details to current running test (or step in Cucumber)
    * @param context   context to current running test
    */
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* results */ Results, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Gets executed once before all workers get launched.
    * @param config        wdio configuration object
    * @param capabilities  list of capabilities details
    */
  var onPrepare: js.UndefOr[
    js.Function2[
      /* config */ Config, 
      /* capabilities */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Gets executed when a refresh happens.
    * @param oldSessionId session id of old session
    * @param newSessionId session id of new session
    */
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
      /* specs */ js.Array[String], 
      /* args */ Config, 
      /* execArgv */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
}
object HookFunctions {
  
  inline def apply(): HookFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookFunctions]
  }
  
  extension [Self <: HookFunctions](x: Self) {
    
    inline def setAfter(
      value: (/* result */ Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
    
    inline def setAfterCommand(
      value: (/* commandName */ String, /* args */ js.Array[js.Any], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit
    ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4(value))
    
    inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
    
    inline def setAfterHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ TestResult, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterHook", js.Any.fromFunction5(value))
    
    inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
    
    inline def setAfterSession(
      value: (/* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3(value))
    
    inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
    
    inline def setAfterSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1(value))
    
    inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
    
    inline def setAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterTest", js.Any.fromFunction3(value))
    
    inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    inline def setBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[js.Any]) => Unit): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2(value))
    
    inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
    
    inline def setBeforeHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeHook", js.Any.fromFunction4(value))
    
    inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
    
    inline def setBeforeSession(
      value: (/* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction3(value))
    
    inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
    
    inline def setBeforeSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1(value))
    
    inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
    
    inline def setBeforeTest(value: (/* test */ Test, /* context */ js.Any) => Unit): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2(value))
    
    inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setOnComplete(
      value: (/* exitCode */ Double, /* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* results */ Results) => Unit
    ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnPrepare(
      value: (/* config */ Config, /* capabilities */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
        ]) => Unit
    ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2(value))
    
    inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
    
    inline def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = StObject.set(x, "onReload", js.Any.fromFunction2(value))
    
    inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
    
    inline def setOnWorkerStart(
      value: (/* cid */ String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, /* specs */ js.Array[String], /* args */ Config, /* execArgv */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5(value))
    
    inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
  }
}
