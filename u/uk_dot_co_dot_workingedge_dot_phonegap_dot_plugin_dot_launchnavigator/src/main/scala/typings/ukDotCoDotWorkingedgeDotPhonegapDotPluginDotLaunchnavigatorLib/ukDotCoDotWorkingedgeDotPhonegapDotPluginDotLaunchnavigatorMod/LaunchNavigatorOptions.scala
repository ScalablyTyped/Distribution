package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchNavigatorOptions extends js.Object {
  /**
    * name of the navigation app to use for directions.
    * Specify using launchnavigator.APP constants.
    * e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * If not specified, defaults to User Selection.
    */
  var app: js.UndefOr[java.lang.String] = js.undefined
  /**
    * options related to the default native actionsheet picker which enables user to select which navigation app to launch if `app` is not specified.
    */
  var appSelection: js.UndefOr[AppSelectionOptions] = js.undefined
  /**
    * nickname to display in app for destination. e.g. "Bob's House".
    */
  var destinationName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Android and iOS only) If true, and input location type(s) doesn't match those required by the app, use geocoding to obtain the address/coords as required. Defaults to true.
    */
  var enableGeocoding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (Windows only) If false, the plugin will NOT attempt to use the geolocation plugin to determine the current device position when the start location parameter is omitted. Defaults to true.
    */
  var enableGeolocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback to invoke if an error is encountered while launching the app.
    * A single string argument containing the error message will be passed in.
    */
  var errorCallback: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * a key/value map of extra app-specific parameters. For example, to tell Google Maps on Android to display Satellite view in "maps" launch mode: `{"t": "k"}`
    */
  var extras: js.UndefOr[js.Any] = js.undefined
  /**
    * (iOS only) method to use to open Apple Maps app.
    * `launchnavigator.LAUNCH_MODE.URI_SCHEME` or `launchnavigator.LAUNCH_MODE.MAPKIT`
    * Defaults to `launchnavigator.LAUNCH_MODE.URI_SCHEME` if not specified.
    */
  var launchModeAppleMaps: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Android only) mode in which to open Google Maps app.
    * `launchnavigator.LAUNCH_MODE.MAPS` or `launchnavigator.LAUNCH_MODE.TURN_BY_TURN`
    * Defaults to `launchnavigator.LAUNCH_MODE.MAPS` if not specified.
    */
  var launchModeGoogleMaps: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start point of the navigation.
    * If not specified, the current device location will be used.
    * Either:
    *  - a {string} containing the address. e.g. "Buckingham Palace, London"
    *  - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
    *  - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
    */
  var start: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  /**
    * nickname to display in app for start . e.g. "My House".
    */
  var startName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback to invoke when the navigation app is successfully launched.
    */
  var successCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * Transportation mode for navigation: "driving", "walking" or "transit". Defaults to "driving" if not specified.
    */
  var transportMode: js.UndefOr[java.lang.String] = js.undefined
}

