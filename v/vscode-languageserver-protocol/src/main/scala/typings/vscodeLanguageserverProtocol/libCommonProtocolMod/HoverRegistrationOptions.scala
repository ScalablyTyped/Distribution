package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
object HoverRegistrationOptions {
  
  inline def apply(): HoverRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[HoverRegistrationOptions]
  }
}
