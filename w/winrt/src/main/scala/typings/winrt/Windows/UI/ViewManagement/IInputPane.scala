package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPane extends js.Object {
  var occludedRect: Rect
  var onhiding: js.Any
  var onshowing: js.Any
}

object IInputPane {
  @scala.inline
  def apply(occludedRect: Rect, onhiding: js.Any, onshowing: js.Any): IInputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect, onhiding = onhiding, onshowing = onshowing)
  
    __obj.asInstanceOf[IInputPane]
  }
}

