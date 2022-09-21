package typings.vscode.anon

import typings.vscode.mod.NotebookEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  val editor: NotebookEditor
  
  val message: Any
}
object Editor {
  
  inline def apply(editor: NotebookEditor, message: Any): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  extension [Self <: Editor](x: Self) {
    
    inline def setEditor(value: NotebookEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
