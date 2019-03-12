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
  def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => scala.Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
  
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
}

