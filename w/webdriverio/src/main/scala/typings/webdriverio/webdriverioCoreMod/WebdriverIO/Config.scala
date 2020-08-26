package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.WebDriverLogTypes
import typings.webdriverio.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent webdriverio.webdriverio/webdriverio-core.WebdriverIO.Options */
/* Inlined parent std.Omit<webdriver.WebDriver.Options, 'capabilities'> */
/* Inlined parent webdriverio.webdriverio/webdriverio-core.WebdriverIO._HooksArray */
/* Inlined parent webdriverio.webdriverio/webdriverio-core.WebdriverIO._Hooks */
@js.native
trait Config extends js.Object {
  var after: js.UndefOr[
    (js.Function3[
      /* result */ Double, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.native
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
  var afterSession: js.UndefOr[
    (js.Function3[
      /* config */ this.type, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ this.type, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var afterTest: js.UndefOr[js.Function3[/* test */ Test, /* context */ js.Any, /* result */ Duration, Unit]] = js.native
  /**
    * Define the protocol you want to use for your browser automation.
    * Currently only [`webdriver`](https://www.npmjs.com/package/webdriver) and
    * [`devtools`](https://www.npmjs.com/package/devtools) are supported,
    * as these are the main browser automation technologies available.
    */
  var automationProtocol: js.UndefOr[String] = js.native
  /**
    * If you want your test run to stop after a specific number of test failures, use bail.
    * (It defaults to 0, which runs all tests no matter what.) Note: Please be aware that
    * when using a third party test runner (such as Mocha), additional configuration might
    * be required.
    */
  var bail: js.UndefOr[Double] = js.native
  /**
    * Shorten url command calls by setting a base URL.
    */
  var baseUrl: js.UndefOr[String] = js.native
  var before: js.UndefOr[
    (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ])
  ] = js.native
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.native
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var beforeSession: js.UndefOr[
    (js.Function3[
      /* config */ this.type, 
      /* capabilities */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ this.type, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.native
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.native
  var capabilities: js.UndefOr[js.Array[DesiredCapabilities] | MultiRemoteCapabilities] = js.native
  var connectionRetryCount: js.UndefOr[Double] = js.native
  var connectionRetryTimeout: js.UndefOr[Double] = js.native
  /**
    * Exclude specs from test execution.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Node arguments to specify when launching child processes.
    */
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  /**
    * Defines the test framework to be used by the WDIO testrunner.
    */
  var framework: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Sauce Labs provides a headless offering that allows you to run Chrome and Firefox tests headless.
    */
  var headless: js.UndefOr[String] = js.native
  var hostname: js.UndefOr[String] = js.native
  /**
    * Your cloud service access key or secret key (only works for Sauce Labs, Browserstack,
    * TestingBot, CrossBrowserTesting or LambdaTest accounts). If set, WebdriverIO will
    * automatically set connection options for you.
    */
  var key: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.native
  var logLevels: js.UndefOr[js.Object] = js.native
  /**
    * Maximum number of total parallel running workers.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Maximum number of total parallel running workers per capability.
    */
  var maxInstancesPerCapability: js.UndefOr[Double] = js.native
  var onComplete: js.UndefOr[
    (js.Function4[
      /* exitCode */ Double, 
      /* config */ this.type, 
      /* capabilities */ DesiredCapabilities, 
      /* results */ Results, 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function4[
          /* exitCode */ Double, 
          /* config */ this.type, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]
      ]
    ])
  ] = js.native
  var onPrepare: js.UndefOr[
    (js.Function2[/* config */ this.type, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ this.type, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ])
  ] = js.native
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.native
  var onWorkerStart: js.UndefOr[
    (js.Function5[
      /* cid */ String, 
      /* caps */ DesiredCapabilities, 
      /* specs */ js.Array[String], 
      /* args */ this.type, 
      /* execArgv */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ this.type, 
          /* execArgv */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.native
  /**
    * Directory to store all testrunner log files (including reporter logs and wdio logs).
    * If not set, all logs are streamed to stdout. Since most reporters are made to log to
    * stdout, it is recommended to only use this option for specific reporters where it
    * makes more sense to push report into a file (like the junit reporter, for example).
    *
    * When running in standalone mode, the only log generated by WebdriverIO will be the wdio log.
    */
  var outputDir: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If running on Sauce Labs, you can choose to run tests between different datacenters:
    * US or EU. To change your region to EU, add region: 'eu' to your config.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Determines in which interval the reporter should check if they are synchronised
    * if they report their logs asynchronously (e.g. if logs are streamed to a 3rd
    * party vendor).
    */
  var reporterSyncInterval: js.UndefOr[Double] = js.native
  /**
    * Determines the maximum time reporters have to finish uploading all their logs
    * until an error is being thrown by the testrunner.
    */
  var reporterSyncTimeout: js.UndefOr[Double] = js.native
  /**
    * List of reporters to use. A reporter can be either a string, or an array of
    * `['reporterName', { <reporter options> }]` where the first element is a string
    * with the reporter name and the second element an object with reporter options.
    */
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.native
  var requestedCapabilities: js.UndefOr[DesiredCapabilities] = js.native
  var runner: js.UndefOr[String] = js.native
  /**
    * Services take over a specific job you don't want to take care of. They enhance
    * your test setup with almost no effort.
    */
  var services: js.UndefOr[js.Array[ServiceEntry]] = js.native
  /**
    * The number of retry attempts for an entire specfile when it fails as a whole.
    */
  var specFileRetries: js.UndefOr[Double] = js.native
  val specFileRetryAttempts: js.UndefOr[Double] = js.native
  /**
    * Define specs for test execution.
    */
  var specs: js.UndefOr[js.Array[String]] = js.native
  /**
    * An object describing various of suites, which you can then specify
    * with the --suite option on the wdio CLI.
    */
  var suites: js.UndefOr[js.Object] = js.native
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.native
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.native
  /**
    * Your cloud service username (only works for Sauce Labs, Browserstack, TestingBot,
    * CrossBrowserTesting or LambdaTest accounts). If set, WebdriverIO will automatically
    * set connection options for you.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * Default interval for all `waitFor*` commands to check if an expected state (e.g.,
    * visibility) has been changed.
    */
  var waitforInterval: js.UndefOr[Double] = js.native
  /**
    * Default timeout for all `waitFor*` commands. (Note the lowercase f in the option name.)
    * This timeout only affects commands starting with `waitFor*` and their default wait time.
    */
  var waitforTimeout: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setAfterVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* result */ Double, 
            /* capabilities */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfterFunction3(
      value: (/* result */ Double, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    @scala.inline
    def setAfter(
      value: (js.Function3[
          /* result */ Double, 
          /* capabilities */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* result */ Double, 
              /* capabilities */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = this.set("after", value.asInstanceOf[js.Any])
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
    def setAfterSessionVarargs(
      value: (js.UndefOr[
          js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
        ])*
    ): Self = this.set("afterSession", js.Array(value :_*))
    @scala.inline
    def setAfterSessionFunction3(value: (Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = this.set("afterSession", js.Any.fromFunction3(value))
    @scala.inline
    def setAfterSession(
      value: (js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
          js.UndefOr[
            js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
          ]
        ])
    ): Self = this.set("afterSession", value.asInstanceOf[js.Any])
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
    def setAutomationProtocol(value: String): Self = this.set("automationProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationProtocol: Self = this.set("automationProtocol", js.undefined)
    @scala.inline
    def setBail(value: Double): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setBeforeVarargs(
      value: (js.UndefOr[
          js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
        ])*
    ): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBeforeFunction2(value: (/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def setBefore(
      value: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
          js.UndefOr[
            js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
          ]
        ])
    ): Self = this.set("before", value.asInstanceOf[js.Any])
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
    def setBeforeSessionVarargs(
      value: (js.UndefOr[
          js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
        ])*
    ): Self = this.set("beforeSession", js.Array(value :_*))
    @scala.inline
    def setBeforeSessionFunction3(value: (Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String]) => Unit): Self = this.set("beforeSession", js.Any.fromFunction3(value))
    @scala.inline
    def setBeforeSession(
      value: (js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
          js.UndefOr[
            js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
          ]
        ])
    ): Self = this.set("beforeSession", value.asInstanceOf[js.Any])
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
    def setCapabilitiesVarargs(value: DesiredCapabilities*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[DesiredCapabilities] | MultiRemoteCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setConnectionRetryCount(value: Double): Self = this.set("connectionRetryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionRetryCount: Self = this.set("connectionRetryCount", js.undefined)
    @scala.inline
    def setConnectionRetryTimeout(value: Double): Self = this.set("connectionRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionRetryTimeout: Self = this.set("connectionRetryTimeout", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = this.set("execArgv", js.Array(value :_*))
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = this.set("execArgv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecArgv: Self = this.set("execArgv", js.undefined)
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeadless(value: String): Self = this.set("headless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLogLevel(value: WebDriverLogTypes): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setLogLevels(value: js.Object): Self = this.set("logLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevels: Self = this.set("logLevels", js.undefined)
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    @scala.inline
    def setMaxInstancesPerCapability(value: Double): Self = this.set("maxInstancesPerCapability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInstancesPerCapability: Self = this.set("maxInstancesPerCapability", js.undefined)
    @scala.inline
    def setOnCompleteVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* exitCode */ Double, 
            Config, 
            /* capabilities */ DesiredCapabilities, 
            /* results */ Results, 
            Unit
          ]
        ])*
    ): Self = this.set("onComplete", js.Array(value :_*))
    @scala.inline
    def setOnCompleteFunction4(
      value: (/* exitCode */ Double, Config, /* capabilities */ DesiredCapabilities, /* results */ Results) => Unit
    ): Self = this.set("onComplete", js.Any.fromFunction4(value))
    @scala.inline
    def setOnComplete(
      value: (js.Function4[
          /* exitCode */ Double, 
          Config, 
          /* capabilities */ DesiredCapabilities, 
          /* results */ Results, 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function4[
              /* exitCode */ Double, 
              Config, 
              /* capabilities */ DesiredCapabilities, 
              /* results */ Results, 
              Unit
            ]
          ]
        ])
    ): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnPrepareVarargs(value: (js.UndefOr[js.Function2[Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]])*): Self = this.set("onPrepare", js.Array(value :_*))
    @scala.inline
    def setOnPrepareFunction2(value: (Config, /* capabilities */ js.Array[DesiredCapabilities]) => Unit): Self = this.set("onPrepare", js.Any.fromFunction2(value))
    @scala.inline
    def setOnPrepare(
      value: (js.Function2[Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
          js.UndefOr[js.Function2[Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]]
        ])
    ): Self = this.set("onPrepare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPrepare: Self = this.set("onPrepare", js.undefined)
    @scala.inline
    def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = this.set("onReload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReload: Self = this.set("onReload", js.undefined)
    @scala.inline
    def setOnWorkerStartFunction5(
      value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], Config, /* execArgv */ js.Array[String]) => Unit
    ): Self = this.set("onWorkerStart", js.Any.fromFunction5(value))
    @scala.inline
    def setOnWorkerStartVarargs(
      value: (js.UndefOr[
          js.Function5[
            /* cid */ String, 
            /* caps */ DesiredCapabilities, 
            /* specs */ js.Array[String], 
            Config, 
            /* execArgv */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = this.set("onWorkerStart", js.Array(value :_*))
    @scala.inline
    def setOnWorkerStart(
      value: (js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          Config, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function5[
              /* cid */ String, 
              /* caps */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              Config, 
              /* execArgv */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = this.set("onWorkerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnWorkerStart: Self = this.set("onWorkerStart", js.undefined)
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDir: Self = this.set("outputDir", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setReporterSyncInterval(value: Double): Self = this.set("reporterSyncInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporterSyncInterval: Self = this.set("reporterSyncInterval", js.undefined)
    @scala.inline
    def setReporterSyncTimeout(value: Double): Self = this.set("reporterSyncTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporterSyncTimeout: Self = this.set("reporterSyncTimeout", js.undefined)
    @scala.inline
    def setReportersVarargs(value: (String | js.Object)*): Self = this.set("reporters", js.Array(value :_*))
    @scala.inline
    def setReporters(value: js.Array[String | js.Object]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    @scala.inline
    def setRequestedCapabilities(value: DesiredCapabilities): Self = this.set("requestedCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedCapabilities: Self = this.set("requestedCapabilities", js.undefined)
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
    @scala.inline
    def setServicesVarargs(value: ServiceEntry*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[ServiceEntry]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setSpecFileRetries(value: Double): Self = this.set("specFileRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecFileRetries: Self = this.set("specFileRetries", js.undefined)
    @scala.inline
    def setSpecFileRetryAttempts(value: Double): Self = this.set("specFileRetryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecFileRetryAttempts: Self = this.set("specFileRetryAttempts", js.undefined)
    @scala.inline
    def setSpecsVarargs(value: String*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecs: Self = this.set("specs", js.undefined)
    @scala.inline
    def setSuites(value: js.Object): Self = this.set("suites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuites: Self = this.set("suites", js.undefined)
    @scala.inline
    def setTransformRequest(value: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    @scala.inline
    def setTransformResponse(value: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse): Self = this.set("transformResponse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransformResponse: Self = this.set("transformResponse", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setWaitforInterval(value: Double): Self = this.set("waitforInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitforInterval: Self = this.set("waitforInterval", js.undefined)
    @scala.inline
    def setWaitforTimeout(value: Double): Self = this.set("waitforTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitforTimeout: Self = this.set("waitforTimeout", js.undefined)
  }
  
}

