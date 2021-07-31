package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDocumentSaveReason extends StObject
@JSImport("vscode", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDocumentSaveReason & Double] = js.native
  
  /**
    * Automatic after a delay.
    */
  @js.native
  sealed trait AfterDelay
    extends StObject
       with TextDocumentSaveReason
  /* 2 */ val AfterDelay: typings.vscode.mod.TextDocumentSaveReason.AfterDelay & Double = js.native
  
  /**
    * When the editor lost focus.
    */
  @js.native
  sealed trait FocusOut
    extends StObject
       with TextDocumentSaveReason
  /* 3 */ val FocusOut: typings.vscode.mod.TextDocumentSaveReason.FocusOut & Double = js.native
  
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  @js.native
  sealed trait Manual
    extends StObject
       with TextDocumentSaveReason
  /* 1 */ val Manual: typings.vscode.mod.TextDocumentSaveReason.Manual & Double = js.native
}
