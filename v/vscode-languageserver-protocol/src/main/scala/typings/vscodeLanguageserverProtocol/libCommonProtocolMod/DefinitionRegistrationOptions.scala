package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
object DefinitionRegistrationOptions {
  
  inline def apply(): DefinitionRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[DefinitionRegistrationOptions]
  }
}
