package typings.webdriverio.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.std.Error
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.WebDriverLogTypes
import typings.webdriverio.AnonDuration
import typings.webdriverio.AnonSpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent webdriverio.WebdriverIO.Options */
/* Inlined parent std.Omit<webdriver.WebDriver.Options, 'capabilities'> */
/* Inlined parent webdriverio.WebdriverIO._HooksArray */
/* Inlined parent webdriverio.WebdriverIO._Hooks */
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
  ] = js.undefined
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[_], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.undefined
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ AnonDuration, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
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
  ] = js.undefined
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ AnonDuration, Unit]
  ] = js.undefined
  var bail: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[
    (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ])
  ] = js.undefined
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[_], Unit]] = js.undefined
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
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
  ] = js.undefined
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  var capabilities: js.UndefOr[js.Array[DesiredCapabilities] | MultiRemoteCapabilities] = js.undefined
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var featureFlags: js.UndefOr[AnonSpecFiltering] = js.undefined
  var framework: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  var logOutput: js.UndefOr[String | WritableStream] = js.undefined
  var maxInstances: js.UndefOr[Double] = js.undefined
  var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
  var mochaOpts: js.UndefOr[js.Object] = js.undefined
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
  ] = js.undefined
  var onPrepare: js.UndefOr[
    (js.Function2[/* config */ this.type, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* config */ this.type, /* capabilities */ js.Array[DesiredCapabilities], Unit]
      ]
    ])
  ] = js.undefined
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
  var outputDir: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var specFileRetries: js.UndefOr[Double] = js.undefined
  val specFileRetryAttempts: js.UndefOr[Double] = js.undefined
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  var suites: js.UndefOr[js.Object] = js.undefined
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.undefined
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var waitforInterval: js.UndefOr[Double] = js.undefined
  var waitforTimeout: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    after: (js.Function3[
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
    ]) = null,
    afterCommand: (/* commandName */ String, /* args */ js.Array[_], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit = null,
    afterHook: (/* test */ js.Any, /* context */ js.Any, /* result */ AnonDuration, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    afterSession: (js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
    afterSuite: /* suite */ Suite => Unit = null,
    afterTest: (/* test */ Test, /* context */ js.Any, /* result */ AnonDuration) => Unit = null,
    bail: Int | Double = null,
    baseUrl: String = null,
    before: (js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function2[/* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
    beforeCommand: (/* commandName */ String, /* args */ js.Array[_]) => Unit = null,
    beforeHook: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit = null,
    beforeSession: (js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]) | (js.Array[
      js.UndefOr[
        js.Function3[Config, /* capabilities */ DesiredCapabilities, /* specs */ js.Array[String], Unit]
      ]
    ]) = null,
    beforeSuite: /* suite */ Suite => Unit = null,
    beforeTest: (/* test */ Test, /* context */ js.Any) => Unit = null,
    capabilities: js.Array[DesiredCapabilities] | MultiRemoteCapabilities = null,
    connectionRetryCount: Int | Double = null,
    connectionRetryTimeout: Int | Double = null,
    exclude: js.Array[String] = null,
    execArgv: js.Array[String] = null,
    featureFlags: AnonSpecFiltering = null,
    framework: String = null,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    jasmineNodeOpts: js.Object = null,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    maxInstances: Int | Double = null,
    maxInstancesPerCapability: Int | Double = null,
    mochaOpts: js.Object = null,
    onComplete: (js.Function4[
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
    ]) = null,
    onPrepare: (js.Function2[Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]) | (js.Array[
      js.UndefOr[js.Function2[Config, /* capabilities */ js.Array[DesiredCapabilities], Unit]]
    ]) = null,
    onReload: (/* oldSessionId */ String, /* newSessionId */ String) => Unit = null,
    outputDir: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    reporters: js.Array[String | js.Object] = null,
    runner: String = null,
    services: js.Array[String | js.Object] = null,
    specFileRetries: Int | Double = null,
    specFileRetryAttempts: Int | Double = null,
    specs: js.Array[String] = null,
    suites: js.Object = null,
    transformRequest: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions = null,
    transformResponse: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse = null,
    user: String = null,
    waitforInterval: Int | Double = null,
    waitforTimeout: Int | Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterCommand != null) __obj.updateDynamic("afterCommand")(js.Any.fromFunction4(afterCommand))
    if (afterHook != null) __obj.updateDynamic("afterHook")(js.Any.fromFunction5(afterHook))
    if (afterSession != null) __obj.updateDynamic("afterSession")(afterSession.asInstanceOf[js.Any])
    if (afterSuite != null) __obj.updateDynamic("afterSuite")(js.Any.fromFunction1(afterSuite))
    if (afterTest != null) __obj.updateDynamic("afterTest")(js.Any.fromFunction3(afterTest))
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeCommand != null) __obj.updateDynamic("beforeCommand")(js.Any.fromFunction2(beforeCommand))
    if (beforeHook != null) __obj.updateDynamic("beforeHook")(js.Any.fromFunction4(beforeHook))
    if (beforeSession != null) __obj.updateDynamic("beforeSession")(beforeSession.asInstanceOf[js.Any])
    if (beforeSuite != null) __obj.updateDynamic("beforeSuite")(js.Any.fromFunction1(beforeSuite))
    if (beforeTest != null) __obj.updateDynamic("beforeTest")(js.Any.fromFunction2(beforeTest))
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (connectionRetryCount != null) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.asInstanceOf[js.Any])
    if (connectionRetryTimeout != null) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (featureFlags != null) __obj.updateDynamic("featureFlags")(featureFlags.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (maxInstancesPerCapability != null) __obj.updateDynamic("maxInstancesPerCapability")(maxInstancesPerCapability.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onPrepare != null) __obj.updateDynamic("onPrepare")(onPrepare.asInstanceOf[js.Any])
    if (onReload != null) __obj.updateDynamic("onReload")(js.Any.fromFunction2(onReload))
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (specFileRetries != null) __obj.updateDynamic("specFileRetries")(specFileRetries.asInstanceOf[js.Any])
    if (specFileRetryAttempts != null) __obj.updateDynamic("specFileRetryAttempts")(specFileRetryAttempts.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    if (suites != null) __obj.updateDynamic("suites")(suites.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction2(transformResponse))
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (waitforInterval != null) __obj.updateDynamic("waitforInterval")(waitforInterval.asInstanceOf[js.Any])
    if (waitforTimeout != null) __obj.updateDynamic("waitforTimeout")(waitforTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

