package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLinkRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with DocumentLinkOptions
object DocumentLinkRegistrationOptions {
  
  inline def apply(): DocumentLinkRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[DocumentLinkRegistrationOptions]
  }
}
