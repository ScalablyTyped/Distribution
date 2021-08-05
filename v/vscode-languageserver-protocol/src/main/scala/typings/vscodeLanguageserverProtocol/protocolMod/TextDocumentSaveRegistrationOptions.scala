package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentSaveRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with SaveOptions
object TextDocumentSaveRegistrationOptions {
  
  inline def apply(): TextDocumentSaveRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[TextDocumentSaveRegistrationOptions]
  }
}
