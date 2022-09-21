package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveParameterSupport extends StObject {
  
  /**
    * The client supports the `activeParameter` property on `SignatureInformation`
    * literal.
    *
    * @since 3.16.0
    */
  var activeParameterSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client supports the following content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[LabelOffsetSupport] = js.undefined
}
object ActiveParameterSupport {
  
  inline def apply(): ActiveParameterSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveParameterSupport]
  }
  
  extension [Self <: ActiveParameterSupport](x: Self) {
    
    inline def setActiveParameterSupport(value: Boolean): Self = StObject.set(x, "activeParameterSupport", value.asInstanceOf[js.Any])
    
    inline def setActiveParameterSupportUndefined: Self = StObject.set(x, "activeParameterSupport", js.undefined)
    
    inline def setDocumentationFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "documentationFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentationFormatUndefined: Self = StObject.set(x, "documentationFormat", js.undefined)
    
    inline def setDocumentationFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "documentationFormat", js.Array(value*))
    
    inline def setParameterInformation(value: LabelOffsetSupport): Self = StObject.set(x, "parameterInformation", value.asInstanceOf[js.Any])
    
    inline def setParameterInformationUndefined: Self = StObject.set(x, "parameterInformation", js.undefined)
  }
}
