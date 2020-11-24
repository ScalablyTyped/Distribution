package typings.winrtUwp.global.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the active application view and associated states and behaviors. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
abstract class ApplicationView ()
  extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView
/* static members */
@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
object ApplicationView extends js.Object {
  
  /**
    * Gets the view state and behavior settings of the active application.
    * @return An ApplicationView instance that can be used to get and set app display properties.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView = js.native
  
  /** Gets or sets the size the app launches with if no view size is remembered by Windows. */
  var preferredLaunchViewSize: Size = js.native
  
  /** Gets or sets a value that indicates the windowing mode the app launches with. */
  var preferredLaunchWindowingMode: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode = js.native
  
  /** Indicates whether the app terminates when the last window is closed. */
  var terminateAppOnFinalViewClose: Boolean = js.native
  
  /**
    * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
    * @return true if the app has been successfully unsnapped; false if the unsnap attempt failed.
    */
  def tryUnsnap(): Boolean = js.native
  
  var tryUnsnapToFullscreen: js.Any = js.native
  
   /* unmapped type */ /** Gets the state of the current window (app view). */
  var value: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState = js.native
}
