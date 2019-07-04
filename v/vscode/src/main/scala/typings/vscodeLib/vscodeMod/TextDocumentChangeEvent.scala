package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentChangeEvent extends js.Object {
  /**
  		 * An array of content changes.
  		 */
  val contentChanges: js.Array[TextDocumentContentChangeEvent]
  /**
  		 * The affected document.
  		 */
  val document: TextDocument
}

object TextDocumentChangeEvent {
  @scala.inline
  def apply(contentChanges: js.Array[TextDocumentContentChangeEvent], document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges, document = document)
  
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
}

