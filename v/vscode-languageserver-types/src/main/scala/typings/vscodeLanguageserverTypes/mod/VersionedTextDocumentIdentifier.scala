package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedTextDocumentIdentifier
  extends StObject
     with TextDocumentIdentifier {
  
  /**
    * The version number of this document.
    */
  var version: integer
}
object VersionedTextDocumentIdentifier {
  
  inline def apply(uri: DocumentUri, version: integer): VersionedTextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedTextDocumentIdentifier]
  }
  
  @JSImport("vscode-languageserver-types", "VersionedTextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param version The document's version.
    */
  inline def create(uri: DocumentUri, version: integer): VersionedTextDocumentIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[VersionedTextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean]
  
  extension [Self <: VersionedTextDocumentIdentifier](x: Self) {
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
