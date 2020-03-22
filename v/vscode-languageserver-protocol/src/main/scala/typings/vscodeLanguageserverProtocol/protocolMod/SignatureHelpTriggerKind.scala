package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait SignatureHelpTriggerKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  val ContentChange: `3` = js.native
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  val Invoked: `1` = js.native
  /**
    * Signature help was triggered by a trigger character.
    */
  val TriggerCharacter: `2` = js.native
}

