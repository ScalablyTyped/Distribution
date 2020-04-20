package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxPanelElement extends js.Object {
  def hide(): Unit
  def show(index: Double): Unit
  def startAutoplay(): Unit
  def stopAutoplay(): Unit
}

object UIkitLightboxPanelElement {
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
}

