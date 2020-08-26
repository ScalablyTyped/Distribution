package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOptions extends js.Object {
  /** string to hash test to a specific test agent. tester will be picked by index among available testers */
  var affinity: js.UndefOr[String] = js.native
  /** type of authentication: 0 = Basic, 1 = SNS [0] */
  var authenticationType: js.UndefOr[Double] = js.native
  /** download bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthDown: js.UndefOr[String] = js.native
  /** upload bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthUp: js.UndefOr[String] = js.native
  /** space-delimited list of urls to block (substring match) */
  var block: js.UndefOr[String] = js.native
  /** block ads defined by http://adblockplus.org */
  var blockAds: js.UndefOr[Boolean] = js.native
  /** capture chrome trace (about://tracing) (Chrome only) */
  var chromeTrace: js.UndefOr[Boolean] = js.native
  /** clear SSL certificate caches */
  var clearCerts: js.UndefOr[Boolean] = js.native
  /** use a list of custom command line switches (Chrome only) */
  var commandLine: js.UndefOr[String] = js.native
  /** connectivity profile -- requires location to be specified -- (Cable|DSL|FIOS|Dial|3G|3GFast|Native|custom) [Cable] */
  var connectivity: js.UndefOr[String] = js.native
  /** capture video continuously (unstable/experimental, may cause tests to fail) */
  var continuousVideoCapture: js.UndefOr[Boolean] = js.native
  /** execute arbitrary JavaScript at the end of a test to collect custom metrics */
  var customMetrics: js.UndefOr[String] = js.native
  /** enable data reduction on Chrome 34+ Android (Chrome only) */
  var dataReduction: js.UndefOr[Boolean] = js.native
  /** forces all pages to load in standards mode (IE only) */
  var disableCompatibilityView: js.UndefOr[Boolean] = js.native
  /** disable saving of the http headers (as well as browser status messages and CPU utilization) */
  var disableHTTPHeaders: js.UndefOr[Boolean] = js.native
  /** disable JavaScript (IE, Chrome, Firefox) */
  var disableJavaScript: js.UndefOr[Boolean] = js.native
  /** disable optimization checks (for faster testing) */
  var disableOptimization: js.UndefOr[Boolean] = js.native
  /** disable screen shot capturing */
  var disableScreenshot: js.UndefOr[Boolean] = js.native
  /** DOM element to record for sub-measurement */
  var domElement: js.UndefOr[String] = js.native
  /** (experimental) emulate mobile browser: Chrome mobile user agent, 640x960 screen, 2x scaling and fixed viewport (Chrome only) */
  var emulateMobile: js.UndefOr[Boolean] = js.native
  /** skip the Repeat View test */
  var firstViewOnly: js.UndefOr[Boolean] = js.native
  /** force software rendering, disable GPU acceleration (Chrome only) */
  var forceSoftwareRendering: js.UndefOr[Boolean] = js.native
  /** force SPDY version 3 (Chrome only) */
  var forceSpdy3: js.UndefOr[Boolean] = js.native
  /** save a full-resolution version of the fully loaded screen shot as a PNG */
  var fullResolutionScreenshot: js.UndefOr[Boolean] = js.native
  /** save the content of only the base HTML response */
  var htmlBody: js.UndefOr[Boolean] = js.native
  /** ignore SSL certificate errors, e.g. name mismatch, self-signed certificates, etc */
  var ignoreSSL: js.UndefOr[Boolean] = js.native
  /** jpeg compression level (30-100) for the screen shots and video capture */
  var jpegQuality: js.UndefOr[Double] = js.native
  /** do not add PTST to the original browser User Agent string */
  var keepOriginalUserAgent: js.UndefOr[Boolean] = js.native
  /** label for the test */
  var label: js.UndefOr[String] = js.native
  /** first-hop Round Trip Time in ms (used when specifying a custom connectivity profile) */
  var latency: js.UndefOr[String] = js.native
  /** perform lighthouse test (Chrome only, Linux agent only) */
  var lighthouse: js.UndefOr[Boolean] = js.native
  /** location to test from */
  var location: js.UndefOr[String] = js.native
  /** username for authenticating tests (http authentication) */
  var login: js.UndefOr[String] = js.native
  /** store the video from the median run when capturing video is enabled */
  var medianVideo: js.UndefOr[Boolean] = js.native
  /** minimum test duration in seconds */
  var minimumDuration: js.UndefOr[Double] = js.native
  /** capture Network Log (Chrome only) */
  var netLog: js.UndefOr[Boolean] = js.native
  /** e-mail address to notify with the test results */
  var notifyEmail: js.UndefOr[String] = js.native
  /** packet loss rate - percent of packets to drop (used when specifying a custom connectivity profile) */
  var packetLossRate: js.UndefOr[Double] = js.native
  /** password for authenticating tests (http authentication) */
  var password: js.UndefOr[String] = js.native
  /** URL to ping when the test is complete (the test ID will be passed as an "id" parameter) */
  var pingback: js.UndefOr[String] = js.native
  /** poll for results after test is scheduled at every seconds [5] */
  var pollResults: js.UndefOr[Double] = js.native
  /** change test priority (0-9) [enforced by API key, otherwise 5] */
  var priority: js.UndefOr[Double] = js.native
  /** keep the test hidden from the test log */
  var `private`: js.UndefOr[Boolean] = js.native
  /** number of test runs [1] */
  var runs: js.UndefOr[Double] = js.native
  /** save response bodies for text resources */
  var saveResponseBodies: js.UndefOr[Boolean] = js.native
  /** discard script and http headers in the result */
  var sensitive: js.UndefOr[Boolean] = js.native
  /** space-delimited list of domains to simulate failure by re-routing to blackhole.webpagetest.org to silently drop all requests */
  var spof: js.UndefOr[String] = js.native
  /** stop test at document complete. typically, tests run until all activity stops */
  var stopAtDocumentComplete: js.UndefOr[Boolean] = js.native
  /** capture network packet trace (tcpdump) */
  var tcpDump: js.UndefOr[Boolean] = js.native
  /** run the test on a specific PC (name must match exactly or the test will not run) */
  var tester: js.UndefOr[String] = js.native
  /** capture Developer Tools Timeline (Chrome only) */
  var timeline: js.UndefOr[Boolean] = js.native
  /** set between 1-5 to include the JS call stack. must be used in conjunction with timeline (increases overhead) (Chrome only) */
  var timelineCallStack: js.UndefOr[Boolean] = js.native
  /** timeout for polling and waiting results [no timeout] */
  var timeout: js.UndefOr[Double] = js.native
  /** test name to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsView: js.UndefOr[String] = js.native
  /** configs to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsViewConfigs: js.UndefOr[String] = js.native
  /** custom user agent string (Chrome only) */
  var userAgent: js.UndefOr[String] = js.native
  /** capture video */
  var video: js.UndefOr[Boolean] = js.native
  /** wait for test results informed by agent once complete listening on : [hostname:first port available above 8000] */
  var waitResults: js.UndefOr[String] = js.native
}

object TestOptions {
  @scala.inline
  def apply(): TestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOptions]
  }
  @scala.inline
  implicit class TestOptionsOps[Self <: TestOptions] (val x: Self) extends AnyVal {
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
    def setAffinity(value: String): Self = this.set("affinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffinity: Self = this.set("affinity", js.undefined)
    @scala.inline
    def setAuthenticationType(value: Double): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    @scala.inline
    def setBandwidthDown(value: String): Self = this.set("bandwidthDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthDown: Self = this.set("bandwidthDown", js.undefined)
    @scala.inline
    def setBandwidthUp(value: String): Self = this.set("bandwidthUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthUp: Self = this.set("bandwidthUp", js.undefined)
    @scala.inline
    def setBlock(value: String): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setBlockAds(value: Boolean): Self = this.set("blockAds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockAds: Self = this.set("blockAds", js.undefined)
    @scala.inline
    def setChromeTrace(value: Boolean): Self = this.set("chromeTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeTrace: Self = this.set("chromeTrace", js.undefined)
    @scala.inline
    def setClearCerts(value: Boolean): Self = this.set("clearCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearCerts: Self = this.set("clearCerts", js.undefined)
    @scala.inline
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    @scala.inline
    def setConnectivity(value: String): Self = this.set("connectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectivity: Self = this.set("connectivity", js.undefined)
    @scala.inline
    def setContinuousVideoCapture(value: Boolean): Self = this.set("continuousVideoCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousVideoCapture: Self = this.set("continuousVideoCapture", js.undefined)
    @scala.inline
    def setCustomMetrics(value: String): Self = this.set("customMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetrics: Self = this.set("customMetrics", js.undefined)
    @scala.inline
    def setDataReduction(value: Boolean): Self = this.set("dataReduction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataReduction: Self = this.set("dataReduction", js.undefined)
    @scala.inline
    def setDisableCompatibilityView(value: Boolean): Self = this.set("disableCompatibilityView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCompatibilityView: Self = this.set("disableCompatibilityView", js.undefined)
    @scala.inline
    def setDisableHTTPHeaders(value: Boolean): Self = this.set("disableHTTPHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHTTPHeaders: Self = this.set("disableHTTPHeaders", js.undefined)
    @scala.inline
    def setDisableJavaScript(value: Boolean): Self = this.set("disableJavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableJavaScript: Self = this.set("disableJavaScript", js.undefined)
    @scala.inline
    def setDisableOptimization(value: Boolean): Self = this.set("disableOptimization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableOptimization: Self = this.set("disableOptimization", js.undefined)
    @scala.inline
    def setDisableScreenshot(value: Boolean): Self = this.set("disableScreenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScreenshot: Self = this.set("disableScreenshot", js.undefined)
    @scala.inline
    def setDomElement(value: String): Self = this.set("domElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomElement: Self = this.set("domElement", js.undefined)
    @scala.inline
    def setEmulateMobile(value: Boolean): Self = this.set("emulateMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmulateMobile: Self = this.set("emulateMobile", js.undefined)
    @scala.inline
    def setFirstViewOnly(value: Boolean): Self = this.set("firstViewOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstViewOnly: Self = this.set("firstViewOnly", js.undefined)
    @scala.inline
    def setForceSoftwareRendering(value: Boolean): Self = this.set("forceSoftwareRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSoftwareRendering: Self = this.set("forceSoftwareRendering", js.undefined)
    @scala.inline
    def setForceSpdy3(value: Boolean): Self = this.set("forceSpdy3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSpdy3: Self = this.set("forceSpdy3", js.undefined)
    @scala.inline
    def setFullResolutionScreenshot(value: Boolean): Self = this.set("fullResolutionScreenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullResolutionScreenshot: Self = this.set("fullResolutionScreenshot", js.undefined)
    @scala.inline
    def setHtmlBody(value: Boolean): Self = this.set("htmlBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlBody: Self = this.set("htmlBody", js.undefined)
    @scala.inline
    def setIgnoreSSL(value: Boolean): Self = this.set("ignoreSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSSL: Self = this.set("ignoreSSL", js.undefined)
    @scala.inline
    def setJpegQuality(value: Double): Self = this.set("jpegQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJpegQuality: Self = this.set("jpegQuality", js.undefined)
    @scala.inline
    def setKeepOriginalUserAgent(value: Boolean): Self = this.set("keepOriginalUserAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepOriginalUserAgent: Self = this.set("keepOriginalUserAgent", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLatency(value: String): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    @scala.inline
    def setLighthouse(value: Boolean): Self = this.set("lighthouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighthouse: Self = this.set("lighthouse", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    @scala.inline
    def setMedianVideo(value: Boolean): Self = this.set("medianVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianVideo: Self = this.set("medianVideo", js.undefined)
    @scala.inline
    def setMinimumDuration(value: Double): Self = this.set("minimumDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumDuration: Self = this.set("minimumDuration", js.undefined)
    @scala.inline
    def setNetLog(value: Boolean): Self = this.set("netLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetLog: Self = this.set("netLog", js.undefined)
    @scala.inline
    def setNotifyEmail(value: String): Self = this.set("notifyEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyEmail: Self = this.set("notifyEmail", js.undefined)
    @scala.inline
    def setPacketLossRate(value: Double): Self = this.set("packetLossRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketLossRate: Self = this.set("packetLossRate", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPingback(value: String): Self = this.set("pingback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePingback: Self = this.set("pingback", js.undefined)
    @scala.inline
    def setPollResults(value: Double): Self = this.set("pollResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollResults: Self = this.set("pollResults", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setRuns(value: Double): Self = this.set("runs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
    @scala.inline
    def setSaveResponseBodies(value: Boolean): Self = this.set("saveResponseBodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveResponseBodies: Self = this.set("saveResponseBodies", js.undefined)
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setSpof(value: String): Self = this.set("spof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpof: Self = this.set("spof", js.undefined)
    @scala.inline
    def setStopAtDocumentComplete(value: Boolean): Self = this.set("stopAtDocumentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAtDocumentComplete: Self = this.set("stopAtDocumentComplete", js.undefined)
    @scala.inline
    def setTcpDump(value: Boolean): Self = this.set("tcpDump", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpDump: Self = this.set("tcpDump", js.undefined)
    @scala.inline
    def setTester(value: String): Self = this.set("tester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTester: Self = this.set("tester", js.undefined)
    @scala.inline
    def setTimeline(value: Boolean): Self = this.set("timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    @scala.inline
    def setTimelineCallStack(value: Boolean): Self = this.set("timelineCallStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimelineCallStack: Self = this.set("timelineCallStack", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTsView(value: String): Self = this.set("tsView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsView: Self = this.set("tsView", js.undefined)
    @scala.inline
    def setTsViewConfigs(value: String): Self = this.set("tsViewConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsViewConfigs: Self = this.set("tsViewConfigs", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setWaitResults(value: String): Self = this.set("waitResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitResults: Self = this.set("waitResults", js.undefined)
  }
  
}

