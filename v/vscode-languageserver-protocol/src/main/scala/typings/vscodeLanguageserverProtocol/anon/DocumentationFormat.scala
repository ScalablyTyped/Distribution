package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationFormat extends StObject {
  
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[LabelOffsetSupport] = js.undefined
}
object DocumentationFormat {
  
  inline def apply(): DocumentationFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationFormat]
  }
  
  extension [Self <: DocumentationFormat](x: Self) {
    
    inline def setDocumentationFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "documentationFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentationFormatUndefined: Self = StObject.set(x, "documentationFormat", js.undefined)
    
    inline def setDocumentationFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "documentationFormat", js.Array(value :_*))
    
    inline def setParameterInformation(value: LabelOffsetSupport): Self = StObject.set(x, "parameterInformation", value.asInstanceOf[js.Any])
    
    inline def setParameterInformationUndefined: Self = StObject.set(x, "parameterInformation", js.undefined)
  }
}
