package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
abstract class AppCaptureManager () extends js.Object

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
object AppCaptureManager extends js.Object {
  /**
                   * Applies app capture settings.
                   * @param appCaptureSettings The settings to apply.
                   */
  def applySettings(appCaptureSettings: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureSettings): scala.Unit = js.native
  /**
                   * Gets the current app capture settings.
                   * @return The current app capture settings.
                   */
  def getCurrentSettings(): winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.AppCaptureSettings = js.native
}

