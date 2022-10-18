package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with RenameOptions
object RenameRegistrationOptions {
  
  inline def apply(): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}
