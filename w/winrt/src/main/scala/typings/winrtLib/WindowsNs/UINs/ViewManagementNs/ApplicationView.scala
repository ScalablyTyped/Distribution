package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
class ApplicationView () extends js.Object {
  /**
  			 * Gets whether the current window (app view) is adjacent to the left edge of the screen.
  			**/
  var adjacentToLeftDisplayEdge: scala.Double = js.native
  /**
  			 * Gets whether the current window (app view) is adjacent to the right edge of the screen.
  			**/
  var adjacentToRightDisplayEdge: scala.Boolean = js.native
  /**
  			 * Gets the current ID of the window (app view) .
  			**/
  var id: scala.Double = js.native
  /**
  			 * Gets whether the window(app view) is full screen or not.
  			**/
  var isFullScreen: scala.Boolean = js.native
  /**
  			 * Gets whether the window (app view) is on the Windows lock screen.
  			**/
  var isOnLockScreen: scala.Boolean = js.native
  /**
  			 * Gets or sets whether screen capture is enabled for the window (app view).
  			**/
  var isScreenCaptureEnabled: scala.Boolean = js.native
  /**
  			 * Gets the current orientation of the window (app view) with respect to the display.
  			**/
  var orientation: ApplicationViewOrientation = js.native
  /**
  			 * Gets or sets the displayed title of the window.
  			**/
  var title: java.lang.String = js.native
  /**
  			 * Gets the title bar of the app.
  			**/
  var titleBar: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ApplicationViewTitleBar */ js.Any = js.native
}

@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
object ApplicationView extends js.Object {
  /**
  			 * Indicates whether the app terminates when the last window is closed.
  			**/
  var terminateAppOnFinalViewClose: scala.Boolean = js.native
  /**
  			 * Gets the state of the current app view.
  			**/
  var value: winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState = js.native
  /**
  			 * Gets the window (app view) for the current app.
  			**/
  def getForCurrentView(): winrtLib.WindowsNs.UINs.ViewManagementNs.ApplicationView = js.native
  /**
  			 * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
  			**/
  def tryUnsnap(): scala.Boolean = js.native
}

