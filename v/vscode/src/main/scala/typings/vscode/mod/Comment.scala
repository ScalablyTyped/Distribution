package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
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
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: CommentAuthorInformation): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String | MarkdownString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMode(value: CommentMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: js.Array[CommentReaction]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    @scala.inline
    def setReactionsVarargs(value: CommentReaction*): Self = StObject.set(x, "reactions", js.Array(value :_*))
  }
}
