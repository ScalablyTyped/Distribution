package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import typings.wdioTypes.anon.BufferUsageReportingInterval
import typings.wdioTypes.anon.DeviceMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeOptions extends StObject {
  
  /**
    * List of command-line arguments to use when starting Chrome. Arguments with an
    * associated value should be separated by a '=' sign (e.g., `['start-maximized', 'user-data-dir=/tmp/temp_profile']`).
    * See here for a list of Chrome arguments.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Path to the Chrome executable to use (on Mac OS X, this should be the actual binary,
    * not just the app. e.g., '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome')
    */
  var binary: js.UndefOr[String] = js.undefined
  
  /**
    * An address of a Chrome debugger server to connect to, in the form of `<hostname/ip:port>`,
    * e.g. '127.0.0.1:38947'
    */
  var debuggerAddress: js.UndefOr[String] = js.undefined
  
  /**
    * If false, Chrome will be quit when ChromeDriver is killed, regardless of whether
    * the session is quit. If true, Chrome will only be quit if the session is quit
    * (or closed). Note, if true, and the session is not quit, ChromeDriver cannot clean
    * up the temporary user data directory that the running Chrome instance is using.
    */
  var detach: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of Chrome command line switches to exclude that ChromeDriver by default passes
    * when starting Chrome.  Do not prefix switches with --.
    */
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of Chrome extensions to install on startup. Each item in the list should
    * be a base-64 encoded packed Chrome extension (.crx)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A dictionary with each entry consisting of the name of the preference and its value.
    * These preferences are applied to the Local State file in the user data folder.
    */
  var localState: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Directory to store Chrome minidumps . (Supported only on Linux.)
    */
  var minidumpPath: js.UndefOr[String] = js.undefined
  
  /**
    * A dictionary with either a value for “deviceName,” or values for “deviceMetrics” and
    * “userAgent.” Refer to Mobile Emulation for more information.
    */
  var mobileEmulation: js.UndefOr[DeviceMetrics] = js.undefined
  
  /**
    * An optional dictionary that specifies performance logging preferences. See
    * [Chromedriver docs](http://chromedriver.chromium.org/capabilities) for
    * more information.
    */
  var perfLoggingPrefs: js.UndefOr[BufferUsageReportingInterval] = js.undefined
  
  /**
    * A dictionary with each entry consisting of the name of the preference and its value.
    * These preferences are only applied to the user profile in use. See the 'Preferences'
    * file in Chrome's user data directory for examples.
    */
  var prefs: js.UndefOr[StringDictionary[js.Array[String] | String | Double | Boolean]] = js.undefined
  
  /**
    * A list of window types that will appear in the list of window handles. For access
    * to <webview> elements, include "webview" in this list.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ChromeOptions {
  
  inline def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChromeOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setDebuggerAddress(value: String): Self = StObject.set(x, "debuggerAddress", value.asInstanceOf[js.Any])
    
    inline def setDebuggerAddressUndefined: Self = StObject.set(x, "debuggerAddress", js.undefined)
    
    inline def setDetach(value: Boolean): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    inline def setExcludeSwitches(value: js.Array[String]): Self = StObject.set(x, "excludeSwitches", value.asInstanceOf[js.Any])
    
    inline def setExcludeSwitchesUndefined: Self = StObject.set(x, "excludeSwitches", js.undefined)
    
    inline def setExcludeSwitchesVarargs(value: String*): Self = StObject.set(x, "excludeSwitches", js.Array(value*))
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setLocalState(value: StringDictionary[Any]): Self = StObject.set(x, "localState", value.asInstanceOf[js.Any])
    
    inline def setLocalStateUndefined: Self = StObject.set(x, "localState", js.undefined)
    
    inline def setMinidumpPath(value: String): Self = StObject.set(x, "minidumpPath", value.asInstanceOf[js.Any])
    
    inline def setMinidumpPathUndefined: Self = StObject.set(x, "minidumpPath", js.undefined)
    
    inline def setMobileEmulation(value: DeviceMetrics): Self = StObject.set(x, "mobileEmulation", value.asInstanceOf[js.Any])
    
    inline def setMobileEmulationUndefined: Self = StObject.set(x, "mobileEmulation", js.undefined)
    
    inline def setPerfLoggingPrefs(value: BufferUsageReportingInterval): Self = StObject.set(x, "perfLoggingPrefs", value.asInstanceOf[js.Any])
    
    inline def setPerfLoggingPrefsUndefined: Self = StObject.set(x, "perfLoggingPrefs", js.undefined)
    
    inline def setPrefs(value: StringDictionary[js.Array[String] | String | Double | Boolean]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
    
    inline def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    
    inline def setWindowTypes(value: js.Array[String]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
    
    inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
    
    inline def setWindowTypesVarargs(value: String*): Self = StObject.set(x, "windowTypes", js.Array(value*))
  }
}
