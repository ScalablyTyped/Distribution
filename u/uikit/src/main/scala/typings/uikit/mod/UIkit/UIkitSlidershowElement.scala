package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSlidershowElement extends js.Object {
  def show(index: Double): Unit
  def startAutoplay(): Unit
  def stopAutoplay(): Unit
}

object UIkitSlidershowElement {
  @scala.inline
  def apply(show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitSlidershowElement = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitSlidershowElement]
  }
}

