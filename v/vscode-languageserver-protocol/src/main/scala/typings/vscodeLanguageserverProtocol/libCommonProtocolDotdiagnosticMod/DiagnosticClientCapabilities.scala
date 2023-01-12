package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticClientCapabilities extends StObject {
  
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the clients supports related documents for document diagnostic pulls.
    */
  var relatedDocumentSupport: js.UndefOr[Boolean] = js.undefined
}
object DiagnosticClientCapabilities {
  
  inline def apply(): DiagnosticClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setRelatedDocumentSupport(value: Boolean): Self = StObject.set(x, "relatedDocumentSupport", value.asInstanceOf[js.Any])
    
    inline def setRelatedDocumentSupportUndefined: Self = StObject.set(x, "relatedDocumentSupport", js.undefined)
  }
}
