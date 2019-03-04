package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToManagerStatics extends js.Object {
  def getForCurrentView(): PlayToManager
  def showPlayToUI(): scala.Unit
}

object IPlayToManagerStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[PlayToManager], showPlayToUI: js.Function0[scala.Unit]): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView, showPlayToUI = showPlayToUI)
  
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
}

