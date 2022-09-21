package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalVersionedTextDocumentIdentifier
  extends StObject
     with TextDocumentIdentifier {
  
  /**
    * The version number of this document. If a versioned text document identifier
    * is sent from the server to the client and the file is not open in the editor
    * (the server has not received an open notification before) the server can send
    * `null` to indicate that the version is unknown and the content on disk is the
    * truth (as specified with document content ownership).
    */
  var version: integer | Null
}
object OptionalVersionedTextDocumentIdentifier {
  
  inline def apply(uri: DocumentUri): OptionalVersionedTextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[OptionalVersionedTextDocumentIdentifier]
  }
  
  @JSImport("vscode-languageserver-types", "OptionalVersionedTextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new OptionalVersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param version The document's version.
    */
  inline def create(uri: DocumentUri): OptionalVersionedTextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[OptionalVersionedTextDocumentIdentifier]
  inline def create(uri: DocumentUri, version: integer): OptionalVersionedTextDocumentIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[OptionalVersionedTextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [OptionalVersionedTextDocumentIdentifier](#OptionalVersionedTextDocumentIdentifier) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.OptionalVersionedTextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.OptionalVersionedTextDocumentIdentifier */ Boolean]
  
  extension [Self <: OptionalVersionedTextDocumentIdentifier](x: Self) {
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
