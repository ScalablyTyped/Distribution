package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by extensions to signal to the editor that the content of a {@linkcode CustomDocument}
  * has changed.
  *
  * @see {@linkcode CustomEditorProvider.onDidChangeCustomDocument}.
  */
trait CustomDocumentContentChangeEvent[T /* <: CustomDocument */] extends StObject {
  
  /**
    * The document that the change is for.
    */
  val document: T
}
object CustomDocumentContentChangeEvent {
  
  inline def apply[T /* <: CustomDocument */](document: T): CustomDocumentContentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentContentChangeEvent[T]]
  }
  
  extension [Self <: CustomDocumentContentChangeEvent[?], T /* <: CustomDocument */](x: Self & CustomDocumentContentChangeEvent[T]) {
    
    inline def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
