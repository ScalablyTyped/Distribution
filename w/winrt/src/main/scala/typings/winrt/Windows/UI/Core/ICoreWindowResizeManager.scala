package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowResizeManager extends js.Object {
  def notifyLayoutCompleted(): Unit
}

object ICoreWindowResizeManager {
  @scala.inline
  def apply(notifyLayoutCompleted: () => Unit): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
}

