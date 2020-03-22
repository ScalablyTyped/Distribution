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
trait TextDocumentSaveReason extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends js.Object {
  /**
    * Automatic after a delay.
    */
  val AfterDelay: `2` = js.native
  /**
    * When the editor lost focus.
    */
  val FocusOut: `3` = js.native
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  val Manual: `1` = js.native
}

