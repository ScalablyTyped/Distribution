package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishDiagnosticsClientCapabilities extends js.Object {
  
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
  implicit class PublishDiagnosticsClientCapabilitiesOps[Self <: PublishDiagnosticsClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelatedInformation(value: Boolean): Self = this.set("relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedInformation: Self = this.set("relatedInformation", js.undefined)
    
    @scala.inline
    def setTagSupport(value: ValueSet): Self = this.set("tagSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSupport: Self = this.set("tagSupport", js.undefined)
    
    @scala.inline
    def setVersionSupport(value: Boolean): Self = this.set("versionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionSupport: Self = this.set("versionSupport", js.undefined)
  }
}
