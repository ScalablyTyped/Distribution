package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterInformation extends StObject {
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.undefined
  
  /**
    * The label of this parameter information.
    *
    * Either a string or an inclusive start and exclusive end offsets within its containing
    * signature label. (see SignatureInformation.label). The offsets are based on a UTF-16
    * string representation as `Position` and `Range` does.
    *
    * *Note*: a label of type string should be a substring of its containing signature label.
    * Its intended use case is to highlight the parameter label part in the `SignatureInformation.label`.
    */
  var label: String | (js.Tuple2[Double, Double])
}
object ParameterInformation {
  
  inline def apply(label: String | (js.Tuple2[Double, Double])): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
  
  @JSImport("vscode-languageserver-types", "ParameterInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  inline def create(label: String): ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[ParameterInformation]
  inline def create(label: String, documentation: String): ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[ParameterInformation]
  inline def create(label: js.Tuple2[Double, Double]): ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[ParameterInformation]
  inline def create(label: js.Tuple2[Double, Double], documentation: String): ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[ParameterInformation]
  
  extension [Self <: ParameterInformation](x: Self) {
    
    inline def setDocumentation(value: String | MarkupContent): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setLabel(value: String | (js.Tuple2[Double, Double])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
