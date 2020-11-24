package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationFormat extends js.Object {
  
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[LabelOffsetSupport] = js.native
}
object DocumentationFormat {
  
  @scala.inline
  def apply(): DocumentationFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationFormat]
  }
  
  @scala.inline
  implicit class DocumentationFormatOps[Self <: DocumentationFormat] (val x: Self) extends AnyVal {
    
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
    def setDocumentationFormatVarargs(value: MarkupKind*): Self = this.set("documentationFormat", js.Array(value :_*))
    
    @scala.inline
    def setDocumentationFormat(value: js.Array[MarkupKind]): Self = this.set("documentationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationFormat: Self = this.set("documentationFormat", js.undefined)
    
    @scala.inline
    def setParameterInformation(value: LabelOffsetSupport): Self = this.set("parameterInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterInformation: Self = this.set("parameterInformation", js.undefined)
  }
}
