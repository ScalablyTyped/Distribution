package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverInts.`1`
import typings.vscodeLanguageserver.vscodeLanguageserverInts.`2`
import typings.vscodeLanguageserver.vscodeLanguageserverInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionTriggerKind {
  
  /**
    * Completion was triggered by typing an identifier (24x7 code
    * complete), manual invocation (e.g Ctrl+Space) or via API.
    */
  @JSImport("vscode-languageserver", "CompletionTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
  
  /**
    * Completion was triggered by a trigger character specified by
    * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
    */
  @JSImport("vscode-languageserver", "CompletionTriggerKind.TriggerCharacter")
  @js.native
  val TriggerCharacter: `2` = js.native
  
  /**
    * Completion was re-triggered as current completion list is incomplete
    */
  @JSImport("vscode-languageserver", "CompletionTriggerKind.TriggerForIncompleteCompletions")
  @js.native
  val TriggerForIncompleteCompletions: `3` = js.native
}
