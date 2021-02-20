package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
abstract class AppCaptureManager ()
  extends typings.winrtUwp.Windows.Media.Capture.AppCaptureManager
object AppCaptureManager {
  
  /**
    * Applies app capture settings.
    * @param appCaptureSettings The settings to apply.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.AppCaptureManager.applySettings")
  @js.native
  def applySettings(appCaptureSettings: typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings): Unit = js.native
  
  /**
    * Gets the current app capture settings.
    * @return The current app capture settings.
    */
  /* static member */
  @JSGlobal("Windows.Media.Capture.AppCaptureManager.getCurrentSettings")
  @js.native
  def getCurrentSettings(): typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings = js.native
}
