package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
@js.native
trait CoreTextLayoutBounds extends js.Object {
  
  /** Gets or sets the bounding box in screen coordinates of a text input control. */
  var controlBounds: Rect = js.native
  
  /** Gets or sets the bounding box in screen coordinates of a range of text. */
  var textBounds: Rect = js.native
}
object CoreTextLayoutBounds {
  
  @scala.inline
  def apply(controlBounds: Rect, textBounds: Rect): CoreTextLayoutBounds = {
    val __obj = js.Dynamic.literal(controlBounds = controlBounds.asInstanceOf[js.Any], textBounds = textBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutBounds]
  }
  
  @scala.inline
  implicit class CoreTextLayoutBoundsOps[Self <: CoreTextLayoutBounds] (val x: Self) extends AnyVal {
    
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
    def setControlBounds(value: Rect): Self = this.set("controlBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBounds(value: Rect): Self = this.set("textBounds", value.asInstanceOf[js.Any])
  }
}
