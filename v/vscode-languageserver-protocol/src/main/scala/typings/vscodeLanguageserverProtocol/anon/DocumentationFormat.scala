package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationFormat extends StObject {
  
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
  implicit class DocumentationFormatMutableBuilder[Self <: DocumentationFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "documentationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationFormatUndefined: Self = StObject.set(x, "documentationFormat", js.undefined)
    
    @scala.inline
    def setDocumentationFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "documentationFormat", js.Array(value :_*))
    
    @scala.inline
    def setParameterInformation(value: LabelOffsetSupport): Self = StObject.set(x, "parameterInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterInformationUndefined: Self = StObject.set(x, "parameterInformation", js.undefined)
  }
}
