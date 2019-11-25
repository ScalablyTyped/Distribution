package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThread extends js.Object {
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
  		 * ```
  		 *	"contributes": {
  		 *		"menus": {
  		 *			"comments/commentThread/title": [
  		 *				{
  		 *					"command": "extension.deleteCommentThread",
  		 *					"when": "commentThread == editable"
  		 *				}
  		 *			]
  		 *		}
  		 *	}
  		 * ```
  		 * This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`.
  		 */
  var contextValue: js.UndefOr[String] = js.undefined
  /**
  		 * The optional human-readable label describing the [Comment Thread](#CommentThread)
  		 */
  var label: js.UndefOr[String] = js.undefined
  /**
  		 * The range the comment thread is located within the document. The thread icon will be shown
  		 * at the first line of the range.
  		 */
  var range: Range
  /**
  		 * The uri of the document the thread has been created on.
  		 */
  val uri: Uri
  /**
  		 * Dispose this comment thread.
  		 *
  		 * Once disposed, this comment thread will be removed from visible editors and Comment Panel when approriate.
  		 */
  def dispose(): Unit
}

object CommentThread {
  @scala.inline
  def apply(
    collapsibleState: CommentThreadCollapsibleState,
    comments: js.Array[Comment],
    dispose: () => Unit,
    range: Range,
    uri: Uri,
    contextValue: String = null,
    label: String = null
  ): CommentThread = {
    val __obj = js.Dynamic.literal(collapsibleState = collapsibleState.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
}

