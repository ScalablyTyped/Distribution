package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
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
  /**
    * Specify custom headers to pass into every request.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Host of your WebDriver server.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Level of logging verbosity.
    */
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.native
  /**
    * Set specific log levels per logger
    * use 'silent' level to disable logger
    */
  var logLevels: js.UndefOr[js.Object] = js.native
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
  var requestedCapabilities: js.UndefOr[DesiredCapabilities] = js.native
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
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setLogLevel(value: WebDriverLogTypes): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setLogLevels(value: js.Object): Self = this.set("logLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevels: Self = this.set("logLevels", js.undefined)
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
    def setRequestedCapabilities(value: DesiredCapabilities): Self = this.set("requestedCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedCapabilities: Self = this.set("requestedCapabilities", js.undefined)
    @scala.inline
    def setTransformRequest(value: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    @scala.inline
    def setTransformResponse(value: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse): Self = this.set("transformResponse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransformResponse: Self = this.set("transformResponse", js.undefined)
  }
  
}

