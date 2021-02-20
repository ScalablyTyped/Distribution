package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterInformation extends StObject {
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.native
  
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
  var label: String | (js.Tuple2[Double, Double]) = js.native
}
object ParameterInformation {
  
  @scala.inline
  def apply(label: String | (js.Tuple2[Double, Double])): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
  
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  @JSImport("vscode-languageserver-types", "ParameterInformation.create")
  @js.native
  def create(label: String): ParameterInformation = js.native
  @JSImport("vscode-languageserver-types", "ParameterInformation.create")
  @js.native
  def create(label: String, documentation: String): ParameterInformation = js.native
  @JSImport("vscode-languageserver-types", "ParameterInformation.create")
  @js.native
  def create(label: js.Tuple2[Double, Double]): ParameterInformation = js.native
  @JSImport("vscode-languageserver-types", "ParameterInformation.create")
  @js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): ParameterInformation = js.native
  
  @scala.inline
  implicit class ParameterInformationMutableBuilder[Self <: ParameterInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: String | MarkupContent): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setLabel(value: String | (js.Tuple2[Double, Double])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
