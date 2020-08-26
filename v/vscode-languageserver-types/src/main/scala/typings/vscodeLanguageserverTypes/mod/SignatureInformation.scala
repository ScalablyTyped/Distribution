package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.native
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String = js.native
  /**
    * The parameters of this signature.
    */
  var parameters: js.UndefOr[js.Array[ParameterInformation]] = js.native
}

@JSImport("vscode-languageserver-types", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(label: String, documentation: js.UndefOr[scala.Nothing], parameters: ParameterInformation*): SignatureInformation = js.native
  def create(label: String, documentation: String, parameters: ParameterInformation*): SignatureInformation = js.native
}

