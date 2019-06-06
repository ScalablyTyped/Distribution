package typings
package vscodeLib.vscodeMod

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
  var body: java.lang.String | MarkdownString
  /**
  		 * Context value of the comment. This can be used to contribute comment specific actions.
  		 * For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
  		 * using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
  		 * ```
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
  var contextValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Optional label describing the [Comment](#Comment)
  		 * Label will be rendered next to authorName if exists.
  		 */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * [Comment mode](#CommentMode) of the comment
  		 */
  var mode: CommentMode
}

object Comment {
  @scala.inline
  def apply(
    author: CommentAuthorInformation,
    body: java.lang.String | MarkdownString,
    mode: CommentMode,
    contextValue: java.lang.String = null,
    label: java.lang.String = null
  ): Comment = {
    val __obj = js.Dynamic.literal(author = author, body = body.asInstanceOf[js.Any], mode = mode)
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Comment]
  }
}

