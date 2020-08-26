package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSelectionOptions extends js.Object {
  /**
    * (Android only) native picker theme. Specify using `actionsheet.ANDROID_THEMES` constants.
    * Default `actionsheet.ANDROID_THEMES.THEME_HOLO_LIGHT`
    */
  var androidTheme: js.UndefOr[Double] = js.native
  /**
    * Callback to invoke when the user selects an app in the native picker.
    * A single string argument is passed which is the app what was selected defined as a `launchnavigator.APP` constant.
    */
  var callback: js.UndefOr[js.Function1[/* app */ String, Unit]] = js.native
  /**
    * text to display for the cancel button in the native picker which enables user to select which navigation app to launch.
    * Defaults to "Cancel" if not specified.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  /**
    * text to display in the native picker which enables user to select which navigation app to launch.
    * Defaults to "Select app for navigation" if not specified.
    */
  var dialogHeaderText: js.UndefOr[String] = js.native
  /**
    * List of apps, defined as `launchnavigator.APP` constants, which should be displayed in the picker if the app is available.
    * This can be used to restrict which apps are displayed, even if they are installed.
    * By default, all available apps will be displayed.
    */
  var list: js.UndefOr[js.Array[String]] = js.native
  /**
    * options related to whether to remember user choice of app for next time, instead of asking again for user choice.
    */
  var rememberChoice: js.UndefOr[RememberChoiceOptions] = js.native
}

object AppSelectionOptions {
  @scala.inline
  def apply(): AppSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSelectionOptions]
  }
  @scala.inline
  implicit class AppSelectionOptionsOps[Self <: AppSelectionOptions] (val x: Self) extends AnyVal {
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
    def setAndroidTheme(value: Double): Self = this.set("androidTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidTheme: Self = this.set("androidTheme", js.undefined)
    @scala.inline
    def setCallback(value: /* app */ String => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    @scala.inline
    def setDialogHeaderText(value: String): Self = this.set("dialogHeaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogHeaderText: Self = this.set("dialogHeaderText", js.undefined)
    @scala.inline
    def setListVarargs(value: String*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[String]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setRememberChoice(value: RememberChoiceOptions): Self = this.set("rememberChoice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRememberChoice: Self = this.set("rememberChoice", js.undefined)
  }
  
}

