package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOptions extends StObject {
  
  /** string to hash test to a specific test agent. tester will be picked by index among available testers */
  var affinity: js.UndefOr[String] = js.undefined
  
  /** type of authentication: 0 = Basic, 1 = SNS [0] */
  var authenticationType: js.UndefOr[Double] = js.undefined
  
  /** download bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthDown: js.UndefOr[String] = js.undefined
  
  /** upload bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthUp: js.UndefOr[String] = js.undefined
  
  /** space-delimited list of urls to block (substring match) */
  var block: js.UndefOr[String] = js.undefined
  
  /** block ads defined by http://adblockplus.org */
  var blockAds: js.UndefOr[Boolean] = js.undefined
  
  /** capture chrome trace (about://tracing) (Chrome only) */
  var chromeTrace: js.UndefOr[Boolean] = js.undefined
  
  /** clear SSL certificate caches */
  var clearCerts: js.UndefOr[Boolean] = js.undefined
  
  /** use a list of custom command line switches (Chrome only) */
  var commandLine: js.UndefOr[String] = js.undefined
  
  /** connectivity profile -- requires location to be specified -- (Cable|DSL|FIOS|Dial|3G|3GFast|Native|custom) [Cable] */
  var connectivity: js.UndefOr[String] = js.undefined
  
  /** capture video continuously (unstable/experimental, may cause tests to fail) */
  var continuousVideoCapture: js.UndefOr[Boolean] = js.undefined
  
  /** execute arbitrary JavaScript at the end of a test to collect custom metrics */
  var customMetrics: js.UndefOr[String] = js.undefined
  
  /** enable data reduction on Chrome 34+ Android (Chrome only) */
  var dataReduction: js.UndefOr[Boolean] = js.undefined
  
  /** forces all pages to load in standards mode (IE only) */
  var disableCompatibilityView: js.UndefOr[Boolean] = js.undefined
  
  /** disable saving of the http headers (as well as browser status messages and CPU utilization) */
  var disableHTTPHeaders: js.UndefOr[Boolean] = js.undefined
  
  /** disable JavaScript (IE, Chrome, Firefox) */
  var disableJavaScript: js.UndefOr[Boolean] = js.undefined
  
  /** disable optimization checks (for faster testing) */
  var disableOptimization: js.UndefOr[Boolean] = js.undefined
  
  /** disable screen shot capturing */
  var disableScreenshot: js.UndefOr[Boolean] = js.undefined
  
  /** DOM element to record for sub-measurement */
  var domElement: js.UndefOr[String] = js.undefined
  
  /** (experimental) emulate mobile browser: Chrome mobile user agent, 640x960 screen, 2x scaling and fixed viewport (Chrome only) */
  var emulateMobile: js.UndefOr[Boolean] = js.undefined
  
  /** skip the Repeat View test */
  var firstViewOnly: js.UndefOr[Boolean] = js.undefined
  
  /** force software rendering, disable GPU acceleration (Chrome only) */
  var forceSoftwareRendering: js.UndefOr[Boolean] = js.undefined
  
  /** force SPDY version 3 (Chrome only) */
  var forceSpdy3: js.UndefOr[Boolean] = js.undefined
  
  /** save a full-resolution version of the fully loaded screen shot as a PNG */
  var fullResolutionScreenshot: js.UndefOr[Boolean] = js.undefined
  
  /** save the content of only the base HTML response */
  var htmlBody: js.UndefOr[Boolean] = js.undefined
  
  /** ignore SSL certificate errors, e.g. name mismatch, self-signed certificates, etc */
  var ignoreSSL: js.UndefOr[Boolean] = js.undefined
  
  /** jpeg compression level (30-100) for the screen shots and video capture */
  var jpegQuality: js.UndefOr[Double] = js.undefined
  
  /** do not add PTST to the original browser User Agent string */
  var keepOriginalUserAgent: js.UndefOr[Boolean] = js.undefined
  
  /** label for the test */
  var label: js.UndefOr[String] = js.undefined
  
  /** first-hop Round Trip Time in ms (used when specifying a custom connectivity profile) */
  var latency: js.UndefOr[String] = js.undefined
  
  /** perform lighthouse test (Chrome only, Linux agent only) */
  var lighthouse: js.UndefOr[Boolean] = js.undefined
  
  /** location to test from */
  var location: js.UndefOr[String] = js.undefined
  
  /** username for authenticating tests (http authentication) */
  var login: js.UndefOr[String] = js.undefined
  
  /** store the video from the median run when capturing video is enabled */
  var medianVideo: js.UndefOr[Boolean] = js.undefined
  
  /** minimum test duration in seconds */
  var minimumDuration: js.UndefOr[Double] = js.undefined
  
  /** capture Network Log (Chrome only) */
  var netLog: js.UndefOr[Boolean] = js.undefined
  
  /** e-mail address to notify with the test results */
  var notifyEmail: js.UndefOr[String] = js.undefined
  
  /** packet loss rate - percent of packets to drop (used when specifying a custom connectivity profile) */
  var packetLossRate: js.UndefOr[Double] = js.undefined
  
  /** password for authenticating tests (http authentication) */
  var password: js.UndefOr[String] = js.undefined
  
  /** URL to ping when the test is complete (the test ID will be passed as an "id" parameter) */
  var pingback: js.UndefOr[String] = js.undefined
  
  /** poll for results after test is scheduled at every seconds [5] */
  var pollResults: js.UndefOr[Double] = js.undefined
  
  /** change test priority (0-9) [enforced by API key, otherwise 5] */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** keep the test hidden from the test log */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /** number of test runs [1] */
  var runs: js.UndefOr[Double] = js.undefined
  
  /** save response bodies for text resources */
  var saveResponseBodies: js.UndefOr[Boolean] = js.undefined
  
  /** discard script and http headers in the result */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  
  /** space-delimited list of domains to simulate failure by re-routing to blackhole.webpagetest.org to silently drop all requests */
  var spof: js.UndefOr[String] = js.undefined
  
  /** stop test at document complete. typically, tests run until all activity stops */
  var stopAtDocumentComplete: js.UndefOr[Boolean] = js.undefined
  
  /** capture network packet trace (tcpdump) */
  var tcpDump: js.UndefOr[Boolean] = js.undefined
  
  /** run the test on a specific PC (name must match exactly or the test will not run) */
  var tester: js.UndefOr[String] = js.undefined
  
  /** capture Developer Tools Timeline (Chrome only) */
  var timeline: js.UndefOr[Boolean] = js.undefined
  
  /** set between 1-5 to include the JS call stack. must be used in conjunction with timeline (increases overhead) (Chrome only) */
  var timelineCallStack: js.UndefOr[Boolean] = js.undefined
  
  /** timeout for polling and waiting results [no timeout] */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** test name to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsView: js.UndefOr[String] = js.undefined
  
  /** configs to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsViewConfigs: js.UndefOr[String] = js.undefined
  
  /** custom user agent string (Chrome only) */
  var userAgent: js.UndefOr[String] = js.undefined
  
  /** capture video */
  var video: js.UndefOr[Boolean] = js.undefined
  
  /** wait for test results informed by agent once complete listening on : [hostname:first port available above 8000] */
  var waitResults: js.UndefOr[String] = js.undefined
}
object TestOptions {
  
  @scala.inline
  def apply(): TestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOptions]
  }
  
  @scala.inline
  implicit class TestOptionsMutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: String): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    
    @scala.inline
    def setAuthenticationType(value: Double): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setBandwidthDown(value: String): Self = StObject.set(x, "bandwidthDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthDownUndefined: Self = StObject.set(x, "bandwidthDown", js.undefined)
    
    @scala.inline
    def setBandwidthUp(value: String): Self = StObject.set(x, "bandwidthUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUpUndefined: Self = StObject.set(x, "bandwidthUp", js.undefined)
    
    @scala.inline
    def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockAds(value: Boolean): Self = StObject.set(x, "blockAds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockAdsUndefined: Self = StObject.set(x, "blockAds", js.undefined)
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setChromeTrace(value: Boolean): Self = StObject.set(x, "chromeTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeTraceUndefined: Self = StObject.set(x, "chromeTrace", js.undefined)
    
    @scala.inline
    def setClearCerts(value: Boolean): Self = StObject.set(x, "clearCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearCertsUndefined: Self = StObject.set(x, "clearCerts", js.undefined)
    
    @scala.inline
    def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
    
    @scala.inline
    def setConnectivity(value: String): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    @scala.inline
    def setContinuousVideoCapture(value: Boolean): Self = StObject.set(x, "continuousVideoCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousVideoCaptureUndefined: Self = StObject.set(x, "continuousVideoCapture", js.undefined)
    
    @scala.inline
    def setCustomMetrics(value: String): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetricsUndefined: Self = StObject.set(x, "customMetrics", js.undefined)
    
    @scala.inline
    def setDataReduction(value: Boolean): Self = StObject.set(x, "dataReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataReductionUndefined: Self = StObject.set(x, "dataReduction", js.undefined)
    
    @scala.inline
    def setDisableCompatibilityView(value: Boolean): Self = StObject.set(x, "disableCompatibilityView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCompatibilityViewUndefined: Self = StObject.set(x, "disableCompatibilityView", js.undefined)
    
    @scala.inline
    def setDisableHTTPHeaders(value: Boolean): Self = StObject.set(x, "disableHTTPHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHTTPHeadersUndefined: Self = StObject.set(x, "disableHTTPHeaders", js.undefined)
    
    @scala.inline
    def setDisableJavaScript(value: Boolean): Self = StObject.set(x, "disableJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableJavaScriptUndefined: Self = StObject.set(x, "disableJavaScript", js.undefined)
    
    @scala.inline
    def setDisableOptimization(value: Boolean): Self = StObject.set(x, "disableOptimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOptimizationUndefined: Self = StObject.set(x, "disableOptimization", js.undefined)
    
    @scala.inline
    def setDisableScreenshot(value: Boolean): Self = StObject.set(x, "disableScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScreenshotUndefined: Self = StObject.set(x, "disableScreenshot", js.undefined)
    
    @scala.inline
    def setDomElement(value: String): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomElementUndefined: Self = StObject.set(x, "domElement", js.undefined)
    
    @scala.inline
    def setEmulateMobile(value: Boolean): Self = StObject.set(x, "emulateMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulateMobileUndefined: Self = StObject.set(x, "emulateMobile", js.undefined)
    
    @scala.inline
    def setFirstViewOnly(value: Boolean): Self = StObject.set(x, "firstViewOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstViewOnlyUndefined: Self = StObject.set(x, "firstViewOnly", js.undefined)
    
    @scala.inline
    def setForceSoftwareRendering(value: Boolean): Self = StObject.set(x, "forceSoftwareRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSoftwareRenderingUndefined: Self = StObject.set(x, "forceSoftwareRendering", js.undefined)
    
    @scala.inline
    def setForceSpdy3(value: Boolean): Self = StObject.set(x, "forceSpdy3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSpdy3Undefined: Self = StObject.set(x, "forceSpdy3", js.undefined)
    
    @scala.inline
    def setFullResolutionScreenshot(value: Boolean): Self = StObject.set(x, "fullResolutionScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResolutionScreenshotUndefined: Self = StObject.set(x, "fullResolutionScreenshot", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: Boolean): Self = StObject.set(x, "htmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBodyUndefined: Self = StObject.set(x, "htmlBody", js.undefined)
    
    @scala.inline
    def setIgnoreSSL(value: Boolean): Self = StObject.set(x, "ignoreSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSSLUndefined: Self = StObject.set(x, "ignoreSSL", js.undefined)
    
    @scala.inline
    def setJpegQuality(value: Double): Self = StObject.set(x, "jpegQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJpegQualityUndefined: Self = StObject.set(x, "jpegQuality", js.undefined)
    
    @scala.inline
    def setKeepOriginalUserAgent(value: Boolean): Self = StObject.set(x, "keepOriginalUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOriginalUserAgentUndefined: Self = StObject.set(x, "keepOriginalUserAgent", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setLighthouse(value: Boolean): Self = StObject.set(x, "lighthouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighthouseUndefined: Self = StObject.set(x, "lighthouse", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    @scala.inline
    def setMedianVideo(value: Boolean): Self = StObject.set(x, "medianVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianVideoUndefined: Self = StObject.set(x, "medianVideo", js.undefined)
    
    @scala.inline
    def setMinimumDuration(value: Double): Self = StObject.set(x, "minimumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDurationUndefined: Self = StObject.set(x, "minimumDuration", js.undefined)
    
    @scala.inline
    def setNetLog(value: Boolean): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetLogUndefined: Self = StObject.set(x, "netLog", js.undefined)
    
    @scala.inline
    def setNotifyEmail(value: String): Self = StObject.set(x, "notifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyEmailUndefined: Self = StObject.set(x, "notifyEmail", js.undefined)
    
    @scala.inline
    def setPacketLossRate(value: Double): Self = StObject.set(x, "packetLossRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLossRateUndefined: Self = StObject.set(x, "packetLossRate", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPingback(value: String): Self = StObject.set(x, "pingback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingbackUndefined: Self = StObject.set(x, "pingback", js.undefined)
    
    @scala.inline
    def setPollResults(value: Double): Self = StObject.set(x, "pollResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollResultsUndefined: Self = StObject.set(x, "pollResults", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    @scala.inline
    def setSaveResponseBodies(value: Boolean): Self = StObject.set(x, "saveResponseBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveResponseBodiesUndefined: Self = StObject.set(x, "saveResponseBodies", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    @scala.inline
    def setSpof(value: String): Self = StObject.set(x, "spof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpofUndefined: Self = StObject.set(x, "spof", js.undefined)
    
    @scala.inline
    def setStopAtDocumentComplete(value: Boolean): Self = StObject.set(x, "stopAtDocumentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopAtDocumentCompleteUndefined: Self = StObject.set(x, "stopAtDocumentComplete", js.undefined)
    
    @scala.inline
    def setTcpDump(value: Boolean): Self = StObject.set(x, "tcpDump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpDumpUndefined: Self = StObject.set(x, "tcpDump", js.undefined)
    
    @scala.inline
    def setTester(value: String): Self = StObject.set(x, "tester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTesterUndefined: Self = StObject.set(x, "tester", js.undefined)
    
    @scala.inline
    def setTimeline(value: Boolean): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineCallStack(value: Boolean): Self = StObject.set(x, "timelineCallStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineCallStackUndefined: Self = StObject.set(x, "timelineCallStack", js.undefined)
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTsView(value: String): Self = StObject.set(x, "tsView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsViewConfigs(value: String): Self = StObject.set(x, "tsViewConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsViewConfigsUndefined: Self = StObject.set(x, "tsViewConfigs", js.undefined)
    
    @scala.inline
    def setTsViewUndefined: Self = StObject.set(x, "tsView", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setWaitResults(value: String): Self = StObject.set(x, "waitResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitResultsUndefined: Self = StObject.set(x, "waitResults", js.undefined)
  }
}
