package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDocumentChangeReason extends StObject
@JSImport("vscode", "TextDocumentChangeReason")
@js.native
object TextDocumentChangeReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDocumentChangeReason & Double] = js.native
  
  /** The text change is caused by an redo operation. */
  @js.native
  sealed trait Redo
    extends StObject
       with TextDocumentChangeReason
  /* 2 */ val Redo: typings.vscode.mod.TextDocumentChangeReason.Redo & Double = js.native
  
  /** The text change is caused by an undo operation. */
  @js.native
  sealed trait Undo
    extends StObject
       with TextDocumentChangeReason
  /* 1 */ val Undo: typings.vscode.mod.TextDocumentChangeReason.Undo & Double = js.native
}
