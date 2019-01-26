package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined
  var addCustomRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var app: js.UndefOr[java.lang.String] = js.undefined
  var applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var avoidProxy: js.UndefOr[scala.Boolean] = js.undefined
  var browserAttachTimeout: js.UndefOr[scala.Double] = js.undefined
  var browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var browserSideLog: js.UndefOr[scala.Boolean] = js.undefined
  // wdio-sauce-service specific
  var build: js.UndefOr[java.lang.String] = js.undefined
  var captureNetworkTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var changeMaxConnections: js.UndefOr[scala.Boolean] = js.undefined
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  var cleanSession: js.UndefOr[scala.Boolean] = js.undefined
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[java.lang.String] = js.undefined
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Appium
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  var dontInjectRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var elementScrollBehavior: js.UndefOr[scala.Double] = js.undefined
  var enableElementCacheCleanup: js.UndefOr[scala.Boolean] = js.undefined
  var enablePersistentHover: js.UndefOr[scala.Boolean] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var executablePath: js.UndefOr[java.lang.String] = js.undefined
  var extractPath: js.UndefOr[java.lang.String] = js.undefined
  var firefoxProfileTemplate: js.UndefOr[java.lang.String] = js.undefined
  // Firefox
  var firefox_binary: js.UndefOr[java.lang.String] = js.undefined
  var `goog:chromeOptions`: js.UndefOr[ChromeOptions] = js.undefined
  var handlesAlerts: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var `ie.browserCommandLineSwitches`: js.UndefOr[java.lang.String] = js.undefined
  var `ie.ensureCleanSession`: js.UndefOr[scala.Boolean] = js.undefined
  // IE specific
  var `ie.forceCreateProcessApi`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.setProxyByServer`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.usePerProcessProxy`: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreProtectedModeSettings: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreZoomSetting: js.UndefOr[scala.Boolean] = js.undefined
  var initialBrowserUrl: js.UndefOr[java.lang.String] = js.undefined
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var killProcessesByName: js.UndefOr[scala.Boolean] = js.undefined
  var locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logFile: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var loggingPrefs: js.UndefOr[webdriverLib.Anon_Browser] = js.undefined
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  var `moz:firefoxOptions`: js.UndefOr[FirefoxOptions] = js.undefined
  var nativeEvents: js.UndefOr[scala.Boolean] = js.undefined
  var onlyProxySeleniumTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var optionsSet: js.UndefOr[scala.Boolean] = js.undefined
  var pageLoadingStrategy: js.UndefOr[java.lang.String] = js.undefined
  var perfLoggingPrefs: js.UndefOr[webdriverLib.Anon_BufferUsageReportingInterval] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var proxyEverything: js.UndefOr[scala.Boolean] = js.undefined
  var proxyRequired: js.UndefOr[scala.Boolean] = js.undefined
  var requireWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
  var rotatable: js.UndefOr[scala.Boolean] = js.undefined
  // Safari specific
  var `safari.options`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  // Selenese-Backed-WebDriver specific
  var `selenium.server.url`: js.UndefOr[java.lang.String] = js.undefined
  // Grid-specific
  var seleniumProtocol: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[java.lang.String] = js.undefined
  var singleWindow: js.UndefOr[scala.Boolean] = js.undefined
  var timeoutInSeconds: js.UndefOr[scala.Double] = js.undefined
  var trustAllSSLCertificates: js.UndefOr[scala.Boolean] = js.undefined
  var udid: js.UndefOr[java.lang.String] = js.undefined
  var unexpectedAlertBehaviour: js.UndefOr[java.lang.String] = js.undefined
  var userExtensions: js.UndefOr[java.lang.String] = js.undefined
  var userJSInjection: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `webdriver.remote.quietExceptions`: js.UndefOr[scala.Boolean] = js.undefined
  // RemoteWebDriver specific
  var `webdriver.remote.sessionid`: js.UndefOr[java.lang.String] = js.undefined
}

