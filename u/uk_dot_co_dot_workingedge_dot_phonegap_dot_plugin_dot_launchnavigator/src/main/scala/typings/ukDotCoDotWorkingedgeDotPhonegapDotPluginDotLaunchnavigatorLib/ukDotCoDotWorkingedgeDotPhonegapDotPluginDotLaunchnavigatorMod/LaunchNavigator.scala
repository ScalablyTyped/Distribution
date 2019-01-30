package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchNavigator extends js.Object {
  /**
    * string constants, used to identify apps in native code
    */
  var APP: js.Any = js.native
  /**
    * Launch modes supported by Google Maps on Android
    */
  var LAUNCH_MODE: js.Any = js.native
  /**
    * Supported platforms
    */
  var PLATFORM: js.Any = js.native
  /**
    * All possible transport modes
    */
  var TRANSPORT_MODE: js.Any = js.native
  var appSelection: AppSelection = js.native
  /**
    * Returns a list indicating which apps are installed and available on the current device.
    * @return string[]
    */
  def availableApps(successCallback: js.Function1[/* apps */ js.Any, scala.Unit]): scala.Unit = js.native
  def availableApps(
    successCallback: js.Function1[/* apps */ js.Any, scala.Unit],
    errorCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables debug log output from the plugin to the JS and native consoles. By default debug is disabled.
    * @param enabled {boolean}
    */
  def enableDebug(enabled: scala.Boolean, successCallback: js.Function1[/* any */ js.Any, scala.Unit]): scala.Unit = js.native
  def enableDebug(
    enabled: scala.Boolean,
    successCallback: js.Function1[/* any */ js.Any, scala.Unit],
    errorCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns the display name of the specified app.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @return {string} - app display name. e.g. "Google Maps".
    */
  def getAppDisplayName(app: java.lang.String): java.lang.String = js.native
  /**
    * Returns list of supported apps on a given platform.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {array} - apps supported on specified platform as a list of `launchnavigator.APP` constants.
    */
  def getAppsForPlatform(platform: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Returns the list of transport modes supported by an app on a given platform.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {array} - list of transports modes as constants in `launchnavigator.TRANSPORT_MODE`.
    * If app/platform combination doesn't support specification of transport mode, the list will be empty;
    */
  def getTransportModes(app: java.lang.String, platform: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Determines if the given app is installed and available on the current device.
    * @param app {string}
    */
  def isAppAvailable(app: java.lang.String, successCallback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def isAppAvailable(
    app: java.lang.String,
    successCallback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def logEvent(name: java.lang.String): scala.Unit = js.native
  def logEvent(name: java.lang.String, params: js.Any): scala.Unit = js.native
  def logEvent(name: java.lang.String, params: js.Any, valueToSum: scala.Double): scala.Unit = js.native
  /**
    * Launches navigator app
    * @param destination {string|number[]} Location name or coordinates (as string or array)
    * Either:
    * - a {string} containing the address. e.g. "Buckingham Palace, London"
    * - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
    * - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
    * @param options {LaunchNavigatorOptions}
    * @returns {Promise<any>}
    */
  def navigate(destination: java.lang.String): scala.Unit = js.native
  def navigate(destination: java.lang.String, options: LaunchNavigatorOptions): scala.Unit = js.native
  def navigate(destination: js.Array[scala.Double]): scala.Unit = js.native
  def navigate(destination: js.Array[scala.Double], options: LaunchNavigatorOptions): scala.Unit = js.native
  /**
    * Indicates if an app on a given platform supports specification of a custom nickname for destination location.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {boolean} - true if app/platform combination supports specification of destination location.
    */
  def supportsDestName(app: java.lang.String, platform: java.lang.String): scala.Boolean = js.native
  /**
    * Indicates if an app on a given platform supports specification of launch mode.
    * Note that currently only Google Maps on Android does.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.ANDROID`.
    * @return {boolean} - true if app/platform combination supports specification of transport mode.
    */
  def supportsLaunchMode(app: java.lang.String, platform: java.lang.String): scala.Boolean = js.native
  /**
    * Indicates if an app on a given platform supports specification of start location.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {boolean} - true if app/platform combination supports specification of start location.
    */
  def supportsStart(app: java.lang.String, platform: java.lang.String): scala.Boolean = js.native
  /**
    * Indicates if an app on a given platform supports specification of a custom nickname for start location.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {boolean} - true if app/platform combination supports specification of start location.
    */
  def supportsStartName(app: java.lang.String, platform: java.lang.String): scala.Boolean = js.native
  /**
    * Indicates if an app on a given platform supports specification of transport mode.
    * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
    * @return {boolean} - true if app/platform combination supports specification of transport mode.
    */
  def supportsTransportMode(app: java.lang.String, platform: java.lang.String): scala.Boolean = js.native
  /**
    * Triggers the native dialog picker for user to choose wich app to use.
    * @param {string/number[]} destination (required) - destination location to use for navigation - see launchnavigator.navigate()
    * @param {object} options (optional) - optional parameters - see launchnavigator.navigate()
    * @param {Function} successCallback (optional) - optional callback to be invoked on success
    * @param {Function} errorCallback (optional) - optional callback to be invoked on error
    */
  def userSelect(destination: java.lang.String, options: LaunchNavigatorOptions): scala.Unit = js.native
  def userSelect(destination: js.Array[scala.Double], options: LaunchNavigatorOptions): scala.Unit = js.native
}

