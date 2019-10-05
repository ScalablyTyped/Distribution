package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToManagerStatics extends js.Object {
  def getForCurrentView(): PlayToManager
  def showPlayToUI(): Unit
}

object IPlayToManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
  
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
}

