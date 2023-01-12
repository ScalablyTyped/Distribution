package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDiagnosticParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The additional identifier  provided during registration.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The result id of a previous response if provided.
    */
  var previousResultId: js.UndefOr[String] = js.undefined
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentDiagnosticParams {
  
  inline def apply(textDocument: TextDocumentIdentifier): DocumentDiagnosticParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDiagnosticParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentDiagnosticParams] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPreviousResultId(value: String): Self = StObject.set(x, "previousResultId", value.asInstanceOf[js.Any])
    
    inline def setPreviousResultIdUndefined: Self = StObject.set(x, "previousResultId", js.undefined)
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
