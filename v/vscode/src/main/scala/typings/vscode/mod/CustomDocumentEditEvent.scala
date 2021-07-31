package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by extensions to signal to VS Code that an edit has occurred on an [`CustomDocument`](#CustomDocument).
  *
  * @see [`CustomDocumentProvider.onDidChangeCustomDocument`](#CustomDocumentProvider.onDidChangeCustomDocument).
  */
trait CustomDocumentEditEvent[T /* <: CustomDocument */] extends StObject {
  
  /**
    * The document that the edit is for.
    */
  val document: T
  
  /**
    * Display name describing the edit.
    *
    * This will be shown to users in the UI for undo/redo operations.
    */
  val label: js.UndefOr[String] = js.undefined
  
  /**
    * Redo the edit operation.
    *
    * This is invoked by VS Code when the user redoes this edit. To implement `redo`, your
    * extension should restore the document and editor to the state they were in just after this
    * edit was added to VS Code's internal edit stack by `onDidChangeCustomDocument`.
    */
  def redo(): Thenable[Unit] | Unit
  
  /**
    * Undo the edit operation.
    *
    * This is invoked by VS Code when the user undoes this edit. To implement `undo`, your
    * extension should restore the document and editor to the state they were in just before this
    * edit was added to VS Code's internal edit stack by `onDidChangeCustomDocument`.
    */
  def undo(): Thenable[Unit] | Unit
}
object CustomDocumentEditEvent {
  
  @scala.inline
  def apply[T /* <: CustomDocument */](document: T, redo: () => Thenable[Unit] | Unit, undo: () => Thenable[Unit] | Unit): CustomDocumentEditEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[CustomDocumentEditEvent[T]]
  }
  
  @scala.inline
  implicit class CustomDocumentEditEventMutableBuilder[Self <: CustomDocumentEditEvent[?], T /* <: CustomDocument */] (val x: Self & CustomDocumentEditEvent[T]) extends AnyVal {
    
    @scala.inline
    def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRedo(value: () => Thenable[Unit] | Unit): Self = StObject.set(x, "redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndo(value: () => Thenable[Unit] | Unit): Self = StObject.set(x, "undo", js.Any.fromFunction0(value))
  }
}
