package typings.winrt.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGestureEventArgs extends js.Object {
  var kind: EdgeGestureKind
}

object IEdgeGestureEventArgs {
  @scala.inline
  def apply(kind: EdgeGestureKind): IEdgeGestureEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind)
  
    __obj.asInstanceOf[IEdgeGestureEventArgs]
  }
}

