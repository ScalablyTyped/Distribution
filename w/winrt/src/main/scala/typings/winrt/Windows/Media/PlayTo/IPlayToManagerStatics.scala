package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToManagerStatics extends js.Object {
  def getForCurrentView(): PlayToManager = js.native
  def showPlayToUI(): Unit = js.native
}

object IPlayToManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
  @scala.inline
  implicit class IPlayToManagerStaticsOps[Self <: IPlayToManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetForCurrentView(value: () => PlayToManager): Self = this.set("getForCurrentView", js.Any.fromFunction0(value))
    @scala.inline
    def setShowPlayToUI(value: () => Unit): Self = this.set("showPlayToUI", js.Any.fromFunction0(value))
  }
  
}

