package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /**
  		 * The {@link CommentAuthorInformation author information} of the comment
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
  		 * Optional label describing the {@link Comment}
  		 * Label will be rendered next to authorName if exists.
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * {@link CommentMode Comment mode} of the comment
  		 */
  var mode: CommentMode
  
  /**
  		 * Optional reactions of the {@link Comment}
  		 */
  var reactions: js.UndefOr[js.Array[CommentReaction]] = js.undefined
  
  /**
  		 * Optional timestamp that will be displayed in comments.
  		 * The date will be formatted according to the user's locale and settings.
  		 */
  var timestamp: js.UndefOr[js.Date] = js.undefined
}
object Comment {
  
  inline def apply(author: CommentAuthorInformation, body: String | MarkdownString, mode: CommentMode): Comment = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: CommentAuthorInformation): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String | MarkdownString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContextValue(value: String): Self = StObject.set(x, "contextValue", value.asInstanceOf[js.Any])
    
    inline def setContextValueUndefined: Self = StObject.set(x, "contextValue", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMode(value: CommentMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: js.Array[CommentReaction]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setReactionsVarargs(value: CommentReaction*): Self = StObject.set(x, "reactions", js.Array(value*))
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
