package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameClientCapabilities extends StObject {
  
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the client honors the change annotations in
    * text edits and resource operations returned via the
    * rename request's workspace edit by for example presenting
    * the workspace edit in the user interface and asking
    * for confirmation.
    *
    * @since 3.16.0
    */
  var honorsChangeAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    *
    * @since 3.12.0
    */
  var prepareSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the default behavior result.
    *
    * The value indicates the default behavior used by the
    * client.
    *
    * @since 3.16.0
    */
  var prepareSupportDefaultBehavior: js.UndefOr[PrepareSupportDefaultBehavior] = js.undefined
}
object RenameClientCapabilities {
  
  inline def apply(): RenameClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameClientCapabilities]
  }
  
  extension [Self <: RenameClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setHonorsChangeAnnotations(value: Boolean): Self = StObject.set(x, "honorsChangeAnnotations", value.asInstanceOf[js.Any])
    
    inline def setHonorsChangeAnnotationsUndefined: Self = StObject.set(x, "honorsChangeAnnotations", js.undefined)
    
    inline def setPrepareSupport(value: Boolean): Self = StObject.set(x, "prepareSupport", value.asInstanceOf[js.Any])
    
    inline def setPrepareSupportDefaultBehavior(value: PrepareSupportDefaultBehavior): Self = StObject.set(x, "prepareSupportDefaultBehavior", value.asInstanceOf[js.Any])
    
    inline def setPrepareSupportDefaultBehaviorUndefined: Self = StObject.set(x, "prepareSupportDefaultBehavior", js.undefined)
    
    inline def setPrepareSupportUndefined: Self = StObject.set(x, "prepareSupport", js.undefined)
  }
}
