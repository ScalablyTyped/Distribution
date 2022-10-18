package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with SignatureHelpOptions
object SignatureHelpRegistrationOptions {
  
  inline def apply(): SignatureHelpRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[SignatureHelpRegistrationOptions]
  }
}
