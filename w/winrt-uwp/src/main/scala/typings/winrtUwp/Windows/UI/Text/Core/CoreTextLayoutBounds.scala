package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
@js.native
trait CoreTextLayoutBounds extends StObject {
  
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
  implicit class CoreTextLayoutBoundsMutableBuilder[Self <: CoreTextLayoutBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlBounds(value: Rect): Self = StObject.set(x, "controlBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBounds(value: Rect): Self = StObject.set(x, "textBounds", value.asInstanceOf[js.Any])
  }
}
