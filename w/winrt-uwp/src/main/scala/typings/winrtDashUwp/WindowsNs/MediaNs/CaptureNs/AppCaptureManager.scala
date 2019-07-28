package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
abstract class AppCaptureManager () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
object AppCaptureManager extends js.Object {
  /**
    * Applies app capture settings.
    * @param appCaptureSettings The settings to apply.
    */
  def applySettings(appCaptureSettings: AppCaptureSettings): Unit = js.native
  /**
    * Gets the current app capture settings.
    * @return The current app capture settings.
    */
  def getCurrentSettings(): AppCaptureSettings = js.native
}

