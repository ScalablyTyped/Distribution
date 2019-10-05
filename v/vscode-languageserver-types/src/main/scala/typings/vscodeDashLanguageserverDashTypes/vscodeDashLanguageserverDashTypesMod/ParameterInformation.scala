package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.undefined
  /**
    * The label of this parameter information.
    *
    * Either a string or inclusive start and exclusive end offsets within its containing
    * [signature label](#SignatureInformation.label). *Note*: A label of type string must be
    * a substring of its containing signature information's [label](#SignatureInformation.label).
    */
  var label: String | (js.Tuple2[Double, Double])
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

