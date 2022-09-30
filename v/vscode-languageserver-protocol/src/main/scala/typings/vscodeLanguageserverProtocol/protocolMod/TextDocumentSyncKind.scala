package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`0`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`2`
*/
trait TextDocumentSyncKind extends StObject
object TextDocumentSyncKind {
  
  /**
    * Documents are synced by always sending the full content
    * of the document.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSyncKind.Full")
  @js.native
  val Full: /* 1 */ Double = js.native
  
  /**
    * Documents are synced by sending the full content on open.
    * After that only incremental updates to the document are
    * send.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSyncKind.Incremental")
  @js.native
  val Incremental: /* 2 */ Double = js.native
  
  /**
    * Documents should not be synced at all.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentSyncKind.None")
  @js.native
  val None: /* 0 */ Double = js.native
}
