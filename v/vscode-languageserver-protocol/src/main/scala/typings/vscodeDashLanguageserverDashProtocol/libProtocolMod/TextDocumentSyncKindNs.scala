package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`0`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`1`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentSyncKind")
@js.native
object TextDocumentSyncKindNs extends js.Object {
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

