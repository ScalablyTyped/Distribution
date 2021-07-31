package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.CodeActionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionClientCapabilities extends StObject {
  
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    *
    * @since 3.8.0
    */
  var codeActionLiteralSupport: js.UndefOr[CodeActionKind] = js.undefined
  
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether code action supports the `isPreferred` property.
    * @since 3.15.0
    */
  var isPreferredSupport: js.UndefOr[Boolean] = js.undefined
}
object CodeActionClientCapabilities {
  
  @scala.inline
  def apply(): CodeActionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionClientCapabilities]
  }
  
  @scala.inline
  implicit class CodeActionClientCapabilitiesMutableBuilder[Self <: CodeActionClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeActionLiteralSupport(value: CodeActionKind): Self = StObject.set(x, "codeActionLiteralSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionLiteralSupportUndefined: Self = StObject.set(x, "codeActionLiteralSupport", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setIsPreferredSupport(value: Boolean): Self = StObject.set(x, "isPreferredSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreferredSupportUndefined: Self = StObject.set(x, "isPreferredSupport", js.undefined)
  }
}
