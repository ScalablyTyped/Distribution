package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event triggered by extensions to signal to VS Code that the content of a [`CustomDocument`](#CustomDocument)
  * has changed.
  *
  * @see [`CustomDocumentProvider.onDidChangeCustomDocument`](#CustomDocumentProvider.onDidChangeCustomDocument).
  */
@js.native
trait CustomDocumentContentChangeEvent[T /* <: CustomDocument */] extends js.Object {
  /**
    * The document that the change is for.
    */
  val document: T = js.native
}

object CustomDocumentContentChangeEvent {
  @scala.inline
  def apply[/* <: typings.vscode.mod.CustomDocument */ T](document: T): CustomDocumentContentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentContentChangeEvent[T]]
  }
  @scala.inline
  implicit class CustomDocumentContentChangeEventOps[Self <: CustomDocumentContentChangeEvent[_], /* <: typings.vscode.mod.CustomDocument */ T] (val x: Self with CustomDocumentContentChangeEvent[T]) extends AnyVal {
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
  }
  
}

