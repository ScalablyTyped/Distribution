package typings.useDashDarkDashMode.useDashDarkDashModeMod

import typings.std.HTMLElement
import typings.std.Window
import typings.std.WindowLocalStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkModeConfig extends js.Object {
  var classNameDark: js.UndefOr[String] = js.undefined
   // A className to set "dark mode". Default = "dark-mode".
  var classNameLight: js.UndefOr[String] = js.undefined
   // A className to set "light mode". Default = "light-mode".
  var element: js.UndefOr[HTMLElement] = js.undefined
   // A storage provider. Default = `localStorage`.
  var global: js.UndefOr[Window] = js.undefined
   // The element to apply the className. Default = `document.body`
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[Boolean], Unit]] = js.undefined
   // Overide the default className handler with a custom callback.
  var storageKey: js.UndefOr[String] = js.undefined
   // Specify the `localStorage` key. Default = "darkMode". Sewt to `null` to disable persistent storage.
  var storageProvider: js.UndefOr[WindowLocalStorage] = js.undefined
}

object DarkModeConfig {
  @scala.inline
  def apply(
    classNameDark: String = null,
    classNameLight: String = null,
    element: HTMLElement = null,
    global: Window = null,
    onChange: /* val */ js.UndefOr[Boolean] => Unit = null,
    storageKey: String = null,
    storageProvider: WindowLocalStorage = null
  ): DarkModeConfig = {
    val __obj = js.Dynamic.literal()
    if (classNameDark != null) __obj.updateDynamic("classNameDark")(classNameDark.asInstanceOf[js.Any])
    if (classNameLight != null) __obj.updateDynamic("classNameLight")(classNameLight.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    if (storageProvider != null) __obj.updateDynamic("storageProvider")(storageProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkModeConfig]
  }
}

