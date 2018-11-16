package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement.ActivationViewSwitcher")
@js.native
abstract class ActivationViewSwitcher () extends js.Object {
  var isViewPresentedOnActivationVirtualDesktop: js.Any = js.native
  /**
                   * Shows the view in a new standalone window.
                   * @param viewId The identifier for the view.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def showAsStandaloneAsync(viewId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
   /* unmapped type *//**
                   * Shows the view in a new standalone window and sets the size preference for the view.
                   * @param viewId The identifier for the view.
                   * @param sizePreference The preferred size of the view.
                   * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
                   */
  def showAsStandaloneAsync(viewId: scala.Double, sizePreference: ViewSizePreference): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

