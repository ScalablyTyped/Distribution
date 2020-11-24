package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishDiagnosticsParams extends js.Object {
  
  /**
    * An array of diagnostic information items.
    */
  var diagnostics: js.Array[Diagnostic] = js.native
  
  /**
    * The URI for which diagnostic information is reported.
    */
  var uri: DocumentUri = js.native
  
  /**
    * Optional the version number of the document the diagnostics are published for.
    *
    * @since 3.15.0
    */
  var version: js.UndefOr[Double] = js.native
}
object PublishDiagnosticsParams {
  
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], uri: DocumentUri): PublishDiagnosticsParams = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishDiagnosticsParams]
  }
  
  @scala.inline
  implicit class PublishDiagnosticsParamsOps[Self <: PublishDiagnosticsParams] (val x: Self) extends AnyVal {
    
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
    def setDiagnosticsVarargs(value: Diagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: DocumentUri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
