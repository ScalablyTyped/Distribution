package typings.wdioTypes.buildCapabilitiesMod

import typings.wdioTypes.anon.Args
import typings.wdioTypes.wdioTypesStrings.`private`
import typings.wdioTypes.wdioTypesStrings.`public restricted`
import typings.wdioTypes.wdioTypesStrings.public
import typings.wdioTypes.wdioTypesStrings.share
import typings.wdioTypes.wdioTypesStrings.team
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceLabsCapabilities extends StObject {
  
  /**
    * Enables the interception of biometric input, allowing the test to
    * simulate Touch ID interactions (not a Sauce Labs-specific capability).
    *
    * @default false
    */
  var allowTouchIdEnroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Sauce routes traffic from some WebDriver browsers (Edge, Internet Explorer and Safari)
    * through the Selenium HTTP proxy server so that HTTPS connections with self-signed certificates
    * work everywhere. The Selenium proxy server can cause problems for some users. If that's the case
    * for you, you can configure Sauce to avoid using the proxy server and have browsers communicate
    * directly with your servers.
    *
    * __Don't Need the Selenium Proxy with Firefox or Google Chrome__
    *
    * Firefox and Google Chrome under WebDriver aren't affected by this flag as they handle invalid
    * certificates automatically and there isn't a need to proxy through Selenium.
    *
    * __Incompatible with Sauce Connect Proxy__
    *
    * This flag is incompatible with Sauce Connect Proxy.
    */
  var avoidProxy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to associate jobs with a build number or app version, which is then displayed
    * on both the Dashboard and Archives view
    *
    * @example `build-1234`
    */
  var build: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Keeps a device allocated to you between test sessions, bypassing the
    * device cleaning process and session exit that occurs by default after
    * each test completes. Normally, you'd need to start over and reopen
    * another device. You'll need to launch your next test within 10 seconds
    * of your previous test ending to ensure that the same device will be
    * allocated for the test (not cleaned or reset).
    *
    * @default *randomized string*
    */
  var cacheId: js.UndefOr[String] = js.undefined
  
  /**
    * Enable [Frontend Performance](https://wiki.saucelabs.com/display/DOCS/Measure+Page+Load+Performance+Using+Test+Automation) capturing capabilities.
    */
  var capturePerformance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Chromedriver versions are pinned to the Chrome version you have defined in your capabilities.
    * Only define a custom `chromedriverVersion` if you know what you do.
    *
    * @deprecated
    */
  var chromedriverVersion: js.UndefOr[String] = js.undefined
  
  /**
    * As a safety measure to prevent Selenium crashes from making your tests run indefinitely, Sauce
    * limits how long Selenium can take to run a command in our browsers. This is set to 300 seconds
    * by default. The value of this setting is given in seconds. The maximum command timeout value
    * allowed is 600 seconds.
    *
    * @default 300
    */
  var commandTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * User-defined custom data that will accept any valid JSON object, limited to 64KB in size.
    * @example
    * ```
    * {
    *   "release": "1.0",
    *   "commit": "0k392a9dkjr",
    *   "staging": true,
    *   "execution_number": 5,
    *   "server": "test.customer.com"
    * }
    * ```
    */
  var `custom-data`: js.UndefOr[Any] = js.undefined
  
  /**
    * Enable [Extended Debugging Capabilities](https://wiki.saucelabs.com/pages/viewpage.action?pageId=70072943).
    *
    * @default false
    */
  var extendedDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For Firefox version 80 and above, geckodriver defaults to latest driver version 0.27.0 when no
    * version is specified.
    *
    * @deprecated
    */
  var geckodriverVersion: js.UndefOr[String] = js.undefined
  
  /**
    * As a safety measure to prevent tests from running too long after something has gone wrong, Sauce
    * limits how long a browser can wait for a test to send a new command. This is set to 90 seconds
    * by default and limited to a maximum value of 1000 seconds. You can adjust this limit on a per-job
    * basis. The value of this setting is given in seconds.
    *
    * @default 90
    */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The Internet Explorer Driver defaults to version 2.53.1 when no version is specified.
    *
    * Note that the versions of Internet Explorer Driver we have available correspond to major Selenium
    * releases - we do not have all the minor point releases (e.g. 3.12.0.4) available.
    *
    * We recommend setting the Selenium Version (see above) to correspond with the Internet Explorer Driver
    * version you select.
    *
    * Sauce Labs supports launching 64-bit IE on our 64-bit VMs: Windows 7, Windows 8, and Windows 8.1.
    * This provides a workaround for two known Selenium issues:
    * - Using a 32 bit driver on a 64 bit operating system causes Selenium's screenshot feature to only
    *   capture the part of the page currently visible in the browser viewport Selenium Issue 5876.
    * - Using a 64 bit driver on a 64 bit operating system causes text entry to be extremely slow
    *   Selenium Issue 5516.
    *
    * @deprecated
    */
  var iedriverVersion: js.UndefOr[String] = js.undefined
  
  /**
    * As a safety measure to prevent tests from running indefinitely, Sauce limits the duration of
    * tests to 30 minutes by default. You can adjust this limit on per-job basis and the maximum
    * value is 10800 seconds.
    *
    * __Don't Exceed 30 Minutes__
    *
    * A test should never last more than 30 minutes and ideally should take less than five minutes.
    * The 3 hour maximum exists mainly to ease the transition of new users migrating long running
    * tests to Sauce Labs.
    *
    * While our test VMs respect the maxDuration desired capability when it's set in tests, it may
    * not always be precise. Tests will never be timed out before their maxDuration has elapsed and
    * in most cases, they will be timed out very shortly after their maxDuration has elapsed (usually
    * less than 1 second). But, in some rare cases, such as when the test VM is suffering performance
    * problems, they can be allowed to run longer (30 seconds or more).
    *
    * @default 1800
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to record test names for jobs and make it easier to find individual tests.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This desired capability will let the test job use any shared tunnels available from the
    * specified parent account. i.e. any account that is upstream in the hierarchy. __If using a
    * shared tunnel, you must specify both tunnelIdentifier and parentTunnel__. Check out the
    * topic Using [Sauce Connect Tunnel Identifiers](https://wiki.saucelabs.com/display/DOCS/Using+Sauce+Connect+Tunnel+Identifiers) for more information.
    */
  var parentTunnel: js.UndefOr[String] = js.undefined
  
  /**
    * You can provide a URL to an executable file, which will be downloaded and executed to configure the
    * VM before the test starts. For faster performance, you may want to upload the executable to [Sauce Storage](https://wiki.saucelabs.com/display/DOCS/Uploading+your+Application+to+Emulators+and+Simulators),
    * a private temporary storage space. This capability takes a JSON object with four main keys.
    * Check out the topics under [Using Pre-Run Executables to Configure Browsers and Virtual Machines](https://wiki.saucelabs.com/display/DOCS/Using+Pre-Run+Executables+to+Configure+Browsers+and+Virtual+Machines) for
    * more information.
    *
    * __Running AutoIt Scripts__
    *
    * If you want to run an AutoIt script during your test, compile it as an .exe, send it using this
    * capability, and set background to true to allow AutoIt to continue running throughout the full
    * duration of your test.
    *
    * __Using Multiple Pre-Run Executables__
    *
    * If you need to send multiple pre-run executables, the best way is to bundle them into a single
    * executable file, such as a self-extracting zip file.
    */
  var prerun: js.UndefOr[Args] = js.undefined
  
  /**
    * If you have multiple new jobs waiting to start (i.e., across a collection of sub-accounts), jobs
    * with a lower priority number take precedence over jobs with a higher number. So, for example, if
    * you have multiple jobs simultaneously waiting to start, we'll first attempt to find resources to
    * start all the jobs with priority 0, then all the jobs with priority 1, etc. When we run out of
    * available virtual machines, or when you hit your concurrency limit, any jobs not yet started will
    * wait. Within each priority level, jobs that have been waiting the longest take precedence.
    *
    * @default 0
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Sauce Labs supports several test result visibility levels, which control who can view the test
    * details. The visibility level for a test can be set manually from the test results page, but
    * also programmatically when starting a test or with our REST API. For more information about
    * sharing test result, see the topics under Sharing the Results of Sauce Labs Tests.
    *
    * Available visibility levels are:
    *
    * - __public__: Making your test public means that it is accessible to everyone, and may be
    *   listed on public web pages and indexed by search engines.
    * - __public restricted__: If you want to share your job's result page and video, but keep
    *   the logs only for you, you can certainly do so with public restricted visibility mode. This
    *   visibility mode will hide the fancy job log as well as prohibit access to the raw Selenium log,
    *   so that anonymous users with the link will be able to watch the video and screen shots but
    *   won't be able to see what's being typed and done to get there.
    * - __share__: You can also decide to make your test sharable. Making your test sharable means
    *   that it is only accessible to people having valid link and it is not listed on publicly available
    *   pages on saucelabs.com or indexed by search engines.
    * - __team__: If you want to share your jobs with other team members (that were created as a sub-accounts
    *   of one parent account), you can use team visibility mode. Making your test accessible by team means
    *   that it is only accessible to people under the same root account as you.
    * - __private__: If you don't want to share your test's result page and video with anyone, you should
    *   use private job visibility mode. This way, only you (the owner) will be able to view assets and test
    *   result page.
    *
    * @default private
    */
  var public: js.UndefOr[
    typings.wdioTypes.wdioTypesStrings.public | (`public restricted`) | share | team | `private`
  ] = js.undefined
  
  /**
    * By default, Sauce creates a log of all the actions that you execute to create a report for the
    * test run that lets you troubleshoot test failures more easily.
    *
    * __Note:__ Selenium Logs Are Still Recorded
    *
    * This option only disables recording of the log.json file. The selenium-server.log will still be
    * recorded even if you choose to disable recording of the log.json.
    */
  var recordLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sauce Labs captures step-by-step screenshots of every test you run. Most users find it very
    * useful to get a quick overview of what happened without having to watch the complete video.
    * However, this feature may add some extra time to your tests. You can avoid this by optionally
    * turning off this feature.
    */
  var recordScreenshots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Sauce Labs records a video of every test you run. This is generally handy for debugging
    * failing tests, as well as having a visual confirmation that certain feature works (or still works!)
    * However, there is an added wait time for screen recording during a test run.
    */
  var recordVideo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting specifies which screen resolution should be used during the test session.
    *
    * @example `1280x1024`
    */
  var screenResolution: js.UndefOr[String] = js.undefined
  
  /**
    * We do not recommend to use this option.
    * @deprecated
    */
  var seleniumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * User-defined tags for grouping and filtering jobs in the Dashboard and Archives view.
    * @example
    * ```
    * ["tag1", "tag2", "tag3"]
    * ```
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Desktop Test VMs can be configured with custom time zones. This feature should work on all operating
    * systems, however time zones on Windows VMs are approximate. The time zone will usually default to
    * whatever local time zone is on your selected data center, but this cannot be guaranteed. You can
    * find a complete list of timezones on Wikipedia. If the timeZone name has two or more or words
    * (e.g., Los Angeles), you'll need to separate the words with either a space or an underscore. Sauce
    * takes only location names (not their paths), as shown in the example below.
    *
    * @example Los_Angeles
    * @example Honolulu
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * If you are using Sauce Connect Proxy to to test an application that is behind a firewall
    * or on your local machine, you must provide the identifier of the Sauce Connect tunnel to
    * use. Check out [Basic Sauce Connect Proxy Setup](https://wiki.saucelabs.com/display/DOCS/Basic+Sauce+Connect+Proxy+Setup) for more information.
    */
  var tunnelIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * As an alternative to disabling video recording, the  videoUploadOnPass  setting will let you
    * discard videos for passing tests identified using the passed setting. This disables video
    * post-processing and uploading that may otherwise consume some extra time after your test is complete.
    */
  var videoUploadOnPass: js.UndefOr[Boolean] = js.undefined
}
object SauceLabsCapabilities {
  
  inline def apply(): SauceLabsCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceLabsCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SauceLabsCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAllowTouchIdEnroll(value: Boolean): Self = StObject.set(x, "allowTouchIdEnroll", value.asInstanceOf[js.Any])
    
    inline def setAllowTouchIdEnrollUndefined: Self = StObject.set(x, "allowTouchIdEnroll", js.undefined)
    
    inline def setAvoidProxy(value: Boolean): Self = StObject.set(x, "avoidProxy", value.asInstanceOf[js.Any])
    
    inline def setAvoidProxyUndefined: Self = StObject.set(x, "avoidProxy", js.undefined)
    
    inline def setBuild(value: String | Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    inline def setCapturePerformance(value: Boolean): Self = StObject.set(x, "capturePerformance", value.asInstanceOf[js.Any])
    
    inline def setCapturePerformanceUndefined: Self = StObject.set(x, "capturePerformance", js.undefined)
    
    inline def setChromedriverVersion(value: String): Self = StObject.set(x, "chromedriverVersion", value.asInstanceOf[js.Any])
    
    inline def setChromedriverVersionUndefined: Self = StObject.set(x, "chromedriverVersion", js.undefined)
    
    inline def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
    
    inline def setCommandTimeoutUndefined: Self = StObject.set(x, "commandTimeout", js.undefined)
    
    inline def `setCustom-data`(value: Any): Self = StObject.set(x, "custom-data", value.asInstanceOf[js.Any])
    
    inline def `setCustom-dataUndefined`: Self = StObject.set(x, "custom-data", js.undefined)
    
    inline def setExtendedDebugging(value: Boolean): Self = StObject.set(x, "extendedDebugging", value.asInstanceOf[js.Any])
    
    inline def setExtendedDebuggingUndefined: Self = StObject.set(x, "extendedDebugging", js.undefined)
    
    inline def setGeckodriverVersion(value: String): Self = StObject.set(x, "geckodriverVersion", value.asInstanceOf[js.Any])
    
    inline def setGeckodriverVersionUndefined: Self = StObject.set(x, "geckodriverVersion", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setIedriverVersion(value: String): Self = StObject.set(x, "iedriverVersion", value.asInstanceOf[js.Any])
    
    inline def setIedriverVersionUndefined: Self = StObject.set(x, "iedriverVersion", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentTunnel(value: String): Self = StObject.set(x, "parentTunnel", value.asInstanceOf[js.Any])
    
    inline def setParentTunnelUndefined: Self = StObject.set(x, "parentTunnel", js.undefined)
    
    inline def setPrerun(value: Args): Self = StObject.set(x, "prerun", value.asInstanceOf[js.Any])
    
    inline def setPrerunUndefined: Self = StObject.set(x, "prerun", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setPublic(value: public | (`public restricted`) | share | team | `private`): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRecordLogs(value: Boolean): Self = StObject.set(x, "recordLogs", value.asInstanceOf[js.Any])
    
    inline def setRecordLogsUndefined: Self = StObject.set(x, "recordLogs", js.undefined)
    
    inline def setRecordScreenshots(value: Boolean): Self = StObject.set(x, "recordScreenshots", value.asInstanceOf[js.Any])
    
    inline def setRecordScreenshotsUndefined: Self = StObject.set(x, "recordScreenshots", js.undefined)
    
    inline def setRecordVideo(value: Boolean): Self = StObject.set(x, "recordVideo", value.asInstanceOf[js.Any])
    
    inline def setRecordVideoUndefined: Self = StObject.set(x, "recordVideo", js.undefined)
    
    inline def setScreenResolution(value: String): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
    
    inline def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
    
    inline def setSeleniumVersion(value: String): Self = StObject.set(x, "seleniumVersion", value.asInstanceOf[js.Any])
    
    inline def setSeleniumVersionUndefined: Self = StObject.set(x, "seleniumVersion", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
    
    inline def setVideoUploadOnPass(value: Boolean): Self = StObject.set(x, "videoUploadOnPass", value.asInstanceOf[js.Any])
    
    inline def setVideoUploadOnPassUndefined: Self = StObject.set(x, "videoUploadOnPass", js.undefined)
  }
}
