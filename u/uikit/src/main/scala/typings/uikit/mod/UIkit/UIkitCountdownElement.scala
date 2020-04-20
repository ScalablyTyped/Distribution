package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitCountdownElement extends js.Object {
  def start(): Unit
  def stop(): Unit
}

object UIkitCountdownElement {
  @scala.inline
  def apply(start: () => Unit, stop: () => Unit): UIkitCountdownElement = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[UIkitCountdownElement]
  }
}

