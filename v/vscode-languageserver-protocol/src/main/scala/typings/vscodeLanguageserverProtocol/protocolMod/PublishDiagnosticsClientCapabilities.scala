package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishDiagnosticsClientCapabilities extends StObject {
  
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports the tag property to provide meta data about a diagnostic.
    * Clients supporting tags have to handle unknown tags gracefully.
    *
    * @since 3.15.0
    */
  var tagSupport: js.UndefOr[ValueSet] = js.native
  
  /**
    * Whether the client interprets the version property of the
    * `textDocument/publishDiagnostics` notification`s parameter.
    *
    * @since 3.15.0
    */
  var versionSupport: js.UndefOr[Boolean] = js.native
}
object PublishDiagnosticsClientCapabilities {
  
  @scala.inline
  def apply(): PublishDiagnosticsClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishDiagnosticsClientCapabilities]
  }
  
  @scala.inline
  implicit class PublishDiagnosticsClientCapabilitiesMutableBuilder[Self <: PublishDiagnosticsClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedInformation(value: Boolean): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    @scala.inline
    def setTagSupport(value: ValueSet): Self = StObject.set(x, "tagSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSupportUndefined: Self = StObject.set(x, "tagSupport", js.undefined)
    
    @scala.inline
    def setVersionSupport(value: Boolean): Self = StObject.set(x, "versionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionSupportUndefined: Self = StObject.set(x, "versionSupport", js.undefined)
  }
}
