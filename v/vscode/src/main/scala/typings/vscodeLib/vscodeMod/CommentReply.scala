package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReply extends js.Object {
  /**
  		 * The value in the comment editor
  		 */
  var text: java.lang.String
  /**
  		 * The active [comment thread](#CommentThread)
  		 */
  var thread: CommentThread
}

object CommentReply {
  @scala.inline
  def apply(text: java.lang.String, thread: CommentThread): CommentReply = {
    val __obj = js.Dynamic.literal(text = text, thread = thread)
  
    __obj.asInstanceOf[CommentReply]
  }
}

