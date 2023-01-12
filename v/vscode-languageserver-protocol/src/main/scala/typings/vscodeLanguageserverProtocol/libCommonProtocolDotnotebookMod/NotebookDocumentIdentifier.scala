package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverTypes.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentIdentifier extends StObject {
  
  /**
    * The notebook document's uri.
    */
  var uri: URI
}
object NotebookDocumentIdentifier {
  
  inline def apply(uri: URI): NotebookDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDocumentIdentifier] (val x: Self) extends AnyVal {
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
