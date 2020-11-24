package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentReply extends js.Object {
  
  /**
    * The value in the comment editor
    */
  var text: String = js.native
  
  /**
    * The active [comment thread](#CommentThread)
    */
  var thread: CommentThread = js.native
}
object CommentReply {
  
  @scala.inline
  def apply(text: String, thread: CommentThread): CommentReply = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReply]
  }
  
  @scala.inline
  implicit class CommentReplyOps[Self <: CommentReply] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread(value: CommentThread): Self = this.set("thread", value.asInstanceOf[js.Any])
  }
}
