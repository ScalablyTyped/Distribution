package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brackets extends StObject {
  
  /**
    * This property is deprecated and will be **ignored** from
    * the editor.
    * @deprecated
    */
  var brackets: js.UndefOr[Any] = js.undefined
  
  /**
    * This property is deprecated and not fully supported anymore by
    * the editor (scope and lineStart are ignored).
    * Use the autoClosingPairs property in the language configuration file instead.
    * @deprecated
    */
  var docComment: js.UndefOr[Close] = js.undefined
}
object Brackets {
  
  inline def apply(): Brackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brackets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brackets] (val x: Self) extends AnyVal {
    
    inline def setBrackets(value: Any): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    inline def setDocComment(value: Close): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    inline def setDocCommentUndefined: Self = StObject.set(x, "docComment", js.undefined)
  }
}
