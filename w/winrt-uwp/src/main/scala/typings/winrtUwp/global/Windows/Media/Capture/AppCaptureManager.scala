package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to app capture settings. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
open class AppCaptureManager ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.AppCaptureManager
object AppCaptureManager {
  
  @JSGlobal("Windows.Media.Capture.AppCaptureManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies app capture settings.
    * @param appCaptureSettings The settings to apply.
    */
  /* static member */
  inline def applySettings(appCaptureSettings: typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(appCaptureSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets the current app capture settings.
    * @return The current app capture settings.
    */
  /* static member */
  inline def getCurrentSettings(): typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentSettings")().asInstanceOf[typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings]
}
