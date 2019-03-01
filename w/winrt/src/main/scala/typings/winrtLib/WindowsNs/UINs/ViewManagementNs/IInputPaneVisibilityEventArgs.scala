package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPaneVisibilityEventArgs extends js.Object {
  var ensuredFocusedElementInView: scala.Boolean
  var occludedRect: winrtLib.WindowsNs.FoundationNs.Rect
}

object IInputPaneVisibilityEventArgs {
  @scala.inline
  def apply(ensuredFocusedElementInView: scala.Boolean, occludedRect: winrtLib.WindowsNs.FoundationNs.Rect): IInputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ensuredFocusedElementInView")(ensuredFocusedElementInView)
    __obj.updateDynamic("occludedRect")(occludedRect)
    __obj.asInstanceOf[IInputPaneVisibilityEventArgs]
  }
}

