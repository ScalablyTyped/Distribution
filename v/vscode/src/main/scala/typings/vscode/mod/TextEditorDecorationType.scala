package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorDecorationType extends js.Object {
  /**
    * Internal representation of the handle.
    */
  val key: String
  /**
    * Remove this decoration type and all decorations on all text editors using it.
    */
  def dispose(): Unit
}

object TextEditorDecorationType {
  @scala.inline
  def apply(dispose: () => Unit, key: String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorDecorationType]
  }
}

