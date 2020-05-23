package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFileDialog extends js.Object {
  def openFileDialog(): Unit
}

object OpenFileDialog {
  @scala.inline
  def apply(openFileDialog: () => Unit): OpenFileDialog = {
    val __obj = js.Dynamic.literal(openFileDialog = js.Any.fromFunction0(openFileDialog))
    __obj.asInstanceOf[OpenFileDialog]
  }
}

