package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterInformation extends js.Object {
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

@JSImport("vscode-languageserver-types", "ParameterInformation")
@js.native
object ParameterInformation extends js.Object {
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def create(label: String): ParameterInformation = js.native
  def create(label: String, documentation: String): ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double]): ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): ParameterInformation = js.native
}

