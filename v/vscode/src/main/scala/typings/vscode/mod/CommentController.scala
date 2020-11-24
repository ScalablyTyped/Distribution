package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentController extends js.Object {
  
  /**
    * Optional commenting range provider. Provide a list [ranges](#Range) which support commenting to any given resource uri.
    *
    * If not provided, users can leave comments in any document opened in the editor.
    */
  var commentingRangeProvider: js.UndefOr[CommentingRangeProvider] = js.native
  
  /**
    * Create a [comment thread](#CommentThread). The comment thread will be displayed in visible text editors (if the resource matches)
    * and Comments Panel once created.
    *
    * @param uri The uri of the document the thread has been created on.
    * @param range The range the comment thread is located within the document.
    * @param comments The ordered comments of the thread.
    */
  def createCommentThread(uri: Uri, range: Range, comments: js.Array[Comment]): CommentThread = js.native
  
  /**
    * Dispose this comment controller.
    *
    * Once disposed, all [comment threads](#CommentThread) created by this comment controller will also be removed from the editor
    * and Comments Panel.
    */
  def dispose(): Unit = js.native
  
  /**
    * The id of this comment controller.
    */
  val id: String = js.native
  
  /**
    * The human-readable label of this comment controller.
    */
  val label: String = js.native
  
  /**
    * Comment controller options
    */
  var options: js.UndefOr[CommentOptions] = js.native
  
  /**
    * Optional reaction handler for creating and deleting reactions on a [comment](#Comment).
    */
  var reactionHandler: js.UndefOr[
    js.Function2[/* comment */ Comment, /* reaction */ CommentReaction, js.Promise[Unit]]
  ] = js.native
}
object CommentController {
  
  @scala.inline
  def apply(
    createCommentThread: (Uri, Range, js.Array[Comment]) => CommentThread,
    dispose: () => Unit,
    id: String,
    label: String
  ): CommentController = {
    val __obj = js.Dynamic.literal(createCommentThread = js.Any.fromFunction3(createCommentThread), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentController]
  }
  
  @scala.inline
  implicit class CommentControllerOps[Self <: CommentController] (val x: Self) extends AnyVal {
    
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
    def setCreateCommentThread(value: (Uri, Range, js.Array[Comment]) => CommentThread): Self = this.set("createCommentThread", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentingRangeProvider(value: CommentingRangeProvider): Self = this.set("commentingRangeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentingRangeProvider: Self = this.set("commentingRangeProvider", js.undefined)
    
    @scala.inline
    def setOptions(value: CommentOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setReactionHandler(value: (/* comment */ Comment, /* reaction */ CommentReaction) => js.Promise[Unit]): Self = this.set("reactionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReactionHandler: Self = this.set("reactionHandler", js.undefined)
  }
}
