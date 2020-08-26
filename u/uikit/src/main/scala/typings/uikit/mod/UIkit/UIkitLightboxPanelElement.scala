package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitLightboxPanelElement extends js.Object {
  def hide(): Unit = js.native
  def show(index: Double): Unit = js.native
  def startAutoplay(): Unit = js.native
  def stopAutoplay(): Unit = js.native
}

object UIkitLightboxPanelElement {
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
  @scala.inline
  implicit class UIkitLightboxPanelElementOps[Self <: UIkitLightboxPanelElement] (val x: Self) extends AnyVal {
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: Double => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def setStartAutoplay(value: () => Unit): Self = this.set("startAutoplay", js.Any.fromFunction0(value))
    @scala.inline
    def setStopAutoplay(value: () => Unit): Self = this.set("stopAutoplay", js.Any.fromFunction0(value))
  }
  
}

