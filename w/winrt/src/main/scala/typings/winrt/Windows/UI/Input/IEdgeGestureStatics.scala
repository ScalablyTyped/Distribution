package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGestureStatics extends js.Object {
  def getForCurrentView(): EdgeGesture
}

object IEdgeGestureStatics {
  @scala.inline
  def apply(getForCurrentView: () => EdgeGesture): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
  
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
}

