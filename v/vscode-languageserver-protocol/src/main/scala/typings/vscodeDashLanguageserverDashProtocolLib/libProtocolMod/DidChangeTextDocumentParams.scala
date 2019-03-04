package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeTextDocumentParams extends js.Object {
  /**
    * The actual content changes. The content changes describe single state changes
    * to the document. So if there are two content changes c1 and c2 for a document
    * in state S then c1 move the document to S' and c2 to S''.
    */
  var contentChanges: js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentContentChangeEvent
  ]
  /**
    * The document that did change. The version number points
    * to the version after all provided content changes have
    * been applied.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
}

object DidChangeTextDocumentParams {
  @scala.inline
  def apply(
    contentChanges: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentContentChangeEvent
    ],
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
  ): DidChangeTextDocumentParams = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges, textDocument = textDocument)
  
    __obj.asInstanceOf[DidChangeTextDocumentParams]
  }
}

