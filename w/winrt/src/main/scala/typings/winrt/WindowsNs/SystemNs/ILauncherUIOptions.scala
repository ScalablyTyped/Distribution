package typings.winrt.WindowsNs.SystemNs

import typings.winrt.WindowsNs.FoundationNs.Point
import typings.winrt.WindowsNs.FoundationNs.Rect
import typings.winrt.WindowsNs.UINs.PopupsNs.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncherUIOptions extends js.Object {
  var invocationPoint: Point
  var preferredPlacement: Placement
  var selectionRect: Rect
}

object ILauncherUIOptions {
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint, preferredPlacement = preferredPlacement, selectionRect = selectionRect)
  
    __obj.asInstanceOf[ILauncherUIOptions]
  }
}

