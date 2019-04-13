package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "TextDocumentSyncKind")
@js.native
object TextDocumentSyncKindNs extends js.Object {
  /**
    * Documents are synced by always sending the full content
    * of the document.
    */
  val Full: vscodeDashLanguageserverLib.vscodeDashLanguageserverLibNumbers.`1` = js.native
  /**
    * Documents are synced by sending the full content on open.
    * After that only incremental updates to the document are
    * send.
    */
  val Incremental: vscodeDashLanguageserverLib.vscodeDashLanguageserverLibNumbers.`2` = js.native
  /**
    * Documents should not be synced at all.
    */
  val None: vscodeDashLanguageserverLib.vscodeDashLanguageserverLibNumbers.`0` = js.native
}

