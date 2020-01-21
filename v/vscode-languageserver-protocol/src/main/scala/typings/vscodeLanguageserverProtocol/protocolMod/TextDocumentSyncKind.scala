package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`0`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`0`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
*/
trait TextDocumentSyncKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentSyncKind")
@js.native
object TextDocumentSyncKind extends js.Object {
  /**
    * Documents are synced by always sending the full content
    * of the document.
    */
  val Full: `1` = js.native
  /**
    * Documents are synced by sending the full content on open.
    * After that only incremental updates to the document are
    * send.
    */
  val Incremental: `2` = js.native
  /**
    * Documents should not be synced at all.
    */
  val None: `0` = js.native
}

