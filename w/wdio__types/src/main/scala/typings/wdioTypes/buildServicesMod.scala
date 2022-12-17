package typings.wdioTypes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.NonNullable
import typings.std.Record
import typings.wdioTypes.anon.OmitTestrunnercapabilitieAfter
import typings.wdioTypes.anon.OmitWebdriverIOcapabiliti
import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapabilities
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typings.wdioTypes.buildFrameworksMod.Suite
import typings.wdioTypes.buildFrameworksMod.Test
import typings.wdioTypes.buildFrameworksMod.TestResult
import typings.wdioTypes.buildOptionsMod.Testrunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildServicesMod {
  
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
          /* capabilities */ RemoteCapability, 
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
          /* args */ js.Array[Any], 
          /* result */ Any, 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Hook that gets executed _after_ a hook within the suite ends (e.g. runs after calling
      * afterEach in Mocha). `stepData` and `world` are Cucumber framework specific.
      * @param test      details to current running test (represents step in Cucumber)
      * @param context   context to current running test (represents World object in Cucumber)
      * @param result    test result
      */
    var afterHook: js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]] = js.undefined
    
    /**
      * Gets executed right after terminating the webdriver session.
      * @param config        wdio configuration object
      * @param capabilities  list of capabilities details
      * @param specs         list of spec file paths that are to be run
      */
    var afterSession: js.UndefOr[
        js.Function3[
          /* config */ Testrunner, 
          /* capabilities */ RemoteCapability, 
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
      * Function to be executed after a test (in Mocha/Jasmine only)
      * @param {Object}  test             test object
      * @param {Object}  context          scope object the test was executed with
      * @param {Error}   result.error     error object in case the test fails, otherwise `undefined`
      * @param {Any}     result.result    return object of test function
      * @param {Number}  result.duration  duration of test
      * @param {Boolean} result.passed    true if test has passed, otherwise false
      * @param {Object}  result.retries   informations to spec related retries, e.g. `{ attempts: 0, limit: 0 }`
      */
    var afterTest: js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]] = js.undefined
    
    /**
      * Gets executed before test execution begins. At this point you can access to all global
      * variables like `browser`. It is the perfect place to define custom commands.
      * @param capabilities  list of capabilities details
      * @param specs         specs to be run in the worker process
      * @param browser       instance of created browser/device session
      */
    var before: js.UndefOr[
        js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Runs before a WebdriverIO command gets executed.
      * @param commandName command name
      * @param args        arguments that command would receive
      */
    var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]] = js.undefined
    
    /**
      * Hook that gets executed _before_ a hook within the suite starts (e.g. runs before calling
      * beforeEach in Mocha). `stepData` and `world` are Cucumber framework specific properties.
      * @param test      details to current running test (represents step in Cucumber)
      * @param context   context to current running test (represents World object in Cucumber)
      */
    var beforeHook: js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]] = js.undefined
    
    /**
      * Gets executed just before initialising the webdriver session and test framework. It allows you
      * to manipulate configurations depending on the capability or spec.
      * @param config        wdio configuration object
      * @param capabilities  list of capabilities details
      * @param specs         list of spec file paths that are to be run
      * @param cid           worker id (e.g. 0-0)
      */
    var beforeSession: js.UndefOr[
        js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Hook that gets executed before the suite starts.
      * @param suite suite details
      */
    var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
    
    /**
      * Function to be executed before a test (in Mocha/Jasmine only)
      * @param {Object} test    test object
      * @param {Object} context scope object the test was executed with
      */
    var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]] = js.undefined
    
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
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Gets executed once before all workers get launched.
      * @param config        wdio configuration object
      * @param capabilities  list of capabilities details
      */
    var onPrepare: js.UndefOr[
        js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]
      ] = js.undefined
    
    /**
      * Gets executed when a refresh happens.
      * @param oldSessionId session id of old session
      * @param newSessionId session id of new session
      */
    var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
    
    /**
      * Gets executed just after a worker process has exited.
      * @param  {String} cid      capability id (e.g 0-0)
      * @param  {Number} exitCode 0 - success, 1 - fail
      * @param  {[type]} specs    specs to be run in the worker process
      * @param  {Number} retries  number of retries used
      */
    var onWorkerEnd: js.UndefOr[
        js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]
      ] = js.undefined
    
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
          /* args */ Testrunner, 
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
        value: (/* result */ Double, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      inline def setAfterCommand(
        value: (/* commandName */ String, /* args */ js.Array[Any], /* result */ Any, /* error */ js.UndefOr[js.Error]) => Unit
      ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4(value))
      
      inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
      
      inline def setAfterHook(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterHook", js.Any.fromFunction3(value))
      
      inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
      
      inline def setAfterSession(
        value: (/* config */ Testrunner, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3(value))
      
      inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
      
      inline def setAfterSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1(value))
      
      inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
      
      inline def setAfterTest(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterTest", js.Any.fromFunction3(value))
      
      inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(
        value: (/* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* browser */ Any) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
      
      inline def setBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[Any]) => Unit): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2(value))
      
      inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
      
      inline def setBeforeHook(value: (/* test */ Any, /* context */ Any) => Unit): Self = StObject.set(x, "beforeHook", js.Any.fromFunction2(value))
      
      inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
      
      inline def setBeforeSession(
        value: (/* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* cid */ String) => Unit
      ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction4(value))
      
      inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
      
      inline def setBeforeSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1(value))
      
      inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
      
      inline def setBeforeTest(value: (/* test */ Test, /* context */ Any) => Unit): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2(value))
      
      inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setOnComplete(
        value: (/* exitCode */ Double, /* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapabilities, /* results */ Any) => Unit
      ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnPrepare(value: (/* config */ Testrunner, /* capabilities */ RemoteCapabilities) => Unit): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2(value))
      
      inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
      
      inline def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = StObject.set(x, "onReload", js.Any.fromFunction2(value))
      
      inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
      
      inline def setOnWorkerEnd(
        value: (/* cid */ String, /* exitCode */ Double, /* specs */ js.Array[String], /* retries */ Double) => Unit
      ): Self = StObject.set(x, "onWorkerEnd", js.Any.fromFunction4(value))
      
      inline def setOnWorkerEndUndefined: Self = StObject.set(x, "onWorkerEnd", js.undefined)
      
      inline def setOnWorkerStart(
        value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], /* args */ Testrunner, /* execArgv */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5(value))
      
      inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
    }
  }
  
  /* Inlined {[ k in keyof @wdio/types.@wdio/types/build/Services.HookFunctions ]: @wdio/types.@wdio/types/build/Services.HookFunctions[k] | std.Array<std.NonNullable<@wdio/types.@wdio/types/build/Services.HookFunctions[k]>>} */
  trait Hooks extends StObject {
    
    var after: js.UndefOr[
        (js.Function3[
          /* result */ Double, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* result */ Double, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterCommand: js.UndefOr[
        (js.Function4[
          /* commandName */ String, 
          /* args */ js.Array[Any], 
          /* result */ Any, 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* commandName */ String, 
                /* args */ js.Array[Any], 
                /* result */ Any, 
                /* error */ js.UndefOr[js.Error], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterHook: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var afterSession: js.UndefOr[
        (js.Function3[
          /* config */ Testrunner, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* config */ Testrunner, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var afterTest: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var before: js.UndefOr[
        (js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* browser */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeCommand: js.UndefOr[
        (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
          ]
        ])
      ] = js.undefined
    
    var beforeHook: js.UndefOr[
        (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var beforeSession: js.UndefOr[
        (js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* cid */ String, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var beforeTest: js.UndefOr[
        (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var onComplete: js.UndefOr[
        (js.Function4[
          /* exitCode */ Double, 
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* exitCode */ Double, 
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapabilities, 
                /* results */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onPrepare: js.UndefOr[
        (js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]
            ]
          ]
        ])
      ] = js.undefined
    
    var onReload: js.UndefOr[
        (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
          ]
        ])
      ] = js.undefined
    
    var onWorkerEnd: js.UndefOr[
        (js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* cid */ String, 
                /* exitCode */ Double, 
                /* specs */ js.Array[String], 
                /* retries */ Double, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onWorkerStart: js.UndefOr[
        (js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ Testrunner, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function5[
                /* cid */ String, 
                /* caps */ DesiredCapabilities, 
                /* specs */ js.Array[String], 
                /* args */ Testrunner, 
                /* execArgv */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
  }
  object Hooks {
    
    inline def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setAfter(
        value: (js.Function3[
              /* result */ Double, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* result */ Double, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterCommand(
        value: (js.Function4[
              /* commandName */ String, 
              /* args */ js.Array[Any], 
              /* result */ Any, 
              /* error */ js.UndefOr[js.Error], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* commandName */ String, 
                    /* args */ js.Array[Any], 
                    /* result */ Any, 
                    /* error */ js.UndefOr[js.Error], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterCommand", value.asInstanceOf[js.Any])
      
      inline def setAfterCommandFunction4(
        value: (/* commandName */ String, /* args */ js.Array[Any], /* result */ Any, /* error */ js.UndefOr[js.Error]) => Unit
      ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4(value))
      
      inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
      
      inline def setAfterCommandVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* commandName */ String, 
                  /* args */ js.Array[Any], 
                  /* result */ Any, 
                  /* error */ js.UndefOr[js.Error], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "afterCommand", js.Array(value*))
      
      inline def setAfterFunction3(
        value: (/* result */ Double, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      inline def setAfterHook(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterHook", value.asInstanceOf[js.Any])
      
      inline def setAfterHookFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterHook", js.Any.fromFunction3(value))
      
      inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
      
      inline def setAfterHookVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterHook", js.Array(value*))
      
      inline def setAfterSession(
        value: (js.Function3[
              /* config */ Testrunner, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* config */ Testrunner, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterSession", value.asInstanceOf[js.Any])
      
      inline def setAfterSessionFunction3(
        value: (/* config */ Testrunner, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3(value))
      
      inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
      
      inline def setAfterSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* config */ Testrunner, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "afterSession", js.Array(value*))
      
      inline def setAfterSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "afterSuite", value.asInstanceOf[js.Any])
      
      inline def setAfterSuiteFunction1(value: /* suite */ Suite => Unit): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1(value))
      
      inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
      
      inline def setAfterSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "afterSuite", js.Array(value*))
      
      inline def setAfterTest(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterTest", value.asInstanceOf[js.Any])
      
      inline def setAfterTestFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterTest", js.Any.fromFunction3(value))
      
      inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
      
      inline def setAfterTestVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterTest", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* result */ Double, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(
        value: (js.Function3[
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* browser */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* browser */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommand(
        value: (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
              ]
            ])
      ): Self = StObject.set(x, "beforeCommand", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommandFunction2(value: (/* commandName */ String, /* args */ js.Array[Any]) => Unit): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2(value))
      
      inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
      
      inline def setBeforeCommandVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
            ])*
      ): Self = StObject.set(x, "beforeCommand", js.Array(value*))
      
      inline def setBeforeFunction3(
        value: (/* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* browser */ Any) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
      
      inline def setBeforeHook(
        value: (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeHook", value.asInstanceOf[js.Any])
      
      inline def setBeforeHookFunction2(value: (/* test */ Any, /* context */ Any) => Unit): Self = StObject.set(x, "beforeHook", js.Any.fromFunction2(value))
      
      inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
      
      inline def setBeforeHookVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeHook", js.Array(value*))
      
      inline def setBeforeSession(
        value: (js.Function4[
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* cid */ String, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* cid */ String, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "beforeSession", value.asInstanceOf[js.Any])
      
      inline def setBeforeSessionFunction4(
        value: (/* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* cid */ String) => Unit
      ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction4(value))
      
      inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
      
      inline def setBeforeSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* cid */ String, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "beforeSession", js.Array(value*))
      
      inline def setBeforeSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "beforeSuite", value.asInstanceOf[js.Any])
      
      inline def setBeforeSuiteFunction1(value: /* suite */ Suite => Unit): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1(value))
      
      inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
      
      inline def setBeforeSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "beforeSuite", js.Array(value*))
      
      inline def setBeforeTest(
        value: (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeTest", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestFunction2(value: (/* test */ Test, /* context */ Any) => Unit): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2(value))
      
      inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
      
      inline def setBeforeTestVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeTest", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* browser */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setOnComplete(
        value: (js.Function4[
              /* exitCode */ Double, 
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapabilities, 
              /* results */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* exitCode */ Double, 
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapabilities, 
                    /* results */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteFunction4(
        value: (/* exitCode */ Double, /* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapabilities, /* results */ Any) => Unit
      ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnCompleteVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* exitCode */ Double, 
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapabilities, 
                  /* results */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onComplete", js.Array(value*))
      
      inline def setOnPrepare(
        value: (js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onPrepare", value.asInstanceOf[js.Any])
      
      inline def setOnPrepareFunction2(value: (/* config */ Testrunner, /* capabilities */ RemoteCapabilities) => Unit): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2(value))
      
      inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
      
      inline def setOnPrepareVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function2[/* config */ Testrunner, /* capabilities */ RemoteCapabilities, Unit]
              ]
            ])*
      ): Self = StObject.set(x, "onPrepare", js.Array(value*))
      
      inline def setOnReload(
        value: (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "onReload", value.asInstanceOf[js.Any])
      
      inline def setOnReloadFunction2(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = StObject.set(x, "onReload", js.Any.fromFunction2(value))
      
      inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
      
      inline def setOnReloadVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
            ])*
      ): Self = StObject.set(x, "onReload", js.Array(value*))
      
      inline def setOnWorkerEnd(
        value: (js.Function4[
              /* cid */ String, 
              /* exitCode */ Double, 
              /* specs */ js.Array[String], 
              /* retries */ Double, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* cid */ String, 
                    /* exitCode */ Double, 
                    /* specs */ js.Array[String], 
                    /* retries */ Double, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerEnd", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerEndFunction4(
        value: (/* cid */ String, /* exitCode */ Double, /* specs */ js.Array[String], /* retries */ Double) => Unit
      ): Self = StObject.set(x, "onWorkerEnd", js.Any.fromFunction4(value))
      
      inline def setOnWorkerEndUndefined: Self = StObject.set(x, "onWorkerEnd", js.undefined)
      
      inline def setOnWorkerEndVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* cid */ String, 
                  /* exitCode */ Double, 
                  /* specs */ js.Array[String], 
                  /* retries */ Double, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerEnd", js.Array(value*))
      
      inline def setOnWorkerStart(
        value: (js.Function5[
              /* cid */ String, 
              /* caps */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              /* args */ Testrunner, 
              /* execArgv */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function5[
                    /* cid */ String, 
                    /* caps */ DesiredCapabilities, 
                    /* specs */ js.Array[String], 
                    /* args */ Testrunner, 
                    /* execArgv */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerStart", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerStartFunction5(
        value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], /* args */ Testrunner, /* execArgv */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5(value))
      
      inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
      
      inline def setOnWorkerStartVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function5[
                  /* cid */ String, 
                  /* caps */ DesiredCapabilities, 
                  /* specs */ js.Array[String], 
                  /* args */ Testrunner, 
                  /* execArgv */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerStart", js.Array(value*))
    }
  }
  
  @js.native
  trait RunnerClass
    extends StObject
       with Instantiable2[/* configFile */ String, /* config */ OmitWebdriverIOcapabiliti, RunnerInstance]
  
  trait RunnerInstance extends StObject {
    
    def getWorkerCount(): Double
    
    def initialise(): js.Promise[Unit]
    
    def run(args: Any): EventEmitter
    
    def shutdown(): js.Promise[Unit]
    
    var workerPool: Any
  }
  object RunnerInstance {
    
    inline def apply(
      getWorkerCount: () => Double,
      initialise: () => js.Promise[Unit],
      run: Any => EventEmitter,
      shutdown: () => js.Promise[Unit],
      workerPool: Any
    ): RunnerInstance = {
      val __obj = js.Dynamic.literal(getWorkerCount = js.Any.fromFunction0(getWorkerCount), initialise = js.Any.fromFunction0(initialise), run = js.Any.fromFunction1(run), shutdown = js.Any.fromFunction0(shutdown), workerPool = workerPool.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunnerInstance]
    }
    
    extension [Self <: RunnerInstance](x: Self) {
      
      inline def setGetWorkerCount(value: () => Double): Self = StObject.set(x, "getWorkerCount", js.Any.fromFunction0(value))
      
      inline def setInitialise(value: () => js.Promise[Unit]): Self = StObject.set(x, "initialise", js.Any.fromFunction0(value))
      
      inline def setRun(value: Any => EventEmitter): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: () => js.Promise[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
      
      inline def setWorkerPool(value: Any): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunnerPlugin
    extends StObject
       with RunnerClass {
    
    var default: RunnerClass = js.native
    
    var launcher: js.UndefOr[RunnerClass] = js.native
  }
  
  @js.native
  trait ServiceClass
    extends StObject
       with Instantiable3[
          /* options */ ServiceOption, 
          /* caps */ RemoteCapability, 
          /* config */ OmitWebdriverIOcapabiliti, 
          ServiceInstance
        ]
       with _ServiceEntry
  
  /* Rewritten from type alias, can be one of: 
    - / **
    * e.g. `services: ['@wdio/sauce-service']`
    * /
  java.lang.String
    - / **
    * e.g. `services: [{ onPrepare: () => { ... } }]`
    * /
  typings.wdioTypes.buildServicesMod.HookFunctions
    - / **
    * e.g. `services: [CustomClass]`
    * /
  typings.wdioTypes.buildServicesMod.ServiceClass
    - js.Tuple2[
  typings.wdioTypes.buildServicesMod.ServiceClass | java.lang.String, 
  typings.wdioTypes.mod.global.WebdriverIO.ServiceOption]
  */
  type ServiceEntry = _ServiceEntry | (js.Tuple2[ServiceClass | String, typings.wdioTypes.mod.global.WebdriverIO.ServiceOption]) | (/**
    * e.g. `services: ['@wdio/sauce-service']`
    */
  String)
  
  trait ServiceInstance
    extends StObject
       with HookFunctions {
    
    var capabilities: js.UndefOr[RemoteCapability] = js.undefined
    
    var config: js.UndefOr[Testrunner] = js.undefined
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object ServiceInstance {
    
    inline def apply(): ServiceInstance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstance]
    }
    
    extension [Self <: ServiceInstance](x: Self) {
      
      inline def setCapabilities(value: RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setConfig(value: Testrunner): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type ServiceOption = StringDictionary[Any]
  
  @js.native
  trait ServicePlugin
    extends StObject
       with ServiceClass {
    
    var default: ServiceClass = js.native
    
    var launcher: js.UndefOr[ServiceClass] = js.native
  }
  
  trait _ServiceEntry extends StObject
}
