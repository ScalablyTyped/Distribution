package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReply extends js.Object {
  /**
  		 * The value in the comment editor
  		 */
  var text: String
  /**
  		 * The active [comment thread](#CommentThread)
  		 */
  var thread: CommentThread
}

object CommentReply {
  @scala.inline
  def apply(text: String, thread: CommentThread): CommentReply = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReply]
  }
}

