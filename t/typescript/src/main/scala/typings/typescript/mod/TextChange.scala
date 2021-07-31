package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChange extends StObject {
  
  var newText: java.lang.String
  
  var span: TextSpan
}
object TextChange {
  
  @scala.inline
  def apply(newText: java.lang.String, span: TextSpan): TextChange = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  
  @scala.inline
  implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewText(value: java.lang.String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
