package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchNavigatorOptions extends js.Object {
  /**
    * name of the navigation app to use for directions.
    * Specify using launchnavigator.APP constants.
    * e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * If not specified, defaults to User Selection.
    */
  var app: js.UndefOr[String] = js.native
  /**
    * options related to the default native actionsheet picker which enables user to select which navigation app to launch if `app` is not specified.
    */
  var appSelection: js.UndefOr[AppSelectionOptions] = js.native
  /**
    * nickname to display in app for destination. e.g. "Bob's House".
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * (Android and iOS only) If true, and input location type(s) doesn't match those required by the app, use geocoding to obtain the address/coords as required. Defaults to true.
    */
  var enableGeocoding: js.UndefOr[Boolean] = js.native
  /**
    * (Windows only) If false, the plugin will NOT attempt to use the geolocation plugin to determine the current device position when the start location parameter is omitted. Defaults to true.
    */
  var enableGeolocation: js.UndefOr[Boolean] = js.native
  /**
    * A callback to invoke if an error is encountered while launching the app.
    * A single string argument containing the error message will be passed in.
    */
  var errorCallback: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  /**
    * a key/value map of extra app-specific parameters. For example, to tell Google Maps on Android to display Satellite view in "maps" launch mode: `{"t": "k"}`
    */
  var extras: js.UndefOr[js.Any] = js.native
  /**
    * (iOS only) method to use to open Apple Maps app.
    * `launchnavigator.LAUNCH_MODE.URI_SCHEME` or `launchnavigator.LAUNCH_MODE.MAPKIT`
    * Defaults to `launchnavigator.LAUNCH_MODE.URI_SCHEME` if not specified.
    */
  var launchModeAppleMaps: js.UndefOr[String] = js.native
  /**
    * (Android only) mode in which to open Google Maps app.
    * `launchnavigator.LAUNCH_MODE.MAPS` or `launchnavigator.LAUNCH_MODE.TURN_BY_TURN`
    * Defaults to `launchnavigator.LAUNCH_MODE.MAPS` if not specified.
    */
  var launchModeGoogleMaps: js.UndefOr[String] = js.native
  /**
    * Start point of the navigation.
    * If not specified, the current device location will be used.
    * Either:
    *  - a {string} containing the address. e.g. "Buckingham Palace, London"
    *  - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
    *  - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
    */
  var start: js.UndefOr[String | js.Array[Double]] = js.native
  /**
    * nickname to display in app for start . e.g. "My House".
    */
  var startName: js.UndefOr[String] = js.native
  /**
    * A callback to invoke when the navigation app is successfully launched.
    */
  var successCallback: js.UndefOr[js.Function] = js.native
  /**
    * Transportation mode for navigation: "driving", "walking" or "transit". Defaults to "driving" if not specified.
    */
  var transportMode: js.UndefOr[String] = js.native
}

object LaunchNavigatorOptions {
  @scala.inline
  def apply(): LaunchNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchNavigatorOptions]
  }
  @scala.inline
  implicit class LaunchNavigatorOptionsOps[Self <: LaunchNavigatorOptions] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAppSelection(value: AppSelectionOptions): Self = this.set("appSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppSelection: Self = this.set("appSelection", js.undefined)
    @scala.inline
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setEnableGeocoding(value: Boolean): Self = this.set("enableGeocoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGeocoding: Self = this.set("enableGeocoding", js.undefined)
    @scala.inline
    def setEnableGeolocation(value: Boolean): Self = this.set("enableGeolocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGeolocation: Self = this.set("enableGeolocation", js.undefined)
    @scala.inline
    def setErrorCallback(value: /* error */ String => Unit): Self = this.set("errorCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorCallback: Self = this.set("errorCallback", js.undefined)
    @scala.inline
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    @scala.inline
    def setLaunchModeAppleMaps(value: String): Self = this.set("launchModeAppleMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchModeAppleMaps: Self = this.set("launchModeAppleMaps", js.undefined)
    @scala.inline
    def setLaunchModeGoogleMaps(value: String): Self = this.set("launchModeGoogleMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchModeGoogleMaps: Self = this.set("launchModeGoogleMaps", js.undefined)
    @scala.inline
    def setStartVarargs(value: Double*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: String | js.Array[Double]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartName(value: String): Self = this.set("startName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartName: Self = this.set("startName", js.undefined)
    @scala.inline
    def setSuccessCallback(value: js.Function): Self = this.set("successCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessCallback: Self = this.set("successCallback", js.undefined)
    @scala.inline
    def setTransportMode(value: String): Self = this.set("transportMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportMode: Self = this.set("transportMode", js.undefined)
  }
  
}

