package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
abstract class AppCaptureManager ()
  extends typings.winrtUwp.Windows.Media.Capture.AppCaptureManager

/* static members */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
object AppCaptureManager extends js.Object {
  /**
    * Applies app capture settings.
    * @param appCaptureSettings The settings to apply.
    */
  def applySettings(appCaptureSettings: typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings): Unit = js.native
  /**
    * Gets the current app capture settings.
    * @return The current app capture settings.
    */
  def getCurrentSettings(): typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings = js.native
}

