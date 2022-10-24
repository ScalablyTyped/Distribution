package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorStateAny extends StObject {
  
  var editorState: Any
}
object EditorStateAny {
  
  inline def apply(editorState: Any): EditorStateAny = {
    val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorStateAny]
  }
  
  extension [Self <: EditorStateAny](x: Self) {
    
    inline def setEditorState(value: Any): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
  }
}
