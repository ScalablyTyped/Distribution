package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /**
  		 * The [author information](#CommentAuthorInformation) of the comment
  		 */
  var author: CommentAuthorInformation
  /**
  		 * The human-readable comment body
  		 */
  var body: String | MarkdownString
  /**
  		 * Context value of the comment. This can be used to contribute comment specific actions.
  		 * For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
  		 * using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
  		 * ```json
  		 *	"contributes": {
  		 *		"menus": {
  		 *			"comments/comment/title": [
  		 *				{
  		 *					"command": "extension.deleteComment",
  		 *					"when": "comment == editable"
  		 *				}
  		 *			]
  		 *		}
  		 *	}
  		 * ```
  		 * This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`.
  		 */
  var contextValue: js.UndefOr[String] = js.undefined
  /**
  		 * Optional label describing the [Comment](#Comment)
  		 * Label will be rendered next to authorName if exists.
  		 */
  var label: js.UndefOr[String] = js.undefined
  /**
  		 * [Comment mode](#CommentMode) of the comment
  		 */
  var mode: CommentMode
  /**
  		 * Optional reactions of the [comment](#Comment)
  		 */
  var reactions: js.UndefOr[js.Array[CommentReaction]] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    author: CommentAuthorInformation,
    body: String | MarkdownString,
    mode: CommentMode,
    contextValue: String = null,
    label: String = null,
    reactions: js.Array[CommentReaction] = null
  ): Comment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (reactions != null) __obj.updateDynamic("reactions")(reactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

