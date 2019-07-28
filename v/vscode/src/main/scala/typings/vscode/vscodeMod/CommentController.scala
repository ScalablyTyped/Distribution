package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentController extends js.Object {
  /**
  		 * Optional commenting range provider. Provide a list [ranges](#Range) which support commenting to any given resource uri.
  		 *
  		 * If not provided, users can leave comments in any document opened in the editor.
  		 */
  var commentingRangeProvider: js.UndefOr[CommentingRangeProvider] = js.undefined
  /**
  		 * The id of this comment controller.
  		 */
  val id: String
  /**
  		 * The human-readable label of this comment controller.
  		 */
  val label: String
  /**
  		 * Optional reaction handler for creating and deleting reactions on a [comment](#Comment).
  		 */
  var reactionHandler: js.UndefOr[
    js.Function2[/* comment */ Comment, /* reaction */ CommentReaction, js.Promise[Unit]]
  ] = js.undefined
  /**
  		 * Create a [comment thread](#CommentThread). The comment thread will be displayed in visible text editors (if the resource matches)
  		 * and Comments Panel once created.
  		 *
  		 * @param uri The uri of the document the thread has been created on.
  		 * @param range The range the comment thread is located within the document.
  		 * @param comments The ordered comments of the thread.
  		 */
  def createCommentThread(uri: Uri, range: Range, comments: js.Array[Comment]): CommentThread
  /**
  		 * Dispose this comment controller.
  		 *
  		 * Once disposed, all [comment threads](#CommentThread) created by this comment controller will also be removed from the editor
  		 * and Comments Panel.
  		 */
  def dispose(): Unit
}

object CommentController {
  @scala.inline
  def apply(
    createCommentThread: (Uri, Range, js.Array[Comment]) => CommentThread,
    dispose: () => Unit,
    id: String,
    label: String,
    commentingRangeProvider: CommentingRangeProvider = null,
    reactionHandler: (/* comment */ Comment, /* reaction */ CommentReaction) => js.Promise[Unit] = null
  ): CommentController = {
    val __obj = js.Dynamic.literal(createCommentThread = js.Any.fromFunction3(createCommentThread), dispose = js.Any.fromFunction0(dispose), id = id, label = label)
    if (commentingRangeProvider != null) __obj.updateDynamic("commentingRangeProvider")(commentingRangeProvider)
    if (reactionHandler != null) __obj.updateDynamic("reactionHandler")(js.Any.fromFunction2(reactionHandler))
    __obj.asInstanceOf[CommentController]
  }
}

