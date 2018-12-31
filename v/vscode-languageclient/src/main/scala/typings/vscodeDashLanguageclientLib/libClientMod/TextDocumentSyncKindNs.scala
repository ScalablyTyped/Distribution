package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentSyncKind")
@js.native
object TextDocumentSyncKindNs extends js.Object {
  /**
    * Documents are synced by always sending the full content
    * of the document.
    */
  val Full: /* 1 */ scala.Double = js.native
  /**
    * Documents are synced by sending the full content on open.
    * After that only incremental updates to the document are
    * send.
    */
  val Incremental: /* 2 */ scala.Double = js.native
  /**
    * Documents should not be synced at all.
    */
  val None: /* 0 */ scala.Double = js.native
}

