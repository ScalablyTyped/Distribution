package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`2`
import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionTriggerKind {
  
  /**
    * Completion was triggered by typing an identifier (24x7 code
    * complete), manual invocation (e.g Ctrl+Space) or via API.
    */
  @JSImport("vscode-languageclient/lib/client", "CompletionTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
  
  /**
    * Completion was triggered by a trigger character specified by
    * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
    */
  @JSImport("vscode-languageclient/lib/client", "CompletionTriggerKind.TriggerCharacter")
  @js.native
  val TriggerCharacter: `2` = js.native
  
  /**
    * Completion was re-triggered as current completion list is incomplete
    */
  @JSImport("vscode-languageclient/lib/client", "CompletionTriggerKind.TriggerForIncompleteCompletions")
  @js.native
  val TriggerForIncompleteCompletions: `3` = js.native
}
