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
trait CustomDocumentContentChangeEvent[T /* <: CustomDocument */] extends js.Object {
  /**
    * The document that the change is for.
    */
  val document: T
}

object CustomDocumentContentChangeEvent {
  @scala.inline
  def apply[/* <: typings.vscode.mod.CustomDocument */ T](document: T): CustomDocumentContentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentContentChangeEvent[T]]
  }
}

