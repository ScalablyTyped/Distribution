package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncherUIOptions extends js.Object {
  var invocationPoint: winrtLib.WindowsNs.FoundationNs.Point
  var preferredPlacement: winrtLib.WindowsNs.UINs.PopupsNs.Placement
  var selectionRect: winrtLib.WindowsNs.FoundationNs.Rect
}

object ILauncherUIOptions {
  @scala.inline
  def apply(
    invocationPoint: winrtLib.WindowsNs.FoundationNs.Point,
    preferredPlacement: winrtLib.WindowsNs.UINs.PopupsNs.Placement,
    selectionRect: winrtLib.WindowsNs.FoundationNs.Rect
  ): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invocationPoint")(invocationPoint)
    __obj.updateDynamic("preferredPlacement")(preferredPlacement)
    __obj.updateDynamic("selectionRect")(selectionRect)
    __obj.asInstanceOf[ILauncherUIOptions]
  }
}

