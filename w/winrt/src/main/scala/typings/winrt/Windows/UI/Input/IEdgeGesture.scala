package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGesture extends js.Object {
  var oncanceled: js.Any
  var oncompleted: js.Any
  var onstarting: js.Any
}

object IEdgeGesture {
  @scala.inline
  def apply(oncanceled: js.Any, oncompleted: js.Any, onstarting: js.Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled, oncompleted = oncompleted, onstarting = onstarting)
  
    __obj.asInstanceOf[IEdgeGesture]
  }
}

