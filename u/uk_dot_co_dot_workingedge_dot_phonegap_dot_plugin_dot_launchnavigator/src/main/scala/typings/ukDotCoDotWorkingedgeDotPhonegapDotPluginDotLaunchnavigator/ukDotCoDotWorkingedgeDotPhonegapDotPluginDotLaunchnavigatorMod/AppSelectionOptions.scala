package typings.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigator.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppSelectionOptions extends js.Object {
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
  def apply(
    androidTheme: Int | Double = null,
    callback: /* app */ String => Unit = null,
    cancelButtonText: String = null,
    dialogHeaderText: String = null,
    list: js.Array[String] = null,
    rememberChoice: RememberChoiceOptions = null
  ): AppSelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (androidTheme != null) __obj.updateDynamic("androidTheme")(androidTheme.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (dialogHeaderText != null) __obj.updateDynamic("dialogHeaderText")(dialogHeaderText.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (rememberChoice != null) __obj.updateDynamic("rememberChoice")(rememberChoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSelectionOptions]
  }
}

