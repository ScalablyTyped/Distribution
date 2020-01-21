package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`2`
import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends js.Object {
  /**
    * Completion was triggered by typing an identifier (24x7 code
    * complete), manual invocation (e.g Ctrl+Space) or via API.
    */
  val Invoked: `1` = js.native
  /**
    * Completion was triggered by a trigger character specified by
    * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
    */
  val TriggerCharacter: `2` = js.native
  /**
    * Completion was re-triggered as current completion list is incomplete
    */
  val TriggerForIncompleteCompletions: `3` = js.native
}

