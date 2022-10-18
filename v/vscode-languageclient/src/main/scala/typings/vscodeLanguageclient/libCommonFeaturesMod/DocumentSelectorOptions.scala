package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFilter
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSelectorOptions extends StObject {
  
  var documentSelector: DocumentSelector
}
object DocumentSelectorOptions {
  
  inline def apply(documentSelector: DocumentSelector): DocumentSelectorOptions = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelectorOptions]
  }
  
  extension [Self <: DocumentSelectorOptions](x: Self) {
    
    inline def setDocumentSelector(value: DocumentSelector): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    inline def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = StObject.set(x, "documentSelector", js.Array(value*))
  }
}
