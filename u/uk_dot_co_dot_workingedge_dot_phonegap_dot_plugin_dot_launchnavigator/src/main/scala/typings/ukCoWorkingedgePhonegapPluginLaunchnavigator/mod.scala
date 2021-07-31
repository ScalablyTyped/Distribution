package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uk.co.workingedge.phonegap.plugin.launchnavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uk.co.workingedge.phonegap.plugin.launchnavigator", "launchnavigator")
  @js.native
  def launchnavigator: LaunchNavigator_ = js.native
  @scala.inline
  def launchnavigator_=(x: LaunchNavigator_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("launchnavigator")(x.asInstanceOf[js.Any])
  
  trait AppSelection extends StObject {
    
    var userChoice: UserChoice
    
    var userPrompted: UserPrompted
  }
  object AppSelection {
    
    @scala.inline
    def apply(userChoice: UserChoice, userPrompted: UserPrompted): AppSelection = {
      val __obj = js.Dynamic.literal(userChoice = userChoice.asInstanceOf[js.Any], userPrompted = userPrompted.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSelection]
    }
    
    @scala.inline
    implicit class AppSelectionMutableBuilder[Self <: AppSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserChoice(value: UserChoice): Self = StObject.set(x, "userChoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPrompted(value: UserPrompted): Self = StObject.set(x, "userPrompted", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSelectionOptions extends StObject {
    
    /**
      * (Android only) native picker theme. Specify using `actionsheet.ANDROID_THEMES` constants.
      * Default `actionsheet.ANDROID_THEMES.THEME_HOLO_LIGHT`
      */
    var androidTheme: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback to invoke when the user selects an app in the native picker.
      * A single string argument is passed which is the app what was selected defined as a `launchnavigator.APP` constant.
      */
    var callback: js.UndefOr[js.Function1[/* app */ String, Unit]] = js.undefined
    
    /**
      * text to display for the cancel button in the native picker which enables user to select which navigation app to launch.
      * Defaults to "Cancel" if not specified.
      */
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * text to display in the native picker which enables user to select which navigation app to launch.
      * Defaults to "Select app for navigation" if not specified.
      */
    var dialogHeaderText: js.UndefOr[String] = js.undefined
    
    /**
      * List of apps, defined as `launchnavigator.APP` constants, which should be displayed in the picker if the app is available.
      * This can be used to restrict which apps are displayed, even if they are installed.
      * By default, all available apps will be displayed.
      */
    var list: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * options related to whether to remember user choice of app for next time, instead of asking again for user choice.
      */
    var rememberChoice: js.UndefOr[RememberChoiceOptions] = js.undefined
  }
  object AppSelectionOptions {
    
    @scala.inline
    def apply(): AppSelectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSelectionOptions]
    }
    
    @scala.inline
    implicit class AppSelectionOptionsMutableBuilder[Self <: AppSelectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroidTheme(value: Double): Self = StObject.set(x, "androidTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidThemeUndefined: Self = StObject.set(x, "androidTheme", js.undefined)
      
      @scala.inline
      def setCallback(value: /* app */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      @scala.inline
      def setDialogHeaderText(value: String): Self = StObject.set(x, "dialogHeaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogHeaderTextUndefined: Self = StObject.set(x, "dialogHeaderText", js.undefined)
      
      @scala.inline
      def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setRememberChoice(value: RememberChoiceOptions): Self = StObject.set(x, "rememberChoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberChoiceUndefined: Self = StObject.set(x, "rememberChoice", js.undefined)
    }
  }
  
  trait LaunchNavigatorOptions extends StObject {
    
    /**
      * name of the navigation app to use for directions.
      * Specify using launchnavigator.APP constants.
      * e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * If not specified, defaults to User Selection.
      */
    var app: js.UndefOr[String] = js.undefined
    
    /**
      * options related to the default native actionsheet picker which enables user to select which navigation app to launch if `app` is not specified.
      */
    var appSelection: js.UndefOr[AppSelectionOptions] = js.undefined
    
    /**
      * nickname to display in app for destination. e.g. "Bob's House".
      */
    var destinationName: js.UndefOr[String] = js.undefined
    
    /**
      * (Android and iOS only) If true, and input location type(s) doesn't match those required by the app, use geocoding to obtain the address/coords as required. Defaults to true.
      */
    var enableGeocoding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Windows only) If false, the plugin will NOT attempt to use the geolocation plugin to determine the current device position when the start location parameter is omitted. Defaults to true.
      */
    var enableGeolocation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback to invoke if an error is encountered while launching the app.
      * A single string argument containing the error message will be passed in.
      */
    var errorCallback: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
    
    /**
      * a key/value map of extra app-specific parameters. For example, to tell Google Maps on Android to display Satellite view in "maps" launch mode: `{"t": "k"}`
      */
    var extras: js.UndefOr[js.Any] = js.undefined
    
    /**
      * (iOS only) method to use to open Apple Maps app.
      * `launchnavigator.LAUNCH_MODE.URI_SCHEME` or `launchnavigator.LAUNCH_MODE.MAPKIT`
      * Defaults to `launchnavigator.LAUNCH_MODE.URI_SCHEME` if not specified.
      */
    var launchModeAppleMaps: js.UndefOr[String] = js.undefined
    
    /**
      * (Android only) mode in which to open Google Maps app.
      * `launchnavigator.LAUNCH_MODE.MAPS` or `launchnavigator.LAUNCH_MODE.TURN_BY_TURN`
      * Defaults to `launchnavigator.LAUNCH_MODE.MAPS` if not specified.
      */
    var launchModeGoogleMaps: js.UndefOr[String] = js.undefined
    
    /**
      * Start point of the navigation.
      * If not specified, the current device location will be used.
      * Either:
      *  - a {string} containing the address. e.g. "Buckingham Palace, London"
      *  - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
      *  - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
      */
    var start: js.UndefOr[String | js.Array[Double]] = js.undefined
    
    /**
      * nickname to display in app for start . e.g. "My House".
      */
    var startName: js.UndefOr[String] = js.undefined
    
    /**
      * A callback to invoke when the navigation app is successfully launched.
      */
    var successCallback: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Transportation mode for navigation: "driving", "walking" or "transit". Defaults to "driving" if not specified.
      */
    var transportMode: js.UndefOr[String] = js.undefined
  }
  object LaunchNavigatorOptions {
    
    @scala.inline
    def apply(): LaunchNavigatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchNavigatorOptions]
    }
    
    @scala.inline
    implicit class LaunchNavigatorOptionsMutableBuilder[Self <: LaunchNavigatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppSelection(value: AppSelectionOptions): Self = StObject.set(x, "appSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppSelectionUndefined: Self = StObject.set(x, "appSelection", js.undefined)
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
      
      @scala.inline
      def setEnableGeocoding(value: Boolean): Self = StObject.set(x, "enableGeocoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGeocodingUndefined: Self = StObject.set(x, "enableGeocoding", js.undefined)
      
      @scala.inline
      def setEnableGeolocation(value: Boolean): Self = StObject.set(x, "enableGeolocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGeolocationUndefined: Self = StObject.set(x, "enableGeolocation", js.undefined)
      
      @scala.inline
      def setErrorCallback(value: /* error */ String => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      @scala.inline
      def setExtras(value: js.Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      @scala.inline
      def setLaunchModeAppleMaps(value: String): Self = StObject.set(x, "launchModeAppleMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchModeAppleMapsUndefined: Self = StObject.set(x, "launchModeAppleMaps", js.undefined)
      
      @scala.inline
      def setLaunchModeGoogleMaps(value: String): Self = StObject.set(x, "launchModeGoogleMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchModeGoogleMapsUndefined: Self = StObject.set(x, "launchModeGoogleMaps", js.undefined)
      
      @scala.inline
      def setStart(value: String | js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartName(value: String): Self = StObject.set(x, "startName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNameUndefined: Self = StObject.set(x, "startName", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setSuccessCallback(value: js.Function): Self = StObject.set(x, "successCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
      
      @scala.inline
      def setTransportMode(value: String): Self = StObject.set(x, "transportMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportModeUndefined: Self = StObject.set(x, "transportMode", js.undefined)
    }
  }
  
  @js.native
  trait LaunchNavigator_ extends StObject {
    
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
    def availableApps(successCallback: js.Function1[/* apps */ js.Any, Unit]): Unit = js.native
    def availableApps(
      successCallback: js.Function1[/* apps */ js.Any, Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Enables debug log output from the plugin to the JS and native consoles. By default debug is disabled.
      * @param enabled {boolean}
      */
    def enableDebug(enabled: Boolean, successCallback: js.Function1[/* success */ js.Any, Unit]): Unit = js.native
    def enableDebug(
      enabled: Boolean,
      successCallback: js.Function1[/* success */ js.Any, Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Returns the display name of the specified app.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @return {string} - app display name. e.g. "Google Maps".
      */
    def getAppDisplayName(app: String): String = js.native
    
    /**
      * Returns list of supported apps on a given platform.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {array} - apps supported on specified platform as a list of `launchnavigator.APP` constants.
      */
    def getAppsForPlatform(platform: String): js.Array[String] = js.native
    
    /**
      * Returns the list of transport modes supported by an app on a given platform.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {array} - list of transports modes as constants in `launchnavigator.TRANSPORT_MODE`.
      * If app/platform combination doesn't support specification of transport mode, the list will be empty;
      */
    def getTransportModes(app: String, platform: String): js.Array[String] = js.native
    
    /**
      * Determines if the given app is installed and available on the current device.
      * @param app {string}
      */
    def isAppAvailable(app: String, successCallback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
    def isAppAvailable(
      app: String,
      successCallback: js.Function1[/* isAvailable */ Boolean, Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    def logEvent(name: String): Unit = js.native
    def logEvent(name: String, params: js.Any): Unit = js.native
    def logEvent(name: String, params: js.Any, valueToSum: Double): Unit = js.native
    def logEvent(name: String, params: Unit, valueToSum: Double): Unit = js.native
    
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
    def navigate(destination: String): Unit = js.native
    def navigate(destination: String, options: LaunchNavigatorOptions): Unit = js.native
    def navigate(destination: js.Array[Double]): Unit = js.native
    def navigate(destination: js.Array[Double], options: LaunchNavigatorOptions): Unit = js.native
    
    /**
      * Indicates if an app on a given platform supports specification of a custom nickname for destination location.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {boolean} - true if app/platform combination supports specification of destination location.
      */
    def supportsDestName(app: String, platform: String): Boolean = js.native
    
    /**
      * Indicates if an app on a given platform supports specification of launch mode.
      * Note that currently only Google Maps on Android does.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.ANDROID`.
      * @return {boolean} - true if app/platform combination supports specification of transport mode.
      */
    def supportsLaunchMode(app: String, platform: String): Boolean = js.native
    
    /**
      * Indicates if an app on a given platform supports specification of start location.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {boolean} - true if app/platform combination supports specification of start location.
      */
    def supportsStart(app: String, platform: String): Boolean = js.native
    
    /**
      * Indicates if an app on a given platform supports specification of a custom nickname for start location.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {boolean} - true if app/platform combination supports specification of start location.
      */
    def supportsStartName(app: String, platform: String): Boolean = js.native
    
    /**
      * Indicates if an app on a given platform supports specification of transport mode.
      * @param {string} app - specified as a constant in `launchnavigator.APP`. e.g. `launchnavigator.APP.GOOGLE_MAPS`.
      * @param {string} platform - specified as a constant in `launchnavigator.PLATFORM`. e.g. `launchnavigator.PLATFORM.IOS`.
      * @return {boolean} - true if app/platform combination supports specification of transport mode.
      */
    def supportsTransportMode(app: String, platform: String): Boolean = js.native
    
    /**
      * Triggers the native dialog picker for user to choose wich app to use.
      * @param {string/number[]} destination (required) - destination location to use for navigation - see launchnavigator.navigate()
      * @param {object} options (optional) - optional parameters - see launchnavigator.navigate()
      * @param {Function} successCallback (optional) - optional callback to be invoked on success
      * @param {Function} errorCallback (optional) - optional callback to be invoked on error
      */
    def userSelect(destination: String, options: LaunchNavigatorOptions): Unit = js.native
    def userSelect(destination: js.Array[Double], options: LaunchNavigatorOptions): Unit = js.native
  }
  
  trait PromptsOptions extends StObject {
    
    /**
      * text to display in the native prompt body asking user whether to remember their choice.
      * Defaults to "Use the same app for navigating next time?" if not specified.
      */
    var bodyText: js.UndefOr[String] = js.undefined
    
    /**
      * a function to pass the user's decision whether to remember their choice of app.
      * This will be passed a single boolean value indicating the user's decision.
      * @param rememberChoice
      */
    var callback: js.UndefOr[js.Function1[/* rememberChoice */ Boolean, Unit]] = js.undefined
    
    /**
      * text to display in the native prompt header asking user whether to remember their choice.
      * Defaults to "Remember your choice?" if not specified.
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /**
      * text to display for the No button.
      * Defaults to "No" if not specified.
      */
    var noButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * text to display for the Yes button.
      * Defaults to "Yes" if not specified.
      */
    var yesButtonText: js.UndefOr[String] = js.undefined
  }
  object PromptsOptions {
    
    @scala.inline
    def apply(): PromptsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptsOptions]
    }
    
    @scala.inline
    implicit class PromptsOptionsMutableBuilder[Self <: PromptsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyText(value: String): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTextUndefined: Self = StObject.set(x, "bodyText", js.undefined)
      
      @scala.inline
      def setCallback(value: /* rememberChoice */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setNoButtonText(value: String): Self = StObject.set(x, "noButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoButtonTextUndefined: Self = StObject.set(x, "noButtonText", js.undefined)
      
      @scala.inline
      def setYesButtonText(value: String): Self = StObject.set(x, "yesButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesButtonTextUndefined: Self = StObject.set(x, "yesButtonText", js.undefined)
    }
  }
  
  trait RememberChoiceOptions extends StObject {
    
    /**
      * whether to remember user choice of app for next time, instead of asking again for user choice.
      * `"prompt"` - Prompt user to decide whether to remember choice.
      *  - Default value if unspecified.
      *  - If `promptFn` is defined, this will be used for user confirmation.
      *  - Otherwise (by default), a native dialog will be displayed to ask user.
      * `false` - Do not remember user choice.
      * `true` - Remember user choice.
      */
    var enabled: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * options related to the default dialog prompt used to ask the user whether to remember their choice of app.
      */
    var prompt: js.UndefOr[PromptsOptions] = js.undefined
    
    /**
      * a function which asks the user whether to remember their choice of app.
      * If this is defined, then the default dialog prompt will not be shown, allowing for a custom UI for asking the user.
      * This will be passed a callback function which should be invoked with a single boolean argument which indicates the user's decision to remember their choice.
      * @param callback
      */
    var promptFn: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* rememberChoice */ Boolean, Unit], Unit]
      ] = js.undefined
  }
  object RememberChoiceOptions {
    
    @scala.inline
    def apply(): RememberChoiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RememberChoiceOptions]
    }
    
    @scala.inline
    implicit class RememberChoiceOptionsMutableBuilder[Self <: RememberChoiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean | String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPrompt(value: PromptsOptions): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptFn(value: /* callback */ js.Function1[/* rememberChoice */ Boolean, Unit] => Unit): Self = StObject.set(x, "promptFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPromptFnUndefined: Self = StObject.set(x, "promptFn", js.undefined)
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    }
  }
  
  trait UserChoice extends StObject {
    
    /**
      * Clears the current user choice of preferred navigator app.
      * @param callback - function to call once operation is complete.
      */
    def clear(callback: js.Function0[Unit]): Unit
    
    /**
      * Indicates whether a user choice exists for a preferred navigator app.
      * @param callback - function to pass result to: will receive a boolean argument.
      */
    def exists(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
    
    /**
      * Returns current user choice of preferred navigator app.
      * @param callback - function to pass result to: will receive a string argument indicating the app, which is a constant in `launchnavigator.APP`.
      */
    def get(callback: js.Function1[/* app */ String, Unit]): Unit
    
    /**
      * Sets the current user choice of preferred navigator app.
      * @param app - app to set as preferred choice as a constant in `launchnavigator.APP`.
      * @param callback - function to call once operation is complete.
      */
    def set(app: String, callback: js.Function0[Unit]): Unit
  }
  object UserChoice {
    
    @scala.inline
    def apply(
      clear: js.Function0[Unit] => Unit,
      exists: js.Function1[/* exists */ Boolean, Unit] => Unit,
      get: js.Function1[/* app */ String, Unit] => Unit,
      set: (String, js.Function0[Unit]) => Unit
    ): UserChoice = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), exists = js.Any.fromFunction1(exists), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[UserChoice]
    }
    
    @scala.inline
    implicit class UserChoiceMutableBuilder[Self <: UserChoice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExists(value: js.Function1[/* exists */ Boolean, Unit] => Unit): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: js.Function1[/* app */ String, Unit] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait UserPrompted extends StObject {
    
    /**
      * Clears flag which indicates if user has already been prompted whether to remember their choice a preferred navigator app.
      * @param callback - function to call once operation is complete.
      */
    def clear(callback: js.Function0[Unit]): Unit
    
    /**
      * Indicates whether user has already been prompted whether to remember their choice a preferred navigator app.
      * @param callback - function to pass result to: will receive a boolean argument.
      */
    def get(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
    
    /**
      * Sets flag indicating user has already been prompted whether to remember their choice a preferred navigator app.
      * @param callback - function to call once operation is complete.
      */
    def set(callback: js.Function0[Unit]): Unit
  }
  object UserPrompted {
    
    @scala.inline
    def apply(
      clear: js.Function0[Unit] => Unit,
      get: js.Function1[/* exists */ Boolean, Unit] => Unit,
      set: js.Function0[Unit] => Unit
    ): UserPrompted = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[UserPrompted]
    }
    
    @scala.inline
    implicit class UserPromptedMutableBuilder[Self <: UserPrompted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: js.Function1[/* exists */ Boolean, Unit] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
