package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGestureStatics extends js.Object {
  def getForCurrentView(): EdgeGesture
}

object IEdgeGestureStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[EdgeGesture]): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView)
  
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
}

