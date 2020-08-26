package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * The [author information](#CommentAuthorInformation) of the comment
    */
  var author: CommentAuthorInformation = js.native
  /**
    * The human-readable comment body
    */
  var body: String | MarkdownString = js.native
  /**
    * Context value of the comment. This can be used to contribute comment specific actions.
    * For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
    * using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
    * ```json
    *    "contributes": {
    *        "menus": {
    *            "comments/comment/title": [
    *                {
    *                    "command": "extension.deleteComment",
    *                    "when": "comment == editable"
    *                }
    *            ]
    *        }
    *    }
    * ```
    * This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`.
    */
  var contextValue: js.UndefOr[String] = js.native
  /**
    * Optional label describing the [Comment](#Comment)
    * Label will be rendered next to authorName if exists.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * [Comment mode](#CommentMode) of the comment
    */
  var mode: CommentMode = js.native
  /**
    * Optional reactions of the [comment](#Comment)
    */
  var reactions: js.UndefOr[js.Array[CommentReaction]] = js.native
}

object Comment {
  @scala.inline
  def apply(author: CommentAuthorInformation, body: String | MarkdownString, mode: CommentMode): Comment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setAuthor(value: CommentAuthorInformation): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String | MarkdownString): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: CommentMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextValue(value: String): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setReactionsVarargs(value: CommentReaction*): Self = this.set("reactions", js.Array(value :_*))
    @scala.inline
    def setReactions(value: js.Array[CommentReaction]): Self = this.set("reactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactions: Self = this.set("reactions", js.undefined)
  }
  
}

