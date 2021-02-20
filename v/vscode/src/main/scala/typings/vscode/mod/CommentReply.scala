package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentReply extends StObject {
  
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
  implicit class CommentReplyMutableBuilder[Self <: CommentReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread(value: CommentThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
  }
}
