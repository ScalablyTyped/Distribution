package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.CodeActionKind
import typings.vscodeLanguageserverProtocol.anon.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionClientCapabilities extends StObject {
  
  /**
    * The client support code action literals of type `CodeAction` as a valid
    * response of the `textDocument/codeAction` request. If the property is not
    * set the request can only return `Command` literals.
    *
    * @since 3.8.0
    */
  var codeActionLiteralSupport: js.UndefOr[CodeActionKind] = js.undefined
  
  /**
    * Whether code action supports the `data` property which is
    * preserved between a `textDocument/codeAction` and a
    * `codeAction/resolve` request.
    *
    * @since 3.16.0
    */
  var dataSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether code action supports the `disabled` property.
    *
    * @since 3.16.0
    */
  var disabledSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the client honors the change annotations in
    * text edits and resource operations returned via the
    * `CodeAction#edit` property by for example presenting
    * the workspace edit in the user interface and asking
    * for confirmation.
    *
    * @since 3.16.0
    */
  var honorsChangeAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether code action supports the `isPreferred` property.
    *
    * @since 3.15.0
    */
  var isPreferredSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the client supports resolving additional code action
    * properties via a separate `codeAction/resolve` request.
    *
    * @since 3.16.0
    */
  var resolveSupport: js.UndefOr[Properties] = js.undefined
}
object CodeActionClientCapabilities {
  
  inline def apply(): CodeActionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setCodeActionLiteralSupport(value: CodeActionKind): Self = StObject.set(x, "codeActionLiteralSupport", value.asInstanceOf[js.Any])
    
    inline def setCodeActionLiteralSupportUndefined: Self = StObject.set(x, "codeActionLiteralSupport", js.undefined)
    
    inline def setDataSupport(value: Boolean): Self = StObject.set(x, "dataSupport", value.asInstanceOf[js.Any])
    
    inline def setDataSupportUndefined: Self = StObject.set(x, "dataSupport", js.undefined)
    
    inline def setDisabledSupport(value: Boolean): Self = StObject.set(x, "disabledSupport", value.asInstanceOf[js.Any])
    
    inline def setDisabledSupportUndefined: Self = StObject.set(x, "disabledSupport", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setHonorsChangeAnnotations(value: Boolean): Self = StObject.set(x, "honorsChangeAnnotations", value.asInstanceOf[js.Any])
    
    inline def setHonorsChangeAnnotationsUndefined: Self = StObject.set(x, "honorsChangeAnnotations", js.undefined)
    
    inline def setIsPreferredSupport(value: Boolean): Self = StObject.set(x, "isPreferredSupport", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredSupportUndefined: Self = StObject.set(x, "isPreferredSupport", js.undefined)
    
    inline def setResolveSupport(value: Properties): Self = StObject.set(x, "resolveSupport", value.asInstanceOf[js.Any])
    
    inline def setResolveSupportUndefined: Self = StObject.set(x, "resolveSupport", js.undefined)
  }
}
