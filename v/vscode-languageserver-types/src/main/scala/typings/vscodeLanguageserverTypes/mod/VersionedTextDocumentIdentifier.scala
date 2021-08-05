package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedTextDocumentIdentifier
  extends StObject
     with TextDocumentIdentifier {
  
  /**
    * The version number of this document. If a versioned text document identifier
    * is sent from the server to the client and the file is not open in the editor
    * (the server has not received an open notification before) the server can send
    * `null` to indicate that the version is unknown and the content on disk is the
    * truth (as speced with document content ownership).
    */
  var version: Double | Null
}
object VersionedTextDocumentIdentifier {
  
  inline def apply(uri: DocumentUri): VersionedTextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[VersionedTextDocumentIdentifier]
  }
  
  @JSImport("vscode-languageserver-types", "VersionedTextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  inline def create(uri: DocumentUri): VersionedTextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[VersionedTextDocumentIdentifier]
  inline def create(uri: DocumentUri, version: Double): VersionedTextDocumentIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[VersionedTextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean]
  
  extension [Self <: VersionedTextDocumentIdentifier](x: Self) {
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
