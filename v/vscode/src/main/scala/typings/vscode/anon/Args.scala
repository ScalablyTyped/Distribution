package typings.vscode.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  /**
    * The arguments to be used in the localized string. As an array, the index of the argument is used to
    * match the template placeholder in the localized string. As a Record, the key is used to match the template
    * placeholder in the localized string.
    */
  var args: js.UndefOr[(js.Array[String | Double | Boolean]) | (Record[String, Any])] = js.undefined
  
  /**
    * A comment to help translators understand the context of the message.
    */
  var comment: String | js.Array[String]
  
  /**
    * The message to localize. If {@link args} is an array, this message supports index templating where strings like
    * `{0}` and `{1}` are replaced by the item at that index in the {@link args} array. If `args` is a `Record<string, any>`,
    * this supports named templating where strings like `{foo}` and `{bar}` are replaced by the value in
    * the Record for that key (foo, bar, etc).
    */
  var message: String
}
object Args {
  
  inline def apply(comment: String | js.Array[String], message: String): Args = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: (js.Array[String | Double | Boolean]) | (Record[String, Any])): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setComment(value: String | js.Array[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentVarargs(value: String*): Self = StObject.set(x, "comment", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
