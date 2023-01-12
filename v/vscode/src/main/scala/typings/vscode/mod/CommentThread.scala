package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThread extends StObject {
  
  /**
    * Whether the thread supports reply.
    * Defaults to true.
    */
  var canReply: Boolean
  
  /**
    * Whether the thread should be collapsed or expanded when opening the document.
    * Defaults to Collapsed.
    */
  var collapsibleState: CommentThreadCollapsibleState
  
  /**
    * The ordered comments of the thread.
    */
  var comments: js.Array[Comment]
  
  /**
    * Context value of the comment thread. This can be used to contribute thread specific actions.
    * For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
    * using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
    * ```json
    * "contributes": {
    *   "menus": {
    *     "comments/commentThread/title": [
    *       {
    *         "command": "extension.deleteCommentThread",
    *         "when": "commentThread == editable"
    *       }
    *     ]
    *   }
    * }
    * ```
    * This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`.
    */
  var contextValue: js.UndefOr[String] = js.undefined
  
  /**
    * Dispose this comment thread.
    *
    * Once disposed, this comment thread will be removed from visible editors and Comment Panel when appropriate.
    */
  def dispose(): Unit
  
  /**
    * The optional human-readable label describing the {@link CommentThread Comment Thread}
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The range the comment thread is located within the document. The thread icon will be shown
    * at the last line of the range.
    */
  var range: Range
  
  /**
    * The uri of the document the thread has been created on.
    */
  val uri: Uri
}
object CommentThread {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CommentThread] (val x: Self) extends AnyVal {
    
    inline def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleState(value: CommentThreadCollapsibleState): Self = StObject.set(x, "collapsibleState", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    inline def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
