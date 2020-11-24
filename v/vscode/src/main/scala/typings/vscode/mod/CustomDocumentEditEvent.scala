package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by extensions to signal to VS Code that an edit has occurred on an [`CustomDocument`](#CustomDocument).
  *
  * @see [`CustomDocumentProvider.onDidChangeCustomDocument`](#CustomDocumentProvider.onDidChangeCustomDocument).
  */
@js.native
trait CustomDocumentEditEvent[T /* <: CustomDocument */] extends js.Object {
  
  /**
    * The document that the edit is for.
    */
  val document: T = js.native
  
  /**
    * Display name describing the edit.
    *
    * This will be shown to users in the UI for undo/redo operations.
    */
  val label: js.UndefOr[String] = js.native
  
  /**
    * Redo the edit operation.
    *
    * This is invoked by VS Code when the user redoes this edit. To implement `redo`, your
    * extension should restore the document and editor to the state they were in just after this
    * edit was added to VS Code's internal edit stack by `onDidChangeCustomDocument`.
    */
  def redo(): Thenable[Unit] | Unit = js.native
  
  /**
    * Undo the edit operation.
    *
    * This is invoked by VS Code when the user undoes this edit. To implement `undo`, your
    * extension should restore the document and editor to the state they were in just before this
    * edit was added to VS Code's internal edit stack by `onDidChangeCustomDocument`.
    */
  def undo(): Thenable[Unit] | Unit = js.native
}
object CustomDocumentEditEvent {
  
  @scala.inline
  def apply[T /* <: CustomDocument */](document: T, redo: () => Thenable[Unit] | Unit, undo: () => Thenable[Unit] | Unit): CustomDocumentEditEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[CustomDocumentEditEvent[T]]
  }
  
  @scala.inline
  implicit class CustomDocumentEditEventOps[Self <: CustomDocumentEditEvent[_], T /* <: CustomDocument */] (val x: Self with CustomDocumentEditEvent[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocument(value: T): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedo(value: () => Thenable[Unit] | Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndo(value: () => Thenable[Unit] | Unit): Self = this.set("undo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
