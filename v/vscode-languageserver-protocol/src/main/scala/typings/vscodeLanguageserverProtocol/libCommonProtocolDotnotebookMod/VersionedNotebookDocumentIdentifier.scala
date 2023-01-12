package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverTypes.mod.URI
import typings.vscodeLanguageserverTypes.mod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedNotebookDocumentIdentifier extends StObject {
  
  /**
    * The notebook document's uri.
    */
  var uri: URI
  
  /**
    * The version number of this notebook document.
    */
  var version: integer
}
object VersionedNotebookDocumentIdentifier {
  
  inline def apply(uri: URI, version: integer): VersionedNotebookDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedNotebookDocumentIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionedNotebookDocumentIdentifier] (val x: Self) extends AnyVal {
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
