package typings.useDashDarkDashMode.useDashDarkDashModeMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-dark-mode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * A custom React Hook to help you implement a "dark mode" component for
    * your application. The user setting persists to `localStorage` by default.
    *
    * `useDarkMode` works in one of two ways:
    * 1. By toggling a CSS class on whatever element you specify (defaults to
    *    `document.body`). You then setup your CSS to display different views
    *    based on the presence of the selector.
    * 2. If you don't use global classes, you can specify an `onChange` handler
    *    and take care of the implementation of switching to dark mode
    *    yourself.
    *
    * @param initialState Specifies whether it should be in dark mode by defualt.
    * @param darkModeConfig Optional configuration.
    */
  def default(initialState: Boolean): DarkMode = js.native
  def default(initialState: Boolean, darkModeConfig: Partial[DarkModeConfig]): DarkMode = js.native
}

