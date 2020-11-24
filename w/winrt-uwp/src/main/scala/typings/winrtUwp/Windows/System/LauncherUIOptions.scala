package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@js.native
trait LauncherUIOptions extends js.Object {
  
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: Point = js.native
  
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: Placement = js.native
  
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: Rect = js.native
}
object LauncherUIOptions {
  
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): LauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherUIOptions]
  }
  
  @scala.inline
  implicit class LauncherUIOptionsOps[Self <: LauncherUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvocationPoint(value: Point): Self = this.set("invocationPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPlacement(value: Placement): Self = this.set("preferredPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRect(value: Rect): Self = this.set("selectionRect", value.asInstanceOf[js.Any])
  }
}
