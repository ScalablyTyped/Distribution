package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with CompletionOptions
object CompletionRegistrationOptions {
  
  inline def apply(): CompletionRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[CompletionRegistrationOptions]
  }
}
