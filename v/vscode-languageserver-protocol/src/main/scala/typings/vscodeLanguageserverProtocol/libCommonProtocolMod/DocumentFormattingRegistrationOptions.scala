package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFormattingRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
object DocumentFormattingRegistrationOptions {
  
  inline def apply(): DocumentFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[DocumentFormattingRegistrationOptions]
  }
}
