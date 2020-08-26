package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorDecorationType extends js.Object {
  /**
    * Internal representation of the handle.
    */
  val key: String = js.native
  /**
    * Remove this decoration type and all decorations on all text editors using it.
    */
  def dispose(): Unit = js.native
}

object TextEditorDecorationType {
  @scala.inline
  def apply(dispose: () => Unit, key: String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorDecorationType]
  }
  @scala.inline
  implicit class TextEditorDecorationTypeOps[Self <: TextEditorDecorationType] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

