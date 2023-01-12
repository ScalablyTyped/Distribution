package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInsertion extends StObject {
  
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double
  
  var newText: java.lang.String
}
object TextInsertion {
  
  inline def apply(caretOffset: Double, newText: java.lang.String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInsertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInsertion] (val x: Self) extends AnyVal {
    
    inline def setCaretOffset(value: Double): Self = StObject.set(x, "caretOffset", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: java.lang.String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
  }
}
