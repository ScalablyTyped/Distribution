package typings.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationExit extends js.Object {
  var onexiting: js.Any
  def exit(): Unit
}

object ICoreApplicationExit {
  @scala.inline
  def apply(exit: () => Unit, onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), onexiting = onexiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreApplicationExit]
  }
}

