package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with CodeActionOptions
object CodeActionRegistrationOptions {
  
  inline def apply(): CodeActionRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[CodeActionRegistrationOptions]
  }
}
