package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionTriggerKind")
@js.native
object CompletionTriggerKindNs extends js.Object {
  /**
       * Completion was triggered by typing an identifier (24x7 code
       * complete), manual invocation (e.g Ctrl+Space) or via API.
       */
  val Invoked: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibNumbers.`1` = js.native
  /**
       * Completion was triggered by a trigger character specified by
       * the `triggerCharacters` properties of the `CompletionRegistrationOptions`.
       */
  val TriggerCharacter: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibNumbers.`2` = js.native
  /**
       * Completion was re-triggered as current completion list is incomplete
       */
  val TriggerForIncompleteCompletions: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibNumbers.`3` = js.native
}

