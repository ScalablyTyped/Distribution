package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
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
  def apply(
    affinity: String = null,
    authenticationType: Int | Double = null,
    bandwidthDown: String = null,
    bandwidthUp: String = null,
    block: String = null,
    blockAds: js.UndefOr[Boolean] = js.undefined,
    chromeTrace: js.UndefOr[Boolean] = js.undefined,
    clearCerts: js.UndefOr[Boolean] = js.undefined,
    commandLine: String = null,
    connectivity: String = null,
    continuousVideoCapture: js.UndefOr[Boolean] = js.undefined,
    customMetrics: String = null,
    dataReduction: js.UndefOr[Boolean] = js.undefined,
    disableCompatibilityView: js.UndefOr[Boolean] = js.undefined,
    disableHTTPHeaders: js.UndefOr[Boolean] = js.undefined,
    disableJavaScript: js.UndefOr[Boolean] = js.undefined,
    disableOptimization: js.UndefOr[Boolean] = js.undefined,
    disableScreenshot: js.UndefOr[Boolean] = js.undefined,
    domElement: String = null,
    emulateMobile: js.UndefOr[Boolean] = js.undefined,
    firstViewOnly: js.UndefOr[Boolean] = js.undefined,
    forceSoftwareRendering: js.UndefOr[Boolean] = js.undefined,
    forceSpdy3: js.UndefOr[Boolean] = js.undefined,
    fullResolutionScreenshot: js.UndefOr[Boolean] = js.undefined,
    htmlBody: js.UndefOr[Boolean] = js.undefined,
    ignoreSSL: js.UndefOr[Boolean] = js.undefined,
    jpegQuality: Int | Double = null,
    keepOriginalUserAgent: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    latency: String = null,
    lighthouse: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    login: String = null,
    medianVideo: js.UndefOr[Boolean] = js.undefined,
    minimumDuration: Int | Double = null,
    netLog: js.UndefOr[Boolean] = js.undefined,
    notifyEmail: String = null,
    packetLossRate: Int | Double = null,
    password: String = null,
    pingback: String = null,
    pollResults: Int | Double = null,
    priority: Int | Double = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    runs: Int | Double = null,
    saveResponseBodies: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    spof: String = null,
    stopAtDocumentComplete: js.UndefOr[Boolean] = js.undefined,
    tcpDump: js.UndefOr[Boolean] = js.undefined,
    tester: String = null,
    timeline: js.UndefOr[Boolean] = js.undefined,
    timelineCallStack: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tsView: String = null,
    tsViewConfigs: String = null,
    userAgent: String = null,
    video: js.UndefOr[Boolean] = js.undefined,
    waitResults: String = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (affinity != null) __obj.updateDynamic("affinity")(affinity.asInstanceOf[js.Any])
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (bandwidthDown != null) __obj.updateDynamic("bandwidthDown")(bandwidthDown.asInstanceOf[js.Any])
    if (bandwidthUp != null) __obj.updateDynamic("bandwidthUp")(bandwidthUp.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(blockAds)) __obj.updateDynamic("blockAds")(blockAds.asInstanceOf[js.Any])
    if (!js.isUndefined(chromeTrace)) __obj.updateDynamic("chromeTrace")(chromeTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCerts)) __obj.updateDynamic("clearCerts")(clearCerts.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (connectivity != null) __obj.updateDynamic("connectivity")(connectivity.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousVideoCapture)) __obj.updateDynamic("continuousVideoCapture")(continuousVideoCapture.asInstanceOf[js.Any])
    if (customMetrics != null) __obj.updateDynamic("customMetrics")(customMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(dataReduction)) __obj.updateDynamic("dataReduction")(dataReduction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCompatibilityView)) __obj.updateDynamic("disableCompatibilityView")(disableCompatibilityView.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHTTPHeaders)) __obj.updateDynamic("disableHTTPHeaders")(disableHTTPHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(disableJavaScript)) __obj.updateDynamic("disableJavaScript")(disableJavaScript.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScreenshot)) __obj.updateDynamic("disableScreenshot")(disableScreenshot.asInstanceOf[js.Any])
    if (domElement != null) __obj.updateDynamic("domElement")(domElement.asInstanceOf[js.Any])
    if (!js.isUndefined(emulateMobile)) __obj.updateDynamic("emulateMobile")(emulateMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(firstViewOnly)) __obj.updateDynamic("firstViewOnly")(firstViewOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSoftwareRendering)) __obj.updateDynamic("forceSoftwareRendering")(forceSoftwareRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSpdy3)) __obj.updateDynamic("forceSpdy3")(forceSpdy3.asInstanceOf[js.Any])
    if (!js.isUndefined(fullResolutionScreenshot)) __obj.updateDynamic("fullResolutionScreenshot")(fullResolutionScreenshot.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlBody)) __obj.updateDynamic("htmlBody")(htmlBody.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL.asInstanceOf[js.Any])
    if (jpegQuality != null) __obj.updateDynamic("jpegQuality")(jpegQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOriginalUserAgent)) __obj.updateDynamic("keepOriginalUserAgent")(keepOriginalUserAgent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (!js.isUndefined(lighthouse)) __obj.updateDynamic("lighthouse")(lighthouse.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    if (!js.isUndefined(medianVideo)) __obj.updateDynamic("medianVideo")(medianVideo.asInstanceOf[js.Any])
    if (minimumDuration != null) __obj.updateDynamic("minimumDuration")(minimumDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(netLog)) __obj.updateDynamic("netLog")(netLog.asInstanceOf[js.Any])
    if (notifyEmail != null) __obj.updateDynamic("notifyEmail")(notifyEmail.asInstanceOf[js.Any])
    if (packetLossRate != null) __obj.updateDynamic("packetLossRate")(packetLossRate.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pingback != null) __obj.updateDynamic("pingback")(pingback.asInstanceOf[js.Any])
    if (pollResults != null) __obj.updateDynamic("pollResults")(pollResults.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    if (!js.isUndefined(saveResponseBodies)) __obj.updateDynamic("saveResponseBodies")(saveResponseBodies.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (spof != null) __obj.updateDynamic("spof")(spof.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtDocumentComplete)) __obj.updateDynamic("stopAtDocumentComplete")(stopAtDocumentComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpDump)) __obj.updateDynamic("tcpDump")(tcpDump.asInstanceOf[js.Any])
    if (tester != null) __obj.updateDynamic("tester")(tester.asInstanceOf[js.Any])
    if (!js.isUndefined(timeline)) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    if (!js.isUndefined(timelineCallStack)) __obj.updateDynamic("timelineCallStack")(timelineCallStack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tsView != null) __obj.updateDynamic("tsView")(tsView.asInstanceOf[js.Any])
    if (tsViewConfigs != null) __obj.updateDynamic("tsViewConfigs")(tsViewConfigs.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (waitResults != null) __obj.updateDynamic("waitResults")(waitResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

