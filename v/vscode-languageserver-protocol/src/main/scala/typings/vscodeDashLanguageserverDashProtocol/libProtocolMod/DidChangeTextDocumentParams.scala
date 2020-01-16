package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentContentChangeEvent */ _
  ]
  /**
    * The document that did change. The version number points
    * to the version after all provided content changes have
    * been applied.
    */
  var textDocument: VersionedTextDocumentIdentifier
}

object DidChangeTextDocumentParams {
  @scala.inline
  def apply(
    contentChanges: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentContentChangeEvent */ _
    ],
    textDocument: VersionedTextDocumentIdentifier
  ): DidChangeTextDocumentParams = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidChangeTextDocumentParams]
  }
}

