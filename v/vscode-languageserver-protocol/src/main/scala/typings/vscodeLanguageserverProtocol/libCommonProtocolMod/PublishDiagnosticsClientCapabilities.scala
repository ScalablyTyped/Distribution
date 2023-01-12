package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishDiagnosticsClientCapabilities extends StObject {
  
  /**
    * Client supports a codeDescription property
    *
    * @since 3.16.0
    */
  var codeDescriptionSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether code action supports the `data` property which is
    * preserved between a `textDocument/publishDiagnostics` and
    * `textDocument/codeAction` request.
    *
    * @since 3.16.0
    */
  var dataSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the tag property to provide meta data about a diagnostic.
    * Clients supporting tags have to handle unknown tags gracefully.
    *
    * @since 3.15.0
    */
  var tagSupport: js.UndefOr[ValueSet] = js.undefined
  
  /**
    * Whether the client interprets the version property of the
    * `textDocument/publishDiagnostics` notification's parameter.
    *
    * @since 3.15.0
    */
  var versionSupport: js.UndefOr[Boolean] = js.undefined
}
object PublishDiagnosticsClientCapabilities {
  
  inline def apply(): PublishDiagnosticsClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishDiagnosticsClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishDiagnosticsClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setCodeDescriptionSupport(value: Boolean): Self = StObject.set(x, "codeDescriptionSupport", value.asInstanceOf[js.Any])
    
    inline def setCodeDescriptionSupportUndefined: Self = StObject.set(x, "codeDescriptionSupport", js.undefined)
    
    inline def setDataSupport(value: Boolean): Self = StObject.set(x, "dataSupport", value.asInstanceOf[js.Any])
    
    inline def setDataSupportUndefined: Self = StObject.set(x, "dataSupport", js.undefined)
    
    inline def setRelatedInformation(value: Boolean): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    inline def setTagSupport(value: ValueSet): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    inline def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
    
    inline def setVersionSupport(value: Boolean): Self = StObject.set(x, "versionSupport", value.asInstanceOf[js.Any])
    
    inline def setVersionSupportUndefined: Self = StObject.set(x, "versionSupport", js.undefined)
  }
}
