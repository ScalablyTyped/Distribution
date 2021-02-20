package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by extensions to signal to VS Code that the content of a [`CustomDocument`](#CustomDocument)
  * has changed.
  *
  * @see [`CustomDocumentProvider.onDidChangeCustomDocument`](#CustomDocumentProvider.onDidChangeCustomDocument).
  */
@js.native
trait CustomDocumentContentChangeEvent[T /* <: CustomDocument */] extends StObject {
  
  /**
    * The document that the change is for.
    */
  val document: T = js.native
}
object CustomDocumentContentChangeEvent {
  
  @scala.inline
  def apply[T /* <: CustomDocument */](document: T): CustomDocumentContentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentContentChangeEvent[T]]
  }
  
  @scala.inline
  implicit class CustomDocumentContentChangeEventMutableBuilder[Self <: CustomDocumentContentChangeEvent[_], T /* <: CustomDocument */] (val x: Self with CustomDocumentContentChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
