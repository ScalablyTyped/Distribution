package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentRule extends StObject {
  
  /**
    * The block comment character pair, like `/ * block comment *&#47;`
    */
  var blockComment: js.UndefOr[CharacterPair] = js.undefined
  
  /**
    * The line comment token, like `// this is a comment`
    */
  var lineComment: js.UndefOr[String] = js.undefined
}
object CommentRule {
  
  inline def apply(): CommentRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentRule] (val x: Self) extends AnyVal {
    
    inline def setBlockComment(value: CharacterPair): Self = StObject.set(x, "blockComment", value.asInstanceOf[js.Any])
    
    inline def setBlockCommentUndefined: Self = StObject.set(x, "blockComment", js.undefined)
    
    inline def setLineComment(value: String): Self = StObject.set(x, "lineComment", value.asInstanceOf[js.Any])
    
    inline def setLineCommentUndefined: Self = StObject.set(x, "lineComment", js.undefined)
  }
}
