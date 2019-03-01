package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  /** string to hash test to a specific test agent. tester will be picked by index among available testers */
  var affinity: js.UndefOr[java.lang.String] = js.undefined
  /** type of authentication: 0 = Basic, 1 = SNS [0] */
  var authenticationType: js.UndefOr[scala.Double] = js.undefined
  /** download bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthDown: js.UndefOr[java.lang.String] = js.undefined
  /** upload bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthUp: js.UndefOr[java.lang.String] = js.undefined
  /** space-delimited list of urls to block (substring match) */
  var block: js.UndefOr[java.lang.String] = js.undefined
  /** block ads defined by http://adblockplus.org */
  var blockAds: js.UndefOr[scala.Boolean] = js.undefined
  /** capture chrome trace (about://tracing) (Chrome only) */
  var chromeTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** clear SSL certificate caches */
  var clearCerts: js.UndefOr[scala.Boolean] = js.undefined
  /** use a list of custom command line switches (Chrome only) */
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /** connectivity profile -- requires location to be specified -- (Cable|DSL|FIOS|Dial|3G|3GFast|Native|custom) [Cable] */
  var connectivity: js.UndefOr[java.lang.String] = js.undefined
  /** capture video continuously (unstable/experimental, may cause tests to fail) */
  var continuousVideoCapture: js.UndefOr[scala.Boolean] = js.undefined
  /** execute arbitrary JavaScript at the end of a test to collect custom metrics */
  var customMetrics: js.UndefOr[java.lang.String] = js.undefined
  /** enable data reduction on Chrome 34+ Android (Chrome only) */
  var dataReduction: js.UndefOr[scala.Boolean] = js.undefined
  /** forces all pages to load in standards mode (IE only) */
  var disableCompatibilityView: js.UndefOr[scala.Boolean] = js.undefined
  /** disable saving of the http headers (as well as browser status messages and CPU utilization) */
  var disableHTTPHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /** disable JavaScript (IE, Chrome, Firefox) */
  var disableJavaScript: js.UndefOr[scala.Boolean] = js.undefined
  /** disable optimization checks (for faster testing) */
  var disableOptimization: js.UndefOr[scala.Boolean] = js.undefined
  /** disable screen shot capturing */
  var disableScreenshot: js.UndefOr[scala.Boolean] = js.undefined
  /** DOM element to record for sub-measurement */
  var domElement: js.UndefOr[java.lang.String] = js.undefined
  /** (experimental) emulate mobile browser: Chrome mobile user agent, 640x960 screen, 2x scaling and fixed viewport (Chrome only) */
  var emulateMobile: js.UndefOr[scala.Boolean] = js.undefined
  /** skip the Repeat View test */
  var firstViewOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** force software rendering, disable GPU acceleration (Chrome only) */
  var forceSoftwareRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** force SPDY version 3 (Chrome only) */
  var forceSpdy3: js.UndefOr[scala.Boolean] = js.undefined
  /** save a full-resolution version of the fully loaded screen shot as a PNG */
  var fullResolutionScreenshot: js.UndefOr[scala.Boolean] = js.undefined
  /** save the content of only the base HTML response */
  var htmlBody: js.UndefOr[scala.Boolean] = js.undefined
  /** ignore SSL certificate errors, e.g. name mismatch, self-signed certificates, etc */
  var ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined
  /** jpeg compression level (30-100) for the screen shots and video capture */
  var jpegQuality: js.UndefOr[scala.Double] = js.undefined
  /** do not add PTST to the original browser User Agent string */
  var keepOriginalUserAgent: js.UndefOr[scala.Boolean] = js.undefined
  /** label for the test */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** first-hop Round Trip Time in ms (used when specifying a custom connectivity profile) */
  var latency: js.UndefOr[java.lang.String] = js.undefined
  /** perform lighthouse test (Chrome only, Linux agent only) */
  var lighthouse: js.UndefOr[scala.Boolean] = js.undefined
  /** location to test from */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** username for authenticating tests (http authentication) */
  var login: js.UndefOr[java.lang.String] = js.undefined
  /** store the video from the median run when capturing video is enabled */
  var medianVideo: js.UndefOr[scala.Boolean] = js.undefined
  /** minimum test duration in seconds */
  var minimumDuration: js.UndefOr[scala.Double] = js.undefined
  /** capture Network Log (Chrome only) */
  var netLog: js.UndefOr[scala.Boolean] = js.undefined
  /** e-mail address to notify with the test results */
  var notifyEmail: js.UndefOr[java.lang.String] = js.undefined
  /** packet loss rate - percent of packets to drop (used when specifying a custom connectivity profile) */
  var packetLossRate: js.UndefOr[scala.Double] = js.undefined
  /** password for authenticating tests (http authentication) */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** URL to ping when the test is complete (the test ID will be passed as an "id" parameter) */
  var pingback: js.UndefOr[java.lang.String] = js.undefined
  /** poll for results after test is scheduled at every seconds [5] */
  var pollResults: js.UndefOr[scala.Double] = js.undefined
  /** change test priority (0-9) [enforced by API key, otherwise 5] */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** keep the test hidden from the test log */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  /** number of test runs [1] */
  var runs: js.UndefOr[scala.Double] = js.undefined
  /** save response bodies for text resources */
  var saveResponseBodies: js.UndefOr[scala.Boolean] = js.undefined
  /** discard script and http headers in the result */
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** space-delimited list of domains to simulate failure by re-routing to blackhole.webpagetest.org to silently drop all requests */
  var spof: js.UndefOr[java.lang.String] = js.undefined
  /** stop test at document complete. typically, tests run until all activity stops */
  var stopAtDocumentComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** capture network packet trace (tcpdump) */
  var tcpDump: js.UndefOr[scala.Boolean] = js.undefined
  /** run the test on a specific PC (name must match exactly or the test will not run) */
  var tester: js.UndefOr[java.lang.String] = js.undefined
  /** capture Developer Tools Timeline (Chrome only) */
  var timeline: js.UndefOr[scala.Boolean] = js.undefined
  /** set between 1-5 to include the JS call stack. must be used in conjunction with timeline (increases overhead) (Chrome only) */
  var timelineCallStack: js.UndefOr[scala.Boolean] = js.undefined
  /** timeout for polling and waiting results [no timeout] */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** test name to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsView: js.UndefOr[java.lang.String] = js.undefined
  /** configs to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsViewConfigs: js.UndefOr[java.lang.String] = js.undefined
  /** custom user agent string (Chrome only) */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** capture video */
  var video: js.UndefOr[scala.Boolean] = js.undefined
  /** wait for test results informed by agent once complete listening on : [hostname:first port available above 8000] */
  var waitResults: js.UndefOr[java.lang.String] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    affinity: java.lang.String = null,
    authenticationType: scala.Int | scala.Double = null,
    bandwidthDown: java.lang.String = null,
    bandwidthUp: java.lang.String = null,
    block: java.lang.String = null,
    blockAds: js.UndefOr[scala.Boolean] = js.undefined,
    chromeTrace: js.UndefOr[scala.Boolean] = js.undefined,
    clearCerts: js.UndefOr[scala.Boolean] = js.undefined,
    commandLine: java.lang.String = null,
    connectivity: java.lang.String = null,
    continuousVideoCapture: js.UndefOr[scala.Boolean] = js.undefined,
    customMetrics: java.lang.String = null,
    dataReduction: js.UndefOr[scala.Boolean] = js.undefined,
    disableCompatibilityView: js.UndefOr[scala.Boolean] = js.undefined,
    disableHTTPHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    disableJavaScript: js.UndefOr[scala.Boolean] = js.undefined,
    disableOptimization: js.UndefOr[scala.Boolean] = js.undefined,
    disableScreenshot: js.UndefOr[scala.Boolean] = js.undefined,
    domElement: java.lang.String = null,
    emulateMobile: js.UndefOr[scala.Boolean] = js.undefined,
    firstViewOnly: js.UndefOr[scala.Boolean] = js.undefined,
    forceSoftwareRendering: js.UndefOr[scala.Boolean] = js.undefined,
    forceSpdy3: js.UndefOr[scala.Boolean] = js.undefined,
    fullResolutionScreenshot: js.UndefOr[scala.Boolean] = js.undefined,
    htmlBody: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    jpegQuality: scala.Int | scala.Double = null,
    keepOriginalUserAgent: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    latency: java.lang.String = null,
    lighthouse: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    login: java.lang.String = null,
    medianVideo: js.UndefOr[scala.Boolean] = js.undefined,
    minimumDuration: scala.Int | scala.Double = null,
    netLog: js.UndefOr[scala.Boolean] = js.undefined,
    notifyEmail: java.lang.String = null,
    packetLossRate: scala.Int | scala.Double = null,
    password: java.lang.String = null,
    pingback: java.lang.String = null,
    pollResults: scala.Int | scala.Double = null,
    priority: scala.Int | scala.Double = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    runs: scala.Int | scala.Double = null,
    saveResponseBodies: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    spof: java.lang.String = null,
    stopAtDocumentComplete: js.UndefOr[scala.Boolean] = js.undefined,
    tcpDump: js.UndefOr[scala.Boolean] = js.undefined,
    tester: java.lang.String = null,
    timeline: js.UndefOr[scala.Boolean] = js.undefined,
    timelineCallStack: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    tsView: java.lang.String = null,
    tsViewConfigs: java.lang.String = null,
    userAgent: java.lang.String = null,
    video: js.UndefOr[scala.Boolean] = js.undefined,
    waitResults: java.lang.String = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (affinity != null) __obj.updateDynamic("affinity")(affinity)
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (bandwidthDown != null) __obj.updateDynamic("bandwidthDown")(bandwidthDown)
    if (bandwidthUp != null) __obj.updateDynamic("bandwidthUp")(bandwidthUp)
    if (block != null) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(blockAds)) __obj.updateDynamic("blockAds")(blockAds)
    if (!js.isUndefined(chromeTrace)) __obj.updateDynamic("chromeTrace")(chromeTrace)
    if (!js.isUndefined(clearCerts)) __obj.updateDynamic("clearCerts")(clearCerts)
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (connectivity != null) __obj.updateDynamic("connectivity")(connectivity)
    if (!js.isUndefined(continuousVideoCapture)) __obj.updateDynamic("continuousVideoCapture")(continuousVideoCapture)
    if (customMetrics != null) __obj.updateDynamic("customMetrics")(customMetrics)
    if (!js.isUndefined(dataReduction)) __obj.updateDynamic("dataReduction")(dataReduction)
    if (!js.isUndefined(disableCompatibilityView)) __obj.updateDynamic("disableCompatibilityView")(disableCompatibilityView)
    if (!js.isUndefined(disableHTTPHeaders)) __obj.updateDynamic("disableHTTPHeaders")(disableHTTPHeaders)
    if (!js.isUndefined(disableJavaScript)) __obj.updateDynamic("disableJavaScript")(disableJavaScript)
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization)
    if (!js.isUndefined(disableScreenshot)) __obj.updateDynamic("disableScreenshot")(disableScreenshot)
    if (domElement != null) __obj.updateDynamic("domElement")(domElement)
    if (!js.isUndefined(emulateMobile)) __obj.updateDynamic("emulateMobile")(emulateMobile)
    if (!js.isUndefined(firstViewOnly)) __obj.updateDynamic("firstViewOnly")(firstViewOnly)
    if (!js.isUndefined(forceSoftwareRendering)) __obj.updateDynamic("forceSoftwareRendering")(forceSoftwareRendering)
    if (!js.isUndefined(forceSpdy3)) __obj.updateDynamic("forceSpdy3")(forceSpdy3)
    if (!js.isUndefined(fullResolutionScreenshot)) __obj.updateDynamic("fullResolutionScreenshot")(fullResolutionScreenshot)
    if (!js.isUndefined(htmlBody)) __obj.updateDynamic("htmlBody")(htmlBody)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (jpegQuality != null) __obj.updateDynamic("jpegQuality")(jpegQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOriginalUserAgent)) __obj.updateDynamic("keepOriginalUserAgent")(keepOriginalUserAgent)
    if (label != null) __obj.updateDynamic("label")(label)
    if (latency != null) __obj.updateDynamic("latency")(latency)
    if (!js.isUndefined(lighthouse)) __obj.updateDynamic("lighthouse")(lighthouse)
    if (location != null) __obj.updateDynamic("location")(location)
    if (login != null) __obj.updateDynamic("login")(login)
    if (!js.isUndefined(medianVideo)) __obj.updateDynamic("medianVideo")(medianVideo)
    if (minimumDuration != null) __obj.updateDynamic("minimumDuration")(minimumDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(netLog)) __obj.updateDynamic("netLog")(netLog)
    if (notifyEmail != null) __obj.updateDynamic("notifyEmail")(notifyEmail)
    if (packetLossRate != null) __obj.updateDynamic("packetLossRate")(packetLossRate.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (pingback != null) __obj.updateDynamic("pingback")(pingback)
    if (pollResults != null) __obj.updateDynamic("pollResults")(pollResults.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    if (!js.isUndefined(saveResponseBodies)) __obj.updateDynamic("saveResponseBodies")(saveResponseBodies)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (spof != null) __obj.updateDynamic("spof")(spof)
    if (!js.isUndefined(stopAtDocumentComplete)) __obj.updateDynamic("stopAtDocumentComplete")(stopAtDocumentComplete)
    if (!js.isUndefined(tcpDump)) __obj.updateDynamic("tcpDump")(tcpDump)
    if (tester != null) __obj.updateDynamic("tester")(tester)
    if (!js.isUndefined(timeline)) __obj.updateDynamic("timeline")(timeline)
    if (!js.isUndefined(timelineCallStack)) __obj.updateDynamic("timelineCallStack")(timelineCallStack)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tsView != null) __obj.updateDynamic("tsView")(tsView)
    if (tsViewConfigs != null) __obj.updateDynamic("tsViewConfigs")(tsViewConfigs)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    if (waitResults != null) __obj.updateDynamic("waitResults")(waitResults)
    __obj.asInstanceOf[TestOptions]
  }
}

