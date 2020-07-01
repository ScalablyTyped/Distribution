package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentOptions extends js.Object {
  /**
    * An optional string to show as placeholder in the comment input box when it's focused.
    */
  var placeHolder: js.UndefOr[String] = js.undefined
  /**
    * An optional string to show on the comment input box when it's collapsed.
    */
  var prompt: js.UndefOr[String] = js.undefined
}

object CommentOptions {
  @scala.inline
  def apply(placeHolder: String = null, prompt: String = null): CommentOptions = {
    val __obj = js.Dynamic.literal()
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentOptions]
  }
}

