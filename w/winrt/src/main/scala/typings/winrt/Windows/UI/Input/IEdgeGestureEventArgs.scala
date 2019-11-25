package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGestureEventArgs extends js.Object {
  var kind: EdgeGestureKind
}

object IEdgeGestureEventArgs {
  @scala.inline
  def apply(kind: EdgeGestureKind): IEdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEdgeGestureEventArgs]
  }
}

