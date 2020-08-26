package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.WebDriverLogTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent webdriver.WebDriver.Options */
/* Inlined parent std.Omit<webdriverio.webdriverio/webdriverio-core.WebdriverIO.Options, 'capabilities'> */
@js.native
trait RemoteOptions extends js.Object {
  var automationProtocol: js.UndefOr[String] = js.native
  var bail: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * Defines the [capabilities](https://w3c.github.io/webdriver/webdriver-spec.html#capabilities) you want to run in your Selenium session.
    */
  var capabilities: js.UndefOr[DesiredCapabilities] = js.native
  /**
    * Count of request retries to the Selenium server.
    */
  var connectionRetryCount: js.UndefOr[Double] = js.native
  /**
    * Timeout for any WebDriver request to a driver or grid.
    */
  var connectionRetryTimeout: js.UndefOr[Double] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var framework: js.UndefOr[String] = js.native
  /**
    * Specify custom headers to pass into every request.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var headless: js.UndefOr[String] = js.native
  /**
    * Host of your WebDriver server.
    */
  var hostname: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  /**
    * Level of logging verbosity.
    */
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.native
  /**
    * Set specific log levels per logger
    * use 'silent' level to disable logger
    */
  var logLevels: js.UndefOr[js.Object] = js.native
  var maxInstances: js.UndefOr[Double] = js.native
  var maxInstancesPerCapability: js.UndefOr[Double] = js.native
  var outputDir: js.UndefOr[String] = js.native
  /**
    * Path to WebDriver endpoint or grid server.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Port your WebDriver server is on.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Protocol to use when communicating with the Selenium standalone server (or driver).
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * Query paramaters that are propagated to the driver server.
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  var region: js.UndefOr[String] = js.native
  var reporterSyncInterval: js.UndefOr[Double] = js.native
  var reporterSyncTimeout: js.UndefOr[Double] = js.native
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.native
  var requestedCapabilities: js.UndefOr[DesiredCapabilities] = js.native
  var runner: js.UndefOr[String] = js.native
  var services: js.UndefOr[js.Array[ServiceEntry]] = js.native
  var specFileRetries: js.UndefOr[Double] = js.native
  var specFileRetryAttempts: js.UndefOr[Double] = js.native
  var specs: js.UndefOr[js.Array[String]] = js.native
  var suites: js.UndefOr[js.Object] = js.native
  /**
    * Function intercepting [HTTP request options](https://github.com/sindresorhus/got#options) before a WebDriver request is made.
    */
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.native
  /**
    * Function intercepting HTTP response objects after a WebDriver response has arrived.
    */
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.native
  var user: js.UndefOr[String] = js.native
  var waitforInterval: js.UndefOr[Double] = js.native
  var waitforTimeout: js.UndefOr[Double] = js.native
}

object RemoteOptions {
  @scala.inline
  def apply(): RemoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteOptions]
  }
  @scala.inline
  implicit class RemoteOptionsOps[Self <: RemoteOptions] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: DesiredCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
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

