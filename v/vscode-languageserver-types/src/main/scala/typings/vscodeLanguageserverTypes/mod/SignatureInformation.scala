package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureInformation extends StObject {
  
  /**
    * The index of the active parameter.
    *
    * If provided, this is used in place of `SignatureHelp.activeParameter`.
    *
    * @since 3.16.0
    */
  var activeParameter: js.UndefOr[uinteger] = js.undefined
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.undefined
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String
  
  /**
    * The parameters of this signature.
    */
  var parameters: js.UndefOr[js.Array[ParameterInformation]] = js.undefined
}
object SignatureInformation {
  
  inline def apply(label: String): SignatureInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInformation]
  }
  
  @JSImport("vscode-languageserver-types", "SignatureInformation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(label: String, documentation: String, parameters: ParameterInformation*): SignatureInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((List(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).`++`(parameters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SignatureInformation]
  inline def create(label: String, documentation: Unit, parameters: ParameterInformation*): SignatureInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")((List(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).`++`(parameters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SignatureInformation]
  
  extension [Self <: SignatureInformation](x: Self) {
    
    inline def setActiveParameter(value: uinteger): Self = StObject.set(x, "activeParameter", value.asInstanceOf[js.Any])
    
    inline def setActiveParameterUndefined: Self = StObject.set(x, "activeParameter", js.undefined)
    
    inline def setDocumentation(value: String | MarkupContent): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ParameterInformation]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ParameterInformation*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
