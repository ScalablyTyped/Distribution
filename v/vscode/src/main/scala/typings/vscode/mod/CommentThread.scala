package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentThread extends js.Object {
  
  /**
    * Whether the thread supports reply.
    * Defaults to true.
    */
  var canReply: Boolean = js.native
  
  /**
    * Whether the thread should be collapsed or expanded when opening the document.
    * Defaults to Collapsed.
    */
  var collapsibleState: CommentThreadCollapsibleState = js.native
  
  /**
    * The ordered comments of the thread.
    */
  var comments: js.Array[Comment] = js.native
  
  /**
    * Context value of the comment thread. This can be used to contribute thread specific actions.
    * For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
    * using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
    * ```
    *    "contributes": {
    *        "menus": {
    *            "comments/commentThread/title": [
    *                {
    *                    "command": "extension.deleteCommentThread",
    *                    "when": "commentThread == editable"
    *                }
    *            ]
    *        }
    *    }
    * ```
    * This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`.
    */
  var contextValue: js.UndefOr[String] = js.native
  
  /**
    * Dispose this comment thread.
    *
    * Once disposed, this comment thread will be removed from visible editors and Comment Panel when appropriate.
    */
  def dispose(): Unit = js.native
  
  /**
    * The optional human-readable label describing the [Comment Thread](#CommentThread)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The range the comment thread is located within the document. The thread icon will be shown
    * at the first line of the range.
    */
  var range: Range = js.native
  
  /**
    * The uri of the document the thread has been created on.
    */
  val uri: Uri = js.native
}
object CommentThread {
  
  @scala.inline
  def apply(
    canReply: Boolean,
    collapsibleState: CommentThreadCollapsibleState,
    comments: js.Array[Comment],
    dispose: () => Unit,
    range: Range,
    uri: Uri
  ): CommentThread = {
    val __obj = js.Dynamic.literal(canReply = canReply.asInstanceOf[js.Any], collapsibleState = collapsibleState.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
  
  @scala.inline
  implicit class CommentThreadOps[Self <: CommentThread] (val x: Self) extends AnyVal {
    
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
    def setCanReply(value: Boolean): Self = this.set("canReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleState(value: CommentThreadCollapsibleState): Self = this.set("collapsibleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValue(value: String): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
