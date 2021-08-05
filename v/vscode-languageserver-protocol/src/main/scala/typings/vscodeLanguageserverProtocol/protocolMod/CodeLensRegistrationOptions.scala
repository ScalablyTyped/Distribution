package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with CodeLensOptions
object CodeLensRegistrationOptions {
  
  inline def apply(): CodeLensRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[CodeLensRegistrationOptions]
  }
}
