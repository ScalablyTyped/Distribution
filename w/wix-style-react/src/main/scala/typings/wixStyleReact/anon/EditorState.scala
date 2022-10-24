package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorState extends StObject {
  
  var editorState: Any
  
  var texts: InsertionForm
}
object EditorState {
  
  inline def apply(editorState: Any, texts: InsertionForm): EditorState = {
    val __obj = js.Dynamic.literal(editorState = editorState.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorState]
  }
  
  extension [Self <: EditorState](x: Self) {
    
    inline def setEditorState(value: Any): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
    
    inline def setTexts(value: InsertionForm): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
  }
}
