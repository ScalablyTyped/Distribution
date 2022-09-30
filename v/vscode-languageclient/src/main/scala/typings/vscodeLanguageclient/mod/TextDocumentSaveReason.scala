package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientInts.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientInts.`2`
import typings.vscodeLanguageclient.vscodeLanguageclientInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentSaveReason {
  
  /**
    * Automatic after a delay.
    */
  @JSImport("vscode-languageclient", "TextDocumentSaveReason.AfterDelay")
  @js.native
  val AfterDelay: `2` = js.native
  
  /**
    * When the editor lost focus.
    */
  @JSImport("vscode-languageclient", "TextDocumentSaveReason.FocusOut")
  @js.native
  val FocusOut: `3` = js.native
  
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  @JSImport("vscode-languageclient", "TextDocumentSaveReason.Manual")
  @js.native
  val Manual: `1` = js.native
}
